import java.util.Scanner;


public class Triangle {


    Scanner scan = new Scanner(System.in);
    double a = scan.nextInt();
    double b = scan.nextInt();
    double c = scan.nextInt();
    public void areaOfTriangle(){
        // Знаходимо площу трикутника за формулою Герона10
        double halfPerimeter = (a+b+c)/2;
        double area = Math.sqrt(halfPerimeter*(halfPerimeter-a)*(halfPerimeter-b)*(halfPerimeter-c));
        String result = String.format("%.2f",area);
        System.out.println("Area of  a triangle: " +result);
    }



public static void main(String[] args){

    System.out.println("Hello! Please, enter sides of the triangle:");

        Triangle obj = new Triangle();
        obj.areaOfTriangle();





}
}
