package ${package};

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(App.class);
		logger.trace("Hello World!");
		logger.debug("How are you today?");
		logger.info("I am fine.");
		logger.warn("I love programming.");
		logger.error("I am programming.");
	}
}
