package interactiveprograms.formattingOutputs;

/**
 *
 * @author nabila
 */
public class Formatting {
    public static void main(String[] args){
        System.out.println("The answer for 5.45 divided by 3 is " + (5.45/3));
        System.out.printf("The answer for %.3f divided by %d is %.2f.", 5.45, 3, 5.45/3);
        /*The answer for 5.45 divided by 3 is 1.8166666666666667*/
        /*The answer for 5.450 divided by 3 is 1.82*/
    }
}
