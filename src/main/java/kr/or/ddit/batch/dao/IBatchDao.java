package kr.or.ddit.batch.dao;

import kr.or.ddit.batch.model.BatchVo;

public interface IBatchDao {
	
	/**
	 * 
	* Method : getBatchBid
	* 작성자 : macbook
	* 변경이력 :
	* @return
	* Method 설명 : 배치 아이디를 생성
	 */
	int getBatchBid();
	
	/**
	 * 
	* Method : createBatch
	* 작성자 : macbook
	* 변경이력 :
	* @param batchVo
	* @return
	* Method 설명 : 배치 정보 생성
	 */
	int createBatch(BatchVo batchVo);
	
	/**
	 * 
	* Method : updateBatch
	* 작성자 : macbook
	* 변경이력 :
	* @param batchVo
	* @return
	* Method 설명 : 배치 정보 업데이트
	 */
	int updateBatch(BatchVo batchVo);

}
