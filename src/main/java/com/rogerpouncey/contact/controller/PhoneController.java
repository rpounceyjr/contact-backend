package com.rogerpouncey.contact.controller;

import com.rogerpouncey.contact.domain.Contact;
import com.rogerpouncey.contact.domain.Phone;
import com.rogerpouncey.contact.repository.ContactRepository;
import com.rogerpouncey.contact.repository.PhoneRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class PhoneController {

    private PhoneRepository repository;

    public PhoneController(PhoneRepository repository) {
        this.repository = repository;
    }

}
