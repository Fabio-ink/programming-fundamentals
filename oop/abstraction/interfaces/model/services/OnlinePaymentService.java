package oop.abstraction.interfaces.model.services;

public interface OnlinePaymentService {

    public Double paymentFee(Double ammount);

    public Double interest(Double ammount, Integer months);

}
