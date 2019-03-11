package otherjavaprograms;

public class Command_line_input {
	public static void main (String[]args) {
		
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		System.out.println("Total = " + (x+y));
		
	}
}

//---------------In command prompt-----------------
//javac test.java
//java test 100 200

/*######
Output:
Total = 300	
----------------------------------------------------------------------------------------------------------------------*/

public class Command_line_argument {
	public static void main (String[]args) {
		int sum = 0;
		for(int i = 0; i<args.length; i++) {
			sum += Integer.parseInt(args[i]);
		}
		System.out.println("Total = " + sum);
	}
}

//---------------In command prompt-----------------
//javac test.java
//java test 100 200 4 5 8 (unlimited)

/*######
Output:
Total = 317*/

