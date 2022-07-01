package com.samgitonga.paymentservice.Dto;

import com.samgitonga.paymentservice.Entity.PassengerInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightBookingAcknowledgement {
    private String status;
    private String totalFare;
    private String pnrNo;
    private PassengerInfo passengerInfo;

    public FlightBookingAcknowledgement(String success, double fare, String pnrNo, PassengerInfo passengerInfo) {
    }
}
