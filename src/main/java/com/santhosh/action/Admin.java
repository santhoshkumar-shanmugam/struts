package com.santhosh.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.santhosh.bean.Employee;

public class Admin {

	private static List<Employee> list = new ArrayList<Employee>();

	public int registerUser(String uname, String uemail, String upass, String udeg) throws Exception {

		Employee emp = new Employee(uname, uemail, upass, udeg);
		list.add(emp);
		return 1;
	}

	// method for fetch saved user data
	public List<Employee> report() throws SQLException, Exception {
		System.out.println(list);
		list = Arrays.asList(new Employee("test","test","test","test"));
		return list;

	}
	 
	public Employee fetchUserDetails(String uemail)  {
		return list.stream().filter(obj->obj.getUemail().equals(uemail)).findFirst().get();
	}
	
	
	public int updateUserDetails(String uname, String uemail, String upass, String udeg, String uemailhidden) {
		Employee emp = list.stream().filter(obj->obj.getUemail().equals(uemailhidden)).findFirst().get();
		emp.setUdeg(udeg);
		emp.setUemail(uemail);
		emp.setUname(uname);
		emp.setUpass(upass);
		return 1;
	}
	
	public int deleteUserDetails(String uemail) throws SQLException, Exception {
		list = list.stream().filter(obj->!obj.getUemail().equals(uemail)).collect(Collectors.toList());
		return 1;
	}

}
