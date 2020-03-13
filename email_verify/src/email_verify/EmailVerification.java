package email_verify;

import java.util.Properties;
import java.util.UUID;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailVerification {  
	public void sendMail(String email) {  
		//sender Info
		final String host = "smtp.naver.com";
		final String user="jidekosw@naver.com";//change accordingly  
		final String password="";//change accordingly  
	    
		//Get and define session props
		Properties props = new Properties();  
		props.put("mail.smtp.host",host);
		props.put("mail.smtp.port",587);
		props.put("mail.smtp.auth", "true");  
		Session session = Session.getDefaultInstance(props,  new javax.mail.Authenticator() {  
	      protected PasswordAuthentication getPasswordAuthentication() {  
	    return new PasswordAuthentication(user,password);  
	      }  
	    });  
	  
	   //Compose the message  
	    try {  
	     MimeMessage message = new MimeMessage(session);  
	     message.setFrom(new InternetAddress(user));  
	     message.addRecipient(Message.RecipientType.TO,new InternetAddress(email));  
	     message.setSubject("Email Verification");  
	     String uuid = UUID.randomUUID().toString().substring(0,6);
	     message.setText(uuid);
//	     message.setContent("<a href='naver.com'>This is actual message embedded in HTML tags</a>","text/html; charset=utf-8");  
	       
	    //send the message  
	     Transport.send(message);  
	  
	     //debug
	     System.out.println("message sent successfully...");  
	   
	     } catch (MessagingException e) {
	    	 e.printStackTrace();
	     }
	 }  
	
	public void sendMail(String email, String shaPass) {  
		//sender Info
		final String host = "smtp.naver.com";
		final String user="jidekosw@naver.com";//change accordingly  
		final String password="";//change accordingly  
	    
		//Get and define session props
		Properties props = new Properties();  
		props.put("mail.smtp.host",host);
		props.put("mail.smtp.port",587);
		props.put("mail.smtp.auth", "true");  
		Session session = Session.getDefaultInstance(props,  new javax.mail.Authenticator() {  
	      protected PasswordAuthentication getPasswordAuthentication() {  
	    return new PasswordAuthentication(user,password);  
	      }  
	    });  
	  
	   //Compose the message  
	    try {  
	     MimeMessage message = new MimeMessage(session);  
	     message.setFrom(new InternetAddress(user));  
	     message.addRecipient(Message.RecipientType.TO,new InternetAddress(email));  
	     message.setSubject("Email Verification");  
	     String veriId = shaPass.substring(0,6);
	     StringBuilder html = new StringBuilder();
	     html.append("") ;
	     message.setContent(html,"text/html; charset=utf-8");  
	       
	    //send the message  
	     Transport.send(message);  
	  
	     //debug
	     System.out.println("message sent successfully...");  
	   
	     } catch (MessagingException e) {
	    	 e.printStackTrace();
	     }
	 }  
}  