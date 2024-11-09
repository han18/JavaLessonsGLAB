import java.util.Arrays;

public class lengthDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String str1 = "Java";
	        String str2 = "";

	        // checks the length of the string
	        System.out.println(str1.length());  // 4
	        System.out.println(str2.length());  // 0
	        System.out.println("Java".length());  // 4
	        System.out.println("Java\n".length()); // 5
	        System.out.println("Learn Java".length()); // 10

	        //2.  IsEmpty() method:
	        // returns true if the string is empty 
	        String s1="";
	        String s2="hello";
	        System.out.println(s1.isEmpty());      // true
	        System.out.println(s2.isEmpty());      // false

	        // 3. Trim() method: 
//	        The Java string trim() method removes the leading and trailing spaces.
	        
	        String trim1 ="  hello   "; 
	        System.out.println(trim1+"how are you");        // without trim() 
	        System.out.println(trim1.trim()+" how are you"); // with trim() 
	        
//	        4. toLowerCase() method:
	        String lowCase="IM NOW LOWER CASE?";
	        String s1lower=lowCase.toLowerCase();
	        System.out.println(s1lower);

//	       5. to uppercase
			 String upperCase="hello how are you"; 
			 String s1upper= upperCase.toUpperCase(); 
			 System.out.println(s1upper); 
			 System.out.println("This is java".toUpperCase());
			 
			 //6 . concat using the +
			 
			 //------By using concat method----
		       String str11 = "Learn ";
		       String str22 = "Java";
		       // concatenate str1 and str2
		       System.out.println(str11.concat(str22)); // "Learn Java"

		       // concatenate str2 and str11
		       System.out.println(str22.concat(str11)); // "JavaLearn "
		     //--- By using + operator---
		       String s3 =  "hello";
		       String s4 = "Learners";
		     //  String s5 = s3.concat(s4); or
		          String s5 = s3 + s4;
		     //both of the above statement will give you the same result

		      // Three strings are concatenated
		       String message = "Welcome " + "to " + "Java";

		     // String Chapter is concatenated with number 2
		       String s = "Chapter" + 2; // s becomes Chapter2

		   // String Supplement is concatenated with character B
		       String s111 = "Supplement" + 'B'; // s1 becomes Supplement
		       
			// 7: split() method

		       String vowels = "a::b::c::d:e";

		       // splitting the string at "::"
		       // storing the result in an array of strings
		       String[] result = vowels.split("::");

		       // converting array to string and printing it
		       System.out.println("result = " + Arrays.toString(result));
		       
		       // charAt Getting Characters From a String 
 		       String message1 = "Welcome to Java";
		       System.out.println("The first character in the message is " + message1.charAt(0));
		       System.out.println("The first character in the message is " + message1.charAt(6));
		       
		       String s1s="hello";
		       String s2s="hello";
		       String s3s="hemlo";
		       String s4s="flag";
		       System.out.println(s1s.compareTo(s2s)); // 0 because both are equal
		       System.out.println(s1s.compareTo(s3s)); //-1 because "l" is only one time lower than "m"
		       System.out.println(s1s.compareTo(s4s)); // 2 because "h" is 2 times greater than "f"


//		       The above program shows the comparison between the various Strings. Notice: 
//		    	   if s1 > s2, it returns a positive number.
//		    	   if s1 < s2, it returns a negative number.
//		    	   if s1 == s2, it returns 0.
		       
		       //10 substring method
//		       The substring() method extracts a substring from 
//		       the string and returns it. The syntax of the substring() 
//		       method is
		       
		       String str1s2 = "java is fun";

		       // extract substring from index 0 to 3
		       System.out.println(str1s2.substring(0, 4));
		       
