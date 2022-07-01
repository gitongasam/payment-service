package com.samgitonga.paymentservice.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PassengerInfo {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String email;
    private String source;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd=mm=yyy ")
    private String travelDate;
    private String pickUpTime;
    private String arrivalTime;
    private double fare;
}
