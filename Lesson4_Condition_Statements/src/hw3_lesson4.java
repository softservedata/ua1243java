import java.util.Scanner;

public class hw3_lesson4 {
    public enum HTTPError {
        BAD_REQUEST(400, "Bad Request"),
        UNAUTHORIZED(401, "Unauthorized"),
        PAYMENT_REQUIRED(402, "Payment Required"),
        FORBIDDEN(403, "Forbidden"),
        NOT_FOUND(404, "Not Found"),
        INTERNAL_SERVER_ERROR(500, "Internal Server Error"),
        NOT_IMPLEMENTED(501, "Not Implemented"),
        BAD_GATEWAY(502, "Bad Gateway"),
        SERVICE_UNAVAILABLE(503, "Service Unavailable"),
        UNKNOWN(-1, "Unknown Error");

        private final int code;
        private final String description;

        HTTPError(int code, String description) {
            this.code = code;
            this.description = description;
        }

        public int getCode() {
            return code;
        }

        public String getDescription() {
            return description;
        }

        public static HTTPError fromCode(int code) {
            for (HTTPError error : HTTPError.values()) {
                if (error.getCode() == code) {
                    return error;
                }
            }
            return UNKNOWN;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an HTTP status code (e.g., 400, 401, 402):");
        int code = scan.nextInt();

        HTTPError error = HTTPError.fromCode(code);

        System.out.println("HTTP Error " + code + ": " + error.getDescription());

        scan.close();
    }
}
