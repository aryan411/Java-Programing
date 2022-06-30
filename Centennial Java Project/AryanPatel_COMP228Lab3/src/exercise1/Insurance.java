package exercise1;

public abstract class Insurance {
	private String insuranceType;
	protected double monthlyCost;
	public Insurance(String type)
	{
		this.insuranceType = type;
	}
	public String getInsuranceType() {
		return insuranceType;
	}
	public double getMonthlyCost() {
		return monthlyCost;
	}
	public abstract void setMonthlyCost(double cost);
	public abstract void displayInfo();
}
