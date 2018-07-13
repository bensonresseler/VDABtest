package com.company;

import java.util.Scanner;

public class Palindroom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef een woord: ");
        String woord = scanner.nextLine();
        String anderWoord = "";
        char[] karakters = woord.toCharArray();

        for (int i = woord.length() -1; i >=0; i--) {
            anderWoord = anderWoord + woord.charAt(i);
        }
        if (woord.compareTo(anderWoord) == 0) {
            System.out.println(woord + " is een palindroom");
        }else {
            System.out.println(woord + " is geen palindroom");
        }
    }
}
