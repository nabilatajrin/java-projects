package stringmethods;

public class ParseStringValues {
    public static void main(String[] args){
        String s1 = "Welcome to California!";
        int len = s1.length();
        int pos = s1.indexOf("California");
        System.out.println(pos);//11
        int pos2 = s1.indexOf("Califorina");
        System.out.println(pos2);//-1, 
        //in java if it dosnt find what you are looking for, it returns 
        //a negative value, that's not true for all methods and classes
        
        String sub = s1.substring(11);
        System.out.println(sub);
        
        String s2 = "   Welcome!   ";
        String trimmed = s2.trim();
        System.out.println(trimmed);
        
        String s = "34.5"; //only numbers in string works for below method
        Double d = Double.parseDouble(s);
        System.out.println(d);
        
        double d2 = Double.parseDouble(s);
        System.out.println(d2);
        
        
    }
}
