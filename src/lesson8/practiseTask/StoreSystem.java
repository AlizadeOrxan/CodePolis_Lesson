package lesson8.practiseTask;

public class StoreSystem {
    public static void main(String[] args) {

        System.out.println("Salam , mini Sifarish sistemine xosh gelmishsiniz");
        System.out.println("__________________________________________________");
        ElectronicProduct smartPhone = new ElectronicProduct("Apple",999.0,20,"2 years");
        ApparelProduct apparel = new ApparelProduct("ZARA",888.99,5,"L");
        Product book = new Product("Cehennemden gelen ses",800.0,10);

        smartPhone.showInfo();
        apparel.showInfo();
        book.showInfo();


        System.out.println("____________________________");

        System.out.println("Sifarishlerinizi tesdiq edin ");
        Order order = new Order();

        order.createOrder(smartPhone,10);
        System.out.println("Smartfon Stok " + smartPhone.getStock());
        System.out.println("Sifarish verildi");
        order.calculateTotalPrice(smartPhone,10,0.15);
        System.out.println("Sifarish yerine yetirildi");
        double price = order.calculateTotalPrice(smartPhone,10,0.15);
        System.out.println(smartPhone.getStock());
        System.out.println("10 units discount " + price + " Azn");



//
//        Product [] products = new Product[3];
//
//        products[0] = book;
//        products[1] = smartPhone;
//        products[2] = apparel;
//
//        for (Product p : products) {
//            p.showInfo();
//        }

        Product [] products = {
                book,smartPhone,apparel
        };

        for (Product p : products) {
            p.showInfo();
            System.out.println("__________________");
        }






    }
}
