package com.stl.EmployeeLeave.service;

import java.util.List;

import com.stl.EmployeeLeave.model.LeaveModel;

public interface LeaveService {

	LeaveModel addleave(LeaveModel leavemodel);
	List<LeaveModel> getleaves();
	
	List<LeaveModel> findbyemailallleaves(String employeeemail);
	List<LeaveModel> findbyemailnotapprovedleaves(String employeeemail,String leavestatus);
	
	void deleteleave(Long leaveid);
	
}
