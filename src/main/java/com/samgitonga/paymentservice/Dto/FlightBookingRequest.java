package com.samgitonga.paymentservice.Dto;

import com.samgitonga.paymentservice.Entity.PassengerInfo;
import com.samgitonga.paymentservice.Entity.PaymentInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightBookingRequest {
    private PassengerInfo passengerInfo;
    private PaymentInfo paymentInfo;
}
