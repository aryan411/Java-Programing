package exercise3;

public abstract class Mortgage implements MortgageConstants {
	public int mNumber;
	public String cName;
	public double amountOfMortgage;
	protected float rate;
	public int term = shTMortgage;
	private static int id = 1;
	
	public Mortgage(String cName, double amountOfMortgage, float rate, Integer...term)
	{
		this.amountOfMortgage = amountOfMortgage;
		this.cName = cName;
		this.rate = rate;
		if(term.length > 0)
		{
			this.term = term[0];
		}
		this.mNumber = Mortgage.id++;
	}
	public abstract void getMortgageInfo(); 
}
