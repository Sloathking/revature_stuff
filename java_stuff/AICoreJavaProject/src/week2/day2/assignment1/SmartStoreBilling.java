package week2.day2.assignment1;

import java.util.Scanner;

public class SmartStoreBilling {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept customer and product details
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();

        System.out.print("Enter product price: ");
        double productPrice = scanner.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        double totalAmount = productPrice * quantity;
        double discountAmount = calculateDiscount(totalAmount);
        double discountPercentage = 0.0;

        if (totalAmount >= 5000) {
            discountPercentage = 10.0;
        } else if (totalAmount >= 1000) {
            discountPercentage = 5.0;
        }

        double finalAmount = totalAmount - discountAmount;

        printBill(
            customerName,
            productName,
            totalAmount,
            discountPercentage,
            discountAmount,
            finalAmount
        );

        scanner.close();
    }

    /*
     * Calculates the discount amount in rupees.
     * The business rules remain unchanged:
     * 10% for Rs. 5000 or above
     * 5% for Rs. 1000 to Rs. 4999
     * 0% for amounts below Rs. 1000
     */
    public static double calculateDiscount(double totalAmount) {
        double discountPercentage = 0.0;

        if (totalAmount >= 5000) {
            discountPercentage = 10.0;
        } else if (totalAmount >= 1000) {
            discountPercentage = 5.0;
        }

        return totalAmount * discountPercentage / 100;
    }

    /*
     * Prints all billing information in the required format.
     */
    public static void printBill(
            String customerName,
            String productName,
            double totalAmount,
            double discountPercentage,
            double discountAmount,
            double finalAmount) {

        System.out.println("\n===== SmartStore Bill =====");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Product Name: " + productName);
        System.out.printf("Total Amount: Rs. %.2f%n", totalAmount);
        System.out.printf("Discount Percentage: %.2f%%%n", discountPercentage);
        System.out.printf("Discount Amount: Rs. %.2f%n", discountAmount);
        System.out.printf("Final Amount: Rs. %.2f%n", finalAmount);
    }

}
