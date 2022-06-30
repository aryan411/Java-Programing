package exercise1;

public class Life extends Insurance {

	public Life(String type) {
		// TODO Auto-generated constructor stub
		super(type);	
	}

	@Override
	public void setMonthlyCost(double cost) {
		// TODO Auto-generated method stub
		this.monthlyCost = cost;
	}

	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println("Insurance Type: "+this.getInsuranceType()+"\n"+"Monthly cost: "+this.getMonthlyCost());
	}

}
