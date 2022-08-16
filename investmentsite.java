package investment_tracker;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Investment_Tracking_Class {

	public Investment_Tracking_Class() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("Enter your buying Price");
		Scanner scan = new Scanner(System.in);
		double sum = 0;
		
		int day = 1;
		double buyingPrice = scan.nextDouble();
		double earnings;
		double closingPrice = 0;
		while (true) {
			
			if (closingPrice < 0) break;
			System.out.println("Enter your closing Price: ");
			closingPrice = scan.nextDouble();
			earnings = closingPrice - buyingPrice;
			
			
			if (earnings > 0) {
				System.out.println("Your earnings for day "+ day + " is "+ earnings);
			}else if(earnings < 0) {
				System.out.println("Your lost for day "+ day + " is "+ (-earnings));
			}else {
				System.out.println("You made nothing out of todays investment");
			}
			ArrayList<Double> profit = new ArrayList<Double>(40);
			profit.add(earnings);
			int i = 0;
			
			for (double x : profit)
				sum += x;
			
			System.out.println("Your investment outcome since day one (1) is " + profit + " and the profit you've made is "+ sum);
			System.out.println("-------------------------------------------------------------------------------------------------------");
			
			day++;
		}
			
		
	}

}
