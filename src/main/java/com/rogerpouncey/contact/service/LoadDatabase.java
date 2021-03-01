package com.rogerpouncey.contact.service;

import aj.org.objectweb.asm.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rogerpouncey.contact.domain.Contact;
import com.rogerpouncey.contact.repository.ContactRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(ContactRepository repository) {

        return args -> {

            ObjectMapper mapper = new ObjectMapper();
            com.fasterxml.jackson.core.type.TypeReference<List<Contact>> typeReference = new com.fasterxml.jackson.core.type.TypeReference<List<Contact>>(){};
            InputStream inputStream = TypeReference.class.getResourceAsStream("/contacts.json");
            try {
                List<Contact> contacts = mapper.readValue(inputStream, typeReference);
                repository.saveAll(contacts);
                System.out.println("Contacts Saved");
            }
            catch(IOException error) {
                System.out.println("Could not save contacts. Error:" + error);
            }
        };
    }
}