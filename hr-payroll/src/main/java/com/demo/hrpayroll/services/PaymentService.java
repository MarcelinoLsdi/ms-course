package com.demo.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.demo.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(Long workerId, int days) {
		return(new Payment("bob", 200.0, days));		
	}

}
