package com.company;

import java.util.Scanner;

public class Bestemming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] bestemmingen = {"Corsica", "Sicilië", "Sardinië", "Montenegro"};
        double [] prijzen = {10, 12.5, 16, 15};

        System.out.print("Geef je naam: ");
        String naam = scanner.nextLine();
        int keuze = 1;

        do {
            if (keuze != 1){
                System.out.println("Kies een geldig nummer.");
            }
            System.out.println("Kies een bestemming:");

            for (int i = 0; i < bestemmingen.length; i++) {
                System.out.printf("\t %d. %s (€ %4.2f)\n",i+1, bestemmingen[i], prijzen[i]);
            }

            System.out.printf("Welke bestemming kies je (1-%d)? ", bestemmingen.length);
            keuze = Integer.parseInt(scanner.nextLine());

        } while (keuze < 1 || keuze >= bestemmingen.length + 1);

        System.out.printf("Dag %s, goede reis naar %s. De reis kost € %4.2f.", naam, bestemmingen[keuze-1], prijzen[keuze-1]);
    }
}
