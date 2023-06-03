package com.gestionContact.util;

import com.gestionContact.models.Contact;
import com.gestionContact.models.Group;
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
            //Assign a group id between 1 and 3
            //Generate number between 1 and 3, if 1 Family, if 2 Friends, if 3 Work, then add the group to the contact
            int randomGroup = faker.number().numberBetween(1, 4);
            if (randomGroup == 1) {
                Group group = new Group();
                group.setId(1L);
                group.setName("Family");
                //contact.getGroups().add(group);
            } else if (randomGroup == 2) {
                Group group = new Group();
                group.setId(2L);
                group.setName("Friends");
                //contact.getGroups().add(group);
            } else if (randomGroup == 3) {
                Group group = new Group();
                group.setId(3L);
                group.setName("Work");
               // contact.getGroups().add(group);
            }
            contactRepository.save(contact);
        }
    }

}

