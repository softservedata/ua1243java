package homework.dmytro.livantsov.homeW_04_ConditionStatement;

import java.util.Scanner;

public class Http_Request_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inputCode;
        System.out.println();
        System.out.println("\tHello, write the code of error which you got, and I'll try to explain what happened.");
        System.out.println("Available code numbers - (200, 301, 302, 304, 400, 401, 403, 404)");
        System.out.print("\nNumber: ");
        inputCode = scanner.nextInt();
        Http_Error httpError = Http_Error.getStatusOfTheCode(inputCode);

        String httpDescription = httpError.getDescription();

        System.out.println("\nCode problem - " + inputCode);
        System.out.println("Description : \n" + httpDescription);
    }
}
