package oop.composition.orders.entities;

public class OrderItem {

    private Integer quantity;
    private Double price;

    private Product product; 

    public OrderItem(){
    }

    public OrderItem(Product product, Integer quantity, Double price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
    public Double subTotal(){
        return price * quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return product.getName() + ", R$" + price + ", Quantidade: " + quantity + ", Subtotal: R$" + subTotal();
    }

    
}
