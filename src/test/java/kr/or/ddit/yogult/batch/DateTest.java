package kr.or.ddit.yogult.batch;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.or.ddit.yogult.model.CycleVo;
import kr.or.ddit.yogult.model.DailyVo;

public class DateTest {
	private static final Logger logger = LoggerFactory.getLogger(DateTest.class);
	
	@Test
	public void testDateBath() throws ParseException{
		/***Given***/
		String ym = "201903";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

		/***When***/
		Date stDate = sdf.parse(ym + "01"); //시작일자
		Calendar cal = Calendar.getInstance();
		cal.setTime(stDate);
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH); //31
		Date enDate = sdf.parse(ym + lastDay);
		
		/***Then***/
		assertEquals("20190301", sdf.format(stDate));
		assertEquals("20190331", sdf.format(enDate));

	}
	
	@Test
	public void testDtWhile() throws ParseException{
		String ym = "201903";
		CycleVo cycleVo = new CycleVo();
		cycleVo.setCid(1);
		cycleVo.setPid(100);
		cycleVo.setDay(2);
		cycleVo.setCnt(2);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date stDate = sdf.parse(ym + "01");
		Calendar cal = Calendar.getInstance();
		cal.setTime(stDate);
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		Date edDate = sdf.parse(ym + lastDay);

		// 시작일자, 종료일자
		List<DailyVo> dailyVoList = new ArrayList<DailyVo>();
		while (cal.getTimeInMillis() <= edDate.getTime()) {
			int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

			// 애음주기 요일이랑 cal 날짜요일이 같으면 일시적으로 생성할 대상일자
			if (dayOfWeek == cycleVo.getDay()) {
				DailyVo dailyVo = new DailyVo();
				dailyVo.setCid(cycleVo.getCid());
				dailyVo.setPid(cycleVo.getPid());
				dailyVo.setDt(sdf.format(cal.getTime()));
				dailyVo.setCnt(cycleVo.getCnt());
				dailyVoList.add(dailyVo);
			}
			cal.add(Calendar.DAY_OF_MONTH, 1);
		}
		logger.debug("dailyVoList : {}", dailyVoList);
		logger.debug("dailyVoList.size() : {}", dailyVoList.size());
	}

}
