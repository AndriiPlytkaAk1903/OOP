package shop;

import java.util.HashMap;
import java.util.Map;


public class GroceryShop extends Shop{

    private String storeHours;
    private String storeAddress;

    public void setStoreHours(String storeHours) {
        this.storeHours = storeHours;
    }

    public void setStoreAddress(String address) {
        this.storeAddress = address;
    }


    private Map<String,Integer> itemInStock = new HashMap<>();

    public String getStoreHours(){
        return storeHours;
    }
    @Override
    public void addItemToStock(String itemNane, int quantity) {
        Integer itemQuantity = itemInStock.get(itemNane);
        if (itemQuantity == null){
            itemInStock.put(itemNane, quantity);
        } else {
            itemInStock.put(itemNane, itemQuantity + quantity);
        }
    }
    @Override
    public Map<String, Integer> getStockBalance() {
        return itemInStock;
    }
    @Override
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


    public String getAddress() {
        return storeAddress;
    }



}
