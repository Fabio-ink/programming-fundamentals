package oop.orders.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import oop.orders.entities.enums.OrderStatus;

public class Order {

    SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;
    private Client client;

    private List<OrderItem> itens = new ArrayList<>();


    public Order(){
    }

    public Order(Client client, Date moment, OrderStatus status) {
        this.client = client;
        this.moment = moment;
        this.status = status;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getOrderItems() {
        return itens;
    }

    public void addItem(OrderItem item){
        itens.add(item);
    }

    public void removeItem(OrderItem item){
        itens.remove(item);
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Double totalValueOrder(){
        Double sum = 0.0;
        for (OrderItem i : itens){
            sum += i.subTotal();
        }
        return sum;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Data do pedido: ").append(sdf1.format(moment)).append("\n");
        sb.append("Status do pedido: ").append(status).append("\n");
        sb.append("Cliente: ").append(client);
        sb.append("-----Itens do pedido-----\n");
        for (OrderItem item : itens) {
        sb.append(item).append("\n");
        }
        sb.append("Valor total: R$").append(String.format("%.2f", totalValueOrder()));
        return sb.toString();
    }

}
