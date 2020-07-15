package A3;

import java.util.HashMap;
import java.util.Scanner;

public class A3 {

    public static void main(String[] args) {
        HashMap<String, String[]> dictionary = new HashMap<>();
        dictionary.put("angst", new String[]{"fear", "when you are afraid :)"});
        dictionary.put("hunger", new String[]{"hunger", "when you are hungry :)"});

        //System.out.println(dictionary.get("angst")[0]);

        String rules = "\nPress the number to choose action:\nTo Add word press: 1\nTo Remove word press: 2\nTo Search for a word press: 3\nTo Print the whole dictionary press: 4\nTo Exit press: 5";

        boolean proceed = true;

        while(proceed) {
            System.out.println(rules);
            Scanner in = new Scanner(System.in);
            int theCommand = in.nextInt();
            switch (theCommand) {
                case 5:
                    System.out.println("Thank you for using our dictionary");
                    proceed = false;
                    break;
                case 4:
                    System.out.println("--Printing the whole dictionary--");
                    for (String word : dictionary.keySet())
                        System.out.println("(de): " + word + "  (en): " + dictionary.get(word)[0] + " - " + dictionary.get(word)[1]);
                    break;
                case 3:
                    System.out.println("Enter the word you are looking for");
                    in = new Scanner(System.in);
                    String name = in.nextLine();
                    if (dictionary.containsKey(name)) {
                        System.out.println("Word: " + name + "   Meaning: " + dictionary.get(name)[0] + " - " + dictionary.get(name)[1]);
                    } else {
                        System.out.println("Word not found..");
                    }
                    break;
                case 2:
                    System.out.println("Which word you want to remove?");
                    in = new Scanner(System.in);
                    name = in.nextLine();
                    if(dictionary.containsKey(name)){
                        dictionary.remove(name);
                        System.out.println("Word " + name + " successfully removed");
                    } else {
                        System.out.println("Word not found..");
                    }
                    break;
                case 1:
                    System.out.println("Please add the word, the meaning and the description to the dictionary\n Enter word:");
                    in = new Scanner(System.in);
                    name = in.nextLine();
                    System.out.println("Please add the meaning for " + name + ":");
                    in = new Scanner(System.in);
                    String meaning = in.nextLine();
                    System.out.println("Please add the description for " + name + ":");
                    in = new Scanner(System.in);
                    String description = in.nextLine();
                    dictionary.put(name, new String[]{meaning, description});
                    System.out.println("Successfully added word");
                    break;
            }
        }
    }

}
