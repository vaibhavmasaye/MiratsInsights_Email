package com.email.emailapi.model;

public class SalarySlip {

	private String fromEmail;
	private String toEmails;
	private String password;
	private String payslipMonth;
	private String empName;
	private String empLastname;
	private String adminName;
	private String adminPosition;
	private String adminDept;
	private String adminPhoneno;
	private String adminTeamname;
	private String adminEmail;
	private String salarySlip;
	public String getFromEmail() {
		return fromEmail;
	}
	public void setFromEmail(String fromEmail) {
		this.fromEmail = fromEmail;
	}
	public String getToEmails() {
		return toEmails;
	}
	public void setToEmails(String toEmails) {
		this.toEmails = toEmails;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPayslipMonth() {
		return payslipMonth;
	}
	public void setPayslipMonth(String payslipMonth) {
		this.payslipMonth = payslipMonth;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpLastname() {
		return empLastname;
	}
	public void setEmpLastname(String empLastname) {
		this.empLastname = empLastname;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminPosition() {
		return adminPosition;
	}
	public void setAdminPosition(String adminPosition) {
		this.adminPosition = adminPosition;
	}
	public String getAdminDept() {
		return adminDept;
	}
	public void setAdminDept(String adminDept) {
		this.adminDept = adminDept;
	}
	public String getAdminPhoneno() {
		return adminPhoneno;
	}
	public void setAdminPhoneno(String adminPhoneno) {
		this.adminPhoneno = adminPhoneno;
	}
	public String getAdminTeamname() {
		return adminTeamname;
	}
	public void setAdminTeamname(String adminTeamname) {
		this.adminTeamname = adminTeamname;
	}
	public String getAdminEmail() {
		return adminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	public String getSalarySlip() {
		return salarySlip;
	}
	public void setSalarySlip(String salarySlip) {
		this.salarySlip = salarySlip;
	}

	public SalarySlip(String fromEmail, String toEmails, String password, String payslipMonth, String empName,
			String empLastname, String adminName, String adminPosition, String adminDept, String adminPhoneno,
			String adminTeamname, String adminEmail, String salarySlip, String hrProfile) {
		super();
		this.fromEmail = fromEmail;
		this.toEmails = toEmails;
		this.password = password;
		this.payslipMonth = payslipMonth;
		this.empName = empName;
		this.empLastname = empLastname;
		this.adminName = adminName;
		this.adminPosition = adminPosition;
		this.adminDept = adminDept;
		this.adminPhoneno = adminPhoneno;
		this.adminTeamname = adminTeamname;
		this.adminEmail = adminEmail;
		this.salarySlip = salarySlip;
	}
	public SalarySlip() {
		super();
	}
	@Override
	public String toString() {
		return "SalarySlip [fromEmail=" + fromEmail + ", toEmails=" + toEmails + ", password=" + password
				+ ", payslipMonth=" + payslipMonth + ", empName=" + empName + ", empLastname=" + empLastname
				+ ", adminName=" + adminName + ", adminPosition=" + adminPosition + ", adminDept=" + adminDept
				+ ", adminPhoneno=" + adminPhoneno + ", adminTeamname=" + adminTeamname + ", adminEmail=" + adminEmail
				+ ", salarySlip=" + salarySlip + "]";
	}
	
	
		
	
	
}
