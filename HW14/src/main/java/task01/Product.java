package task01;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Product {

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    private ProductCategory category;
    private LocalDate dateOfManufacture;
    private BigDecimal price;

    public Product(ProductCategory category, LocalDate dateOfManufacture, BigDecimal price) {
        this.category = category;
        this.dateOfManufacture = dateOfManufacture;
        setPrice(price); // Використовуємо метод setPrice для форматування
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(LocalDate dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price.setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public String toString() {
        return String.format("Category: %-20s | Date of Manufacture: %-10s | Price: %10.2f",
                category,
                dateOfManufacture.format(DATE_FORMATTER),
                price);
    }
}
