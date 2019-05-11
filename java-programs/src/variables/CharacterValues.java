package variables;

public class CharacterValues {
    public static void main(String[] args){
        char c1 = '1';
        char c2 = '2';
        char c3 = '3';
        char nine = '\u0039'; //unicode
        System.out.println("nine = " + nine);
        char dollar = '\u0024'; //unicode
        System.out.println("dollar = " + dollar);
        
        char a = 'a';
        char upper = Character.toUpperCase(a);
        System.out.println("upper = " + upper);
        
        char[] chars = {'h','e','y'};
        System.out.println("chars = " + new String(chars));
        //or
        String s = new String(chars);
        System.out.println(s);
        //or
        char[] char2 = s.toCharArray();
        System.out.println(char2);
        
    }
}
