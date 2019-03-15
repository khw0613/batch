package kr.or.ddit.yogult.batch;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:kr/or/ddit/config/spring/context-batch.xml",
						"classpath:kr/or/ddit/config/spring/context-batch-test.xml"})

public class YogultJobTest {

	   @Autowired
	   private JobLauncherTestUtils jobLauncher;
	   
	   @Test
	   public void testYogultJob() throws Exception {
	      /***Given***/
		   Map<String, JobParameter> map = new HashMap<String,JobParameter>();
		   map.put("ym",new JobParameter(new SimpleDateFormat("yyyyMM").format(new Date())));
		   
		   map.put("dt", new JobParameter(new Date()));
	      
	      /***When***/
	      JobExecution jobExecution = jobLauncher.launchJob(new JobParameters(map));
	      
	      /***Then***/

	      assertEquals(ExitStatus.COMPLETED, jobExecution.getExitStatus());
	   }
	   
	   
	   
}