package lesson8.practiseTask;

public class ElectronicProduct extends Product implements DiscountAplicable {

    private String warrantPeriod;

    public ElectronicProduct(String name, double price, int stock, String warrantPeriod) {
        super(name, price, stock);
        this.warrantPeriod = warrantPeriod;
    }

    public String getWarrantPeriod() {
        return warrantPeriod;
    }

    public void setWarrantPeriod(String warrantPeriod) {
        this.warrantPeriod = warrantPeriod;
    }

    @Override
    public void showInfo() {
        System.out.println("Electronic Product :" + getName() + " Price:  " + getPrice() + " AZN, Stock: " + getStock() + " units");
    }

    @Override
    public double calculateDiscountedPrice(double discountRate) {
        return  getPrice() * (1.0 - discountRate);
    }

    //"Apparel Product: [name], Price: [price] AZN, Stock: [stock] units, Size: [size]."
}
