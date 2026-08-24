package Cognizant;

/**
 * 📝 Problem: Amazon Cryptography (Barcode Generator)
 *
 * Problem Statement:
 * Amazon wants to apply cryptography to its barcode scanner printed on items.
 * Each item already has an item number. Your job is to generate this
 * cryptographed barcode number that will be printed. The rule is as follows:
 *
 * Accept a crypto key C from the user. Each digit of the item number is replaced
 * with a new character/digit. The replacement value is calculated by adding C
 * to the original digit.
 * - If the resulting value is less than 10, print the digit.
 * - Else (if the result is 10 or greater), print a character from the general
 *   alphabets post 10 (e.g., 10 -> A, 11 -> B, 12 -> C, and so on).
 *
 * Input Specification:
 * input1 : A string representing the order number (item number).
 * input2 : An integer C representing the crypto key.
 *
 * Output Specification:
 * Return a string representing the cryptographed barcode number.
 *
 * Example 1:
 * input1 : "46734"
 * input2 : 2
 * Output : "68956"
 *
 * Explanation:
 * Original digits: 4, 6, 7, 3, 4
 * Key (C) = 2
 * New digits: (4+2)=6, (6+2)=8, (7+2)=9, (3+2)=5, (4+2)=6
 * Since all are < 10, output is "68956".
 *
 * Example 2 (Custom to show alphabet logic):
 * input1 : "89"
 * input2 : 3
 * Output : "BC"
 *
 * Explanation:
 * - 8 + 3 = 11. Since 11 >= 10, it maps to alphabet 'B' (10=A, 11=B).
 * - 9 + 3 = 12. Since 12 >= 10, it maps to alphabet 'C' (12=C).
 * Output is "BC".
 */
public class AmazonCryptography {

    public static String generateBarcode(String s, int key) {

        // Tor logic ekhane likh...

        char[] arr = s.toCharArray();
        StringBuilder str = new StringBuilder();
        for (int i = 0 ; i< arr.length;i++){
            int no = Integer.parseInt(String.valueOf(arr[i]));
            //to get exactly same no from char minus with 0
            //int no = arr[i]-'0';
            no+=key;
            if(no<10){
                str.append(no);
            }else{

                str.append((char)('A'+no-10));
            }
        }
        return str.toString(); // Replace with actual barcode
    }

    public static void main(String[] args) {
        // Test Case 1 (From Image)
        String orderNumber1 = "46734";
        int key1 = 2;
        System.out.println("--- Test Case 1 ---");
        System.out.println("Input: " + orderNumber1 + ", " + key1);
        System.out.println("Output: " + generateBarcode(orderNumber1, key1));
        // Expected Output: 68956

        // Test Case 2 (Custom for Alphabets)
        String orderNumber2 = "89";
        int key2 = 3;
        System.out.println("\n--- Test Case 2 ---");
        System.out.println("Input: " + orderNumber2 + ", " + key2);
        System.out.println("Output: " + generateBarcode(orderNumber2, key2));
        // Expected Output: BC
    }
}