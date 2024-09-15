package task01;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class ProductManager {

    private static final Random RANDOM = new Random();
    private static final ProductCategory[] CATEGORIES = ProductCategory.values();

    public static List<Product> getPhonesByPriceAndYear(List<Product> products){
        return products.stream()
                .filter(ProductManager::isPhone)
                .filter(ProductManager::isPriceGreaterThan3000)
                .filter(ProductManager::isOlderThanOneYear)
                .sorted(Comparator.comparing(Product::getPrice))
                .toList();
    }

    private static boolean isPhone(Product product) {
        return product.getCategory().equals(ProductCategory.PHONE);
    }

    private static boolean isPriceGreaterThan3000(Product product) {
        return product.getPrice().compareTo(BigDecimal.valueOf(3000)) > 0;
    }

    private static boolean isOlderThanOneYear(Product product){
        return product.getDateOfManufacture().isBefore(LocalDate.now().minusYears(1));
    }

    public static List<Product> getRandomProductList() {
        return Stream.generate(() -> new Product(
                        getRandomCategory(),
                        getRandomDate(),
                        getRandomPrice()))
                .limit(20)
                .toList();
    }

    private static ProductCategory getRandomCategory() {
        return CATEGORIES[RANDOM.nextInt(CATEGORIES.length)];
    }

    private static LocalDate getRandomDate() {
        int year = RANDOM.nextInt(1980, 2025);
        int month = RANDOM.nextInt(1, 13);
        int day = RANDOM.nextInt(1, LocalDate.of(year, month, 1).lengthOfMonth() + 1);
        return LocalDate.of(year, month, day);
    }

    private static BigDecimal getRandomPrice() {
        return BigDecimal.valueOf(RANDOM.nextDouble(0,500000));
    }
}

