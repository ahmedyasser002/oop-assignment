public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        GroceryList list = new GroceryList();
        GroceryOrder order = new GroceryOrder("cloths" , 25);
        order.setQuantity(5);
        System.out.println("The total cost of groceryorder equals" + order.getCost());
        GroceryOrder order2 = new GroceryOrder("Food" , 15);
        order2.setQuantity(3);
        list.add(order2);

        System.out.println(list.getTotalCost());
    }
}