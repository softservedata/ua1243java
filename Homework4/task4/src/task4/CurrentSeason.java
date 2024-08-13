package task4;

public enum CurrentSeason {
    WINTER("Winter - exam period","Зима перод іспитів"), AUTUMN("Autumn is a first semester","Осінь це перший семестр"),SUMMER("Summer is a vocation period","Літо період відпусток"), SPRING("Spring is a second semester","Весна це другий семестр");

    public final String englishName;
    public  final String ukrainianName;

    CurrentSeason(String englishName,String ukrainianName){
        this.englishName = englishName;
        this.ukrainianName = ukrainianName;
    }
   public static CurrentSeason getByNumber(int number){
        return switch (number){
            case 1 ->  WINTER;
            case 2 -> SPRING;
            case 3 -> SUMMER;
            case 4-> AUTUMN;


            default -> throw new IllegalStateException("Unexpected value: " + number);
        };
    }
}
