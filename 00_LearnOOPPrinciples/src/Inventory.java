import java.util.ArrayList;

public class Inventory {

    private ArrayList<Item> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(Item item){
        items.add(item);
    }

    // Polymorphism in compile time
//    public void addItem(String name, int quantity, String type){
//        items.add(new Fruit(name, quantity, type));
//    }
//
//    public void addItem(String name, int quantity, String type, int damage){
//        items.add(new Weapon(name, quantity, type, damage));
//    }

    public void displayInventory(){
        for (Item item : items) {
//            item.displayInfo();
            // Dynamic - Runtime
            System.out.println(item.toString());
        }
    }
}
