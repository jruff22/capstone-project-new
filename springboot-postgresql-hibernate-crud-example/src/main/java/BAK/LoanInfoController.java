package BAK;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoanInfoController {
	
	@Autowired
	private LoanInfoService loanInfoService;
	
	@GetMapping(value = {"/", "index"})
	public String index(Model model) {
		return "index";
	}
	
	@GetMapping ("/loanInfo")
	public String getLoanInfo (Model model) {
		List<loan_info> loanInfo = loanInfoService.findAll();
		model.addAttribute("loan info", loanInfo);
		return "loanInfo";

}

}
