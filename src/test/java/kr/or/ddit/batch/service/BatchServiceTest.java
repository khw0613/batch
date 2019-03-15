package kr.or.ddit.batch.service;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.or.ddit.yogult.dao.IYogultDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:kr/or/ddit/config/spring/context-batch.xml")
public class BatchServiceTest {
	
	@Resource(name="batchService")
	private IBatchService batchService;

	@Resource(name="yogultDao")
	private IYogultDao yogultDao;
	
	@Test
	public void test() {
		/***Given***/
		String ym = "201904";
		yogultDao.deleteDailyYm(ym);

		/***When***/
		int insertCnt = batchService.dailyBatchYm(ym);

		/***Then***/
		assertEquals(66, insertCnt);

	}

}
