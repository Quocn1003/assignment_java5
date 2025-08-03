package poly.java5.asm.dto;

public class TopCustomerReport {

    private String username;
    private Double totalAmount;

    public TopCustomerReport(String username, Double totalAmount) {
        this.username = username;
        this.totalAmount = totalAmount;
    }

    // Getters và Setters (hoặc dùng Lombok nếu muốn)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
