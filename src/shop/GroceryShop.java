package shop;

import java.util.HashMap;
import java.util.Map;


public class GroceryShop extends Shop{

    private String name;
    private String address;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void getName() {
        System.out.println(name);
    }

    public String getAddress() {
        return address;
    }

    @Override
    public void getStoreHours(){
        System.out.println("=======================\n" +
                            "Monday 9:00 - 18:00\n" +
                            "Tuesday 9:00 - 18:00\n" +
                            "Wednesday 8:00 - 19:00\n" +
                            "Thursday 8:00 - 20:00\n" +
                            "Friday 8:00 - 17:00\n" +
                            "=======================");
    }
    @Override
    public void getStoreAddress(){
        System.out.println(address);
    }

}
