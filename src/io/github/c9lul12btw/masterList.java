package io.github.c9lul12btw;

public class masterList {

    private static String[] masterListID = {"SCP-001","SCP-002","SCP-003","SCP-004","SCP-005","SCP-006","SCP-007",
            "SCP-008","SCP-009","SCP-010","SCP-011","SCP-012","SCP-013","SCP-014","SCP-015","SCP-056","SCP-017",
            "SCP-018","SCP-019","SCP-020","SCP-021","SCP-022","SCP-023","SCP-024","SCP-025","SCP-026","SCP-027",
            "SCP-028","SCP-029","SCP-030","SCP-031","SCP-032","SCP-033","SCP-034","SCP-035","SCP-036","SCP-037",
            "SCP-038","SCP-039","SCP-040","SCP-041","SCP-042","SCP-043","SCP-044","SCP-045","SCP-046","SCP-047",
            "SCP-048","SCP-049","SCP-050","SCP-051","SCP-052","SCP-053","SCP-054","SCP-055","SCP-056","SCP-057",
            "SCP-058","SCP-059","SCP-060","SCP-061","SCP-062","SCP-063","SCP-064","SCP-065","SCP-066","SCP-067",
            "SCP-068","SCP-069","SCP-070","SCP-071","SCP-072","SCP-073","SCP-074","SCP-075","SCP-076","SCP-077",
            "SCP-078","SCP-079","SCP-080","SCP-081","SCP-082","SCP-083","SCP-084","SCP-085","SCP-086","SCP-087",
            "SCP-088","SCP-089","SCP-090","SCP-091","SCP-092","SCP-093","SCP-094","SCP-095","SCP-096","SCP-097",
            "SCP-098","SCP-099"};

    private static String[] masterListNick = {"BLOCKED","The Living Room","Biological Motherboard","The 12 Rusty Keys and the Door",
/*5-10*/    "Skeleton Key","Fountain of Youth","Abdominal Planet","Zombie Plague","Red Ice","Collars of Control",
/*11-14*/   "Sentient Civil War Memorial Statue","A Bad Composition","Blue Lady Cigarettes","The Concrete Man",
/*15-20*/   "Pipe Nightmare","Sentient Micro-Organism","Shadow Person","Super Ball","The Monster Pot","Unseen Mold",
/*21-26*/   "Skin Wyrm","The Morgue","Black Shuck","Game Show of Death","A Well-Worn Wardrobe","Afterschool Retention",
/*27-32*/   "The Vermin God", "Knowledge","Daughter of Shadows","The Homunculus","What is Love?","Brothers' Bride",
/*33-36*/   "The Missing Number","Obsidian Ritual Knife","Possessive Mask","The Reincarnation Pilgrimage of the Yazidi",
/*37-41*/   "Dwarf Star", "The Everything Tree","Proboscis Engineers","Evolution's Child","Thought-Broadcasting Patient",
/*42-45*/   "A Formerly Winged Horse", "The Beatle","World War II Era Molecular-Fission Cannon","Atmospheric Converter",
/*46-50*/   "\"Predatory\" Holly Bush","Microbial Mutagen", "The Cursed SCP Number","Plague Doctor","To The Cleverest",
/*51-55*/   "Japanese Obstetrical Model","Time-Traveling Train", "Young Girl","Water Nymph","[unknown]",
/*56-60*/   "A Beautiful Person","The Daily Grind", "Heart of Darkness","Radioactive Mineral","Infernal Occult Skeleton",
/*61-63*/   "Auditory Mind Control","\"Quantum\" Computer", "\"The World's Best TothBrush\"",
/*64-66*/   "Flawed von Neumann Structure","Destroyed Organic Catalyst","Eric's Toy",
/*67-71*/   "The Artist's Pen", "The Wire Figure","Second Chance","Iron Wings","Degenerative Metamorphic Entity",
/*72-77*/   "The Foot of the Bed","\"Cain\"","Quantum Woodlouse","Corrosive Snail","\"Able\"","Rot Skull",
/*78-82*/   "Guilt","Old AI","Dark Form","Spontaneous Combustion Virus","\"Fernand\" the Cannibal",
/*83-86*/   "An Abandoned Row Home","Static Tower","Hand-drawn ''Cassy''","The Office of Dr. [REDACTED]",
/*87-91*/   "The Stairwell", "The Lizard King","Tophet","Apocorubik's Cube","Nostalgia",
/*92-94*/   "\"The Best of The 5th Dimension\"", "Red Sea Object","Miniature Event Horizon",
/*95-99*/   "The Atomic Adventures of Ronnie Ray-Gun", "The \"Shy Guy\"","Old Fairgrounds", "Surgeon Crabs", "The Portrait"};

