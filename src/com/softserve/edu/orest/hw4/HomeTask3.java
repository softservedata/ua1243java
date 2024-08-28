package com.softserve.edu.orest.hw4;

import java.util.Scanner;

public class HomeTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int code = scanner.nextInt();

        HTTPError error = HTTPError.findByCode(code);
        System.out.println(error);
    }
    public enum HTTPError {
        Unauthorized, BadRequest, PageNotFound, ForbiddenError, InternalError, ServiceUnavailable, Unknown;

        public static HTTPError findByCode(int code) {
            HTTPError error;
            error = switch (code){
                case 400 -> HTTPError.BadRequest;
                case 401 -> HTTPError.Unauthorized;
                case 403 -> HTTPError.ForbiddenError;
                case 404 -> HTTPError.PageNotFound;
                case 500 -> HTTPError.InternalError;
                case 503 -> HTTPError.ServiceUnavailable;
                default -> HTTPError.Unknown;
            };
            return error;
        }

    }
}
