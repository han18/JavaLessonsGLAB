import java.util.Scanner;
public class loopdemoone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int n = 5;
		    // for loop  
		    for (int i = 1; i <= n; ++i) {
		      System.out.println("Java is fun");
		    }
//		    Example 2: Display Sum of n Natural Numbers
		    
		    int sum = 0;
		    int n1 = 1000;
		    // for loop
		    for (int i = 1; i <= n1; ++i) {
		      // body inside for loop
		      sum += i;     // sum = sum + i
		    }
		    System.out.println("Sum = " + sum);
		    

//		    Example 3: Palindrome to check if a word can be read in reverse
		    String original, reverse = ""; // Objects of String class
		       Scanner in = new Scanner(System.in);
		System.out.println("Enter a string/number to check if it is a palindrome");
		       original = in.nextLine();
		       int length = original.length();
		       for ( int i = length - 1; i >= 0; i-- )
		           reverse = reverse + original.charAt(i);
		       if (original.equals(reverse)) {
		         System.out.println("Entered string/number is a palindrome.");
		       }else
		       {
		         System.out.println("Entered string/number isn't a palindrome.");
		       }

//		       Example 4: Pyramid - PyramidExample
//		       In this example, we are going to see another application 
//		       of for loop, which is a nested for loop. A nested for loop refers to a 
//		       for loop within a for loop.
		       
		       for(int i=1;i<=5;i++){
		    	   for(int j=1;j<=i;j++){
		    		   for(int k=1; k<=j; k++)
		    	       System.out.print("* ");
		    	   }
		    	   System.out.println();//new line
		    	  }



		  }

	}


