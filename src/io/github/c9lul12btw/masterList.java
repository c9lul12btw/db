package io.github.c9lul12btw;


public class masterList {

    private static String[] masterListID = {"SCP-096","SCP-173"};
    private static String[] masterListClass = {"Euclid","Euclid"};
    private static String[] masterListLocation = {"Unknown","SITE 19"};

    public static void list() {

        System.out.format("\n%-12s%-12s%-12s\n","SCP-ID","CLASS","LOCATION");
        int i = 0;
        for (String scpID : masterListID) {

            String scpClass = masterListClass[i];
            String scpLocation = masterListLocation[i];
            System.out.format("\n%-12s%-12s%-12s", scpID, scpClass, scpLocation);
            i++;
        }
    }
}
