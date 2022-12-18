package shop;

import java.util.Map;

public abstract class Shop {
    public abstract void addItemToStock(String itemName, int quantity);
    public abstract boolean sellItem(String name, int quantity);
    public abstract Map<String, Integer> getStockBalance();

}
