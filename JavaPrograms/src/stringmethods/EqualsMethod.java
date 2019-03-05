/*
 * The equals() method is used to compare if two strings are identical. It 
 * returns true if the strings are equal and false if they are not.
 */
package stringmethods;

/**
 *
 * @author nabila
 */
public class EqualsMethod {
    public static void main(String[] args){
        boolean equalsOrNot = "This is Jamie".equals("This is Jamie");
        boolean equalsOrNot2 = "This is Jamie".equals("Hello World");
        System.out.println(equalsOrNot);
        System.out.println(equalsOrNot2);
        /*true*/
        /*false*/
    }
}
