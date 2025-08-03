package poly.java5.asm.service;

import org.springframework.stereotype.Service;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class CookieService {

    public void add(HttpServletResponse response, String name, String value, int hours) {
        Cookie cookie = new Cookie(name, value);
        cookie.setMaxAge(hours * 3600); // Convert hours to seconds
        cookie.setPath("/"); // Set path to root so cookie is available across the application
        response.addCookie(cookie);
    }

    public String get(HttpServletRequest request, String name) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals(name)) {
                    return cookie.getValue();
                }
            }
        }
        return null; // Return null if cookie not found
    }

    public void remove(HttpServletResponse response, String name) {
        add(response, name, "", 0);
    }
}
