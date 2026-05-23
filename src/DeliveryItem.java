public abstract class DeliveryItem {
    protected String orderId;
    protected String customerName;
    protected String phone;
    protected String address;
    protected String foodItem;
    protected double price;

    public DeliveryItem(String orderId, String customerName, String phone, String address, String foodItem, double price) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.phone = phone;
        this.address = address;
        this.foodItem = foodItem;
        this.price = price;
    }

    public abstract String getDetails();
}