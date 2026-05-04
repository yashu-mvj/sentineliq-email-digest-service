package com.internship.emaildigest.controller;

import com.internship.emaildigest.dto.EmailRequest;
import com.internship.emaildigest.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/email")
@RequiredArgsConstructor
public class EmailController {

    private final EmailService emailService;

    @PostMapping("/send")
    public String sendEmail(@RequestBody EmailRequest request) {
        emailService.sendEmail(
                request.getTo(),
                request.getSubject(),
                request.getBody()
        );
        return "Email sent successfully!";
    }
}