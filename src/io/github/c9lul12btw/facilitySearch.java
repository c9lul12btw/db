package io.github.c9lul12btw;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

class facilitySearch {

    facilitySearch(String facID) throws FileNotFoundException {

        InputStream data = getClass().getResourceAsStream("data/facility/" + facID + ".txt");
        Scanner reader = new Scanner(data);

        System.out.println("\nENTRY FOR " + facID.toUpperCase());

        while (reader.hasNextLine()) {
            System.out.println(reader.nextLine());
        }
        reader.close();
    }
}
