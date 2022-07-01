package com.samgitonga.paymentservice.Repository;

import com.samgitonga.paymentservice.Entity.PaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentInfoRepository extends JpaRepository<PaymentInfo,String> {
}
