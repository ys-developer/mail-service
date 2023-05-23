package com.sgyj.mailservice.modules.repository;

import com.sgyj.mailservice.modules.entity.Email;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MailRepository extends JpaRepository<Email, Long> {
    
    Optional<Email> findByEmailAddress(String email);

}
