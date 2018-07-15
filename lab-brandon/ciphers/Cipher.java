package ciphers;

import java.util.Scanner;

public class Cipher {
    public static final String ALPHABET = "abcdefghijklmnop";

    public static void presentOptions () {
        System.out.println("Select your cipher type -");
        System.out.println("1: Plaintext");
        System.out.println("2: ROT13");
        System.out.println("3: Keyword");
        System.out.println("4: Caesar-Shift");
    }

    public static String encode (int type, String payload) {
        String encodedString = "";

        if (type == 1) {
            System.out.println("You chose plaintext - Type your message below");

        } else if (type == 2) {
            System.out.println("You chose ROT13 - Type your message below");

        } else if (type == 3) {
            System.out.println("You chose Keyword - Type your message below");

        } else if (type == 4) {
            System.out.println("You chose Caesar-Shift - Type your message below");

        }

        return encodedString;
    }

    public static String decode(int type, String payload) {
        String decodedString = "";

        if (type == 1) {
            System.out.println("You chose plaintext - Type your message below");

        } else if (type == 2) {
            System.out.println("You chose ROT13 - Type your message below");

        } else if (type == 3) {
            System.out.println("You chose Keyword - Type your message below");

        } else if (type == 4) {
            System.out.println("You chose Caesar-Shift - Type your message below");

        }

        return decodedString;
    }
    protected String replaceCharacters(String payload, String source, String target) {
        String thing = " ";

        return thing;
    }

}
