package com.rogerpouncey.contact.controller;

import com.rogerpouncey.contact.repository.ContactRepository;
import com.rogerpouncey.contact.repository.PhoneRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhoneController {

    private PhoneRepository repository;

    public PhoneController(PhoneRepository repository) {
        this.repository = repository;
    }


}
