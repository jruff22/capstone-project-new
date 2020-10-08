package BAK;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StatmentController {
		
		@Autowired
		private StatementsService statementService;
		
		@GetMapping(value = {"/", "index"})
		public String index(Model model) {
			return "index";
		}
		
		@GetMapping ("/statement")
		public String getStatements (Model model) {
			List<statements> statementsService = statementService.findAll();
			model.addAttribute("statements", statementService);
			return "statementService";

	}

	}
