package stringmethods;

public class CompareStringValueWithMethod {
    public static void main(String[] args){
        
        //literal value. Strings are object
        //process: interning
        String s1 = "Hello";
        String s2 = "Hello";
        
        if(s1 == s2){
            System.out.println("They match!");
        }else{
            System.out.println("They don't match..");
        }
        
        String s3 = new String("Hello!");
        String s4 = new String("Hello!");
        
        //this doesn't work in this case
        if(s3 == s4){
            System.out.println("They match!");
        }else{
            System.out.println("They don't match..");
        }
        
        //this works
        if(s3.equals(s4)){
            System.out.println("They match!");
        }else{
            System.out.println("They don't match..");
        }
        
        
        String s5 = new String("HeLLo!");
        String s6 = new String("Hello!");
        if(s3.equalsIgnoreCase(s4)){
            System.out.println("They match!");
        }else{
            System.out.println("They don't match..");
        }
        
        //don't use "==" sign to compare strings, it sometimes work, 
        //sometimes doesn't work. equals method always works for string
    }
}
