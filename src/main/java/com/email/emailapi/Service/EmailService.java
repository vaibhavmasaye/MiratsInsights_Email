package com.email.emailapi.Service;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Service;

import com.vdurmont.emoji.Emoji;
import com.vdurmont.emoji.EmojiManager;
import com.vdurmont.emoji.EmojiParser;

@Service
public class EmailService {

	public boolean sendEmail(String fromEmail, String toEmails, String toEmailName, String toSupplierName,
			String toSupplierID, String emailSentBy, String subject, String bid_contact_name, String target_audience,
			String tabledata, String description, String sales_basicinfo_firstname, String sales_basicinfo_lastname,
			String basicinfo_lastname, String sales_basicinfo_email, String basicinfo_firstname,
			String basicinfo_lastname2, String basicinfo_phonenumber, String work_details_position,
			String work_details_department, String work_details_division, String work_details_teamname,
			String work_details_skypeID, String email, String type, String survey_type, String device_compatibility,
			String password, String order_id) {
		boolean f = false;

		String host = "smtp.gmail.com";

		Properties properties = System.getProperties();
		System.out.println("PROPERTIES" + properties);

		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", "465");
		properties.put("mail.smtp.ssl.enable", "true");
		properties.put("mail.smtp.auth", "true");

		String hindi ="नमस्ते दुनिय";
		
		Session session = Session.getInstance(properties, new Authenticator() {

			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromEmail, password);
			}
		});

		session.setDebug(true);

		try {
			// Create a default MimeMessage object.
			Message m = new MimeMessage(session);

			m.setFrom(new InternetAddress(fromEmail));

			m.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmails));

			m.setSubject(subject);
			m.setContent("<!DOCTYPE html>\n" + "<html lang='en'>\n" + "  <head>\n" + "    <meta charset='UTF-8' />\n"
					+ "    <meta http-equiv='X-UA-Compatible' content='IE=edge' />\n"
					+ "    <meta name='viewport' content='width=device-width, initial-scale=1.0' />\n"
					+ "    <title>Email Template</title>\n"
					+ "    <link rel='preconnect' href='https://fonts.gstatic.com' crossorigin>\n"
					+ "    <link href='https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500;700;900&display=swap' rel='stylesheet'>\n"
					+ "\n" + "    <style>\n" + "* {\n" + "  box-sizing: border-box;\n" + "  margin: 0;\n"
					+ "  padding: 0;\n" + "  font-family: 'Poppins', sans-serif;\n" + "}\n" + "\n" + ".logo {\n"
					+ "  width: 200px;\n" + "  object-fit: cover;\n" + "  margin-left: -2em;\n" + "}\n" + "\n"
					+ ".email_template_container {\n" + "  padding: 1em;\n" + "}\n" + "\n" + ".intro_text {\n"
					+ "  font-size: 15px;\n" + "}\n" + "\n" 
					+".send_table:{margin: 1em 0;\n}"+ "\n"
					+".target_audience:{margin: 1em 0; \n}"+
					".intro_text h2 {\n" + "  font-weight: 500;\n"
					+ "  margin-bottom: 1em;\n" + "}\n" + "\n" + ".intro_text p {\n" + "  width: 50%;\n" + "}\n" + "\n"
					+ ".input {\n" + "  width: 50px;\n" + "  border-bottom: 1px solid black;\n"
					+ "  border-top: none;\n" + "  border-left: none;\n" + "  border-right: none;\n"
					+ "  padding-right: 0.5em;\n" + "outline:none;\n" + "}" + ".details{" + "margin-right: 1em;\n" + "}"
					+ ".order_details {\n" + "  margin: 1.5em 0 2em 0;\n" + "  display: flex;\n"
					+ "  justify-content: space-between;\n" + "  align-items: center;\n" + "  flex-wrap: wrap;\n"
					+ "  gap: 1em;\n" + "  width: 70%;\n" + "}\n" + "\n" + ".details h4,\n" + "span {\n"
					+ "  font-size: 15px;\n" + "}\n" + "\n" + ".target_audience {\n" + "  background: #333333;\n"
					+ "  border-radius: 5px;\n" + "  padding: 0.5em 6em;\n" + "  color: white;\n"
					+ "  font-size: 15px;\n" + "}\n" + "\n" + ".restrictions {\n" + "  width: 60%;\n"
					+ "  font-size: 15px;\n" + "  color: #333333;\n" + "  margin: 1em 0;\n" + "  padding: 1em;\n"
					+ "  background: #ffffff;\n" + "  border: 1px solid #000000;\n" + "  border-radius: 5px;\n" + "}\n"
					+ "\n" + ".project_details {\n" + "  display: flex;\n" + "  justify-content: space-between;\n"
					+ "	 gap: 0.4em;\n" + "  align-items: center;\n" + "  text-align: center;\n"
					+ "  font-size: 12px;\n" + "  flex-wrap: wrap;\n" + "  margin-bottom: 1em;\n" + "}\n" + "\n"
					+ ".project_content {\n" + "  margin-right: 0.2em;\n" + "}\n" + ".project_content p {\n"
					+ "  margin: 0.5em 0;\n" + "}\n" + "\n" + ".content_header {\n" + "  background-color: #333333;\n"
					+ "  color: white;\n" + "  padding: 0.5em 2.8em;\n" + "  border-radius: 5px;\n" + "}\n" + "\n"
					+ ".light {\n" + "  border: 1px solid black;\n" + "  padding: 0.3em 1em;\n"
					+ "  border-radius: 5px;\n" + " text-align: center;\n" + "}\n" + "\n" + ".underline {\n"
					+ "  padding-right: 0.2em;\n" + "  text-decoration: underline;\n" + "}\n" + "\n" + 
					".info {\n"
					+ "  font-size: 15px; margin:1em 0;\n" + "}\n" + "\n" + ".information_container {\n" + "  width: 100%;\n"
					+ "  font-size: 15px;\n" + "  color: #333333;\n" + "  margin: 0.8em 0 1.5em 0;\n"
					+ "  padding: 2em 1em;\n" + "  background: #ffffff;\n" + "  border: 1px solid #000000;\n"
					+ "  border-radius: 5px;\n" + "}\n" + "\n" +
					".quote_container {\n" + "  font-size: 15px;"+" margin-top: 1em;\n" + "}\n"
					+ "\n" + ".quote_container p {\n" + "  width: 90%;\n" + "}\n" + "\n" + ".quote_container a {\n"
					+ "  color: #1d53a4;\n" + "  padding: 0 0.2em;\n" + "  text-decoration: none;\n" + "}\n" + "\n"
					+ ".quote_container .quote-child {\n" + "  margin: 1em 0 2em 0;\n" + "}\n" + "\n" + ".footer {\n"
					+ "  font-size: 15px;\n" + "}\n" + "\n" + ".footer_details {\n" + "  margin: 1em 0;\n" + "}\n"
					+ "\n" + ".footer_details a {\n" + "  color: black;\n" + "  text-decoration: none;\n" + "}\n" + "\n"
					+ ".text_underline {\n" + "  text-decoration: underline;\n" + "}\n" + "\n"
					+ "@media (max-width: 600px) {\n" + "  .project_details {\n" + "    display: grid;\n"
					+ "    grid-template-columns: repeat(2, 1fr);\n" + "    gap: 2em;\n" + "  }\n" + "\n"
					+ "  .restrictions {\n" + "    width: 100%;\n" + "  }\n" + "  .order_details {\n"
					+ "    width: 100%;\n" + "  }\n" + "}\n" + "\n"
					+ ".project_table {\n" + "  overflow-x: auto;\n"
							+ "margin:2em 0;\n"
					+ "}\n" + "\n" + ".project_table table{\n" + "  width: 100%;\n" + "  font-size: 12px;\n"
					+ "  border-spacing: 5px;\n" + "}"
					+ "table {font-family: Arial, Helvetica, sans-serif; border-collapse: collapse;	  width: 100%;	}"

					+ "table td,table th {border: 1px solid #ddd;padding: 8px;}"

					+ "table tr:nth-child(even){background-color: #f2f2f2;}"

					+ "table tr:hover {background-color: #ddd;}"

					+ "table th {padding-top: 12px; padding-bottom: 12px;text-align: left;background-color: #333333;color: white;}"
					+ "    </style>\n" + "  </head>\n" 
					+ "  <body>\n" + "    <div class='email_template_container'>\n"
					+ "      <div class='intro_text'>\n" + "        <h3>Hi " + bid_contact_name + ",</h3>\n"
					+ "        <p>\n"
					+ "          We've a new project for you! Please provide pricing, feasibility and\n"
					+ "          field time for the following study.<p>\n"+"<br>\n"
					+ "          <p class='t'>Please send the below table with\n" + "            blank space filled in.</p>\n"
					 + "      </div>\n" + "      <!-- order details -->\n"
					+ "      <div class='order_details'>\n" + "        <div class='details'>\n"
					+ "          <h4 class='details_header'>Order ID</h4>\n" + "          <span># " + order_id
					+ "</span>\n" + "        </div>\n" + "        <div class='details'>\n"
					+ "            <h4 class='details_header'>Sales Manager</h4>\n" + "            <span>"
					+ sales_basicinfo_firstname + " " + sales_basicinfo_lastname + "</span>\n" + "          </div>\n"
					+ "          <div class='details'>\n" + "            <h4 class='details_header'>Study Type</h4>\n"
					+ "            <span>" + type + "</span>\n" + "          </div>\n"
					+ "          <div class='details'>\n" + "            <h4 class='details_header'>Survey Type</h4>\n"
					+ "            <span>" + survey_type + "</span>\n" + "          </div>\n"
					+ "          <div class='details'>\n"
					+ "            <h4 class='details_header'>Device Allowed</h4>\n" + "            <p>"
					+ device_compatibility + "</p>\n"
					+ "            <!-- <span>desktop,</span><span>tablet,</span><span>laptop,</span><span>mobile</span> -->\n"
					+ "          </div>\n" + "      </div>\n" + "      <!-- target audience -->\n"
					+ "      <span class='target_audience'>Target Audience  </span>\n"
					+"<br>\n"+ "      <div class='restrictions'>\n" + "       " + target_audience + "\n"
					+ "        <p><sup>*</sup> Age = 18+</p>\n"
					+ "        <p><sup>*</sup> Respondents must have “exposure” to “video production/editing” in their primary occupation.</p>\n"
					+ "        <p><sup>*</sup> Respondents must indicate primary area of employment is “Marketing/Advertising” or “Music/Video Production”.</p>\n"
					+ "      </div>\n" + "\n" + "      <!-- project details -->\n"
					+ "      <div class=\"project_table\">\n" + tabledata
					
					+ "    </div><!-- information regarding project -->\n" + description+hindi

					+ "      <!-- quote container -->\n" + "      <div class='quote_container'>\n"

					+ "        <p>Please share your best quote. You can provide your quote directly by replying to this email.Please Note - Always loop in<a href='mailto:vendors@miratsinsights.com'>vendors@miratsinsights.com</a></p>\n"
					+ "        <p class='quote-child'>This sales order is managed by " + sales_basicinfo_firstname
					+ "\b" + sales_basicinfo_lastname + "<a href='mailto:" + sales_basicinfo_email + "'>("
					+ sales_basicinfo_email
					+ ")</a>if you have any questions you can directly reach out to the sales manager, or signup on our new <a href='https://supplier.miratsinsights.com/questions/get-started'>Mirats Supplier Portal (built for you only, with more power and more control)</a>to get quick response from our sales team and manage bids, accounts, invoices with us efficiently.</p>\n"
					+ "      </div>\n" + "\n" + " "

					+ "   <!-- footer -->\n" + "      <footer class='footer'>\n"
					+ "        <span class='regards'>Best Regards,</span>\n" + "        <div class='footer_details'>\n"
					+ "            <h3>" + basicinfo_firstname + " " + basicinfo_lastname + "</h3>\n"
					+ "            <p>" + work_details_position + "</p>\n" + "            <p><em>"
					+ work_details_department + "," + work_details_division + "</em></p>\n"
					+ "            <p><span class='text_underline'>" + work_details_teamname + "</span></p>\n"
					+ "        </div>\n" + "        <div class='footer_details'>\n"
					+ "            <p>Skype ID: <a href='" + work_details_skypeID + "'>" + work_details_skypeID
					+ "</a></p>\n" + "            <p>Mobile: " + basicinfo_phonenumber + "</p>\n"
					+ "            <p><a href='mailto:" + email + "'>" + email
					+ "            <p>Website: <a href='http://www.miratsinsights.com/'>http://www.miratsinsights.com/</a></p>\n"
					+ "        </div>\n" + "        <div class='footer_details'>\n"
					+ "            <p>TM and © 2021 Mirats Insights, LLC. All rights reserved.</p>\n"
					+ "        </div>\n" + "        <div class='footer_details'>\n"
					+ "            <h3>Mirats Insights Private Limited</h3>\n"
					+ "            <p>Office No 7022, 1Aerocity NIBR Corporate Park</p>\n"
					+ "            <p>Nr Sakinaka Junction, Safed Pul, Mumbai,</p>\n"
					+ "            <p>Maharashtra 400 072 India</p>\n" + "        </div>\n"
					+ "        <div class='footer_details'>\n" + "           <p>CIN: U72900UP2021PTC153917.</p>\n"
					+ "           <p>GSTIN: 27AAPCM0779A1ZD.</p>\n" + "        </div>\n"
					+ "        <div class='footer_details'>\n"
					+ "            <p>All Rights Reserved | <a href='link'>Privacy Policy</a></p>\n"
					+ "        </div>\n" + "      </footer>\n" + "    </div>\n" + "  </body>\n" + "</html>\n",
					"text/html");

			// Send message
			Transport.send(m);

			System.out.println("Sent message successfully....");

		} catch (MessagingException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return f;

	}
	
	
