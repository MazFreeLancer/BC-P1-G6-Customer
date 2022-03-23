package com.nttdata.bcp1.mscustomer.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.nttdata.bcp1.mscustomer.model.Customer;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CustomerFactory {

    static List<String> types = new ArrayList<>();
    static {
        types.add("PERSONAL");
        types.add("BUSINESS");
    }

    public static Optional<Customer> validateClient(Customer customer){
        return Optional.ofNullable(types.contains(customer.getCustomerType())?customer:null);
    }
}