package hw32;

public class Main {
    public static void main(String[] args) {

        Store store = new Store(15);
        for (int i = 0; i < 15; i++) {
            if (i < 5) {
                store.sellables[i] = new Food();
            } else if (i < 10) {
                store.sellables[i] = new Water();
            } else {
                store.sellables[i] = new Clothes();
            }
            for (Sellable sellable : store.sellables) {

                if (sellable instanceof Food) {
                    ((Food) sellable).eat();
                } else if (sellable instanceof Water) {
                    ((Water) sellable).drink();
                } else if (sellable instanceof Clothes) {
                    ((Clothes) sellable).wear();
                }

            }
        }
    }}
