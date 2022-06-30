package exercise2;

public class FullTimeGameTester extends GameTester {

	public FullTimeGameTester(String name, boolean isFulltime) {
		super(name, isFulltime);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void setSalary(double salary) {
		this.salary = salary;
		// TODO Auto-generated method stub
	}
	
	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println("Name: "+this.gameTesterName+"\nGame Tester: "+(this.fullTime ? "Full timer" : "Part Timer")+"\n"+"Monthly salary: "+this.salary);
	}

}
