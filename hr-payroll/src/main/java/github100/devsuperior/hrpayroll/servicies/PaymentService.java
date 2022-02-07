package github100.devsuperior.hrpayroll.servicies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import github100.devsuperior.hrpayroll.entities.Payment;
import github100.devsuperior.hrpayroll.entities.Worker;
import github100.devsuperior.hrpayroll.feignclient.WorkerFeignClient;

@Service
public class PaymentService {

	
	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	public Payment getPayment(long workerId, int days) {
		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
	
	
}
