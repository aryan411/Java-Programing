package exercise2;

public abstract class GameTester {
	protected String gameTesterName;
	protected boolean fullTime;
	protected double salary;
	
	public GameTester(String name,boolean isFulltime)
	{
		this.gameTesterName = name;
		this.fullTime = isFulltime;
	}
	public abstract void setSalary(double rate);
	public abstract void displayInfo();

}
