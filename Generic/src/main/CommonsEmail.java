package commonsEmail;

import org.apache.commons.mail.*;

public class CommonsEmail {

      // Create the attachment
        public static void sendEmail() throws EmailException {
            Email email = new SimpleEmail();
            email.setHostName("smtp.gmail.com");
            email.setSmtpPort(465);
            email.setAuthenticator(new DefaultAuthenticator("Team6.selenium@gmail.com", "team612345"));
            email.setSSLOnConnect(true);
            email.setFrom("Team6.selenium@gmail.com");
            email.setSubject("Failed Test Email");
            email.setMsg("This is a test mail from Selenium Team 6");
            email.addTo("Team6.selenium@gmail.com");
            email.send();
    }
}