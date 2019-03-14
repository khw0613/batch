package kr.or.ddit.batch.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;

public class SimpleTask {
	private static final Logger logger = LoggerFactory.getLogger(SimpleTask.class);
	
	@Scheduled(cron="*/3 * * * * *")
	public void simpleTask(){
		logger.debug("simpleTask");
	}
}
