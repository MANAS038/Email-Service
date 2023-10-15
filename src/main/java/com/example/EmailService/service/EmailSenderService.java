package com.example.EmailService.service;

import com.example.EmailService.dto.ResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EmailSenderService {


    @Autowired
    private JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    private String sender;
    public ResponseDto sendEmail() {
        // Try block to check for exceptions
        try {

            SimpleMailMessage mailMessage
                    = new SimpleMailMessage();
            mailMessage.setFrom(sender);
            mailMessage.setTo("manasnitrr03@gmail.com");
            mailMessage.setText("HI");
            mailMessage.setSubject("Test");

            javaMailSender.send(mailMessage);
            return null;
        }

        catch (Exception e) {
             log.error("Error while Sending Mail");
        }
        return null;
    }
}
