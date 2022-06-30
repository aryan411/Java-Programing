package exercise1;

public class Health extends Insurance {

	public Health(String type) {
		super(type);
		// TODO Auto-generated constructor stub
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
