package Emsi.MIAGE.messaging;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Mail {
	
	public static void sendMail(String recepient,String namePerson) throws Exception
	{ 
		System.out.println("preparation de l envoie de gmail ...");
		Properties properties =new Properties();
		
		properties.put("mail.smtp.auth","true");
		properties.put("mail.smtp.starttls.enable","true");
		properties.put("mail.smtp.host","smtp.gmail.com");
		properties.put("mail.smtp.port","587");
		properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");

		
		String MyAccountEmail="nokapp.emsi@gmail.com";
		String Password="soit zero soit un";
		
		Session session= Session.getInstance(properties,new Authenticator() {
			@Override
			 protected PasswordAuthentication getPasswordAuthentication() { 
				return new PasswordAuthentication(MyAccountEmail, Password);
			}
		});
		
		
		Message message= preparedMessage(session,MyAccountEmail,recepient,namePerson);
		
		Transport.send(message);
		System.out.println("Message envoyer !!!");
		System.out.println("***********************************");
		System.out.println();


	
		
	}
	private static Message preparedMessage(Session session,String myAccountEmail,String recepient,String namePerson)
	{ 
		Message message= new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress(myAccountEmail));
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
			message.setSubject( namePerson);
			message.setText("Bonjour , on vous informe que votre Niveau á EMSI ,"
					+ "pour cela on vous offre notre aide pour trouver un stage en Amérique afin de débuter une carriére professionnel "
					+ ", déposer votre lettre de motivation au surveillant Génerale de votre Departement , cordialement .");
		
			return message;
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		return null;
	}


}
