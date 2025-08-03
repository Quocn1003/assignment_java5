package poly.java5.asm.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TopCustomerReport {

    private String username;
    private Double totalAmount;

    public TopCustomerReport(String username, Double totalAmount) {
        this.username = username;
        this.totalAmount = totalAmount;
    }

}
