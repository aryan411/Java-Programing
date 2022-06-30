package exercise3;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Mortgage> mg = new ArrayList<>();
		int i = 0;
		while(i<3)
		{
			String cname = JOptionPane.showInputDialog("What is customer name?");
			String type = JOptionPane.showInputDialog("Mortgage Type 'buisness' or 'personal'");
			double MortgageAmount =Double.parseDouble(JOptionPane.showInputDialog("Total Mortgage Amount"));
			int term = Integer.parseInt(JOptionPane.showInputDialog("how many years 1,3,5"));
			while(MortgageAmount > MortgageConstants.maxMortgageAmount)
			{
				System.out.println("Morgage is not allowed mor than "+MortgageConstants.maxMortgageAmount);
				MortgageAmount =Double.parseDouble(JOptionPane.showInputDialog("Total Mortgage Amount"));
				
			}
			if(type.equalsIgnoreCase("buisness"))
			{
				mg.add(new BuisnessMortgage(cname, MortgageAmount, 12, term ));
			}
			else if(type.equalsIgnoreCase("personal"))
			{
				mg.add(new PersonalMortgage(cname, MortgageAmount, 12, term ));
			}
			i++;
		}
		for(Mortgage m: mg)
		{
			m.getMortgageInfo();
		}
		
	}

}
