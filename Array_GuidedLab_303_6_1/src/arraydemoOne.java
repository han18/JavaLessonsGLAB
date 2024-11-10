
public class arraydemoOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// using bracket notation 
		 // create an array
		   int[] age = {12, 4, 5, 2, 5};
		   // access each array elements
		   System.out.println("Accessing Elements of an Array:");
		   System.out.println("First Element: " + age[0]);
		   System.out.println("Second Element: " + age[1]);
		   System.out.println("Third Element: " + age[2]);
		   System.out.println("Fourth Element: " + age[3]);
		   System.out.println("Fifth Element: " + age[4]);

		   // Example 2: Using for Loop
		   // create an array
		   int[] age12 = {12, 4, 5};

		   // loop through the array
		   // using for loop
		   System.out.println("Using for Loop:");
		   for(int i = 0; i < age12.length; i++) {
		     System.out.println(age12[i]); 
		   }
//		   Example 3: Iterating Over an Array using 
//		   EnhancedForLoop	   
		   String[] names = { "New York", "Dallas", "Las Vegas", "Florida" };
           for (String name : names) {
                 System.out.println(name);
               }
//           Example 4: Compute the Sum and Average of Array 
//           Elements

           int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
           int sum = 0;
           Double average;
           
           // access all elements using for each loop
           // add each element in sum
           for (int number: numbers) {
             sum += number;
           }
          
           // get the total number of elements
           int arrayLength = numbers.length;

           // calculate the average
           // convert the average from int to double
           average =  ((double)sum / (double)arrayLength);

           System.out.println("Sum = " + sum);
           System.out.println("Average = " + average);



	}

}
