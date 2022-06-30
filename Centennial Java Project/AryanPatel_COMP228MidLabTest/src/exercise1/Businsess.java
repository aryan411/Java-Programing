package exercise1;

public abstract class Businsess {
	public int numEmp;
	public Businsess(int numemp) {
		this.numEmp = numemp;
		// TODO Auto-generated constructor stub
	}
	public abstract int numEmployee();
	@Override
	public String toString()
	{
		return "\nNumber of Employee:-  " + this.numEmp;
	}
}

