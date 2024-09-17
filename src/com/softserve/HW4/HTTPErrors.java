package com.softserve.HW4;

import java.util.Scanner;

public class HTTPErrors{
enum HTTPError {
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

    HTTPError(int code, String message){
        this.code=code;
        this.message=message;
    }

    public int getCode(){
        return code;
    }

    public String getMessage(){
        return message;
    }}

    public static String findErrorByCode(int code){
        for (HTTPError error : HTTPError.values()){
            if (error.getCode() == code){
                return error.getMessage();
            }
        }
        return "Unknown error";
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write your error");
        int error = scanner.nextInt();

        String errorMessage = HTTPErrors.findErrorByCode(error);
        System.out.println("Your HTTP error is " + errorMessage);

    }

}
