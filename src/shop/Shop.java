package shop;

import java.util.HashMap;
import java.util.Map;

public abstract class Shop {
    public abstract void setStoreHours(String storeHours);
    public abstract void setStoreAddress(String address);
    public abstract void getStoreHours();
    public  abstract  void getStoreAddress();
    private Map<String,Integer> itemInStock = new HashMap<>();
    void addItemToStock(String itemNane, int quantity) {
        Integer itemQuantity = itemInStock.get(itemNane);
        if (itemQuantity == null){
            itemInStock.put(itemNane, quantity);
        } else {
            itemInStock.put(itemNane, itemQuantity + quantity);
        }
    }


    public boolean sellItem(String name, int quantity)
    {
        Integer availableItemQuantity = itemInStock.get(name);
        if (availableItemQuantity >= quantity){
            itemInStock.put(name, availableItemQuantity - quantity);
            return true;
        } else {
            System.out.println("Недостатньо товару в магазині!");
            return false;
        }
    }
    public Map<String, Integer> getStockBalance() {
        return itemInStock;
    }

}
