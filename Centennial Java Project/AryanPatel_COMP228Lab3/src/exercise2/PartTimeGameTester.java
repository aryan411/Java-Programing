package exercise2;

public class PartTimeGameTester extends GameTester {

	public PartTimeGameTester(String name, boolean isFulltime) {
		super(name, isFulltime);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setSalary(double rate) {
		// TODO Auto-generated method stub
		this.salary = rate;

	}
	
	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println("Name: "+this.gameTesterName+"\nGame Tester: "+(this.fullTime ? "Full timer" : "Part Timer")+"\n"+"Hourly rate: "+this.salary);
	}

}
