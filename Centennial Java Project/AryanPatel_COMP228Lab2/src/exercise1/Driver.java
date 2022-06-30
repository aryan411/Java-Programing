package exercise1;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

// driver class
public class Driver {

	// main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// random number for right answer
		SecureRandom rendomRR = new SecureRandom();
		// random number for wrong answer
		SecureRandom rendomWR = new SecureRandom();
		// number of right answer
		int rA = 0;
		// number of wrong answer
		int wA = 0;
		List<Integer> queNum = new ArrayList<>(Arrays.asList(0,1,2,3,4)); 
		Collections.shuffle(queNum);
		// Quiz object
		Quiz q = new Quiz();
		// input string
		String input = "";
		System.out.println("Hello! \nLet's start the quiz\n To start press 's' or press 'e' to exit");
		input = JOptionPane.showInputDialog("To start press 's' or press 'e' to exit");
		if (input.equalsIgnoreCase("s"))
			q.createQuestions();
		int totalQ = 0;
		// show questions 
		while (!input.equals("e") && totalQ < 5) {
			
			System.out.println(q.getQuestions().get(queNum.get(totalQ)));
			int ix = 0;
			for (String o : (q.getOptions().get(queNum.get(totalQ))))
				System.out.println(Integer.toString(ix++)+") "+o);
			input = JOptionPane.showInputDialog("Select right answer:");
			int i = Integer.parseInt(input);
			while (i > 5 && i < 0) {
				input = JOptionPane.showInputDialog("Please select valid option");
				i = Integer.parseInt(input);
			}
			
			if (q.checkAns(queNum.get(totalQ), q.getOptions().get(queNum.get(totalQ)).get(i))) {
				System.out.println(q.getRightAnsReply().get(rendomRR.nextInt(4)) );
				rA++;

			} else {
				System.out.println(q.getWrongAnsReply().get(rendomWR.nextInt(4)));
				wA++;
			}
			totalQ++;
			if (totalQ == 5) {
				System.out.println("correct:- "+  Integer.toString(rA) + "     Incoreect:- "+ Integer.toString(wA));
				System.out.println("You have got" + Integer.toString((100 * rA) / 5) + "per. in this quiz ");
			}
		}

	}

}
