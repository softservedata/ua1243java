import java.util.Scanner;

public class Triangle {

    static Scanner scan = new Scanner(System.in);//better scan to do as static
    double a = scan.nextInt();
    double b = scan.nextInt();
    double c = scan.nextInt();

    public static void main(String[] args) {


        System.out.println("Hello! Please, enter sides of the triangle:");
        Triangle obj = new Triangle();
        obj.areaOfTriangle();
        scan.close();//remember to close resource
    }

    public void areaOfTriangle() {
        // Знаходимо площу трикутника за формулою Герона10
        double halfPerimeter = (a + b + c) / 2;
        double area = Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
        String result = String.format("%.2f", area);
        System.out.println("Area of  a triangle: " + result);
    }
    //Не забувай про форматування коду веред відправкою його на гітхаб
    // У цій задачі було б добре додати перевірку чи існує трикутник із заданими велечинами сторін, оскільки якщо ввести
    // наприклад, 3,7,10, то площу поверне просто 0,0
}
