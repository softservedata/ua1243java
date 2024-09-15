package task01;

public enum ProductCategory {
    ELECTRONICS("Electronics"),
    FASHION("Fashion"),
    HOME_AND_KITCHEN("Home and kitchen"),
    BEAUTY_AND_HEALTH("Beauty and health"),
    SPORTS_AND_OUTDOORS("Sports and outdoors"),
    TOYS_AND_GAMES("Toys and games"),
    AUTOMOTIVE("Automotive"),
    PHONE("Phone"),
    BOOKS("Books");

    private final String category;

    ProductCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public static ProductCategory fromString(String category) {
        for (ProductCategory pc : ProductCategory.values()) {
            if (pc.category.equalsIgnoreCase(category)) {
                return pc;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return category;
    }
}

