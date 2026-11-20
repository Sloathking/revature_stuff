package week2.day2.assignment1;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read employee details from the HR console
        System.out.print("Enter Employee ID: ");
        String employeeId = scanner.nextLine();

        System.out.print("Enter Employee Name: ");
        String employeeName = scanner.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        // Calculate all salary components
        double hra = calculateHRA(basicSalary);
        double da = calculateDA(basicSalary);
        double grossSalary =
                calculateGross(basicSalary, hra, da);
        double professionalTax =
                calculateProfessionalTax(grossSalary);
        double netSalary =
                grossSalary - professionalTax;

        // Display the complete salary breakdown
        displaySalaryDetails(
                employeeId,
                employeeName,
                basicSalary,
                hra,
                da,
                grossSalary,
                professionalTax,
                netSalary
        );

        scanner.close();
    }

    /*
     * Calculates HRA as 20 percent of the basic salary.
     */
    public static double calculateHRA(double basic) {
        return basic * 20 / 100;
    }

    /*
     * Calculates DA as 10 percent of the basic salary.
     */
    public static double calculateDA(double basic) {
        double da = basic * 10 / 100;
        return da;
    }

    /*
     * Calculates gross salary as basic salary plus HRA and DA.
     */
    public static double calculateGross(
            double basic,
            double hra,
            double da) {
        return basic + hra + da;
    }

    /*
     * Applies professional tax of Rs. 200 if gross salary is
     * strictly greater than Rs. 20,000.
     * The professional tax is zero at exactly Rs. 20,000.
     */
    public static double calculateProfessionalTax(double gross) {
        if (gross > 20000) {
            return 200.0;
        } else {
            return 0.0;
        }
    }

    /*
     * Displays the employee information and salary breakdown
     * in an HR-friendly formatted output.
     */
    public static void displaySalaryDetails(
            String employeeId,
            String employeeName,
            double basic,
            double hra,
            double da,
            double gross,
            double professionalTax,
            double netSalary) {

        System.out.println("\n===== Salary Breakdown =====");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.printf("Basic Salary: Rs. %.2f%n", basic);
        System.out.printf("HRA (20%%): Rs. %.2f%n", hra);
        System.out.printf("DA (10%%): Rs. %.2f%n", da);
        System.out.printf("Gross Salary: Rs. %.2f%n", gross);
        System.out.printf("Professional Tax: Rs. %.2f%n",
                professionalTax);
        System.out.printf("Net Salary: Rs. %.2f%n", netSalary);
    }
}
