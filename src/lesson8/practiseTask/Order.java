package lesson8.practiseTask;

public class Order {

    public void createOrder(Product product, int quantity){
        if (product.getStock() < quantity){
            System.out.println("Error: Not enough stock for "  + product.getName() + " .");
        }else {
            product.setStock(product.getStock() - quantity);
            System.out.println("Order confirmed : " + quantity + " units of " +  product.getName());
        }
    }


    public double calculateTotalPrice(DiscountAplicable product, int quantity, double discountRate) {
        double discountedPrice = product.calculateDiscountedPrice(discountRate);
        return discountedPrice * quantity;
    }


}
