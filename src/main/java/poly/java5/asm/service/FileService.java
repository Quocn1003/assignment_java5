package poly.java5.asm.service;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class FileService {

    private static final String UPLOAD_DIR = "src/main/resources/static/image";

    public String save(MultipartFile file) {
        try {
            String filename = file.getOriginalFilename();
            Files.copy(file.getInputStream(), Paths.get(UPLOAD_DIR + File.separator + filename));
            return filename;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
