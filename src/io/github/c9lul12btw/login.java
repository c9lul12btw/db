package io.github.c9lul12btw;

import java.util.HashMap;
import java.util.Scanner;

class login {

    private HashMap<String, String> login = new HashMap<>();

    login() {

        login.put("O5-1","password");
        login.put("L4-101","password");
        login.put("L3-101","password");
        login.put("L2-101","password");
        login.put("L1-101","password");
    }


    int entry() {

        boolean validCredentials = false;
        int clearance = 0;

        System.out.println("------------ LOGIN ------------");

        while (!validCredentials) {
            System.out.print("USER-ID: ");
            Scanner loginS = new Scanner(System.in);
            String userEntry = loginS.nextLine();

            if (login.get(userEntry) != null) {

                System.out.print("PASSWORD: ");
                String passEntry = loginS.nextLine();

                if (login.get(userEntry).equals(passEntry)) {
                    validCredentials = true;
                    System.out.println("\nLOGIN SUCCESSFUL.\n");
                    switch (userEntry) {
                        case "O5-1":
                            clearance = 5;
                            break;
                        case "L4-101":
                            clearance = 4;
                            break;
                        case "L3-101":
                            clearance = 3;
                            break;
                        case "L2-101":
                            clearance = 2;
                            break;
                        case "L1-101":
                            clearance = 1;
                            break;
                    }
                } else {
                    System.out.println("INVALID CREDENTIALS.\n");
                    validCredentials = false;
                }
            } else {
                System.out.println("INVALID CREDENTIALS.\n");
                validCredentials = false;
            }
        }
        return clearance;
    }
}
