package ASSIGMENTS;
import java.util.*;

public class Assignment6 {
    public static void main(String[] args) {
        List<Item> items=new ArrayList<>();
        
        String itemIsThere="yes";
        Scanner sc=new Scanner(System.in);
        while(itemIsThere=="yes"){

            String itemName=sc.nextLine();
            int noOfItems=sc.nextInt();
            double itemPrice=sc.nextDouble();
            items.add(new Item(itemName,noOfItems,itemPrice));
            System.out.println("Again Items are there type yes or no:");
            itemIsThere=sc.next();
        

        }
        Order order=new Order(1,"SWETHA",items);
        order.displayOrder();
        
    }
    
}
class Order{
    private int orderId;
    private String customerName;
    private List<Item> items;
    private double netTotal;
    public Order(int orderId, String customerName, List<Item> items) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.items = items;
        this.netTotal=0;
        for(Item item:items){
            netTotal+=item.getPrice();
        }
        


    }
    public int getOrderId() {
        return orderId;
    }
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        customerName = customerName;
    }
    public List<Item> getItems() {
        return items;
    }
    public void setItems(List<Item> items) {
        items = items;
    }
    public double getNetTotal() {
        return netTotal;
    }
    public void setNetTotal(double netTotal) {
        this.netTotal = netTotal;
    }
    public void displayOrder(){
        System.out.printf("Order Id: %d                      Customer Name: %s %n",orderId,customerName);
        System.out.println("-----------------------------------------------------------------");
        System.out.printf("ITEMS             QUANTITY     PRICE          TOTALCOST   \n ");
        System.out.println("-----------------------------------------------------------------");
        for(Item item:items){
            System.out.printf("%-20s %-10d %-14.2f %4.2f  %n",item.getItemName(),item.getQuantity(),item.getPrice(),item.getTotalCost());
        }
        System.out.println("------------------------------------------------------------------");
        System.out.printf("Net Total:%f",+netTotal);
    }


}
class Item{
    private String itemName;
    private int quantity;
    private double price;
    private double totalCost;
    public Item(String itemName,int quantity,double price){
        this.itemName=itemName;
        this.quantity=quantity;
        this.price=price;
        this.totalCost=quantity*price;
    }
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getTotalCost() {
        return totalCost;
    }
    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

}