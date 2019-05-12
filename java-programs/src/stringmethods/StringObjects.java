package stringmethods;

public class StringObjects {
    
    public String type;
    
    public static void main(String[] args){
        String item = new String("Shirt");
        StringObjects item2 = new StringObjects();
        item2.type = "shoe";
        item2.displayItem();
    }
    
    private void displayItem(){
        System.out.println("This is a " + this.type);
    }
}