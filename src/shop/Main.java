package shop;

public class Main {
    public static void main(String[] args) {
        GroceryShop groceryShop = new GroceryShop();
        System.out.println(groceryShop.getStoreHours());
        groceryShop.addItemToStock("Bread", 10);
        System.out.println(groceryShop.getStockBalance());
        groceryShop.addItemToStock("Bread", 10);
        System.out.println(groceryShop.getStockBalance());
        groceryShop.sellItem("Bread", 20);
        System.out.println(groceryShop.getAddress());


    }
}
