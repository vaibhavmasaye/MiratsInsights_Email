package com.email.emailapi.Controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.email.emailapi.Service.EmailService;
import com.email.emailapi.model.EmailRequest;
import com.email.emailapi.model.EmplyeeOnbording;
import com.email.emailapi.model.SalarySlip;

@RestController
@RequestMapping(value = "/api/v1")
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class EmailController {

	@Autowired
	private EmailService emailService;

	@RequestMapping("/welcome")
	public String welcome() {
		return "hello this is my email api";
	}

	@RequestMapping(value = "/sendemail", method = RequestMethod.POST)
	public ResponseEntity<?> sendEmail(@RequestBody EmailRequest request) {
		System.out.println(request);
		boolean result = this.emailService.sendEmail(request.getFromEmail(), request.getToEmails(),
				request.getToEmailName(), request.getToSupplierName(), request.getToSupplierID(),
				request.getEmailSentBy(), request.getSubject(), request.getBid_contact_name(),
				request.getTarget_audience(), request.getTabledata(), request.getDescription(),
				request.getSales_basicinfo_firstname(), request.getSales_basicinfo_lastname(),
				request.getBasicinfo_lastname(), request.getSales_basicinfo_email(), request.getBasicinfo_firstname(),
				request.getBasicinfo_lastname(), request.getBasicinfo_phonenumber(), request.getWork_details_position(),
				request.getWork_details_department(), request.getWork_details_division(),
				request.getWork_details_teamname(), request.getWork_details_skypeID(), request.getEmail(),
				request.getType(), request.getSurvey_type(), request.getDevice_compatibility(), request.getPassword(),
				request.getOrder_id());

		return ResponseEntity.ok("mail is sent successfully");

	}

	@RequestMapping(value = "/salaryslip", method = RequestMethod.POST)
	public ResponseEntity<?> salaryslip(@RequestBody SalarySlip request) {
		System.out.println(request);
		boolean result = this.emailService.salaryslip(request.getFromEmail(), request.getToEmails(),
				 request.getPassword(),request.getPayslipMonth(),request.getEmpName(),request.getEmpLastname()
				 ,request.getAdminName(),
				 request.getAdminPosition(),request.getAdminDept(),request.getAdminPhoneno(),
				 request.getAdminTeamname(),
				 request.getAdminEmail(),request.getSalarySlip());

		return ResponseEntity.ok("mail is sent successfully");


	}
	
	@RequestMapping(value = "/emplyeeOnbording", method = RequestMethod.POST)
	public ResponseEntity<?> emplyeeOnbording(@RequestBody EmplyeeOnbording request) {
		System.out.println(request);
		boolean result = this.emailService.emplyeeOnbording(request.getFromEmail(), request.getToEmails(),
				 request.getPassword(),request.getFirstName(),request.getDoj(),
				 request.getTeamName(),request.getDepartment(),
				 request.getLastName(),request.getEmpPassword(),request.getDob(),request.getHrName(),
				 request.getGender(),request.getPhoneNo(),
				 request.getWorkLocation(),request.getPosition(),request.getEmployeeType(),
				 request.getShift(),request.getHrSkype(),request.getHrProfile(),request.getHrEmail());

		return ResponseEntity.ok("mail is sent successfully");


	}
	
	

}
