package newassignment;
import java.util.*;

public class Gasstation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   
		        Scanner sc = new Scanner(System.in);

		        // Input for Gas Station 1
		        System.out.println("Enter details for Gas Station 1:");
		        String name1 = sc.nextLine();
		        String address1 = sc.nextLine();
		        double price1 = sc.nextDouble();
		        sc.nextLine(); // consume newline

		        // Input for Gas Station 2
		        System.out.println("Enter details for Gas Station 2:");
		        String name2 = sc.nextLine();
		        String address2 = sc.nextLine();
		        double price2 = sc.nextDouble();
		        sc.nextLine(); // consume newline

		        // Input for Gas Station 3
		        System.out.println("Enter details for Gas Station 3:");
		        String name3 = sc.nextLine();
		        String address3 = sc.nextLine();
		        double price3 = sc.nextDouble();

		        // Calculating average price
		        double averagePrice = (price1 + price2 + price3) / 3;

		        // Formatting and printing the report
		        System.out.println("\nGas Station Report:");
		        System.out.println(name1, address1, price1);
		        System.out.println(name2, address2, price2);
		        System.out.println(formatGasStation(name3, address3, price3));
		        System.out.printf("Average Price: %.2f%n", averagePrice);

		        sc.close();
		    

		    // Method to format gas station details
		    private static  formatGasStation(String name, String address, double price) {
		        return String.format("%s, %s, %.1f", name, address, price);
		    }
		


	}

}
