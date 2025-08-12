public class Weapon extends Item{
    private int damage;
    private String type;

    public Weapon(String name, int quantity, String type, int damage){
        super(name, quantity);
        this.type = type;
        this.damage = damage;
    }

    public int getDamage(){
        return damage;
    }

    public String getType(){
        return type;
    }
    @Override
    public String toString(){
        return "Weapon: " + getName() + ", Quantity: " + getQuantity() + ", Type: " + getType() + ", Damage: " + getDamage() ;
    }

}
