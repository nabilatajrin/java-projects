package helloworld;
/**
 *
 * @author nabila
 */
public class Test {
    public static void main(String[] args){
        String strSub_1 = "Hello World".substring(6);
        String strSub_2 = "Hello World".substring(1, 6);
        
        System.out.println(strSub_1); // World
        System.out.println(strSub_2); // ello
    }
}
