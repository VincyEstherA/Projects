import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
	public static boolean isvalid(String email)
	{
		String expression = "^(.+)@(.+)$";
	       Pattern pattern = Pattern.compile(expression);
	       Matcher matcher = pattern.matcher(email);
	       return matcher.matches();
	}
	public static void main(String[] args) {
		List<String> emails = new ArrayList<String>();
	       emails.add("abc@example.com");
	       emails.add("bob@example.com");
	       emails.add("abhi@example.me.org");
	       emails.add("aman.example.com");
	       emails.add("xyz..bob@example.com");
	       emails.add("alka@.example.com");

	       for (String value : emails) {
	           System.out.println("The Email address " + value + " is " + (isvalid(value) ? "valid" : "invalid"));
	       }
	       
	       System.out.println("Enter any email address to check");
	       try (Scanner sc = new Scanner(System.in)) {
			String input = sc.nextLine();
			   System.out.println("The Email address " + input + " is " + (isvalid(input) ? "valid" : "invalid"));
		}
	       	

	}

}
