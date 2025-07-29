package oop.enums.syntax;

import java.util.Date;

import oop.enums.entities.Order;
import oop.enums.entities.enums.OrderStatus;

public class ChangeStatus {
    public static void main(String[] args) {
        

        Order o1 = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT); // Instanciação de um novo pedido

        System.out.println(o1);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED"); // Conversão de um String para um Enum.

        System.out.println(os1);
        System.out.println(os2);
    }

}
