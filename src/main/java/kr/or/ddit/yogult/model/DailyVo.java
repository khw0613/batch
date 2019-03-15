package kr.or.ddit.yogult.model;

public class DailyVo {
 private int cid; //고객번호
 private int pid; //제품번호
 private String dt; //일
 private int cnt; //수량
 
 
	public DailyVo() {
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getDt() {
		return dt;
	}

	public void setDt(String dt) {
		this.dt = dt;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	@Override
	public String toString() {
		return "DailyVo [cid=" + cid + ", pid=" + pid + ", dt=" + dt + ", cnt=" + cnt + "]";
	}
 
}
