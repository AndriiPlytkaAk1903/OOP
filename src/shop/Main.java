package shop;

public class Main {
    public static void main(String[] args) {
        GroceryShop groceryShop = new GroceryShop();
        groceryShop.addItemToStock("Bread", 10);
        System.out.println(groceryShop.getStockBalance());
        groceryShop.addItemToStock("Bread", 10);
        System.out.println(groceryShop.getStockBalance());
        groceryShop.sellItem("Bread", 20);
        System.out.println(groceryShop.getStockBalance());
        groceryShop.setStoreAddress("Shevchenka 113, Kyiv, Ukraine");
        groceryShop.getStoreAddress();
        groceryShop.setStoreHours(
                "=======================\n" +
                "Monday 9:00 - 18:00\n" +
                "Tuesday 9:00 - 18:00\n" +
                "Wednesday 8:00 - 19:00\n" +
                "Thursday 8:00 - 20:00\n" +
                "Friday 8:00 - 17:00\n" +
                "=======================");
        groceryShop.getStoreHours();

    }
}
