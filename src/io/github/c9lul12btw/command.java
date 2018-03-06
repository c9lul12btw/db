package io.github.c9lul12btw;

import java.io.FileNotFoundException;
import java.io.IOException;

class command {

    private boolean fileFound = false;

    void clear(){
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ignored) {}
    }

    void searchID(String param) {
        try {
            new IDSearch(param);
            fileFound = true;
        } catch (FileNotFoundException ignored) {}
        finally {
            if (!fileFound) {
                System.out.println("\nNO ENTRY FOUND UNDER SCP-" + param + "\n");
            }
        }
    }

    void searchFac(String param) {
        try {
            new facilitySearch(param);
            fileFound = true;
        } catch (FileNotFoundException ignored) {}
        finally {
            if (!fileFound) {
                System.out.println("\nNO ENTRY FOUND UNDER " + param.toUpperCase() + "\n");
            }
        }
    }

    void searchClass(String param) {

    }

    void list() {

    }

    void help() {
        System.out.println("REGISTERED COMMANDS:\n");
        System.out.println("> id/###  -  Searches SCP Database by SCP-ID");
        System.out.println("> class/<param>  -  Lists by SCP-CLASS");
        System.out.println("> list  -  Lists all by SCP-ID");
        System.out.println("> fac/<param>  -  Searches Facilities Database by SITE-ID");
        System.out.println("> help  -  Displays this menu");
        System.out.println("> clear  -  Clears console");
        System.out.println("> exit  -  Exits console\n");
    }
}
