package shop;

import java.util.HashMap;
import java.util.Map;


public class GroceryShop extends Shop{
    private String storeHours;
    private String storeAddress;

    public void setStoreHours(String storeHours) {
        this.storeHours = storeHours;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }
    public void getStoreHours(){
        System.out.println(storeHours);
    }

    public void getStoreAddress(){
        System.out.println(storeAddress);
    }

}
