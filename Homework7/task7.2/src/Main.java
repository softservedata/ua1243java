
public class Main {
    public static void main(String[] args) {
        Passengers[] passenger = {
                new Boat(2323, 5000),
                new Bus(24, "Lviv-Zapytiv"),
                new Car(5, "BMW"),
                new Helicopter(10, 1000),
                new Motorcycle(2, 160),
                new Plane(2000, 7000),

        };

        for (var passengers : passenger) {
            passengers.fly();
            System.out.println(passengers + "\n");
        }
    }
}