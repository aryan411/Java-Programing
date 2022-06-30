package exercise2;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

// lotto class
public class Lotto {
	// list
	List<Integer> ar = new ArrayList<>();
	// constructor
	public Lotto()
	{
		SecureRandom random = new SecureRandom();
		ar.add(random.nextInt(1,9));
		ar.add(random.nextInt(1,9));
		ar.add(random.nextInt(1,9));
		
	}
	// get array of three value
	public List<Integer> getAr() {
		return ar;
	}

}
