package A2;

import java.util.HashMap;
import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        HashMap< String, String> phonebook = new HashMap<>();
        phonebook.put("Jessie", "+436779874441");
        phonebook.put("Messie", "+436773874543");
        phonebook.put("Luvio", "+4369452662970");
        phonebook.put("Kilu", "+436991410544");
        phonebook.put("Markus", "+436974484188");
        phonebook.put("David", "+436991827107");
        phonebook.put("Moritz", "+436981548488");
        phonebook.put("Nikola", "+438548748848");
        phonebook.put("Daniel", "+436987447747");
        phonebook.put("Jasmine", "+433654879977");

        String rules = "\nPress the number to choose action:\nTo Add number press: 1\nTo Remove number press: 2\nTo Search for a Person press: 3\nTo Print all numbers press: 4\nTo Exit press: 5";

        boolean proceed = true;

        while(proceed) {
            System.out.println(rules);
            Scanner in = new Scanner(System.in);
            int theCommand = in.nextInt();
            switch (theCommand) {
                case 5:
                    System.out.println("Thank you for using our phonebook");
                    proceed = false;
                    break;
                case 4:
                    System.out.println("--Printing all the phone contacts--");
                    for (String contact : phonebook.keySet())
                    System.out.println("Name: " + contact + "   Number: " + phonebook.get(contact));
                    break;
                case 3:
                    System.out.println("Enter the name of the person");
                    in = new Scanner(System.in);
                    String name = in.nextLine();
                    if (phonebook.containsKey(name)) {
                        System.out.println("The phone number of " + name + " is: " + phonebook.get(name));
                    } else {
                        System.out.println("Contact not found..");
                    }
                    break;
                case 2:
                    System.out.println("Which contact you want to remove?");
                    in = new Scanner(System.in);
                    name = in.nextLine();
                    if(phonebook.containsKey(name)){
                        phonebook.remove(name);
                        System.out.println("contact " + name + " successfully removed");
                    } else {
                        System.out.println("Contact not found..");
                    }
                    break;
                case 1:
                    System.out.println("Please add the name and the number to the phonebook\n Enter Name:");
                    in = new Scanner(System.in);
                    name = in.nextLine();
                    System.out.println("Please add the number for " + name + ":");
                    in = new Scanner(System.in);
                    String phoneNumber = in.nextLine();
                    phonebook.put(name, phoneNumber);
                    System.out.println("Successfully added contact");
                    break;
            }
        }



    }



}
