import java.util.ArrayList;

public class GroceryList{
    private GroceryOrder[] order;
    private int items;
    public GroceryList(){
        order = new GroceryOrder[10];
    }
    public void add(GroceryOrder item){
        order[items] = item;
        items++;
    }
    public double getTotalCost(){
    double cost = 0;
    for(int i=0;i<items;i++){
        cost+=order[i].getCost();
    }
    return cost;
    }


}
