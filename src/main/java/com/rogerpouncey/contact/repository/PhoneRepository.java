package com.rogerpouncey.contact.repository;

import com.rogerpouncey.contact.domain.Contact;
import com.rogerpouncey.contact.domain.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepository extends JpaRepository<Phone, Long> {
}
