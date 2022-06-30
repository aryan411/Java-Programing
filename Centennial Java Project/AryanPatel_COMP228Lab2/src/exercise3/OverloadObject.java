package exercise3;

public class OverloadObject {
	// four different overloaded static methods 
	public static void overLoading()
	{
		System.out.println("Overloaded function with zero parameter");
	}
	public static void overLoading(String s)
	{
		System.out.println("Overloaded function with 1 parameter\n parameter s:- "+ s);
	}
	public static void overLoading(String s, int i)
	{
		System.out.println("Overloaded function with 1 parameter\n parameter s:- "+ s+"\nparameter i:- "+Integer.toString(i));
	}
	public static void overLoading(int i, int s)
	{
		System.out.println("function with two int  parameters ");
	}

}
