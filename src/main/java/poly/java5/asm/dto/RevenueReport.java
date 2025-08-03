package poly.java5.asm.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RevenueReport {

    private String categoryName;
    private Double totalRevenue;

    public RevenueReport(String categoryName, Double totalRevenue) {
        this.categoryName = categoryName;
        this.totalRevenue = totalRevenue;
    }
}
