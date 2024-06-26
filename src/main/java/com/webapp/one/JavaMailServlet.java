package com.webapp.one;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
@WebServlet("/JavaMailServlet")
public class JavaMailServlet extends HttpServlet {

            public void javaMail (String email){
                // Replace these values with your email configuration
                String host = "smtp.gmail.com";
                String username = "aristestmail@gmail.com";
                String password = "dsks leal poer zmea";

                Properties properties = new Properties();
                properties.put("mail.smtp.host", host);
                properties.put("mail.smtp.port", "587");
                properties.put("mail.smtp.auth", "true");
                properties.put("mail.smtp.starttls.enable", "true");

                Session session = Session.getInstance(properties, new Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

                try {
                    Message message = new MimeMessage(session);
                    message.setFrom(new InternetAddress(username));
                    message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));
                    message.setSubject("Admission Form Submission Confirmation");
                    message.setText("Hello" +"Your request has been received.\n\n"
                            + "Best regards,\nYour University");

                    Transport.send(message);

                    System.out.println("Email sent successfully!");

                } catch (MessagingException e) {
                    throw new RuntimeException(e);
                }
            }
        }
