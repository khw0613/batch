package kr.or.ddit.batch.model;

import java.util.Date;

public class BatchVo {
	private int bid; 	//배치 로그번호
	private String bcd; //배치 코드 (01:일실적 생성 배치, 02:일실적 통계 배치...)
	private String st;  //배치 상태 (01: 실행 02: 완료 99:에러)
	private Date st_dt;	//배치 시작일시
	private Date ed_dt;	//배치 종료일시
	
	public BatchVo() {
	}

	public BatchVo(int bid, String bcd, String st) {
		this.bid = bid;
		this.bcd = bcd;
		this.st = st;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBcd() {
		return bcd;
	}

	public void setBcd(String bcd) {
		this.bcd = bcd;
	}

	public String getSt() {
		return st;
	}

	public void setSt(String st) {
		this.st = st;
	}

	public Date getSt_dt() {
		return st_dt;
	}

	public void setSt_dt(Date st_dt) {
		this.st_dt = st_dt;
	}

	public Date getEd_dt() {
		return ed_dt;
	}

	public void setEd_dt(Date ed_dt) {
		this.ed_dt = ed_dt;
	}

	@Override
	public String toString() {
		return "BatchVo [bid=" + bid + ", bcd=" + bcd + ", st=" + st + ", st_dt=" + st_dt + ", ed_dt=" + ed_dt + "]";
	}
	
	
}	
