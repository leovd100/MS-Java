package github100.devsuperior.hrpayroll.servicies;

import org.springframework.stereotype.Service;

import github100.devsuperior.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long workerId, int days) {
		return new Payment("Bob", 200.0, days);
	}
	
	
}
