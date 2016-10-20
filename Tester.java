
public class Tester {

	public static void main(String[] args) {
		// TODO invoke the stripped method of Palindrome on "Madam", "Ma'am", and ""
		String s1 = "Madam";
		String s2 = "Ma'am";
		String s3 = "";
		
		String stripped1 = Palindrome.stripped(s1); // calling a class method!
		String stripped2 = Palindrome.stripped(s2);
		String stripped3 = Palindrome.stripped(s3);
		
		// TODO invoke the String toLowerCase on the returned values
		String lower1 = stripped1.toLowerCase(); // calling an instance method!
		String lower2 = stripped2.toLowerCase();
		String lower3 = stripped3.toLowerCase();
		
		// TODO invoke the testString method of Palindrome on the returned values
		boolean test1 = Palindrome.testString(lower1); // calling a class method
		boolean test2 = Palindrome.testString(lower2);
		boolean test3 = Palindrome.testString(lower3);
		
		// TODO print the original string and whether it is a palindrome
		System.out.println(s1+" is a palindrome? "+test1);
		System.out.println(s2+" is a palindrome? "+test2);
		System.out.println(s3+" is a palindrome? "+test3);
		
		// Can you figure out the following method call?
		System.out.println(Palindrome.testString(Palindrome.stripped("Able was I, ere I saw Elba").toLowerCase()));
	}

}