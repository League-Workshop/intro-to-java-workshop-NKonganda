package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
public static void main(String[] args) {
	int  wow;
	Random r = new Random();
	 wow = r.nextInt(4);
	 System.out.println(wow);
	 String WoW = JOptionPane.showInputDialog("Show your favorite number 0-3");
	 int w = 0;
	try {	
	  w = Integer.parseInt(WoW);
	} catch(Exception Ee) {
	}
	if (w==0) {
	 System.out.println("awesome");
	 JOptionPane.showMessageDialog(null,"AmAzInG");
	}
	 if (w==1) {
	 System.out.println("AwEsOmE");
	 JOptionPane.showMessageDialog(null,"AwEsOme");
	 }
	 if (w==2) {
	 System.out.println("bad");
	 JOptionPane.showMessageDialog(null,"bad");
	 }
	 if (w==3) {
	 System.out.println("stop");
	 JOptionPane.showMessageDialog(null,"stop");
	 }
	 else {
		 for (int i = 0; i < Long.MAX_VALUE; i++) {
			 JOptionPane.showMessageDialog(null,"Put in a number 0-3");
		}
	 System.out.println("Put in a number 0-3");		
	 JOptionPane.showMessageDialog(null,"You chose wrong");
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 }
}
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"

	// 3. Print out this variable

	// 4. Get the user to enter something that they think is awesome

	// 5. If the random number is 0

	// -- tell the user whatever they entered is awesome!

	// 6. If the random number is 1

	// -- tell the user whatever they entered is ok.

	// 7. If the random number is 2

	// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3

	// -- write your own answer

}


