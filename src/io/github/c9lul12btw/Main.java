package io.github.c9lul12btw;

import io.github.c9lul12btw.classes.euclid.*;

import java.util.Scanner;

public class Main {

    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        search();
    }

    private static void search() {

        boolean correctSearch = false;
        while (!correctSearch) {

            System.out.println("SEARCH TYPES: ID, CLASS");
            System.out.print("Enter search type: ");
            String searchType = s.nextLine();

            switch (searchType.toLowerCase()) {
                case "id":
                    correctSearch = true;
                    System.out.println("\nSearching for SCP-ID.\n");
                    break;
                case "class":
                    correctSearch = true;
                    System.out.println("\nSearching for SCP-CLASS.\n");
                    break;
                default:
                    correctSearch = false;
                    System.out.println("\nPlease enter a correct value.\n");
                    break;
            }
        }
    }
}
