package hw32;

public class Food implements Sellable {
    @Override
    public void sell(){
        System.out.println("Sell the food before the expire date");
    }
    public void eat(){
        System.out.println("we are fresh");
    }
}
