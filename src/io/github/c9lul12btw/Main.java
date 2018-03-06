package io.github.c9lul12btw;

import java.util.Scanner;

@SuppressWarnings("ContinueOrBreakFromFinallyBlock")
public class Main {

    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        login login = new login();
        int clearance = login.entry();
        //int clearance = 5;
        enterCommand(clearance);
    }

    private static void enterCommand(int clearance) {

        boolean exitLoop = false;
        String commandString;
        String paramString;
        command command = new command();

        while (!exitLoop) {

            System.out.print("\nENTER A COMMAND: ");
            String commandEntry = s.next();

            Scanner split = new Scanner(commandEntry).useDelimiter("/");

            if (commandEntry.contains("/")) {
                commandString = split.next();
                paramString = split.next();
            } else {
                commandString = split.next();
                paramString = "";
            }

            switch (commandString.toLowerCase()) {
                case "id":
                    command.clear();
                    command.searchID(paramString);
                    break;

                case "class":
                    command.clear();
                    command.searchClass(paramString);
                    break;

                case "list":
                    command.clear();
                    command.list();
                    break;

                case "fac":
                    command.clear();
                    command.searchFac(paramString);
                    break;

                case "clear":
                    command.clear();
                    break;

                case "help":
                    command.clear();
                    command.help();
                    break;

                case "exit":
                    exitLoop = true;
                    s.close();
                    break;

                default:
                    System.out.println("\nUNKNOWN COMMAND. USE \"HELP\" FOR INFORMATION.\n");
                    break;
            }
        }
    }
}
