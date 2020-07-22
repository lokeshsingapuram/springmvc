package com.tcs.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import com.tcs.model.Registration;

@Component
public class EmailUtils {
	@Autowired
	private JavaMailSender mailSender;

	public boolean sendUserAccUnlockEmail(Registration reg)  {
		boolean isSent=false;
try {
		MimeMessage mimeMessage = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(mimeMessage);
		helper.setTo(reg.getEmail());
		helper.setSubject("unlock your account");
		helper.setText(getUnlockAccEmailBody(reg), true);
		mailSender.send(mimeMessage);
		
       isSent=true;
}
catch (Exception e) {
e.printStackTrace();
}
return isSent;
	}
	public String getUnlockAccEmailBody(Registration reg) throws IOException {
			StringBuffer sb = new StringBuffer("");

			FileReader fr = new FileReader("UNLOCK-ACC-EMAIL-BODY-TEMPLATE.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				line = br.readLine();
			}
			
			br.close();

			// format mail body
			String mailBody = sb.toString();
			mailBody = mailBody.replace("{FNAME}", reg.getFirstName());
			mailBody = mailBody.replace("{LNAME}", reg.getLastName());
			mailBody = mailBody.replace("{TEMP-PWD}", reg.getPwd());
			mailBody = mailBody.replace("{EMAIL}", reg.getEmail());

			return mailBody;
		}

}
