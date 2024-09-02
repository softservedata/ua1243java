package academy.softserve.Homework4.task3;

import java.util.Scanner;

public class Main {
    enum HTTPError {
        BAD_REQUEST(400, "Bad request"),
        UNAUTHORIZED(401, "Unauthorized"),
        PAYMENT_REQUIRED(402, "Payment required");
        public final int errorCode;
        public final String description;

        HTTPError(int errorCode, String description) {
            this.errorCode = errorCode;
            this.description = description;
        }

        public String getDescription() {
            return description;
        }

        public int getErrorCode() {
            return errorCode;
        }

        public static String getDescriptionByValue(int code) {
            for (HTTPError error : HTTPError.values()) {
                if (error.getErrorCode() == code)
                    return error.getDescription();
            }
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter your HTTPError code: ");
        Scanner scan = new Scanner(System.in);
        String number = scan.nextLine();
        if (isNumeric(number)) {
            int code = Integer.parseInt(number);
            System.out.println("Your problem is: " + HTTPError.getDescriptionByValue(code));
        }else{
            System.out.println("Invalid input");
        }
    }

    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
