package com.merilytics.mail;

import java.util.ArrayList;
import java.util.Base64;
import java.util.Properties;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;

@Configuration("emailTemplete")
@EnableAsync
public class EmailTemplate {
	@Autowired
	private JavaMailSenderImpl mailSender;

	@Async
	public void sendMailtoPmCycle(String to, final String subject, final String text) {
		try {
			to = "rajesh_jajam@merilytics.com";
			String adminEmail = null;
			String itSupportEmail = null;
			String itSupportPassword = null;
			Integer SMTPPort = null;
			String SMTPServerIP = null;

			adminEmail = "rajesh_jajam@merilytics.com";
			itSupportEmail = "rajesh_jajam@merilytics.com";
			itSupportPassword = new String(Base64.getDecoder().decode("TWVyaXR1c0AxOTky"));
			System.out.println(itSupportPassword);
			SMTPPort = 587;
			SMTPServerIP = "smtp.office365.com";

			Properties p = new Properties();
			p.setProperty("mail.smtp.auth", "true");
			p.setProperty("mail.smtp.starttls.enable", "true");

			mailSender.setHost(SMTPServerIP);
			mailSender.setPort(SMTPPort);
			mailSender.setUsername(itSupportEmail);
			mailSender.setPassword(itSupportPassword);
			mailSender.setJavaMailProperties(p);

			final String it = itSupportEmail;
			final String toadress = to;
			mailSender.send(new MimeMessagePreparator() {

				@Override
				public void prepare(MimeMessage mimeMessage) throws Exception {
					MimeMessageHelper message = new MimeMessageHelper(mimeMessage, true, "UTF-8");
					message.setFrom(it);
					message.setTo(toadress);
					message.setSubject(subject);
					message.setText(text, true);
				}
			});

		}

		catch (Exception err) {
			err.printStackTrace();
		}
	}
}