//		       indexOf() method:
//		       The indexOf() method returns the index of the first occurrence 
//		       of the specified character/substring within the string.
		       
		       String str1index = "Java is fun";
		       int results;

		       // getting index of character 's'
		       results = str1index.indexOf('s');

		       System.out.println(results); // 6

		       // getting index of character 'J'
		       results = str1index.lastIndexOf('J');
		       System.out.println(results); // 0

		       // the last occurrence of 'a' is returned
		       results = str1index.lastIndexOf('a');
		       System.out.println(results); // 3

		       // character not in the string
		       results = str1index.lastIndexOf('j');
		       System.out.println(results); // -1

		       // getting the last occurrence of "ava"
		       results = str1index.lastIndexOf("ava");
		       System.out.println(results); // 1

		       // substring not in the string
		       results = str1index.lastIndexOf("java");
		       System.out.println(results); // -1
		       // ============================
//		       12 contains() method:
//		       The contains() method checks whether the specified string 
//		       (sequence of characters) is present in the string or not.
		       
		       String strContains = "Learn Java";
		       Boolean results1;

		       // check if str1 contains "Java"
		       results1 = strContains.contains("Java");
		       System.out.println(results1);  // true

		       // check if str1 contains "Python"
		       results1 = strContains.contains("Python");
		       System.out.println(results1);  // false

		       // check if str1 contains ""
		       results1 = strContains.contains("");

		       System.out.println(results1);  // true
		       
		       // ==========================
		       
//		      13 replace() method
//		       The replace() method replaces each matching occurrence
//		       of the old character/text in the string with the new 
//		       character/text.


		       String strReplace = "abc cba";

		       // all occurrences of 'a' is replaced with 'z'
		       System.out.println(strReplace.replace('a', 'z'));  

		       // all occurences of 'L' is replaced with 'J'
		       System.out.println("Lava".replace('L', 'J'));  
		       // character not in the string
		       System.out.println("Hello".replace('4', 'J')); 
		   // all occurrences of "C++" is replaced with "Java"
		       System.out.println(strReplace.replace("C++", "Java"));  

		       // all occurences of "aa" is replaced with "zz"
		       System.out.println("aa bb aa zz".replace("aa", "zz"));

		       // substring not in the string
		       System.out.println("Java".replace("C++", "C")); 
		       
		       //==============================================
		       
//		      14: Java String replaceAll()
//		       The replaceAll() method replaces each substring that
//		       matches the regex of the string with the specified text.
//		       The syntax of the replaceAll() method is:
		       
		       String str1Replace = "Java123is456fun";

		       // regex for sequence of digits
		       String regex = "\\d+";

		       // replace all occurrences of numeric
		       // digits by a space
		       System.out.println(str1Replace.replaceAll(regex, " "));
		       
		       //=======================================
		       
//		      15 Java String compares
//		       We can compare String in Java based on content and reference.
//		       It is used in authentication (by equals() method), sorting 
//		       (by compareTo() method), and reference matching 
//		       (by == operator) etc.
//		       By Using equals() Method.
//		       By Using == Operator.
//		       By compareTo() Method.
		       
//		       16: by using equal methods
		       String s1eq="PerScholas";
		       String s2eq="PerScholas";
		       String s3eq=new String("PerScholas");
		       String s4eq="Teksystem";
		       System.out.println(s1eq.equals(s2eq));//true
		       System.out.println(s1eq.equals(s3eq));//true 
		       System.out.println(s1eq.equals(s4eq));//false
		       
//		       17: using Operator
		       String s1Op="Perscholas";
		       String s2Op="Perscholas";
		       String s3Op=new String("Perscholas");
		       System.out.println(s1Op==s2Op);//true (because both refer to same instance)
		       System.out.println(s1Op==s3Op);//false(because s3 refers to instance created in nonpool)

//		       18: By Using compareTo() method,
//		       The String class's compareTo() method 
//		       compares values lexicographically. 
//		       It returns an integer value that describes if
//		       the first string is less than, equal to, or 
//		       greater than the second string.
		       
		       String s1Co="Perscholas";
		       String s2Co="Perscholas";
		       String s3Co="Perschola";
		       String s4Co="PerscholasX";
		       System.out.println(s1Co.compareTo(s2Co)); //0
		       System.out.println(s1Co.compareTo(s3Co)); // 1(because s1>s3)
		       System.out.println(s1Co.compareTo(s4Co)); // -1(because s1<s4 )
















	}

}
