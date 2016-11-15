package org.zerock.domain;

public class TestVO {

	private Integer tno;
	private String tname;

	public Integer getTno() {
		return tno;
	}

	public void setTno(Integer tno) {
		this.tno = tno;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	@Override
	public String toString() {
		return "TestVO [tno=" + tno + ", tname=" + tname + "]";
	}

}
