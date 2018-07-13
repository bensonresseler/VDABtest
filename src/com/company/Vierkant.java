package com.company;

import java.util.Scanner;

public class Vierkant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef zijde: ");
        int aantalZijde = Integer.parseInt(scanner.nextLine());
        char ster = '*';

        for (int j = 1; j <= aantalZijde; j++) {
            for (int i = 1; i <= aantalZijde; i++) {
                System.out.print(ster);
            }
            System.out.println();
        }

    }
}
