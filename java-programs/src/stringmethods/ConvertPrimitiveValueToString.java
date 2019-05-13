package stringmethods;

public class ConvertPrimitiveValueToString {
    public static void main(String[] args){
        int result = 10 + 12;
        String answer = "The answer is " + result;
        System.out.println(answer);
        
        //position of the string doesn't matter, at least one string is enough
        String howMany = 20 + " things";
        System.out.println(howMany);
        
        //int to string
        int intValue = 42;
        String fromInt = Integer.toString(intValue);
        System.out.println(intValue);
        
        //boolean to string
        Boolean boolValue = true;
        String fromBool = Boolean.toString(boolValue);
        System.out.println(fromBool);
        
        //long to string
        long longValue = 10_000_000;//these underscores are for code readability
        System.out.println(longValue);
        
        String fromLong = Long.toString(longValue);
        System.out.println(fromLong);
        
        //string Interpolation is a programming technique that is available 
        //in a quite few languages. Ex- Kotlin does this automatically.
        //This is string interpolation, it's a format method
        String stringInterpolation = 
                String.format("Shirt size: %s, Qty: %d", "M", 4);
        System.out.println(stringInterpolation);
        
        //or
        
        int qty = 5;
        String size = "L";
        String result2 = String.format("Shirt size: %s, Qty: %d", size, qty);
        System.out.println(result2);
    }
}
