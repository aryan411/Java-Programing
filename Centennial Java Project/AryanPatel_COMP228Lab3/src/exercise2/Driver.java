package exercise2;

import javax.swing.JOptionPane;


public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String type;
		double salary;
		String name;
		String user = "";
		
		while(!user.equalsIgnoreCase("exit"))
		{
			name = JOptionPane.showInputDialog("Game Tester's Name");
			type = JOptionPane.showInputDialog("Game Tester's job fulltime or parttime?");
			
			
			if(type.equalsIgnoreCase("parttime"))
			{
				salary = Double.parseDouble(JOptionPane.showInputDialog("What is Hourly rate"));
				GameTester temp = new PartTimeGameTester(name,false);
				temp.setSalary(salary);
				temp.displayInfo();
			}
			else if(type.equalsIgnoreCase("fulltime"))
			{
				salary = Double.parseDouble(JOptionPane.showInputDialog("What is Monthly salary"));
				GameTester temp = new PartTimeGameTester(name,true);
				temp.setSalary(salary);
				temp.displayInfo();
			}
			user = JOptionPane.showInputDialog("Type \" exit\" if you want to exit or type anything");
		}

	}

}
