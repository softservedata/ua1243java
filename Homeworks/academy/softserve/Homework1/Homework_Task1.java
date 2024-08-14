package academy.softserve.Homework1;

public class Homework_Task1 {
    public static void main(String[] args) {
    /* Flower bed is shaped like a circle.
     Calculate its perimeter and area.
     Input the radius from the console, and output obtained results.  */
        int r = 3, p;
        double ar;
        p = r * 2;
        ar = 2 * Math.PI * r;
        System.out.println("Radius - "+r);
        System.out.println("Perimeter - "+p);
        System.out.println("Area - "+ar);
    }
}
