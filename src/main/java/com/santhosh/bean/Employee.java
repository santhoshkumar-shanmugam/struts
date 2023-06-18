package com.santhosh.bean;

public class Employee {
	private String uname, uemail, upass, udeg;
	int srNo;

	public Employee(String uname, String uemail, String upass, String udeg) {
		super();
		this.uname = uname;
		this.uemail = uemail;
		this.upass = upass;
		this.udeg = udeg;
	}

	public Employee() {
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getUpass() {
		return upass;
	}

	public void setUpass(String upass) {
		this.upass = upass;
	}

	public String getUdeg() {
		return udeg;
	}

	public void setUdeg(String udeg) {
		this.udeg = udeg;
	}

	public int getSrNo() {
		return srNo;
	}

	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}

}
