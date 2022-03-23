package com.nttdata.bcp1.mscustomer.model;

import lombok.Data;

@Data
public class Credit {

    private String id;
    private String idClient;
    private String cardNumber;
    private String typeCredit;
    private String accountNumber;
    private Double balance;
    private Double credit;
    private Double debt;

}
