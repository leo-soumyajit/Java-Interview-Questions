//
//### 📝 Level 2 Challenge: The Secret Spy Code
//
//**Story:**
//Rohan is an undercover spy who has intercepted a garbled enemy transmission, represented by a string `S`. The transmission contains a mix of English letters (both uppercase and lowercase) and digits.
//
//The enemy hides their daily "secret code" within the message. To find the secret code, Rohan must extract every contiguous sequence of digits, treat them as individual numbers, and calculate their **total sum**. If the transmission contains no digits at all, the secret code is `0`.
//
//Help Rohan write a program to automate this decryption.
//
//**Constraints:**
//        * The length of string `S` is between $1$ and $10^5$.
//* `S` contains only English letters (`a-z`, `A-Z`) and digits (`0-9`).
//        * A single contiguous number sequence will not exceed 15 digits (meaning it will safely fit inside a Java `long`, and the final sum will also fit in a `long`).
//
//        ---
//
//        ### 💻 Tor Boilerplate Code (Java)
//
//```java
//import java.util.*;
//
//public class TheSecretSpyCode {
//
//    // Toke sudhu ei function ta complete korte hobe
//    public static long findSecretCode(String S) {
//        // Write your code here
//
//        return 0;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        // Using nextLine() to read the entire string
//        String S = sc.nextLine();
//        System.out.println(findSecretCode(S));
//        sc.close();
//    }
//}
//```
//
//        ---
//
//        ### 🧪 Sample Test Cases & Explanation
//
//**Test Case 1: The Standard Extraction**
//        **Input:** ```text
//        abc12xyz34pqr
//```
//        **Output:** ```text
//46
//        ```
//        **Explanation:** There are two contiguous numbers hidden in the string: `12` and `34`. Their sum is `12 + 34 = 46`.
//
//        **Test Case 2: The "No Digits" Trap**
//        **Input:** ```text
//        MissionImpossible
//```
//        **Output:** ```text
//0
//        ```
//        **Explanation:** The string consists entirely of letters. Since there are no digits to extract, the secret code defaults to `0`.
//
//        **Test Case 3: The "Edge of the Cliff" Trap**
//        **Input:** ```text
//        agent007
//```
//        **Output:** ```text
//7
//        ```
//        **Explanation:** The contiguous number is `007`, which mathematically equals `7`. Notice that the number is exactly at the **end of the string** with no letters following it. This is a very specific trap where many beginner algorithms fail to add the final number before the loop ends!
//
//        ---
//
//
package StoryBased;

import com.sun.jdi.IntegerType;

import java.util.*;

public class TheSecretSpyCode {

    public static long findSecretCode(String s) {
        // Write your code here
        String helper = "";
        long sum = 0;
        for(int i = 0 ; i<s.length() ; i++){
            if(Character.isDigit(s.charAt(i))){
                helper += String.valueOf(s.charAt(i));
            }else{
                if(!helper.equals("")){
                    sum += Long.parseLong(helper);
                }
                helper = "";
            }
        }
        //sum again without this not all test cases will run
        if(!helper.equals("")){
            sum += Long.parseLong(helper);
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        System.out.println(findSecretCode(S));
        sc.close();
    }
}