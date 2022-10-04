package com.email.emailapi.model;

import java.util.List;

public class EmailRequest {
	private String fromEmail;
	private String toEmails;
	private String toEmailName;
	private String toSupplierName;
	private String toSupplierID;
	private String emailSentBy;
	private String subject;
	private String bid_contact_name;
	private String target_audience;
	private String tabledata;
	private String description;
	
	private String sales_basicinfo_firstname;
	private String sales_basicinfo_lastname;
	private String sales_basicinfo_email;
	
	private String basicinfo_firstname;
	private String basicinfo_lastname;
	private String basicinfo_phonenumber;
	
	private String work_details_position;
	private String work_details_department;
	private String work_details_division;
	private String work_details_teamname;
	private String work_details_skypeID;
	private String email;
	private String type;
	private String survey_type;
	private String device_compatibility;
	private String password;
	private String order_id;
	
	
	


	


	public EmailRequest(String fromEmail, String toEmails, String toEmailName, String toSupplierName,
			String toSupplierID, String emailSentBy, String subject, String bid_contact_name, String target_audience,
			String tabledata, String description, String sales_basicinfo_firstname, String sales_basicinfo_lastname,
			String sales_basicinfo_email, String basicinfo_firstname, String basicinfo_lastname,
			String basicinfo_phonenumber, String work_details_position, String work_details_department,
			String work_details_division, String work_details_teamname, String work_details_skypeID, String email,
			String type, String survey_type, String device_compatibility, String password, String order_id) {
		super();
		this.fromEmail = fromEmail;
		this.toEmails = toEmails;
		this.toEmailName = toEmailName;
		this.toSupplierName = toSupplierName;
		this.toSupplierID = toSupplierID;
		this.emailSentBy = emailSentBy;
		this.subject = subject;
		this.bid_contact_name = bid_contact_name;
		this.target_audience = target_audience;
		this.tabledata = tabledata;
		this.description = description;
		this.sales_basicinfo_firstname = sales_basicinfo_firstname;
		this.sales_basicinfo_lastname = sales_basicinfo_lastname;
		this.sales_basicinfo_email = sales_basicinfo_email;
		this.basicinfo_firstname = basicinfo_firstname;
		this.basicinfo_lastname = basicinfo_lastname;
		this.basicinfo_phonenumber = basicinfo_phonenumber;
		this.work_details_position = work_details_position;
		this.work_details_department = work_details_department;
		this.work_details_division = work_details_division;
		this.work_details_teamname = work_details_teamname;
		this.work_details_skypeID = work_details_skypeID;
		this.email = email;
		this.type = type;
		this.survey_type = survey_type;
		this.device_compatibility = device_compatibility;
		this.password = password;
		this.order_id = order_id;
	}

	public String getTabledata() {
		return tabledata;
	}

	public void setTabledata(String tabledata) {
		this.tabledata = tabledata;
	}

	public EmailRequest() {
		super();
	}

	@Override
	public String toString() {
		return "EmailRequest [fromEmail=" + fromEmail + ", toEmails=" + toEmails + ", toEmailName=" + toEmailName
				+ ", toSupplierName=" + toSupplierName + ", toSupplierID=" + toSupplierID + ", emailSentBy="
				+ emailSentBy + ", subject=" + subject + ", bid_contact_name=" + bid_contact_name + ", target_audience="
				+ target_audience + ", tabledata=" + tabledata + ", description=" + description
				+ ", sales_basicinfo_firstname=" + sales_basicinfo_firstname + ", sales_basicinfo_lastname="
				+ sales_basicinfo_lastname + ", sales_basicinfo_email=" + sales_basicinfo_email
				+ ", basicinfo_firstname=" + basicinfo_firstname + ", basicinfo_lastname=" + basicinfo_lastname
				+ ", basicinfo_phonenumber=" + basicinfo_phonenumber + ", work_details_position="
				+ work_details_position + ", work_details_department=" + work_details_department
				+ ", work_details_division=" + work_details_division + ", work_details_teamname="
				+ work_details_teamname + ", work_details_skypeID=" + work_details_skypeID + ", email=" + email
				+ ", type=" + type + ", survey_type=" + survey_type + ", device_compatibility=" + device_compatibility
				+ ", password=" + password + ", order_id=" + order_id + "]";
	}


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


