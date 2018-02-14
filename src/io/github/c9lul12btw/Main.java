package io.github.c9lul12btw;

import java.util.Scanner;

public class Main {

    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        searchType();
    }

    private static void searchType() {

        boolean correctSearch = false;
        while (!correctSearch) {

            System.out.println("SEARCH TYPES: ID, CLASS, ALL");
            System.out.print("Enter search type: ");
            String searchType = s.nextLine();

            switch (searchType.toLowerCase()) {
                case "id":
                    correctSearch = true;
                    System.out.println("\nSearching for SCP-ID.\n");
                    searchId();
                    break;
                case "class":
                    correctSearch = true;
                    System.out.println("\nSearching for SCP-CLASS.\n");
                    searchClass();
                    break;
                case "all":
                    correctSearch = true;
                    System.out.println("\nListing all SCP Entries.\n");
                    masterList.list();
                    break;
                default:
                    correctSearch = false;
                    System.out.println("\nPlease enter a correct value.\n");
                    break;
            }
        }
    }

    private static void searchId() {

    }

    private static void searchClass() {

    }
}
