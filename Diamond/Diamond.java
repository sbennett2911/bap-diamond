/***********************************************************************
 Program Name: Diamond.java
 Programmer's Name: Steven Bennett
 Program Description: Program allows user to choose the number of rows
 to create a diamond of asteriks.
 ***********************************************************************/ 

import javax.swing.JOptionPane;

public class Diamond {

	public static void main(String[] args) {
		//declare variables
		int diamondRows = 0;
		boolean done = false;
		
		while(!done){
		
			//Get user input and validate that number is odd and at least 3
			diamondRows = Integer.parseInt(JOptionPane.showInputDialog("Enter number of rows for diamond."));
		
			if ((diamondRows >= 3) && (diamondRows % 2 == 1)){
				diamondOfAsteriks(diamondRows);
				done = true;
			} else {
				JOptionPane.showMessageDialog(null, "Invalid input! Number must be greater than 3 and odd",
						"D A T A  E R R O R", JOptionPane.ERROR_MESSAGE);
			}
		}
		
		//terminate program
		System.exit(0);
	}

	public static void diamondOfAsteriks(int rows){
		/*For loop structures were adapted from 
		*http://www.java2s.com/Tutorial/Java/0080__Statement-Control/PrintoutaDiamond.htm*/
		for (int i = 1; i <= rows; i += 2) {
  	      for (int j = 0; j < rows - i / 2; j++)
  	        System.out.print(" ");

  	      for (int j = 0; j < i; j++)
  	        System.out.print("*");

  	      System.out.print("\n");
  	    }

  	    for (int i = rows - 2; i > 0; i -= 2) {
  	      for (int j = 0; j < rows - i / 2; j++)
  	        System.out.print(" ");

  	      for (int j = 0; j < i; j++)
  	        System.out.print("*");

  	      System.out.print("\n");
  	    }
	}		
}
