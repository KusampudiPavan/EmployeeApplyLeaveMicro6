package com.stl.EmployeeLeave.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stl.EmployeeLeave.model.LeaveModel;
import com.stl.EmployeeLeave.service.LeaveService;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("leave")
public class LeaveController {

	@Autowired
	LeaveService leaveservice;

	@PostMapping("/addleave")
	public LeaveModel addleave(@RequestBody LeaveModel leavemodel){
		return leaveservice.addleave(leavemodel);
	}

	@GetMapping("/get")
	public List<LeaveModel> getleaves(){
		return leaveservice.getleaves();
	}

	@GetMapping("/get/all/{employeeemail}")
	public List<LeaveModel> findbyemailallleaves(@PathVariable("employeeemail") String employeeemail){
		return leaveservice.findbyemailallleaves(employeeemail);
	}

	@GetMapping("/get/{employeeemail}/{leavestatus}")
	public List<LeaveModel>  findbyemailnotapprovedleaves(@PathVariable("employeeemail") String employeeemail,@PathVariable("leavestatus") String leavestatus){
		return leaveservice.findbyemailnotapprovedleaves(employeeemail,leavestatus);
	}


	@DeleteMapping("/delete/{leaveid}")
	public ResponseEntity<String> deleteleave(@PathVariable("leaveid") Long leaveid){
		leaveservice.deleteleave(leaveid);
		return new ResponseEntity<String> ("Leave Cancelled!", HttpStatus.OK);

	}

}
