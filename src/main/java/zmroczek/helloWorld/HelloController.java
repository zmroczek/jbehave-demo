package zmroczek.helloWorld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    public String showLinkToNextPage() {
        return "index";
    }

    @RequestMapping("nextPage")
	public String printWelcome(ModelMap model) {
		model.addAttribute("helloWorld", "Hello world!");
		return "helloWorld";
	}
}