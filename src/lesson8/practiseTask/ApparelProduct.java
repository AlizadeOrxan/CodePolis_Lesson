package lesson8.practiseTask;

public class ApparelProduct extends Product implements DiscountAplicable {
String size;

    public ApparelProduct(String name, double price, int stock, String size) {
        super(name, price, stock);
        this.size = size;
    }

    @Override
    public void showInfo() {
        System.out.println("Apparel Product : " + getName() + " Price:  " + getPrice() + " AZN, Stock: " + getStock() + " units");

    }//"Apparel Product: [name], Price: [price] AZN, Stock: [stock] units, Size: [size]."

    @Override
    public double calculateDiscountedPrice(double discountRate) {
        return  getPrice() * (1.0 - discountRate);
    }
}
