package kr.or.ddit.batch.dao;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.or.ddit.batch.model.BatchVo;

@Repository
public class BatchDao implements IBatchDao{

	@Resource(name="sqlSessionTemplate")
	private SqlSessionTemplate template;
	
	@Override
	public int createBatch(BatchVo batchVo) {
		
		return template.insert("batch.createBatch", batchVo);
	}

	@Override
	public int updateBatch(BatchVo batchVo) {
		return template.update("batch.updateBatch", batchVo);
	}

	@Override
	public int getBatchBid() {
		return template.selectOne("batch.getBatchBid");
	}
	
	
}
