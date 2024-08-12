import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskThree {
    public enum HTTPError {
        ERROR_400(400, "Bad Request"),
        ERROR_401(401, "Unauthorized"),
        ERROR_402(402, "Payment Required"),
        ERROR_403(403, "Forbidden"),
        ERROR_404(404, "Not Found"),
        ERROR_500(500, "Internal Server Error"),
        ERROR_501(501, "Not Implemented"),
        ERROR_502(502, "Bad Gateway"),
        ERROR_503(503, "Service Unavailable");

        private final int code;
        private final String message;

        HTTPError(int code, String message) {
            this.code = code;
            this.message = message;
        }

        public static String getMessageByCode(int code) {
            for (HTTPError error : HTTPError.values()) {
                if (error.code == code) {
                    return error.message;
                }
            }
            return "Unknown Error";
        }
    }

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter HTTP error code: ");
            int errorCode = scanner.nextInt();

            String errorMessage = HTTPError.getMessageByCode(errorCode);
            System.out.println("HTTP Error " + errorCode + ": " + errorMessage);
        } catch (InputMismatchException e) {
            System.err.println("Invalid input. Please enter a valid integer HTTP error code.");
        }
    }
}
