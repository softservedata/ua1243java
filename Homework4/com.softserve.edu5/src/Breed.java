package Breed;

public enum Breed {

    CHIHUAHUA,
    BULLDOGS,
    LABRADOR;

    @Override
    public String toString() {
        String name = name();
        return name.charAt(0)+name.substring(1).toLowerCase();
    }
}
