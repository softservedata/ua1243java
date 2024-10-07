package encryptdecrypt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();
        int key = scanner.nextInt();
        String encryptMessage = encrypt(message, key);
        System.out.println(encryptMessage);
    }
    public static String encrypt(String message, int key) {
        StringBuilder cipherMessage = new StringBuilder();
        key = key % 26;
        for(char c : message.toLowerCase().toCharArray()) {
            if(c >= 'a' && c <= 'z') {
                char cipher = (char) ((c - 'a' + key) % 26 + 'a');
                cipherMessage.append(cipher);
            } else {
                cipherMessage.append(c);
            }
        }
        return cipherMessage.toString();
    }
}
