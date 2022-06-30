package exercise1;

import javax.swing.JOptionPane;

public class PatMidTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int employee;
		double income;
		int year;
		employee =Integer.parseInt(JOptionPane.showInputDialog("How many employees work in your business?"));
		income = Double.parseDouble(JOptionPane.showInputDialog("How much do you earn from your grocery business?"));
		GroceryBusiness b1 = new GroceryBusiness(employee, income);
		System.out.println("The Data You Just Entered for Your Grocery Business:");
		System.out.println(b1);
		year = Integer.parseInt(JOptionPane.showInputDialog("In which year you established your grocery business?"));
		b1.yearEstablished(year);
		System.out.println("Price List:");
		b1.onionPrice(Double.parseDouble(JOptionPane.showInputDialog("What is the price for onion per kilo?")));
		b1.cokePrice(Double.parseDouble(JOptionPane.showInputDialog("What is the price for coke per bottle?")));
	}

}
