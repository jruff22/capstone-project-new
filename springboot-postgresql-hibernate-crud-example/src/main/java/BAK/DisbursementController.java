package BAK;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DisbursementController {
	
	@Autowired
	private DisbursementsService disbursementService;
	
	@GetMapping(value = {"/", "index"})
	public String index(Model model) {
		return "index";
	}
	
	@GetMapping ("/disbursementInfo")
	public String getDisbursementInfo (Model model) {
		List<disbursements> disbursementInfo = disbursementService.findAll();
		model.addAttribute("disbursement info", disbursementInfo);
		return "disbursementInfo";

}

}