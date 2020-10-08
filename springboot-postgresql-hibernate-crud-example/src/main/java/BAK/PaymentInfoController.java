package BAK;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaymentInfoController {
	
	@Autowired
	private PaymentInfoService paymentInfoService;
	
	@GetMapping(value = {"/", "index"})
	public String index(Model model) {
		return "index";
	}
	
	@GetMapping ("/paymentInfo")
	public String getPaymentInfo (Model model) {
		List<payment_info> paymentInfo = paymentInfoService.findAll();
		model.addAttribute("payment info", paymentInfo);
		return "paymentInfo";

}

}

