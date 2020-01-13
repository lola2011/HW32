package hw32;

public class Water implements Sellable {
    @Override
    public void sell(){
        System.out.println("we sell spring water");
    }
    public void drink(){
        System.out.println("water is the best drink");
    }
}
