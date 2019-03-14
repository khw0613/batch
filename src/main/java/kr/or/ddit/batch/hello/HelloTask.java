package kr.or.ddit.batch.hello;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.scheduling.annotation.Scheduled;

public class HelloTask {

	private static final Logger logger = LoggerFactory.getLogger(HelloTask.class);
	
	@Resource(name="jobLauncher")
	private JobLauncher jobLauncher;
	
	@Resource(name="helloJob")
	private Job helloJob;
	
	@Scheduled(cron="*/3 * * * * *")
	public void helloTask(){
		logger.debug("helloTask");
		try {
			Map<String, JobParameter> map = new HashMap<String, JobParameter>();
//			jobLauncher.run(helloJob, new JobParameters(map));
			jobLauncher.run(helloJob, new JobParameters());
		} catch (JobExecutionAlreadyRunningException | JobRestartException | JobInstanceAlreadyCompleteException
				| JobParametersInvalidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
