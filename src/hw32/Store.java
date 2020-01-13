package hw32;

public class Store  {
    public Sellable[]sellables;
    public Store(int quantity){
        if (quantity>0) {
            sellables= new Sellable[quantity];
    }
}}
