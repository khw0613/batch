package kr.or.ddit.yogult.dao;

public interface IYogultDao {
	//일실적 일괄 삭제
	int deleteDailyYm(String ym);
	
	//일실적 입력
	int dailyBatchYm(String ym);
}
