/**This is the first program in programming world's tradition. The main method uses Java's approach to encapsulation

public = access modifier. When a class member is preceded by public, 
	then that member may be accessed by code outside the class in which it is declared.
	
static = static allows main() to be called without having to instantiate a particular 
	instance of the class. This is necessary since main() is called by the JVM before
	any objects are made.
	
void = This keyword simply tells the compiler that main() does not return a value.

main() = All Java applications begin execution by calling main(). main must be declared 
	as public, since it must be called by code outside of its class when the program is 
	started. Java is case sensitive. Thus, Main is different from main. In main(), there
	is only one parameter, albeit a complicated one. that is String args[].
	
String args[] = String args[] declares a parameter named args, which is an array of 
	instances of the class String. (Arrays are collection of similar objects.) Objetcs
	of type String store character strings. In this case, args receives any command-line 
	arguments present when the program is executed.
*/


//Program
class FirstProgram {
	public static void main (String args[]) {
		System.out.println("Hello World!");
	}
}

	


