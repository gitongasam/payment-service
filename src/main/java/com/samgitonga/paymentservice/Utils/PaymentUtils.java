package com.samgitonga.paymentservice.Utils;

import com.samgitonga.paymentservice.Excemption.InsufficientAmountExcemption;

import java.util.HashMap;
import java.util.Map;

public class PaymentUtils {
    private static Map<String,Double> paymentMap=new HashMap<>();
    {
        paymentMap.put("acc1",12000.00);
        paymentMap.put("acc2",10000.00);
        paymentMap.put("acc3",5000.00);
        paymentMap.put("acc4",8000.00);

    }

    public static boolean validateCreditLimit(String accNo,double paidAmount){
        if(paidAmount>paymentMap.get(accNo)){
throw new InsufficientAmountExcemption ("insufficient fund...");
        }
    else{
        return true;
    }

  }
}
