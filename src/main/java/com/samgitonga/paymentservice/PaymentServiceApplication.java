package com.samgitonga.paymentservice;

import com.samgitonga.paymentservice.Dto.FlightBookingAcknowledgement;
import com.samgitonga.paymentservice.Dto.FlightBookingRequest;
import com.samgitonga.paymentservice.Service.FlightBookingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PaymentServiceApplication {
	private FlightBookingService service;
	@PostMapping("bookFlightTicket")
	public FlightBookingAcknowledgement bookFlightTicket(@RequestBody FlightBookingRequest request){
		return  service.bookFlightTicket(request);

	}

	public static void main(String[] args) {
		SpringApplication.run(PaymentServiceApplication.class, args);
	}

}
