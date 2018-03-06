package io.github.c9lul12btw;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

class IDSearch {

    IDSearch(String scpID) throws FileNotFoundException {

        InputStream data = getClass().getResourceAsStream("data/scp/scp-" + scpID + ".txt");
        Scanner reader = new Scanner(data);

        while (reader.hasNextLine()) {
            System.out.println(reader.nextLine());
        }
        reader.close();
    }
}
