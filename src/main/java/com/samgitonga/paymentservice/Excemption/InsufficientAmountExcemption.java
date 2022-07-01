package com.samgitonga.paymentservice.Excemption;

public class InsufficientAmountExcemption extends RuntimeException{
    public InsufficientAmountExcemption(String msg){
        super(msg);
    }
}
