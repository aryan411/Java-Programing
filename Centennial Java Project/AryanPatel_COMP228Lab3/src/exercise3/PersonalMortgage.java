package exercise3;

public class PersonalMortgage extends Mortgage {

	public PersonalMortgage(String cName, double amountOfMortgage, float rate, Integer... term) {
		super(cName, amountOfMortgage, rate+2, term);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getMortgageInfo() {
		// TODO Auto-generated method stub
		System.out.println("Type of Mortgage:- Personal"+"\nCustomer Name:- "+ this.cName+"\nMortgage Number:- "+this.mNumber+"\nAmount of Mortgage:- "+ this.amountOfMortgage +"\n Interest rate:- "+this.rate+"\nTerm:- "+this.term+"\n");
	}

}
