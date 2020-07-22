package basiclog4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class ReportGenerator {
	// initializing the logger object for current class
	private static final Logger logger = Logger.getLogger(ReportGenerator.class);

	public static void main(String[] args) {

//using basic configuration
		BasicConfigurator.configure();
		logger.trace("trace message");
		logger.debug("debugg message");
		logger.info("info message");
		logger.warn("warn message");
		logger.info("info message");
		logger.fatal("fatal message");

	}

}
