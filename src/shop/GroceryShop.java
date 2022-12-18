package shop;

import java.util.HashMap;
import java.util.Map;


public class GroceryShop extends Shop{
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
        System.out.println("Shevchenka 113, Kyiv, Ukraine");
    }

}
