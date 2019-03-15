package kr.or.ddit.yogult.dao;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.or.ddit.yogult.dao.IYogultDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:kr/or/ddit/config/spring/context-batch.xml")
public class YogultDaoTest {

	@Resource(name="yogultDao")
	private IYogultDao yogultDao;
	
	/**
	 * 
	* Method : test
	* 작성자 : macbook
	* 변경이력 :
	* Method 설명 : 일실적 생성 테스트
	 */
	@Test
	public void testDailyBatchYm() {
		/***Given***/
		String ym = "201904";
		yogultDao.deleteDailyYm(ym);

		/***When***/
		int insertCnt = yogultDao.dailyBatchYm(ym);
		
		/***Then***/
		assertTrue(insertCnt > 50); 

	}

}
