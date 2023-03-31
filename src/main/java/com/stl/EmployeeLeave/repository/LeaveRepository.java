package com.stl.EmployeeLeave.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.stl.EmployeeLeave.model.LeaveModel;

public interface LeaveRepository extends JpaRepository<LeaveModel, Long> {

	@Query(value = "select * from leaves where employeeemail= ?;", nativeQuery = true)
	public List<LeaveModel> findbyemailallleaves(String employeeemail);
	
	@Query(value = "select * from leaves where employeeemail = ? and leavestatus = ?;", nativeQuery = true)
	public List<LeaveModel> findbyemailnotapprovedleaves(String employeeemail,String leavestatus);
}
