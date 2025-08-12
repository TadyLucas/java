public class Fruit  extends Item{
    private String type;
    private int quantity;
    private String name;

    public Fruit(String name, int quantity, String type){
        super(name, quantity);
//        super(name, quantity); // Assign values to the class you inherit these variables
        this.type = type;
    }

    public String getType(){
        return type;
    }
//    @Override
//    public String getName(){
//        return name;
//    }
//    @Override
//    public int getQuantity(){
//        return quantity;
//    }
    @Override
    public String toString(){
        return "Fruit: " + getName() + ", Quantity: " + getQuantity() + ", Type: " + getType();
    }
}
