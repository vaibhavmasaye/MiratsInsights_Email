package com.email.emailapi.model;

public class EmplyeeOnbording {
	
	private String fromEmail;
	private String toEmails;
	private String password;
	private String firstName;
	private String doj;
	private String teamName;
	private String department;
	private String lastName;
	private String empPassword;
	private String dob;
	private String hrName;
	private String gender;
	private String phoneNo;
	private String workLocation;
	private String position;
	private String employeeType;
	private String shift;
	private String hrSkype;
	private String hrProfile;
	private String hrEmail;
	
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
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmpPassword() {
		return empPassword;
	}
	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getHrName() {
		return hrName;
	}
	public void setHrName(String hrName) {
		this.hrName = hrName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getWorkLocation() {
		return workLocation;
	}
	public void setWorkLocation(String workLocation) {
		this.workLocation = workLocation;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getEmployeeType() {
		return employeeType;
	}
	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}
	public String getShift() {
		return shift;
	}
	public void setShift(String shift) {
		this.shift = shift;
	}
	public String getHrSkype() {
		return hrSkype;
	}
	public void setHrSkype(String hrSkype) {
		this.hrSkype = hrSkype;
	}
	public String getHrProfile() {
		return hrProfile;
	}
	public void setHrProfile(String hrProfile) {
		this.hrProfile = hrProfile;
	}
	public String getHrEmail() {
		return hrEmail;
	}
	public void setHrEmail(String hrEmail) {
		this.hrEmail = hrEmail;
	}
	public EmplyeeOnbording(String fromEmail, String toEmails, String password, String firstName, String doj,
			String teamName, String department, String lastName, String empPassword, String dob, String hrName,
			String gender, String phoneNo, String workLocation, String position, String employeeType, String shift,
			String hrSkype, String hrProfile, String hrEmail) {
		super();
		this.fromEmail = fromEmail;
		this.toEmails = toEmails;
		this.password = password;
		this.firstName = firstName;
		this.doj = doj;
		this.teamName = teamName;
		this.department = department;
		this.lastName = lastName;
		this.empPassword = empPassword;
		this.dob = dob;
		this.hrName = hrName;
		this.gender = gender;
		this.phoneNo = phoneNo;
		this.workLocation = workLocation;
		this.position = position;
		this.employeeType = employeeType;
		this.shift = shift;
		this.hrSkype = hrSkype;
		this.hrProfile = hrProfile;
		this.hrEmail = hrEmail;
	}
	public EmplyeeOnbording() {
		super();
	}
	@Override
	public String toString() {
		return "EmplyeeOnbording [fromEmail=" + fromEmail + ", toEmails=" + toEmails + ", password=" + password
				+ ", firstName=" + firstName + ", doj=" + doj + ", teamName=" + teamName + ", department=" + department
				+ ", lastName=" + lastName + ", empPassword=" + empPassword + ", dob=" + dob + ", hrName=" + hrName
				+ ", gender=" + gender + ", phoneNo=" + phoneNo + ", workLocation=" + workLocation + ", position="
				+ position + ", employeeType=" + employeeType + ", shift=" + shift + ", hrSkype=" + hrSkype
				+ ", hrProfile=" + hrProfile + ", hrEmail=" + hrEmail + "]";
	}
	
	
	
	


}
