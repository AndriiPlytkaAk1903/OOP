package shop;

public class BakeryShop extends Shop{

    @Override
    public void getStoreHours() {
        System.out.println("========BakeryShop========\n" +
                            "=========SCHEDULE========\n" +
                            "Monday - 9:00 - 20:00\n" +
                            "Tuesday - 9:00 - 20:00\n" +
                            "Wednesday - 8:00 - 20:00\n" +
                            "Thursday - 8:00 - 20:00\n" +
                            "Friday - 8:00 - 20:00\n" +
                            "=======================");
    }
    @Override
    public void getStoreAddress() {
        System.out.println("========BakeryShop========\n" +
                            "Mazepy 103, Ternopil, Ukraine");

    }
}
