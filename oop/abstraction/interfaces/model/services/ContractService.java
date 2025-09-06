package oop.abstraction.interfaces.model.services;

import java.time.LocalDate;

import oop.abstraction.interfaces.model.entities.Contract;
import oop.abstraction.interfaces.model.entities.Installment;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months){

        Double basicQuota = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);

            Double interest = onlinePaymentService.interest(basicQuota, i);
            Double fee = onlinePaymentService.paymentFee(basicQuota + interest);
            Double Quota = basicQuota + interest + fee;

            contract.getInstallments().add(new Installment(dueDate, Quota));
        }
    }

}
