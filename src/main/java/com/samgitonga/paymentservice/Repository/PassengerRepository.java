package com.samgitonga.paymentservice.Repository;

import com.samgitonga.paymentservice.Entity.PassengerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<PassengerInfo,Long > {

}
