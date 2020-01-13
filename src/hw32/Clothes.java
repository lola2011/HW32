package hw32;

public class Clothes implements Sellable{
    @Override
    public void sell(){
        System.out.println("we sell high quality clothes");
    }
    public void wear(){
        System.out.println("wear with pleasure");
    }

}
