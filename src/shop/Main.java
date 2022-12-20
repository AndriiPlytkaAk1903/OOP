package shop;

public class Main {
    public static void main(String[] args) {
        GroceryShop groceryShop = new GroceryShop();
        groceryShop.setName("Metro");
        groceryShop.getName();
        groceryShop.setAddress("Shevchenka 93, Kiyv, Ukraine");
        groceryShop.getStoreAddress();
        groceryShop.addItemToStock("Bread", 10);
        System.out.println(groceryShop.getStockBalance());
        groceryShop.addItemToStock("Bread", 10);
        System.out.println(groceryShop.getStockBalance());
        groceryShop.sellItem("Bread", 20);
        System.out.println(groceryShop.getStockBalance());
        groceryShop.getStoreHours();
        System.out.println("--------------------------------\n");
        BakeryShop bakeryShop = new BakeryShop();
        bakeryShop.getStoreAddress();
        bakeryShop.getStoreHours();
        bakeryShop.addItemToStock("Cinnamon",20);
        bakeryShop.addItemToStock("Cookies",100);
        System.out.println(bakeryShop.getStockBalance());
        bakeryShop.sellItem("Cinnamon", 15);
        System.out.println(bakeryShop.getStockBalance());
        bakeryShop.sellItem("Cinnamon", 15);
        System.out.println(bakeryShop.getStockBalance());
    }
}
