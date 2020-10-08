package BAK;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentInfoService {
	
	@Autowired
	private PaymentInfoRepository paymentInfoRepo;
	
	private boolean existsById(Long id) {
		return paymentInfoRepo.existsById(id);
	}
		
		public List <payment_info> findAll() {
			List<payment_info> paymentInfo = paymentInfoRepo.findAll();
			return paymentInfo; 
		}
	}
