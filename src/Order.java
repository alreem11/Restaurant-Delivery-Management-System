public class Order extends DeliveryItem {
    public Order(String orderId, String customerName, String phone, String address, String foodItem, double price) {
        super(orderId, customerName, phone, address, foodItem, price);
    }

    @Override
    public String getDetails() {
        return "Order ID: " + orderId + "\n"
             + "Customer Name: " + customerName + "\n"
             + "Phone: " + phone + "\n"
             + "Address: " + address + "\n"
             + "Food Item: " + foodItem + "\n"
             + "Total Price: " + price + " SR";
    }

    public String getOrderId() {
        return orderId;
         
    }

    public String getCustomerName() {
        return customerName;
        
    }

    public String getPhone() {
        return phone;
        
    }

    public String getAddress() {
        return address;
        
    }

    public String getFoodItem() {
        return foodItem;
      
    }
    
    public double getPrice (){
        return price;
    }
}

    