	public String getToEmailName() {
		return toEmailName;
	}


	public void setToEmailName(String toEmailName) {
		this.toEmailName = toEmailName;
	}


	public String getToSupplierName() {
		return toSupplierName;
	}


	public void setToSupplierName(String toSupplierName) {
		this.toSupplierName = toSupplierName;
	}


	public String getToSupplierID() {
		return toSupplierID;
	}


	public void setToSupplierID(String toSupplierID) {
		this.toSupplierID = toSupplierID;
	}


	public String getEmailSentBy() {
		return emailSentBy;
	}


	public void setEmailSentBy(String emailSentBy) {
		this.emailSentBy = emailSentBy;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public String getBid_contact_name() {
		return bid_contact_name;
	}


	public void setBid_contact_name(String bid_contact_name) {
		this.bid_contact_name = bid_contact_name;
	}


	public String getTarget_audience() {
		return target_audience;
	}


	public void setTarget_audience(String target_audience) {
		this.target_audience = target_audience;
	}

	

	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getSales_basicinfo_firstname() {
		return sales_basicinfo_firstname;
	}


	public void setSales_basicinfo_firstname(String sales_basicinfo_firstname) {
		this.sales_basicinfo_firstname = sales_basicinfo_firstname;
	}


	public String getSales_basicinfo_lastname() {
		return sales_basicinfo_lastname;
	}


	public void setSales_basicinfo_lastname(String sales_basicinfo_lastname) {
		this.sales_basicinfo_lastname = sales_basicinfo_lastname;
	}


	public String getSales_basicinfo_email() {
		return sales_basicinfo_email;
	}


	public void setSales_basicinfo_email(String sales_basicinfo_email) {
		this.sales_basicinfo_email = sales_basicinfo_email;
	}


	public String getBasicinfo_firstname() {
		return basicinfo_firstname;
	}


	public void setBasicinfo_firstname(String basicinfo_firstname) {
		this.basicinfo_firstname = basicinfo_firstname;
	}


	public String getBasicinfo_lastname() {
		return basicinfo_lastname;
	}


	public void setBasicinfo_lastname(String basicinfo_lastname) {
		this.basicinfo_lastname = basicinfo_lastname;
	}


	public String getBasicinfo_phonenumber() {
		return basicinfo_phonenumber;
	}


	public void setBasicinfo_phonenumber(String basicinfo_phonenumber) {
		this.basicinfo_phonenumber = basicinfo_phonenumber;
	}


	public String getWork_details_position() {
		return work_details_position;
	}


	public void setWork_details_position(String work_details_position) {
		this.work_details_position = work_details_position;
	}


	public String getWork_details_department() {
		return work_details_department;
	}


	public void setWork_details_department(String work_details_department) {
		this.work_details_department = work_details_department;
	}


	public String getWork_details_division() {
		return work_details_division;
	}


	public void setWork_details_division(String work_details_division) {
		this.work_details_division = work_details_division;
	}


	public String getWork_details_teamname() {
		return work_details_teamname;
	}


	public void setWork_details_teamname(String work_details_teamname) {
		this.work_details_teamname = work_details_teamname;
	}


	public String getWork_details_skypeID() {
		return work_details_skypeID;
	}


	public void setWork_details_skypeID(String work_details_skypeID) {
		this.work_details_skypeID = work_details_skypeID;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getSurvey_type() {
		return survey_type;
	}


	public void setSurvey_type(String survey_type) {
		this.survey_type = survey_type;
	}


	public String getDevice_compatibility() {
		return device_compatibility;
	}


	public void setDevice_compatibility(String device_compatibility) {
		this.device_compatibility = device_compatibility;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getOrder_id() {
		return order_id;
	}


	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	

	
	
	

}
