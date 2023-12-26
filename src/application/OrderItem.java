package application;

public class OrderItem {
    private Integer quantity;
    private Double price;

    public OrderItem() {
    }

    public OrderItem(Integer quantity, Double price) {
        this.quantity = quantity;
        this.price = price;
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

    /* O cliente poderá setar o preço? Se não, precisa criar uma forma para instanciar o preço
    public OrderItem setPrice(Double price) {
        this.price = price;
        return this;
    }*/

    public Double subTotal(){
        return quantity*price;
    }

}
