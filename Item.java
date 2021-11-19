public class Item {
    private double price = 15.50;

    public void setPrice(double price, Customer cust) {
        this.price = price;
        adjustPrice(cust);        
    }

    private void adjustPrice(Customer cust) {
        if (cust.hasLoyaltyDiscount){
            price = price * .85;
        }
    }

    public getPrice() {
        return String.format("$%.2f", price);        
    }
}