    private static String[] masterListClass = {"BLOCKED","Euclid","Euclid","Euclid","Safe","Safe","Euclid",
/*8-17*/    "Euclid","Euclid","Safe","Safe","Euclid","Safe","Safe","Euclid","Keter","Keter",
/*18-27*/   "Euclid","Keter","Keter","Safe","Euclid","Euclid","Euclid","Safe","Euclid","Euclid",
/*28-37*/   "Safe","Keter","Safe","Safe","Euclid","Euclid","Safe","Keter","Safe","Euclid",
/*38-47*/   "Safe","Euclid","Euclid","Safe","Safe","Safe","Safe","Safe","Euclid","Keter",
/*48-57*/   "None","Euclid","Euclid","Safe","Euclid","Euclid","Safe","Keter","Euclid","Safe",
/*58-67*/   "Keter","Keter","Keter","Safe","Euclid","Safe","Safe","Euclid","Euclid","Safe",
/*68-77*/   "Safe","Safe","Safe","Euclid","Safe","Euclid","Euclid","Euclid","Keter","Euclid",
/*78-87*/   "Euclid","Euclid","Euclid","Euclid","Euclid","Euclid","Euclid","Safe","Safe","Euclid",
/*88-97*/   "Safe","Euclid","Keter","Safe","Safe","Euclid","Keter","Safe","Euclid","Euclid",
/*98-99*/   "Safe","Safe"};

    private static String[] masterListAccess = {"O5 CLEARANCE","L1 CLEARANCE","L1 CLEARANCE","L1 CLEARANCE",
/*5-10*/    "L1 CLEARANCE","L1 CLEARANCE","L1 CLEARANCE","L4 CLEARANCE","L1 CLEARANCE","L1 CLEARANCE",
/*11-16*/   "L2 CLEARANCE","L3 CLEARANCE","L1 CLEARANCE","L1 CLEARANCE","L2 CLEARANCE","L3 CLEARANCE",
/*17-22*/   "L3 CLEARANCE","L1 CLEARANCE","L2 CLEARANCE","L3 CLEARANCE","L1 CLEARANCE","L1 CLEARANCE",
/*23-28*/   "L2 CLEARANCE","L2 CLEARANCE","L1 CLEARANCE","L2 CLEARANCE","L4 CLEARANCE","L1 CLEARANCE",
/*29-34*/   "L3 CLEARANCE","L2 CLEARANCE","L1 CLEARANCE","L1 CLEARANCE","L2 CLEARANCE","L1 CLEARANCE",
/*35-40*/   "L4 CLEARANCE","L1 CLEARANCE","L1 CLEARANCE","L2 CLEARANCE","L1 CLEARANCE","L3 CLEARANCE",
/*41-46*/   "L2 CLEARANCE","L1 CLEARANCE","L1 CLEARANCE","L1 CLEARANCE","L1 CLEARANCE","L2 CLEARANCE",
/*47-52*/   "L1 CLEARANCE","L3 CLEARANCE","L2 CLEARANCE","L2 CLEARANCE","L1 CLEARANCE","L1 CLEARANCE",
/*53-58*/   "L2 CLEARANCE","L2 CLEARANCE","L3 CLEARANCE","L2 CLEARANCE","L1 CLEARANCE","L4 CLEARANCE",
/*59-64*/   "L3 CLEARANCE","L4 CLEARANCE","L1 CLEARANCE","L1 CLEARANCE","L1 CLEARANCE","L1 CLEARANCE",
/*65-70*/   "L3 CLEARANCE","L2 CLEARANCE","L1 CLEARANCE","L1 CLEARANCE","L1 CLEARANCE","L1 CLEARANCE",
/*71-76*/   "L2 CLEARANCE","L1 CLEARANCE","L4 CLEARANCE","L1 CLEARANCE","L1 CLEARANCE","L4 CLEARANCE",
/*77-82*/   "L2 CLEARANCE","L1 CLEARANCE","L1 CLEARANCE","L1 CLEARANCE","L3 CLEARANCE","L2 CLEARANCE",
/*83-88*/   "L2 CLEARANCE","L1 CLEARANCE","L1 CLEARANCE","L1 CLEARANCE","L2 CLEARANCE","L3 CLEARANCE",
/*89-94*/   "L1 CLEARANCE","L4 CLEARANCE","L1 CLEARANCE","L1 CLEARANCE","L2 CLEARANCE","L4 CLEARANCE",
/*95-99*/   "L1 CLEARANCE","L4 CLEARANCE","L1 CLEARANCE","L1 CLEARANCE","L2 CLEARANCE"};

