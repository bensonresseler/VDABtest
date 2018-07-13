package com.company;

import java.util.Scanner;

public class Bestemming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] bestemmingen = {"Corsica", "Sicilië", "Sardinië", "Montenegro"};

        System.out.println("Kies een bestemming:");

        for (int i = 0; i < bestemmingen.length; i++) {
            System.out.printf("\t %d. %s \n",i+1, bestemmingen[i]);
        }
    }

}
