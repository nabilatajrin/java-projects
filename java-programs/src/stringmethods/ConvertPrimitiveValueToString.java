package stringmethods;

public class ConvertPrimitiveValueToString {
    public static void main(String[] args){
        int result = 10 + 12;
        String answer = "The answer is " + result;
        System.out.println(answer);
        
        //position of the string doesn't matter, at least one string is enough
        String howMany = 20 + " things";
        System.out.println(howMany);
        
        int intValue = 42;
        String fromInt = Integer.toString(intValue);
        System.out.println(intValue);
        
        Boolean boolValue = true;
        String fromBool = Boolean.toString(boolValue);
        System.out.println(fromBool);
    }
}
