package exercise1;

public class GroceryBusiness extends Businsess implements Coke, Onion {
	public double groceryIncome;
	public double onionPrice;
	public double cokePrice;
	public int year;
	
	public GroceryBusiness(int numemp, double gIncome) {
		super(numemp);
		this.groceryIncome = gIncome;
		// TODO Auto-generated constructor stub
	}
	public void yearEstablished(int year)
	{
		System.out.println("You established your business in year:- "+year);
		this.year = year;
	}
	@Override
	public void onionPrice(double price) {
		// TODO Auto-generated method stub
		this.onionPrice = price;
		System.out.println("The onion price per kilo is:- "+price);
	}

	@Override
	public void cokePrice(double price) {
		// TODO Auto-generated method stub
		System.out.println("The price per bottle of Coke is:- "+price);
		this.cokePrice = price;
	}

	@Override
	public int numEmployee() {
		// TODO Auto-generated method stub
		return this.numEmp;
	}
	@Override
	public String toString()
	{
		return "\nNumber of Employees in Your Business:-  " + this.numEmp +
				"\ngroceryIncome:- "+this.groceryIncome;
	}

}
