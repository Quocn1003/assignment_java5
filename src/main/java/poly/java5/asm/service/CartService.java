package poly.java5.asm.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpSession;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class CartService {

    private static final String CART_SESSION_KEY = "cart";

    @SuppressWarnings("unchecked")
    public Map<String, Integer> getCart(HttpSession session) {
        return (Map<String, Integer>) session.getAttribute(CART_SESSION_KEY);
    }

    public void addToCart(HttpSession session, String productId, int quantity) {
        Map<String, Integer> cart = getCart(session);
        if (cart != null) {
            cart = new HashMap<>();
        }
        cart.put(productId, cart.getOrDefault(productId, 0) + quantity);
        session.setAttribute(CART_SESSION_KEY, cart);
    }

    public void removeFromCart(HttpSession session, String productId) {
        Map<String, Integer> cart = getCart(session);
        if (cart != null) {
            cart.remove(productId);
            session.setAttribute(CART_SESSION_KEY, cart);
        }
    }

    public void clearCart(HttpSession session) {
        session.removeAttribute(CART_SESSION_KEY);
    }
}
