package stringmethods;

public class StringObjects {
    
    public String type;
    
    public static void main(String[] args){
        String item = new String("Shirt");
        StringObjects item2 = new StringObjects();
        item2.type = "shoe";
        item2.displayItem();
        
        //string is an object example
        String string1 = new String("Hello!");
        String string2 = "Hello2!";
        System.out.println(string1);
        System.out.println(string2);//same result
        string1 = "hey";
        System.out.println(string1);
        
        //another example
        char[] chars = {'J','e','l','l','o','!'};
        String s = new String(chars);
        System.out.println(s);             
    }
    
    private void displayItem(){
        System.out.println("This is a " + this.type);
    }
}