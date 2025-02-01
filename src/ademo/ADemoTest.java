package ademo;

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
		System.out.println("Team 1");
		
		System.out.println("Hi Team 1");
		System.out.println("This is just a test");
		
		String group = "Team A";
		String name = "Sally";
		System.out.println("Group:" + group + " name: "+ name);
		
		for(int i = 0; i < 20 ; i++) {
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
		
		

		// Adding new lines 1/1/2025 - Push Number 2 - Sam -
		// Adding new Objects
		ADemoTest dept1 = new ADemoTest(111, "Dev");
		ADemoTest dept2 = new ADemoTest(222, "QA");
		
		// Print Statement
		System.out.println("******* Push Number# 2 By Sam *******");
		System.out.println(dept1.departName);
		System.out.println(dept2.departName);
		System.out.println("****** End OF Code: Push Number# 2 by Sam ******");
		

		//Adding new line 1/31/2025 - Push Number# 1
		System.out.println("*****From Farah: Push Number 1******");
		int point = 80;
		if(point >= 80) {
			System.out.println("WOW");
		}else if(point >= 70) {
			System.out.println("good");
		}else if(point < 70) {
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

// First push Roberto

public String withoutEnd(String str) {
	  String result = "";
	  
	  int length = str.length()-2;
	  
	  if(length >= 2){
	    result = str.substring(1,str.length()-1);
	  }
	  
	  return result;
	}
//****************** End of code by Roberto***********************
	
// second push Roberto
	int a = 90;
	int b = 80;
	int c = 70;
	int d = 60;{

	if(a > b) {
		System.out.println("Grade: A");
	} else if(b > c && b < a) {
		System.out.println("Grade: B");
	} else if (c > d && c < b) {
		System.out.println("Grade: C");
	} else {
		System.out.println("Grade: D");
	}
	
	//****************** End of code by Roberto***********************
}}
