import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.println("Hello! Enter the word that should be encoded: ");
        String s = scan.nextLine();
        System.out.println("Ok! Thank you. Now enter the number whatever you wont: ");
        int n = scan.nextInt();
        System.out.println("Result: ");
        String encrypted = encrypt(s, n);
        System.out.println("Encrypted: " + encrypted);
        String decrypted = decrypt(encrypted, n);
        System.out.println("Decrypted: " + decrypted);
    }

    public static String encrypt(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sb.append((char) (c + n));
        }
        return sb.toString();
    }

    public static String decrypt(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sb.append((char) (c - n));
        }
        return sb.toString();
    }
}