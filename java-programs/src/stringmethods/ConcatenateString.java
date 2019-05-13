package stringmethods;

public class ConcatenateString {
    public static void main(String[] args){
        String s1 = "This is a string";
        String s2 = new String("This is also a string");
        
        char[] chars = {'h','e','l','l','o'};
        
        String s3 = new String(chars);
        
        System.out.println(s3);
        
        String s = "shirt size: ";
        String size = "M";
        String description = s + size;
        System.out.println(description);
        
        description += ", very elegant";
        System.out.println(description);
        System.out.println(description.toUpperCase());
        
        System.out.println(s.charAt(4));
        System.out.println(s.getBytes()); //didnt work
    }
}
