package task01;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ProductManagerTest {

    @Test
    public void testGetPhonesByPriceAndYear() {
        Product phone1 = new Product(ProductCategory.PHONE, LocalDate.of(2021, 1, 1), BigDecimal.valueOf(3500));
        Product phone2 = new Product(ProductCategory.PHONE, LocalDate.of(2022, 1, 1), BigDecimal.valueOf(2900));
        Product phone3 = new Product(ProductCategory.PHONE, LocalDate.of(2020, 1, 1), BigDecimal.valueOf(4000));
        Product phone4 = new Product(ProductCategory.PHONE, LocalDate.of(2019, 6, 15), BigDecimal.valueOf(3200));
        Product nonPhone = new Product(ProductCategory.BOOKS, LocalDate.of(2022, 2, 1), BigDecimal.valueOf(2500));

        List<Product> products = List.of(phone1, phone2, phone3, phone4, nonPhone);

        List<Product> filteredPhones = ProductManager.getPhonesByPriceAndYear(products);

        assertEquals(3, filteredPhones.size());

        assertTrue(filteredPhones.contains(phone1));
        assertFalse(filteredPhones.contains(phone2));
        assertTrue(filteredPhones.contains(phone3));
        assertTrue(filteredPhones.contains(phone4));

        assertTrue(filteredPhones.get(0).getPrice().compareTo(BigDecimal.valueOf(3200)) == 0);
        assertTrue(filteredPhones.get(1).getPrice().compareTo(BigDecimal.valueOf(3500)) == 0);
        assertTrue(filteredPhones.get(2).getPrice().compareTo(BigDecimal.valueOf(4000)) == 0);
    }

    @Test
    public void testGetRandomProductList() {
        List<Product> products = ProductManager.getRandomProductList();

        assertEquals(20, products.size());

        for (Product product : products) {
            assertNotNull(product.getCategory());
            assertNotNull(product.getDateOfManufacture());
            assertNotNull(product.getPrice());
            assertTrue(product.getPrice().compareTo(BigDecimal.ZERO) > 0);
        }
    }
}
