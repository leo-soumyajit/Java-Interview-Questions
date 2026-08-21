package Cognizant;

/**
 * 📝 Problem: Calculate Total Stock Value
 *
 * Problem Statement:
 * You are given a string S that contains various product names, their prices,
 * and quantities in the following format:
 * Product1:Price1:Quantity1;Product2:Price2:Quantity2...
 *
 * Your task is to find and return an integer value representing the total
 * value of the stock. The total value is calculated by multiplying the
 * price of each product by its quantity and summing these values.
 *
 * Input Specification:
 * input1 : A string S representing multiple products, their prices, and
 *          quantities, formatted as described above.
 *
 * Output Specification:
 * Return an integer value representing the total value of the stock.
 */
public class TotalStockValue {

    public static int calculateTotalValue(String input1) {

        int totalValue = 0;

        // Step 1: ';' diye string take bhanga (Product gulo alada kora)
        String[] arr = input1.split(";");

        // Step 2: Protita product er upor loop chalano
        for (int i = 0; i < arr.length; i++) {

            // Step 3: ':' diye product er details bhanga
            String[] details = arr[i].split(":");

            // details[0] = Product Name (Lagbe na)
            // details[1] = Price (String)
            // details[2] = Quantity (String)

            // Step 4: String theke Integer-e convert kora
            int price = Integer.parseInt(details[1]);
            int quantity = Integer.parseInt(details[2]);

            // Step 5: Gun kore total-e jog kora
            totalValue += (price * quantity);
        }

        return totalValue;
    }

    public static void main(String[] args) {
        // Test Case 1
        String input1 = "Apple:250:10;Banana:120:15;Orange:300:5";
        System.out.println("--- Test Case 1 ---");
        System.out.println("Input: " + input1);
        System.out.println("Output: " + calculateTotalValue(input1));
        // Expected Output: 5800

        // Test Case 2
        String input2 = "Pen:10:50;Pencil:5:100;Eraser:3:20";
        System.out.println("\n--- Test Case 2 ---");
        System.out.println("Input: " + input2);
        System.out.println("Output: " + calculateTotalValue(input2));
        // Expected Output: 1060
    }
}