package com.samgitonga.paymentservice.Service;

import com.samgitonga.paymentservice.Dto.FlightBookingAcknowledgement;
import com.samgitonga.paymentservice.Dto.FlightBookingRequest;
import com.samgitonga.paymentservice.Entity.PassengerInfo;
import com.samgitonga.paymentservice.Entity.PaymentInfo;
import com.samgitonga.paymentservice.Repository.PassengerRepository;
import com.samgitonga.paymentservice.Repository.PaymentInfoRepository;
import com.samgitonga.paymentservice.Utils.PaymentUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class FlightBookingService {
    @Autowired
    private PassengerRepository passengerRepository;
    @Autowired
    private PaymentInfoRepository paymentInfoRepository;

    public FlightBookingAcknowledgement bookFlightTicket(FlightBookingRequest request){
        FlightBookingAcknowledgement acknowledgement=null;
        PassengerInfo passengerInfo=request.getPassengerInfo();
        passengerInfo=passengerRepository.save(passengerInfo);

        PaymentInfo paymentInfo=request.getPaymentInfo();


        PaymentUtils.validateCreditLimit(paymentInfo.getAccountNo(),passengerInfo.getFare());
        paymentInfo.setPassengerId(passengerInfo.getId());
        paymentInfo.setAmount(passengerInfo.getFare());
        paymentInfoRepository.save(paymentInfo);
        return new FlightBookingAcknowledgement("success",passengerInfo.getFare(), UUID.randomUUID().toString().split("")[0],passengerInfo);


    }
}
