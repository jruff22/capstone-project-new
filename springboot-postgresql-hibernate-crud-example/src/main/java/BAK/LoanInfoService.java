package BAK;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanInfoService {
	
	@Autowired
	private LoanInfoRepository loanInfoRepo;
	
	private boolean existsById(Long id) {
		return loanInfoRepo.existsById(id);
	}
		
		public List <loan_info> findAll() {
			List<loan_info> loanInfo = loanInfoRepo.findAll();
			return loanInfo; 
		}
	}


