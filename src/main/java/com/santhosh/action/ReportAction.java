package com.santhosh.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.santhosh.bean.Employee;

public class ReportAction extends ActionSupport {

	private static final long serialVersionUID = 6329394260276112660L;
	Employee bean = null;
	List<Employee> beanList = null;
	Admin admin = new Admin();
	private boolean noData = false;

	@Override
	public String execute() throws Exception {
		
		beanList = admin.report();
		noData = true;
		return "REPORT";
	}

	public boolean isNoData() {
		return noData;
	}

	public void setNoData(boolean noData) {
		this.noData = noData;
	}

	public List<Employee> getBeanList() {
		return beanList;
	}

	public void setBeanList(List<Employee> beanList) {
		this.beanList = beanList;
	}
}
