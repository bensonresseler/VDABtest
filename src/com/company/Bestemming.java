package com.company;

import java.util.Scanner;

public class Bestemming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] bestemmingen = {"Corsica", "Sicilië", "Sardinië", "Montenegro"};

        System.out.print("Geef je naam: ");
        String naam = scanner.nextLine();
        int keuze = 1;

        do {
            if (keuze != 1){
                System.out.println("Kies een geldig nummer.");
            }
            System.out.println("Kies een bestemming:");

            for (int i = 0; i < bestemmingen.length; i++) {
                System.out.printf("\t %d. %s \n",i+1, bestemmingen[i]);
            }

            System.out.printf("Welke bestemming kies je (1-%d)? ", bestemmingen.length);
            keuze = Integer.parseInt(scanner.nextLine());

        } while (keuze < 1 || keuze >= bestemmingen.length + 1);

        System.out.printf("Dag %s, goede reis naar %s.", naam, bestemmingen[keuze-1]);
    }
}
