package stringmethods;

public class StringBuilderTest {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Welcome");
        System.out.println(sb);
        
        String sb2 = sb.append(" to California!").toString();  
        System.out.println(sb2);
    }
}
