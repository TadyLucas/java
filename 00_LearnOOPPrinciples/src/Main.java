public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

//        Item item = new Item("Generic Item", 20);
        Fruit fruit = new Fruit("Apple", 10, "Fuji");
        Weapon weapon = new Weapon("Axe", 2, "Stone", 20);

//        inventory.addItem(item);
        inventory.addItem(fruit);
        inventory.addItem(weapon);


        inventory.displayInventory();
    }
}