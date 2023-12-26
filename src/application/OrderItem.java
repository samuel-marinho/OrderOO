package application;
public class OrderItem {
    private Integer quantity;
    private Double price;
    private Product product;

    public OrderItem() {
    }

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public OrderItem setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public OrderItem setPrice(Double price) {
        this.price = price;
        return this;
    }

    public Product getProduct() {
        return product;
    }

    public OrderItem setProduct(Product product) {
        this.product = product;
        return this;
    }

    public double subTotal(){
        return quantity*price;
    }

    @Override
    public String toString() {
        return getProduct().getName() +
                ",$ "+
                String.format("%.2f", price) +
                ", Quantity: " + quantity +
                ", Subtotal: $" +
                String.format("%.2f", subTotal());
    }
}
