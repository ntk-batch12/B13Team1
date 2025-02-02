package ademo;

// Import the Scanner package
import java.util.*;

public class ADemoTest {

	// Code Added By Sam - Push Number 2 -
	int departId;
	String departName;

	// Parameterized Constructor by SAM - Push Number 2
	public ADemoTest(int id, String name) {
		departId = id;
		departName = name;

	}

	public static void main(String[] args) {
		// calling Roberto's method ---- by Sally
		// push number #2 By Sally 02/01/2025
		ADemoTest obj = new ADemoTest(100, "Team 1");

		String result = obj.withoutEnd("NumberOne");
		String result1 = obj.withoutEnd("NOOOOOO");
		String result2 = obj.withoutEnd("Trouble");
		System.out.println("****** calling Roberto's Method By Sally ******");
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println("****** End of Code by Sally ******");
		
		//Calling checkFirstLast() ---- By Sally
		
		String s1 = checkFirstLast("Sally", "Shakkakee");
		String s2 = checkFirstLast("Farah", "AbdulAziz");
		String s3 = checkFirstLast("Sam", "Smith");
		String s4 = checkFirstLast("Roberto", "Jones");
		String s5 = checkFirstLast("Mina", "Taim");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		//calling concatString() ---- by Sally
		String r1 = obj.concatString("gitHub", "briliant");
		String r2 = obj.concatString("road", "door");
		String r3 = obj.concatString("more", "fun");
		String r4 = obj.concatString("call", "ling");
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println("***********End of code--- By Sally ***********");
		
		System.out.println("Team 1");

		System.out.println("Hi Team 1");
		System.out.println("This is just a test");

		String group = "Team A";
		String name = "Sally";
		System.out.println("Group:" + group + " name: " + name);

		for (int i = 0; i < 20; i++) {
			System.out.println(i);
		}
		System.out.println("GitHub is fum so far ...");

		// Adding new lines 1/31/2025 - Push Number# 1
		System.out.println("***** From Sam: Push Number 1 *****");
		int count = 10;
		if (count > 20) {
			System.out.println("Count is Greater than 20 ");
		} else {
			System.out.println("Count is Less than 20");
		}
		System.out.println("****** End of Code by Sam ******");

		// Adding new line 1/31/2025 - Push Number# 1

		// Adding new lines 1/1/2025 - Push Number 2 - Sam -
		// Adding new Objects
		ADemoTest dept1 = new ADemoTest(111, "Dev");
		ADemoTest dept2 = new ADemoTest(222, "QA");

		// Print Statement
		System.out.println("******* Push Number# 2 By Sam *******");
		System.out.println(dept1.departName);
		System.out.println(dept2.departName);
		System.out.println("****** End OF Code: Push Number# 2 by Sam ******");

		// Adding new line 1/31/2025 - Push Number# 1

		System.out.println("*****From Farah: Push Number 1******");
		int point = 80;
		if (point >= 80) {
			System.out.println("WOW");
		} else if (point >= 70) {
			System.out.println("good");
		} else if (point < 70) {
			System.out.println("ewwww");
		}
		System.out.println("******End of Code by Farah*******");

		// Adding new lines 02/01/2025 - Push Number# 1
		System.out.println("***** From Sally: Push Number 1 *****");

		String str1 = phoneCalls("Voice call. Accepted on another device");
		String str2 = phoneCalls("Video call. Accepted on another device");
		String str3 = phoneCalls("Voice call. Rejected on another device");
		String str4 = phoneCalls("Video call. Rejected on another device");

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println("****** End of Code by Sally ******");

	}

	public static String phoneCalls(String str) {
		String result = "";

		if (str.contains("Accepted")) {
			result = "this call has beed recorded";
		} else {
			result = "no record in the system";
		}

		return result;
	}
	// ******************* End of Code by Sally *********************

///// sally is Testing

// First push Roberto

	public String withoutEnd(String str) {
		String result = "";

		int length = str.length() - 2;

		if (length >= 2) {
			result = str.substring(1, str.length() - 1);
		}

		return result;
	}
//****************** End of code by Roberto***********************

// second push Roberto
	int a = 90;
	int b = 80;
	int c = 70;
	int d = 60;
	{

		if (a > b) {
			System.out.println("Grade: A");
		} else if (b > c && b < a) {
			System.out.println("Grade: B");
		} else if (c > d && c < b) {
			System.out.println("Grade: C");
		} else {
			System.out.println("Grade: D");
		}

		// ****************** End of code by Roberto***********************

		// sally is testing again

		// ************** Beginning of Push Number #3 by Sam *************
		System.out.println("********* Beginning of Push Number #3 By Sam *******");

		Scanner scan = new Scanner(System.in);

		// Create a Variable
		String num;

		// Ask the user to Enter a Number:
		System.out.println("Please Enter a Number: ");

		num = scan.nextLine();

		// IF Statement
		if (num.matches("[01]+")) {
			System.out.println("You Entered a Binary Redix = 2");

		} else if (num.matches("[0-7]+")) {
			System.out.println("You Entered a Octal Redix = 8");

		} else if (num.matches("[0-9]+")) {
			System.out.println("You Entered a Decimal Redix = 10");

		} else if (num.matches("[0-9A-F+]")) {
			System.out.println("You Entered a Hexa Redix = 16");

		} else {
			System.out.println("The Number You Have Entered is Not Within Range!");
		}
		System.out.println("********* END of Push Number #3 By Sam *******");

		// ************** END of Push Number #3 by Sam *************
	}

	// Push 3 Roberto

	public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		boolean result = true;

		if (isAsleep) {
			result = false;
		}
		if (isMorning && !isMom) {
			result = false;
		}

		return result;
	}
	// End of code push 3 Roberto

	// Sally is testing again and again and again

	// push number 3 ---- By Sally

	public static String checkFirstLast(String firstName, String lastName) {
		String result = "";

		if (firstName.substring(0, 1).equals(lastName.substring(0, 1))) {
			result = " First letter from the first name matches the first letter from the last name ";

		} else {
			result = " First letter from the first name does not match the first letter from the last name ";

		}

		return result;
	}
	
	// End of code ---- by Sally
	
	
	//start code by Mina 
	public class DemoNonVoid1 {
		
		// 1. void method
		public static void add(int a, int b) {
		System.out.println(a + b);	
		}

		// 2. non-void
		public static int subtract(int a, int b) {
			int result =0;
			result =a -b;
			return result;
		}
		//Bush #1 by Mina 
		// see you in class today, 4th push Roberto
	}
	// push number 4 ---- By Sally
	String concatString(String str1, String str2) {
		String result = "";
		if (str1.charAt(str1.length() - 1) == str2.charAt(0)) {
			result = str1.concat(str2.substring(1));
			return result;
		} else {
			result = str1.concat(str2);

		}
		return result;
	}
	}
