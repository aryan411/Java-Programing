package exercise1;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String type;
		double cost;
		String user = "";
		List<Insurance> insuArray = new ArrayList<>();
		while(!user.equalsIgnoreCase("exit"))
		{
			type = JOptionPane.showInputDialog("Insurance Type Life or Health");
			cost = Double.parseDouble(JOptionPane.showInputDialog("What is Monthly cost of this insuarnce"));
			
			if(type.equalsIgnoreCase("health"))
			{
				Insurance temp = new Health(type);
				temp.setMonthlyCost(cost);
				insuArray.add(temp);
				temp.displayInfo();
			}
			else if(type.equalsIgnoreCase("life"))
			{
				Insurance temp = new Health(type);
				temp.setMonthlyCost(cost);
				insuArray.add(temp);
				temp.displayInfo();
			}
			user = JOptionPane.showInputDialog("Type \" exit\" if you want to exit or type anything");
		}
		
		
		
	}

}
