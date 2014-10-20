package ${package};

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {

	private static final Logger LOGGER = LoggerFactory.getLogger(WelcomeController.class);

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String welcome(Model model) {
		LOGGER.trace("Hello World!");
		LOGGER.debug("How are you today?");
		LOGGER.info("I am fine.");
		LOGGER.warn("I love programming.");
		LOGGER.error("I am programming.");
		model.addAttribute("message", "Hello World!");
		return "welcome";
	}

}
