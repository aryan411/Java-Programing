package exercise2;

import java.util.List;

import javax.swing.JOptionPane;

// lotto driver class
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Lotto game");
		int i;
		// five round of lotto game 
		for( i=0;i<5;i++)
		{
			// input from user
			int input = Integer.parseInt(JOptionPane.showInputDialog("Enter Number Between 3 and 27"));
			int lottoNum = 0;
			// initiate object with array with three integer
			List<Integer> lottoArray = new Lotto().getAr(); 
			for(int j = 0; j < lottoArray.size(); j++ )
			{
				lottoNum += lottoArray.get(j);
			}
			if(lottoNum == input)
			{
				System.out.println("congratulation! You won!");
				i=7;
			}
			else 
			{
				System.out.println("Lotto number is:- "+ Integer.toString(lottoNum)+"\nTry again");
			}
		}
		if(i==5)
			System.out.println("Sorry! You lost");
		
		
	}

}
