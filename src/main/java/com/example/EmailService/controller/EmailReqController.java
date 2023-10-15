package com.example.EmailService.controller;

import com.example.EmailService.dto.ResponseDto;
import com.example.EmailService.service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailReqController {

    @Autowired
    private EmailSenderService emailSenderService;
    @PostMapping("/send-email")
    public ResponseDto sendEmail(){
        return emailSenderService.sendEmail();
    }
}