    public static void list(int clearance) {

        System.out.format("\n%-12s%-50s%-12s%-25s\n","SCP-ID","SCP-NICKNAME","CLASS","ACCESS LEVEL");
        int i = 0;
        for (String scpID : masterListID) {

            String scpAccess = masterListAccess[i];
            String scpNick = "";
            String scpClass = "";
            switch(scpAccess) {
                case "L1 CLEARANCE":
                    if (clearance >= 1){
                        scpNick = masterListNick[i];
                        scpClass = masterListClass[i];
                    } else {
                        for (int j = 0; j < masterListNick[i].length(); j++) {
                            scpNick = scpNick + "■";
                        }
                        for (int j = 0; j < masterListClass[i].length(); j++) {
                            scpClass = scpClass + "■";
                        }
                    }
                    break;
                case "L2 CLEARANCE":
                    if (clearance >= 2){
                        scpNick = masterListNick[i];
                        scpClass = masterListClass[i];
                    } else {
                        for (int j = 0; j < masterListNick[i].length(); j++) {
                            scpNick = scpNick + "■";
                        }
                        for (int j = 0; j < masterListClass[i].length(); j++) {
                            scpClass = scpClass + "■";
                        }
                    }
                    break;
                case "L3 CLEARANCE":
                    if (clearance >= 3){
                        scpNick = masterListNick[i];
                        scpClass = masterListClass[i];
                    } else {
                        for (int j = 0; j < masterListNick[i].length(); j++) {
                            scpNick = scpNick + "■";
                        }
                        for (int j = 0; j < masterListClass[i].length(); j++) {
                            scpClass = scpClass + "■";
                        }
                    }
                    break;
                case "L4 CLEARANCE":
                    if (clearance >= 4){
                        scpNick = masterListNick[i];
                        scpClass = masterListClass[i];
                    } else {
                        for (int j = 0; j < masterListNick[i].length(); j++) {
                            scpNick = scpNick + "■";
                        }
                        for (int j = 0; j < masterListClass[i].length(); j++) {
                            scpClass = scpClass + "■";
                        }
                    }
                    break;
                case "O5 CLEARANCE":
                    if (clearance == 5){
                        scpNick = masterListNick[i];
                        scpClass = masterListClass[i];
                    } else {
                        for (int j = 0; j < masterListNick[i].length(); j++) {
                            scpNick = scpNick + "■";
                        }
                        for (int j = 0; j < masterListClass[i].length(); j++) {
                            scpClass = scpClass + "■";
                        }
                    }
                    break;
            }

            System.out.format("\n%-12s%-50s%-12s%-25s", scpID, scpNick, scpClass, scpAccess);
            i++;
        }
        System.out.println("\n\n");
    }
}
