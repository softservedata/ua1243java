package task01;

import java.util.Scanner;

public class CesarCipherApp {

    private static final int SHIFT = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, input sentence for encode: ");
        String cipher = scanner.nextLine();
        scanner.close();

        String encrypt = CesarCipher.encrypt(cipher, SHIFT);
        System.out.println("Encrypt message: " + encrypt);

        String decrypt = CesarCipher.decrypt(encrypt, SHIFT);
        System.out.println("Decrypt message: " + decrypt);
    }
}