//	Salary slip email
	
	public boolean salaryslip(String fromEmail, String toEmails, String password, String payslipMonth,
	 String empName,
	 String empLastname,
	 String adminName,
	 String adminPosition,
	 String adminDept,
	 String adminPhoneno,
	 String adminTeamname,
	 String adminEmail,
	 String salarySlip) {
		boolean f = false;
		
		
		

		
		 
		
		
		String host = "smtp.gmail.com";
		 
		Properties properties = System.getProperties();
		
		System.out.println("PROPERTIES" + properties);
		
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", "465");
		properties.put("mail.smtp.ssl.enable", "true");
		properties.put("mail.smtp.auth", "true");

		Session session = Session.getInstance(properties, new Authenticator() {

			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromEmail, password);
			}
		});

		session.setDebug(true);

		try {
			// Create a default MimeMessage object.
			Message m = new MimeMessage(session);

			m.setFrom(new InternetAddress(fromEmail));
			m.setRecipients(Message.RecipientType.CC, InternetAddress.parse("Accounts <accounts@miratsinsights.com>"));
			
			m.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmails));
			
			m.setSubject("Employee Pay slip for the month of \t"+payslipMonth);
			
			m.setContent("<!DOCTYPE html>\n"
					+ "<html lang='en'>\n"
					+ "\n"
					+ "<head>\n"
					+ "  <meta charset='UTF-8'/>\n"
					+"<meta charset='ISO-8859-1'/>"
					+ "  <meta http-equiv='X-UA-Compatible' content='IE=edge'/>\n"
					+ "  <meta name='viewport' content='width=device-width, initial-scale=1.0' />\n"
					+ "  <title>Email Template</title>\n"
					+ "  <link rel='stylesheet' href='index.css' />\n"
					+ "  <link rel='preconnect' href='https://fonts.googleapis.com' />\n"
					+ "  <link rel='preconnect' href='https://fonts.gstatic.com' crossorigin />\n"
					+ "  <link href='https://fonts.googleapis.com/css2?family=Baloo+Bhai+2&family=Inter&display=swap' rel='stylesheet' />\n"
					+ "<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n"
					+ "<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n"
					+ "<link href=\"https://fonts.googleapis.com/css2?family=Poppins&display=swap\" rel=\"stylesheet\">\n"
					+ "</head>\n"
					+ "<style>\n"
					+ "  * {\n"
					+ "    margin: 0;\n"
					+ "    padding: 0;\n"
					+ "    box-sizing: border-box;\n"
					+ "    font-family: 'Baloo Bhai 2';\n"
					+ "    font-family: 'Inter', sans-serif;\n"
					+ "  }\n"
					+ "\n"
					+ "  .container {\n"
					+ "    width: 100%;\n"
					+ "    /* border: 1px solid red; */\n"
					+ "    display: flex;\n"
					+ "    flex-direction: column;\n"
					+ "    gap: 10px;\n"
					+ "  }\n"
					+ "\n"
					+ "  .greeting_msg {\n"
					+ "    width: 57%;\n"
					+ "    /* border: 1px solid red; */\n"
					+ "    padding: 5px;\n"
					+ "  }\n"
					+ "\n"
					+ "  .greet {\n"
					+ "    font-size: 16px;\n"
					+ "    font-weight: 600;\n"
					+ "    color: black !important;\n"
					+ "  }\n"
					+ "\n"
					+"a:link, a:visited {\n"
					+ "  background-color: #f44336;\n"
					+ "  color: white;\n"
					+ "  padding: 14px 25px;\n"
					+ "  text-align: center;\n"
					+ "  text-decoration: none;\n"
					+ "  display: inline-block;\n"
					+ "}\n"
					+ "\n"
					+ "a:hover, a:active {\n"
					+ "  background-color: red;\n"
					+ "}"
					+ "  .salute {\n"
					+ "    font-size: 15px;\n"
					+ "    font-weight: 300;\n"
					+ "    /* color: rgb(34, 34, 34); */\n"
					+ "  }\n"
					+ "\n"
					+ "  .name_and_address {\n"
					+ "    display: flex;\n"
					+ "    flex-direction: column;\n"
					+ "    gap: 5px;\n"
					+ "    padding: 5px 20px;\n"
					+ "  }\n"
					+ "\n"
					+ "  .address {\n"
					+ "    color: rgb(37, 92, 154);\n"
					+ "    font-size: 14px;\n"
					+ "  }\n"
					+ "\n"
					+ "  .hr_name {\n"
					+ "    font-size: 15px;\n"
					+ "  }\n"
					+ "\n"
					+ "  .img_container {\n"
					+ "    width: 100%;\n"
					+ "    /* border: 1px solid green; */\n"
					+ "    padding: 0px 20px;\n"
					+ "  }\n"
					+ "\n"
					+ "  .img_container>a>img {\n"
					+ "    height: 40px;\n"
					+ "    width: 200px;\n"
					+ "    object-fit: contain;\n"
					+ "  }\n"
					+ "\n"
					+ "  .video {\n"
					+ "    height: 300px;\n"
					+ "    width: 400px;\n"
					+ "    object-fit: contain;\n"
					+ "    /* border: 1px solid red; */\n"
					+ "  }\n"
					+ "\n"
					+ "  .bottom_container {\n"
					+ "    width: 90%;\n"
					+ "    padding: 10px 20px;\n"
					+ "    display: flex;\n"
					+ "    flex-direction: column;\n"
					+ "    gap: 15px;\n"
					+ "    /* border: 1px solid blue; */\n"
					+ "  }\n"
					+ "\n"
					+ "  .italic_para {\n"
					+ "    font-style: italic;\n"
					+ "    color: rgb(94, 93, 93);\n"
					+ "    font-size: 13px;\n"
					+ "  }\n"
					+ "\n"
					+ "  .pdf_links {\n"
					+ "    font-size: 13px;\n"
					+ "    color: rgb(80, 77, 77);\n"
					+ "  }\n"
					+ "\n"
					+ "  .download_books {\n"
					+ "    font-size: 15px;\n"
					+ "  }\n"
					+ "\n"
					+ "  .hr_line {\n"
					+ "    width: 100%;\n"
					+ "    border: 0.05 solid gray;\n"
					+ "  }\n"
					+ "\n"
					+ "  .links_container {\n"
					+ "    color: gray;\n"
					+ "    font-size: 13px;\n"
					+ "    line-height: 1.6;\n"
					+ "  }\n"
					+ "\n"
					+ "  .links {\n"
					+ "    color: rgb(6, 100, 172);\n"
					+ "  }\n"
					+ "\n"
					+ "  .button {\n"
					+ "    padding: 10px 10px;\n"
					+ "    outline: none;\n"
					+ "    border: none;\n"
					+ "    border-radius: 5px;\n"
					+ "    background-color: #1756dc;\n"
					+ "    color: #fff;\n"
					+ "    cursor: pointer;\n"
					+"text-decoration: none;\n"
					+ "  }\n"
					+ "</style>\n"
					+ "\n"
					+ "<body>\n"
					+ "  <div class='container'>\n"
					+ "    <div class='greeting_msg'>\n"
					+ "      <h3 class='greet'>Hello "+empLastname+"  ji,</h3>\n"
					+ "      <h3 class='greet'>Greetings of the day,</h3>\n"
					+ "    </div>"
					+ "\n"
					+ "    <div class='greeting_msg'>\n"
					+ "      <p class='salute'>\n"
					+ "        We are thankful for your services and are committed to your growth, success and well being in the company. We\n"
					+ "        have generated your payslip for the month of "+payslipMonth+". Please click the button below to access and\n"
					+ "        download\n"
					+ "        your payslip.\n"
					+ "      </p>\n"
					+ "    </div>"
					+ "\n"
					+ "    <div class='greeting_msg'>\n"
					+"      <a class='button' href='"+salarySlip+"' style='background-color: #333; color:#fff; text-decoration:none; padding: 8px 16px; border-radius: 4px' target='_blank'>View Salary Slip </a>\n"
					+ "    </div>"
					+"<div class=\"greeting_msg\">\n"
					+ "      <p class=\"salute\">\n"
					+ "        If you want to make any changes in your profile and account please visit our People's Console. If you want to\n"
					+ "        download the payslips of previous months, you can download it from the \"Salary\" tab of People's Console.\n"
					+ "      </p>\n"
					+ "    </div>"
					+"<div class='greeting_msg'>\n"
					+ "      <a class='button' href='https://peoples.miratsinsights.com/userdetails/personal-information' style='background-color: #FF3636; color:#fff; text-decoration:none; padding: 8px 16px; border-radius: 4px' target='_blank'>View Profile</a>\n"
					+ "      <a class='button' href='https://peoples.miratsinsights.com/salary' style='background-color: #FF3636; color:#fff; text-decoration:none; padding: 8px 16px; border-radius: 4px' target='_blank'>View All Salaries</a>\n"  
					+ "    </div>"
					+"<div class=\"greeting_msg\">\n"
					+ "      <p class=\"salute\">\n"
					+ "        If you have any query or questions, please do not hesitate to contact me. If you have any questions regarding\n"
					+ "        Payments & Salary, please feel free to email us at <a href=\"payment_issues@miratsinsights.com\"\n"
					+ "          target=\"_blank\">payment_issues@miratsinsights.com</a>\n"
					+ "      </p>\n"
					+ "    </div>"
					
					
					+ "    <div class='greeting_msg'>\n"
					+ "      --\n"
					+ "      <h4 class='salute'>Best Regards,</h4>\n"
					+ "    </div>\n"
					+ "\n"
					+ "    <div class='name_and_address'>\n"
					+ "      <p class='hr_name'>"+adminName+" | "+adminPosition+", "+adminDept+"</p>\n"
					+ "      <p class='address'>Mirats Insights</p>\n"
					+ "      <p class='address'>M. +91 "+adminPhoneno+" | "+adminTeamname+"</p>\n"
					+ "      <p class='address'>\n"
					+ "        <a href='mailto:"+fromEmail+"' target='_blank' class='links'>\n"
					+ "          E."+fromEmail+"</a>\n"
					+ "        |\n"
					+ "        <a href='https://www.miratsinsights.com/' target='_blank' class='links'>www.MiratsInsights.com</a>\n"
					+ "      </p>\n"
					+ "    </div>\n"
					+ "\n"
					+ "    <div class='img_container'>\n"
					+ "      <a href='https://www.miratsinsights.com/' target='_blank' class='links'><img src='https://esomar.mirats.in/unnamed.png' alt='' style='width:200px' /></a>\n"
					+ "    </div>\n"
					+ "\n"
					+ "    <div class='greeting_msg'>\n"
					+ "      <p class='address'>\n"
					+ "        Mirats Insights is a Macer India Research & Technology Services\n"
					+ "        Private Limited subsidiary.\n"
					+ "      </p>\n"
					+ "    </div>\n"
					+ "    <div class='greeting_msg'>\n"
					+ "      <p class='address'>\n"
					+ "        <a href='https://twitter.com/MiratsInsights' target='_blank' class='links'>\n"
					+ "          TWITTER</a>\n"
					+ "        |\n"
					+ "        <a href='https://www.linkedin.com/company/miratsinsights/mycompany/' target='_blank' class='links'>LINKEDIN</a>\n"
					+ "        |\n"
					+ "        <a href='https://directory.esomar.org/country/82-india/r7358_Mirats-Insights-Private-Limited.php'\n"
					+ "          target='_blank' class='links'>ESOMAR CORPORATE MEMBER</a>\n"
					+ "        |\n"
					+ "        <a href='https://www.greenbook.org/company/Mirats-Insights' target='_blank' class='links'>GREENBOOK LISTING</a>\n"
					+ "      </p>\n"
					+ "    </div>\n"
					+ "    <div class='greeting_msg'>\n"
					+ "      <p class='address'>\n"
					+ "        Offices Address. 7022, 1Aerocity NIBR Corporate Park Nr, Sakinaka\n"
					+ "        Junction, Mumbai, Maharashtra 400 072 India CIN. U72900UP2021PTC153917\n"
					+ "        | GSTIN. 27AAPCM0779A1ZD\n"
					+ "      </p>\n"
					+ "    </div>\n"
					+ "\n"
					+ "    <div class='greeting_msg'>\n"
					+ "<img src='https://esomar.mirats.in/email_footer.png' style='width: 700px;'/>"
					+ "    </div>\n"
					+ "\n"
					+ "    <div class='greeting_msg'>\n"
					+ "      <a href='https://directory.esomar.org/country/82-india/r7358_Mirats-Insights-Private-Limited.php' target='_blank'\n"
					+ "        class='links'><img src='https://esomar.mirats.in/esomar_promo_email.gif' style='width:500px'></a>\n"
					+ "    </div>\n"
					+ "\n"
					+ "    <div class='bottom_container'>\n"
					+ "      <hr class='hr_line' />\n"
					+ "      <span class='gray_line'>\n"
					+ "        <b class='download_books'> DOWNLOAD OUR AUDIENCE BOOKS</b> :\n"
					+ "\n"
					+ "        <a href='https://resources.mirats.in/GLOBAL_PANELBOOK_MIRATS.pdf' target='_blank' class='pdf_links'>Consumer\n"
					+ "          Audience Book</a>\n"
					+ "        | <a href='https://resources.mirats.in/GLOBAL_-_B2B_Panel_Profiling.pdf' target='_blank' class='pdf_links'> B2B\n"
					+ "          Audience Book</a> |\n"
					+ "        <a href='https://resources.mirats.in/GLOBAL_-_HEALTHCARE_Panel_Profiling.pdf' target='_blank'\n"
					+ "          class='pdf_links'>Healthcare Audience Book</a>\n"
					+ "        </b>\n"
					+ "      </span>\n"
					+ "\n"
					+ "      <p class='italic_para'>\n"
					+ "        This e-mail message is intended to be conveyed only to the designated\n"
					+ "        recipient(s). If you are NOT the intended recipient(s) of this e-mail,\n"
					+ "        please notify the sender immediately and delete the original message\n"
					+ "        from your system.\n"
					+ "      </p>\n"
					+ "\n"
					+ "      --\n"
					+ "\n"
					+ "      <p class='links_container'>\n"
					+ "        You received this message because you are subscribed to the Google\n"
					+ "        Groups 'Employees' group. To unsubscribe from this group and stop\n"
					+ "        receiving emails from it, send an email to\n"
					+ "        <a href='mailto:employees+unsubscribe@miratsinsights.com'\n"
					+ "          class='links'>employees+unsubscribe@miratsinsights.com.</a>\n"
					+ "        To view this discussion on the web, visit\n"
					+ "        <a href='https://groups.google.com/a/miratsinsights.com/g/employees/c/CAFpGrvVcbNQi+ZpwEkgeDGbwOJ5XFEDR3DbFJc2jik4Dz5Q+EA@mail.gmail.com?utm_medium=email&utm_source=footer&pli=1'\n"
					+ "          class='links'\n"
					+ "          target='_blank'>https://groups.google.com/a/miratsinsights.com/d/msgid/employees/CAFpGrvVcbNQi%2BZpwEkgeDGbwOJ5XFEDR3DbFJc2jik4Dz5Q%2BEA%40mail.gmail.com.</a>\n"
					+ "      </p>\n"
					+ "    </div>\n"
					+ "  </div>\n"
					+ "</body>\n"
					+ "\n"
					+ "</html>"
					,"text/html");

			// Send message
			Transport.send(m);
			
			System.out.println("Sent message successfully....");

		} catch (MessagingException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return f;

	}
	
	public boolean emplyeeOnbording(String fromEmail, String toEmails, String password, String firstName, String doj,
			String teamName, String department, String lastName, String empPassword, String dob, String hrName,
			String gender, String phoneNo, String workLocation, String position, String employeeType, String shift,
			String hrSkype, String hrProfile, String hrEmail) {
				boolean f = false;
				
				
				
				String host = "smtp.gmail.com";
				 
				Properties properties = System.getProperties();
				
				System.out.println("PROPERTIES" + properties);
				
				properties.put("mail.smtp.host", host);
				properties.put("mail.smtp.port", "465");
				properties.put("mail.smtp.ssl.enable", "true");
				properties.put("mail.smtp.auth", "true");

				Session session = Session.getInstance(properties, new Authenticator() {

					@Override
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(fromEmail, password);
					}
				});

				session.setDebug(true);

				try {
					// Create a default MimeMessage object.
					Message m = new MimeMessage(session);
					
					m.setFrom(new InternetAddress(fromEmail));
//					m.setRecipients(Message.RecipientType.CC, InternetAddress.parse("Accounts <accounts@miratsinsights.com>"));
					
					m.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmails));
					
					m.setSubject("Welcome To Mirats Insights");
					
					m.setContent("<!DOCTYPE html>\n"
							+ "<html lang='en'>\n"
							+ "\n"
							+ "<head>\n"
							+ "    <meta charset='UTF-8' />\n"
							+ "    <meta http-equiv='X-UA-Compatible' content='IE=edge' />\n"
							+ "    <meta name='viewport' content='width=device-width, initial-scale=1.0' />\n"
							+ "    <title>Welcome Email Template</title>\n"
							+ "    <!-- <link rel='stylesheet' href='./style.css' /> -->\n"
							+ "    <style>\n"
							+ "        @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@100;200;300;400;500;600;700;800&display=swap');\n"
							+ "\n"
							+ "        * {\n"
							+ "            box-sizing: border-box;\n"
							+ "            margin: 0;\n"
							+ "            padding: 0;\n"
							+ "            font-family: 'Poppins', sans-serif;\n"
							+ "        }\n"
							+ "\n"
							+ "        .container {\n"
							+ "            margin: 2em 0;\n"
							+ "        }\n"
							+ "\n"
							+ "        .img_container {\n"
							+ "            text-align-last: center;\n"
							+ "        }\n"
							+ "\n"
							+ "        .img_container img {\n"
							+ "            width: 150px;\n"
							+ "            height: 150px;\n"
							+ "            object-fit: cover;\n"
							+ "        }\n"
							+ "\n"
							+ "        .welcome_credentials {\n"
							+ "            /* border: 1px solid red; */\n"
							+ "            text-align: center;\n"
							+ "        }\n"
							+ "\n"
							+ "        .text_color_orange {\n"
							+ "            color: #e67e23;\n"
							+ "            font-size: 21px;\n"
							+ "            font-weight: 600;\n"
							+ "        }\n"
							+ "\n"
							+ "        .welcome_text {\n"
							+ "            margin: 0.2em 0;\n"
							+ "            font-size: 35px;\n"
							+ "            font-weight: 600;\n"
							+ "        }\n"
							+ "\n"
							+ "        .welcome_desc {\n"
							+ "            width: 60%;\n"
							+ "            margin: 0 auto;\n"
							+ "            padding-bottom: 0.7em;\n"
							+ "            color: #444;\n"
							+ "        }\n"
							+ "\n"
							+ "        .site_link {\n"
							+ "            color: #0066cc;\n"
							+ "            text-decoration: none;\n"
							+ "            font-weight: 500;\n"
							+ "        }\n"
							+ "\n"
							+ "        .login_credentials {\n"
							+ "            margin: 1em 0;\n"
							+ "        }\n"
							+ "\n"
							+ "        .login_credentials p {\n"
							+ "            color: #444;\n"
							+ "        }\n"
							+ "\n"
							+ "        .login_credentials strong {\n"
							+ "            font-size: 18px;\n"
							+ "        }\n"
							+ "\n"
							+ "        .login_credentials a {\n"
							+ "            color: #0066cc;\n"
							+ "            text-decoration: none;\n"
							+ "            font-weight: 500;\n"
							+ "        }\n"
							+ "\n"
							+ "        .login_credentials .bold {\n"
							+ "            font-weight: 600;\n"
							+ "            font-size: 20px;\n"
							+ "        }\n"
							+ "\n"
							+ "        .employee_details {\n"
							+ "            background-color: #f5f5f7;\n"
							+ "            text-align: center;\n"
							+ "            margin: 3em 0;\n"
							+ "            padding: 3em;\n"
							+ "            color: #1d1d1f;\n"
							+ "        }\n"
							+ "\n"
							+ "        .employee_details h3 {\n"
							+ "            color: #444;\n"
							+ "            font-size: 24px;\n"
							+ "            font-weight: 600;\n"
							+ "        }\n"
							+ "\n"
							+ "        .employee_details p {\n"
							+ "            line-height: 1.7;\n"
							+ "        }\n"
							+ "\n"
							+ "        .emp_name {\n"
							+ "            color: #2dc26b;\n"
							+ "        }\n"
							+ "\n"
							+ "        .birthday_desc {\n"
							+ "            margin: 0.5em auto 1em auto;\n"
							+ "            font-size: 17px;\n"
							+ "            width: 50%;\n"
							+ "        }\n"
							+ "\n"
							+ "        .birthday_desc a {\n"
							+ "            color: #000;\n"
							+ "        }\n"
							+ "\n"
							+ "        .emp_desc section {\n"
							+ "            margin: 1em 0;\n"
							+ "        }\n"
							+ "\n"
							+ "        .text_color_green {\n"
							+ "            color: #169179;\n"
							+ "        }\n"
							+ "\n"
							+ "        .company_benefits {\n"
							+ "            /* border: 1px solid red; */\n"
							+ "            padding: 1em;\n"
							+ "        }\n"
							+ "\n"
							+ "        .company_benefits h1 {\n"
							+ "            text-align: center;\n"
							+ "            line-height: 1.2;\n"
							+ "            color: #444;\n"
							+ "            font-weight: 600;\n"
							+ "        }\n"
							+ "\n"
							+ "        .benefits section img {\n"
							+ "            width: 50px;\n"
							+ "            height: 50px;\n"
							+ "            object-fit: cover;\n"
							+ "            margin-bottom: 0.5em;\n"
							+ "        }\n"
							+ "\n"
							+ "        .benefits section p {\n"
							+ "            color: #444;\n"
							+ "            font-weight: 600;\n"
							+ "        }\n"
							+ "\n"
							+ "        .learn_more {\n"
							+ "            text-align: center;\n"
							+ "        }\n"
							+ "\n"
							+ "        .learn_more a {\n"
							+ "            text-decoration: none;\n"
							+ "            color: #0066cc;\n"
							+ "            font-weight: 500;\n"
							+ "            font-size: 18px;\n"
							+ "        }\n"
							+ "\n"
							+ "        .hr_details_container {\n"
							+ "            display: flex;\n"
							+ "            justify-content: space-between;\n"
							+ "            align-items: center;\n"
							+ "            gap: 2em;\n"
							+ "            background-color: #f5f5f7;\n"
							+ "            margin: 3em 0;\n"
							+ "            padding: 2em 10em;\n"
							+ "        }\n"
							+ "\n"
							+ "        .hr_img {\n"
							+ "            width: 160px;\n"
							+ "            border-radius: 20px;\n"
							+ "            object-fit: cover;\n"
							+ "        }\n"
							+ "\n"
							+ "        .hr_details {\n"
							+ "            /* margin-left: 8em; */\n"
							+ "            text-align: center;\n"
							+ "        }\n"
							+ "\n"
							+ "        .hr_details h2 {\n"
							+ "            color: #444;\n"
							+ "            line-height: 1.2;\n"
							+ "            font-size: 28px;\n"
							+ "            font-weight: 600;\n"
							+ "        }\n"
							+ "\n"
							+ "        .hr_desc {\n"
							+ "            color: #444;\n"
							+ "            margin: 1em auto;\n"
							+ "            width: 70%;\n"
							+ "            font-size: 17px;\n"
							+ "        }\n"
							+ "\n"
							+ "        .hr_details a {\n"
							+ "            color: #0066cc;\n"
							+ "            text-decoration: none;\n"
							+ "        }\n"
							+ "\n"
							+ "        .skype_id {\n"
							+ "            font-size: 18px;\n"
							+ "            color: #444;\n"
							+ "        }\n"
							+ "\n"
							+ "        .footer {\n"
							+ "            background-color: #f5f5f7;\n"
							+ "            padding: 1.5em;\n"
							+ "            text-align: center;\n"
							+ "        }\n"
							+ "\n"
							+ "        .links {\n"
							+ "            border-bottom: 1px solid #d2d2d7;\n"
							+ "            padding-bottom: 0.8em;\n"
							+ "        }\n"
							+ "\n"
							+ "        .links a {\n"
							+ "            color: #424245;\n"
							+ "            text-decoration: none;\n"
							+ "            padding: 0 1em;\n"
							+ "        }\n"
							+ "\n"
							+ "        .links a:last-child {\n"
							+ "            color: #1155cc;\n"
							+ "            text-decoration: underline;\n"
							+ "        }\n"
							+ "\n"
							+ "        .links span {\n"
							+ "            color: #d2d2d7;\n"
							+ "        }\n"
							+ "\n"
							+ "        footer section {\n"
							+ "            margin: 0.8em 0;\n"
							+ "            font-size: 15px;\n"
							+ "            color: #6e6e73;\n"
							+ "        }\n"
							+ "\n"
							+ "        footer section a {\n"
							+ "            color: #6e6e73;\n"
							+ "            text-decoration: none;\n"
							+ "        }\n"
							+ "\n"
							+ "        .footer p {\n"
							+ "            color: #6e6e73;\n"
							+ "            font-size: 15px;\n"
							+ "        }\n"
							+ "\n"
							+ "        .border {\n"
							+ "            color: #d2d2d7;\n"
							+ "            padding: 0 0.5em;\n"
							+ "        }\n"
							+ "\n"
							+ "        @media (max-width: 600px) {\n"
							+ "            .hr_details_container {\n"
							+ "                display: block;\n"
							+ "                padding: 1em;\n"
							+ "                text-align: center;\n"
							+ "            }\n"
							+ "\n"
							+ "            .benefits {\n"
							+ "                display: flex;\n"
							+ "                gap: 1em;\n"
							+ "                text-align: center;\n"
							+ "                margin: 2.5em 0;\n"
							+ "\n"
							+ "                display: block;\n"
							+ "            }\n"
							+ "\n"
							+ "            .benefits section {\n"
							+ "                margin-bottom: 1em;\n"
							+ "                border-bottom: 1px solid #d2d2d7;\n"
							+ "                padding-bottom: 1em;\n"
							+ "            }\n"
							+ "\n"
							+ "            .benefits section:last-child {\n"
							+ "                border-bottom: none;\n"
							+ "                padding-bottom: 0;\n"
							+ "            }\n"
							+ "\n"
							+ "            .birthday_desc {\n"
							+ "                width: 100%;\n"
							+ "            }\n"
							+ "        }\n"
							+ "    </style>\n"
							+ "</head>\n"
							+ "\n"
							+ "<body>\n"
							+ "    <div class='container'>\n"
							+ "        <section class='img_container'>\n"
							+ "            <img src='https://esomar.mirats.in/logo.png' alt='logo' />\n"
							+ "        </section>\n"
							+ "        <section class='welcome_credentials'>\n"
							+ "            <h3 class='text_color_orange'>Namaste "+firstName+"!🙏🏻 </h3>\n"
							+ "            <h3 class='text_color_orange'>Welcome to Mirats Insights,</h3>\n"
							+ "            <h1 class='welcome_text'>We are all really excited to welcome you to our team! ❤️</h1>\n"
							+ "            <p class='welcome_desc'>\n"
							+ "                As agreed, your start date is "+doj+". We expect you to bring your\n"
							+ "                experience and skills to our "+teamName+", "+department+", "+lastName+" ji.\n"
							+ "            </p>\n"
							+ "            <a class='site_link' href='https://peoples.miratsinsights.com/'>You can go ahead and log in from here with\n"
							+ "                the credentials given\n"
							+ "                below.</a>\n"
							+ "            <section class='login_credentials'>\n"
							+ "                <p class='bold'>Login Credentials</p>\n"
							+ "                <p>\n"
							+ "                    Username:\n"
							+ "                    <a href='mailto:"+toEmails+"'>"+toEmails+"</a>\n"
							+ "                <p>Password: "+empPassword+"</p>\n"
							+ "                </p>\n"
							+ "            </section>\n"
							+ "        </section>\n"
							+ "\n"
							+ "        <div class='employee_details'>\n"
							+ "            <h3><span class='emp_name'>"+firstName+"</span>, you're an asset to our company.\n"
							+ "            </h3>\n"
							+ "            <p class='birthday_desc'>We also remember your date of birth i.e. "+dob+" so that we can plan something\n"
							+ "                for you. There are a few more details that we have you can go through it and tell our Viking\n"
							+ "                (hammer-wielding god) - <a href='mailto:"+fromEmail+"'>"+hrName+"</a> to fix it as soon as\n"
							+ "                possible. 😁🧛‍♂️</p>\n"
							+ "\n"
							+ "            <section class='emp_desc'>\n"
							+ "                <p>Your name is "+firstName+" "+lastName+", and</p>\n"
							+ "                <p>your gender is "+gender+"</p>\n"
							+ "                <p>and your contact number is stored "+phoneNo+"</p>\n"
							+ "                <p>in our records</p>\n"
							+ "                <small>(don't worry we won't call you unnecessary)</small>\n"
							+ "                <p>You will work in your working location i.e. "+workLocation+"</p>\n"
							+ "                <p>Your title will be <s>Sorcerer Supreme, Doctor Stephen Strange</s></p>\n"
							+ "                <span class='text_color_green'>"+position+"| "+teamName+","+department+"</span>\n"
							+ "                <p>Most Important you're "+employeeType+" in our company,</p>\n"
							+ "                <p>and your shift will be "+shift+"</p>\n"
							+ "                <section>\n"
							+ "                    <p>Does everything look fine? Then please don't disturb</p>\n"
							+ "                    <p>our Viking. just joking,</p>\n"
							+ "                    <p>you can give him trouble anytime you're free to do so.</p>\n"
							+ "                </section>\n"
							+ "            </section>\n"
							+ "        </div>\n"
							+ "\n"
							+ "        <div class='company_benefits'>\n"
							+ "            <h1>Our Company's Peoples </h1>\n"
							+ "            <h1>Department Speciality.</h1>\n"
							+ "\n"
							+ "            <div class='benefits' style='display:flex; text-align:center; justify-content: space-between; align-items: center;'>\n"
							+ "                <section>\n"
							+ "                    <img src='https://ci6.googleusercontent.com/proxy/xAYqVkHs-35p6QEC5Qw20GQ_YYaxTmz5QKWcW-Sb5FMtkqdDKQV5JqVcrV5YO83tgYvlhzz1g5wUkLeGb_GX13IC4BJg0dvgmA5j5dDGqVZBSEp3Y7-mxCX7FD9NzFwMmtWA2EnC0nu-vjlVuA=s0-d-e1-ft#https://www.apple.com/in/dm/22/1E76CC6D-5E55-4B05-AB11-F7F174612F59/i/icon_products_2x.png' alt=''>\n"
							+ "                    <p>Your salary will be credited b/w 1-7 of every month without delay, we even have our own record of\n"
							+ "                        continuously paying salary on the first two days of the month.</p>\n"
							+ "                    <span>🤩</span>\n"
							+ "                </section>\n"
							+ "                <section>\n"
							+ "                    <img src='https://ci6.googleusercontent.com/proxy/9kBBDp40ItmGePfcsokN0Mz2PMS-Bq_aTkwWj6FmIHk1rE6sFC4zfXoyq3dWTwC1ZS6eDAn7LLz0ZrjMfeK1FLiOYNQ3mSHHOrs2koX-v1f61tJzy_e1TLktsJKxW1N0I_Qde0gVT_qnnhO3ag=s0-d-e1-ft#https://www.apple.com/in/dm/22/1E76CC6D-5E55-4B05-AB11-F7F174612F59/i/icon_shipping_2x.png' alt=''>\n"
							+ "                    <p>We usually give you treats and throw parties from time to time. You're going to love how foodie\n"
							+ "                        we are. You will also love working with our team.</p>\n"
							+ "                    <span>🥳</span>\n"
							+ "                </section>\n"
							+ "                <section>\n"
							+ "                    <img src='https://ci6.googleusercontent.com/proxy/CaFZXxllvLjNjCEqXx-wqlCLuigBgalAv1vhNT8xFnkZuEl8S-joxFFuSCYqRPXy2UJbGC9i132xb4FUuIUmBu4GAIgSgH6ELQ5cUsM-pXAVrV-0PdUY_0lzXWzg6WRYJ47Ec3gebN5_hcw=s0-d-e1-ft#https://www.apple.com/in/dm/22/1E76CC6D-5E55-4B05-AB11-F7F174612F59/i/icon_device_2x.pngg' alt=''>\n"
							+ "                    <p>You are free to contact anyone, anytime especially senior management. Please don't contact\n"
							+ "                        clients anytime, we are not sure of them.</p>\n"
							+ "                    <span>😢</span>\n"
							+ "                </section>\n"
							+ "            </div>\n"
							+ "\n"
							+ "            <p class='learn_more'><a href='https://peoples.miratsinsights.com/'>Learn more about our People</a></p>\n"
							+ "        </div>\n"
							+ "\n"
							+ "        <div class='hr_details_container'>\n"
							+ "            <section >\n"
							+ "                <img src='"+hrProfile+"' style='height:301px; width:215px;border-radius: 20px;' alt=''>\n"
							+ "            </section>\n"
							+ "            <section class='hr_details'>\n"
							+ "                <h2>Meet our</h2>\n"
							+ "                <h2>HR, "+hrName+".</h2>\n"
							+ "                <p class='hr_desc'>He's an amazing, hardworking, and a very special member of our team. He is open to\n"
							+ "                    talking (always). Also, you can requests/feedback/suggestions, which he will obviously be going to\n"
							+ "                    give you a sweet response.</p>\n"
							+ "                <p><a href='mailto:"+hrEmail+"'>Chalo, let's connect with "+hrName+" over email.</a>\n"
							+ "                </p>\n"
							+ "                <p class='skype_id'>Skype ID: "+hrSkype+"</p>\n"
							+ "            </section>\n"
							+ "        </div>\n"
							+ "\n"
							+ "        <div class='footer'>\n"
							+ "            <p class='links'>\n"
							+ "                <a class='website' href='https://www.miratsinsights.com/'>Visit Website</a><span>|</span>\n"
							+ "                <a class='linkedin' href=''>Linkedin</a><span>|</span>\n"
							+ "                <a class='company_mail' href='mailto:support@miratsinsights.com'>support@miratsinsights.com</a>\n"
							+ "            </p>\n"
							+ "\n"
							+ "            <footer>\n"
							+ "                <section>\n"
							+ "                    <p>TM and © [2022] Mirats Insights Private Limited. All rights reserved.\n"
							+ "                    </p>\n"
							+ "                    <p>Mirats Insights Private Limited,</p>\n"
							+ "                    <p>7022 1Aerocity,</p>\n"
							+ "                    <p>NIBR Corporate Park Nr, Safed Pul,</p>\n"
							+ "                    <p>Mumbai, Maharashtra 400072</p>\n"
							+ "                </section>\n"
							+ "\n"
							+ "                <section>\n"
							+ "                    <p>CIN: U72900UP2021PTC153917</p>\n"
							+ "                    <p>GSTIN: 27AAPCM0779A1ZD</p>\n"
							+ "                </section>\n"
							+ "\n"
							+ "                <section>\n"
							+ "                    <p>Email: <a href='mailto:office_mumbai@miratsinsights.com'>office_mumbai@miratsinsights.com</a>\n"
							+ "                        Website: <a href='https://www.miratsinsights.com/'>https://www.miratsinsights.com/</a> </p>\n"
							+ "                </section>\n"
							+ "                <section>\n"
							+ "                    <a href=''>All Rights Reserved</a><span class='border'>|</span><a href=''>Privacy Policy</a><span\n"
							+ "                        class='border'>|</span>\n"
							+ "                    <a href=''>Terms</a>\n"
							+ "                </section>\n"
							+ "                <p>Thank you for joining Mirats Insights! Much love and support! ❤️</p>\n"
							+ "            </footer>\n"
							+ "        </div>\n"
							+ "\n"
							+ "    </div>\n"
							+ "</body>\n"
							+ "\n"
							+ "</html>"
							,"text/html; charset=UTF-8");

					// Send message
					Transport.send(m);

					System.out.println("Sent message successfully....");

				} catch (MessagingException e) {
					e.printStackTrace();
					throw new RuntimeException(e);
				}
				return f;

			}
	
	
	

}
