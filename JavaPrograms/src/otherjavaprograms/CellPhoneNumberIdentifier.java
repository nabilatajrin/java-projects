package otherjavaprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class CellPhoneNumberIdentifier {
	public static void main(String[] argv) {

		//input phone number
		System.out.print("\nPlease enter the phone number\n\n");
		Scanner scanner1 = new Scanner(System.in);
		String PhoneNumber1 = scanner1.nextLine();

		//check phone number
		Pattern pattern_1 = Pattern.compile("\\+8801[5-9]{1}[0-9]{8}");
		Matcher matcher_1 = pattern_1.matcher(PhoneNumber1);

		Pattern pattern_2 = Pattern.compile("8801[5-9]{1}[0-9]{8}");
		Matcher matcher_2 = pattern_2.matcher(PhoneNumber1);

		Pattern pattern_3 = Pattern.compile("008801[5-9]{1}[0-9]{8}");
		Matcher matcher_3 = pattern_3.matcher(PhoneNumber1);

		Pattern pattern_4 = Pattern.compile("01[5-9]{1}[0-9]{8}");
		Matcher matcher_4 = pattern_4.matcher(PhoneNumber1);

		if (matcher_1.matches()||matcher_2.matches()||matcher_3.matches()||matcher_4.matches()) {
			System.out.println("Phone Number " +  PhoneNumber1 + " Is Valid");
      		}
      		else {
    	  		System.out.println("Sorry! Phone Number " + PhoneNumber1 + " Is Not Valid");
      		}
	}
}
