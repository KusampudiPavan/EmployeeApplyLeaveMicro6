package com.stl.EmployeeLeave.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="leaves")
public class LeaveModel {
	

	@Column(name="leaveid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long leaveid;
	
	@Column(name="employeeemail")
	private String employeeemail;
	
	@Column(name="fromdate")
	private String fromdate;
	
	@Column(name="todate")
	private String todate;
	
	@Column(name="leavereason")
	private String leavereason;
	
	@Column(name="leavestatus")
	private String leavestatus;
	
	@Column(name="manageremail")
	private String manageremail;
	
	public LeaveModel() {
		
	}

	public LeaveModel(Long leaveid, String employeeemail, String fromdate, String todate, String leavereason,
			String leavestatus, String manageremail) {
		super();
		this.leaveid = leaveid;
		this.employeeemail = employeeemail;
		this.fromdate = fromdate;
		this.todate = todate;
		this.leavereason = leavereason;
		this.leavestatus = leavestatus;
		this.manageremail = manageremail;
	}

	public Long getLeaveid() {
		return leaveid;
	}

	public void setLeaveid(Long leaveid) {
		this.leaveid = leaveid;
	}

	public String getEmployeeemail() {
		return employeeemail;
	}

	public void setEmployeeemail(String employeeemail) {
		this.employeeemail = employeeemail;
	}

	public String getFromdate() {
		return fromdate;
	}

	public void setFromdate(String fromdate) {
		this.fromdate = fromdate;
	}

	public String getTodate() {
		return todate;
	}

	public void setTodate(String todate) {
		this.todate = todate;
	}

	public String getLeavereason() {
		return leavereason;
	}

	public void setLeavereason(String leavereason) {
		this.leavereason = leavereason;
	}

	public String getLeavestatus() {
		return leavestatus;
	}

	public void setLeavestatus(String leavestatus) {
		this.leavestatus = leavestatus;
	}

	public String getManageremail() {
		return manageremail;
	}

	public void setManageremail(String manageremail) {
		this.manageremail = manageremail;
	}

	@Override
	public String toString() {
		return "LeaveModel [leaveid=" + leaveid + ", employeeemail=" + employeeemail + ", fromdate=" + fromdate
				+ ", todate=" + todate + ", leavereason=" + leavereason + ", leavestatus=" + leavestatus
				+ ", manageremail=" + manageremail + "]";
	}
	
	
	
	

}
