package com.rogerpouncey.contact.controller;

import com.rogerpouncey.contact.domain.Contact;
import com.rogerpouncey.contact.repository.ContactRepository;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
public class ContactController {

    private ContactRepository repository;

    public ContactController(ContactRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/contacts")
    List<Contact> all() {
        return repository.findAll();
    }

    @GetMapping("/contacts/{id}")
    Contact one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(null);
    }

    @PostMapping("/contacts")
    Contact newContact(@Valid @RequestBody Contact newContact) {
        return repository.save(newContact);
    }

    @PutMapping("/contacts/{id}")
    Contact replaceContact(@Valid @RequestBody Contact newContact, @PathVariable Long id) {

        return repository.findById(id)
                .map(contact -> {
                    contact.setName(newContact.getName());
                    contact.setEmail(newContact.getEmail());
                    contact.setPhone(newContact.getPhone());
                    contact.setAddress(newContact.getAddress());
                    return repository.save(contact);
                })
                .orElseGet(() -> {
                    newContact.setId(id);
                    return repository.save(newContact);
                });
    }

    @DeleteMapping("/contacts/{id}")
    void deleteContact(@PathVariable Long id) {
        repository.deleteById(id);
    }

}
