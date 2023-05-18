package com.sgyj.mailservice.infra.mail;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Slf4j
@Profile({"local", "test"})
@Component
public class ConsoleEmailService implements EmailService {

    @Override
    public void sendEmail(EmailMessage emailMessage) {
        log.info("sent email: {}", emailMessage.getMessage());
    }

    @Override
    public JavaMailSender getJavaMailSender() {
        return null;
    }

}
