package kr.or.ddit.yogult.dao;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class YogultDao implements IYogultDao{

	@Resource(name="sqlSessionTemplate")
	private SqlSessionTemplate template;
	
	@Override
	public int deleteDailyYm(String ym) {
		
		return template.delete("yogult.deleteDailyYm", ym);
	}

	@Override
	public int dailyBatchYm(String ym) {
		return template.insert("yogult.dailyBatchYm", ym);
	}

}
