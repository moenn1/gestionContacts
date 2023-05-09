package com.gestionContact.util;

import com.gestionContact.models.Contact;
import com.gestionContact.repositories.ContactRepository;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public class GenerateData {

    @Autowired
    ContactRepository contactRepository;

    public void generateContact() {
        Faker faker = new Faker();


        for (int i = 0; i < 100; i++) {
            String firstName = faker.name().firstName();
            String lastName = faker.name().lastName();

            Contact contact = new Contact();
            contact.setNom(lastName);
            contact.setPrenom(firstName);
            contact.setTelephone1(faker.phoneNumber().cellPhone());
            contact.setTelephone2(faker.phoneNumber().phoneNumber());
            contact.setAdresse(faker.address().fullAddress());
            contact.setEmailPersonnel(faker.internet().emailAddress(firstName.toLowerCase()));
            contact.setEmailProfessionnel(faker.internet().emailAddress(firstName.toLowerCase() + "." + lastName.toLowerCase()));
            contact.setGenre(faker.options().option("male", "female"));

            contactRepository.save(contact);
        }
    }

}

