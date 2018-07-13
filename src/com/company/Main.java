package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Geef een naam: ");
            String naam = scanner.nextLine();
            System.out.println(String.format("Naam: %10s", naam));
            System.out.println("Test");
            System.out.println("Test2");
        }

    }
}