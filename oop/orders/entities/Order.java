package oop.orders.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import oop.orders.entities.enums.OrderStatus;

public class Order {

    private Date moment;
    private OrderStatus status;

    List<OrderItem> itens = new ArrayList<>();
    List<Client> clients = new ArrayList<>();

    public Order(){
    }

    public Order(Date moment, OrderStatus status) {
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

    public List<Client> getClients() {
        return clients;
    }

    public void addClients(Client client){
        clients.add(client);
    }

    public void removeClients(Client client){
        clients.remove(client);
    }

    Double sum;
    public Double totalValueOrder(){
        
        for (OrderItem i : itens){
            sum += i.subTotal();
        }
        return sum;
    }
    

}
