package com.rogerpouncey.contact.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest {


    @Test
    void setEmailTest() {
        Contact contact = new Contact();
        contact.setEmail("bogus@gmail.com");
        String email = contact.getEmail();
        assertNotNull(email, "Email cannot be null");
        assertNotEquals("", email, "Email cannot be empty");

    }

}