package A1;

import java.util.HashMap;
import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        HashMap<String, String> theMap = new HashMap<>();
        theMap.put("yellow", "banana");
        theMap.put("red", "apple");
        theMap.put("orange", "carrot");
        theMap.put("green", "watermelon");

        System.out.println(theMap.get("green"));
        System.out.println("Which key you wanna check?");
        Scanner in = new Scanner(System.in);
        String toCheck = in.nextLine();
        if(theMap.containsKey(toCheck)){
            System.out.println("The map has the key: " + toCheck);
        } else {
            System.out.println("The map don't have the key: " + toCheck);
        }
        System.out.println("Which value you wanna check?");
        in = new Scanner(System.in);
        toCheck = in.nextLine();
        if(theMap.containsValue(toCheck)){
            System.out.println("The map has the value: " + toCheck);
        } else {
            System.out.println("The map don't have the value: " + toCheck);
        }

        System.out.println("The no. of key/value pairs is:" + theMap.size() + "\n---------");

        for(String key: theMap.keySet())
            System.out.println(key + ": " + theMap.get(key));

        theMap.remove("red");
        System.out.println("-------------red removed---------");

        for(String key: theMap.keySet())
            System.out.println(key + ": " + theMap.get(key));

        System.out.println("---replace a value -----");
        theMap.replace("orange", "oranges");
        System.out.println("after replacing");
        for(String key: theMap.keySet())
            System.out.println(key + ": " + theMap.get(key));

        System.out.println("---replace a key if its mapped to particular value  -----");
        theMap.replace("green", "watermelon", "apple");
        System.out.println("after replacing");
        for(String key: theMap.keySet())
            System.out.println(key + ": " + theMap.get(key));

        theMap.clear();
        System.out.println("The no. of key/value pairs is:" + theMap.size());

    }
}
