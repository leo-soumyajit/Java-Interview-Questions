package Cognizant;

import java.util.*;

public class PrintFrequencyOfEachChar {

    public static void printFrequency(String str) {
        HashMap<Character,Integer> map = new LinkedHashMap<>();
        char[] arr = str.toCharArray();
        for(int i =0;i< arr.length ; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(char key: map.keySet()){
            System.out.println(key+"="+map.get(key));
        }
    }

    public static String getFrequency(String str) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        char[] arr = str.toCharArray();
        for(int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        for(char key : map.keySet()) {
            sb.append(key).append("=").append(map.get(key)).append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String test1 = "apple";
        String test2 = "cognizant";

        System.out.println("--- Test Case 1: " + test1 + " ---");
        printFrequency(test1);

        System.out.println("\n--- Test Case 2: " + test2 + " ---");
        printFrequency(test2);
    }
}
//📝 Problem 1: Print Frequency of Each Character
//Sample Test Cases:
//
//Test Case 1:
//
//Input: "apple"
//
//Output:
//a=1
//p=2
//l=1
//e=1
//
//Test Case 2:
//
//Input: "cognizant"
//
//Output:
//c=1
//o=1
//g=1
//n=2
//i=1
//z=1
//a=1
//t=1