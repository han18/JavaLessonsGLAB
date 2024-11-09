import java.util.Scanner;
// must import this to use the scanner class

public class ReadingStringFromConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// first create a scanner object
		 Scanner input = new Scanner(System.in);
		
//	       System.out.print("Enter three words separated by spaces: ");
//	       // then create an input
//	       String s1 = input.next();
//	       String s2 = input.next();
//	       String s3 = input.next();
//	       //then print the input
//	       System.out.println("s1 is " + s1);
//	       System.out.println("s2 is " + s2);
//	       System.out.println("s3 is " + s3);
	       
	       // Example 2: Reading from console
	       System.out.print("Enter a character: ");
	       String s = input.nextLine();
	       char ch = s.charAt(0);
	       System.out.println("The character entered is " + ch);


	}

}
