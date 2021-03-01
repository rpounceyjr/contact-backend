package com.rogerpouncey.contact.repository;

import com.rogerpouncey.contact.domain.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
