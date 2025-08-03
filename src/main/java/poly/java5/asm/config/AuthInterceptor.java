package poly.java5.asm.config;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Component
public class AuthInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        HttpSession session = request.getSession();
        String uri = request.getRequestURI();
        Boolean isAdmin = (Boolean) session.getAttribute("isAdmin");

        if (uri.startsWith("/admin")) {
            if (isAdmin != null && isAdmin) {
                return true;
            } else {
                session.setAttribute("redirect-uri", uri);
                response.sendRedirect("/auth/login");
                return false;
            }
        }

        return true; // allow others
    }
}
