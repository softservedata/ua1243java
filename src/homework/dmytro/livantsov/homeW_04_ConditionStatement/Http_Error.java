package homework.dmytro.livantsov.homeW_04_ConditionStatement;

public enum Http_Error {
        HTTP_200 (200, "The HTTP status code 200 represents success" +
                " which means the page you have requested has been fetched."),

        HTTP_301(301, "The HTTP status code 301 means that the" +
                         " page you have requested has moved to a new URL and which is permanent."),

        HTTP_302(302, "The requested URL has been redirected to another website which is temporary."),

        HTTP_304(304, "HTTP status code 304 is used for caching purposes."),

        HTTP_400(400,  "When the client requests a page and the server is" +
                " not able to understand anything, it displays a 400 HTTP status code."),

        HTTP_401(401, "This HTTP status code requires user authentication."),

        HTTP_403(403, "The HTTP status code 403 implies that the request is" +
                " understood by the server, but still refuses to fulfill it."),

        HTTP_404(404, "404 HTTP Status code appears when you request" +
                " a URL and then the server has not found anything.");

        private final int errorCode;
        private final String description;

        Http_Error(int errorCode, String description){
            this.errorCode = errorCode;
            this.description = description;
        }

        public int getErrorCode() {
                return errorCode;
        }

        public String getDescription() {
                return description;
        }

        public static Http_Error getStatusOfTheCode(int errorCode) {

                for (Http_Error error : Http_Error.values()){
                        if (error.getErrorCode() == errorCode){
                                return error;
                        }
                }
                throw new IllegalArgumentException("Unknown status code: " + errorCode);
        }
}
