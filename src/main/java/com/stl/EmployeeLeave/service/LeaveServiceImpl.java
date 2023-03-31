package com.stl.EmployeeLeave.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stl.EmployeeLeave.model.LeaveModel;
import com.stl.EmployeeLeave.repository.LeaveRepository;

@Service
public class LeaveServiceImpl implements LeaveService {

	@Autowired
	LeaveRepository leaverepo;
	
	
	@Override
	public LeaveModel addleave(LeaveModel leavemodel) {
		return leaverepo.save(leavemodel);
	}


	@Override
	public List<LeaveModel> getleaves() {
		return leaverepo.findAll();
	}


	@Override
	public List<LeaveModel> findbyemailallleaves(String employeeemail) {
		return leaverepo.findbyemailallleaves(employeeemail);
	}


	@Override
	public List<LeaveModel> findbyemailnotapprovedleaves(String employeeemail,String leavestatus) {
		return leaverepo.findbyemailnotapprovedleaves(employeeemail,leavestatus);
	}


	@Override
	public void deleteleave(Long leaveid) {
		leaverepo.findById(leaveid);
		leaverepo.deleteById(leaveid);
		
	}




}
