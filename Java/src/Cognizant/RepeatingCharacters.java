package Cognizant;

import java.util.*;

public class RepeatingCharacters {

    public static void findRepeating(String text) {

        // Step 1: Create a LinkedHashMap to store frequencies and maintain order
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        // Step 2: Convert string to char array
        char[] arr = text.toCharArray();

        for(int i =0 ; i< arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        StringBuilder str = new StringBuilder();
        for(char key : map.keySet()){

            if(map.get(key)>1){
                str.append(key).append(" ");
            }
        }
        System.out.println(str.toString().trim());

    }

    public static void main(String[] args) {
        String test1 = "programming";
        String test2 = "cognizant";

        System.out.println("--- Test Case 1 ---");
        findRepeating(test1); // Expected: r g m

        System.out.println("\n--- Test Case 2 ---");
        findRepeating(test2); // Expected: n
    }
}