public class GroceryOrder {
    private String name;
    private int quantity;
    private double PricePerUnit;
    public GroceryOrder(String name , double PricePerUnit){
        this.name=name;
        this.PricePerUnit=PricePerUnit;
    }
    public double getCost(){
        return PricePerUnit*quantity;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;

    }
}
