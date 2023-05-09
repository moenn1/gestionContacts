package com.gestionContact.services;

import com.gestionContact.models.Contact;
import com.gestionContact.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
    @Autowired
    ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository){
        this.contactRepository = contactRepository;
    }

    public void save(Contact con){
        contactRepository.save(con);
    }

    public void delete(Contact con){
        contactRepository.delete(con);
    }


    public Contact findById(Long id) {
        return contactRepository.findById(id).orElse(null);
    }

    public Iterable<Contact> findAll() {
        return contactRepository.findAll();
    }

    public long count() {
        return contactRepository.count();
    }

    public boolean existsById(Long id) {
        return contactRepository.existsById(id);
    }

    public void deleteById(Long id) {
        contactRepository.deleteById(id);
    }

    public void deleteAll() {
        contactRepository.deleteAll();
    }

    public void deleteAll(Iterable<Contact> Contacts) {
        contactRepository.deleteAll(Contacts);
    }

    public Iterable<Contact> saveAll(Iterable<Contact> Contacts) {
        return contactRepository.saveAll(Contacts);
    }


    public Iterable<Contact> findByNomAsc(String nom){
        return contactRepository.findByNomOrderByNomAsc(nom);
    }


    public Contact findByTelephone1or2(String telephone1, String telephone2){
        return contactRepository.findByTelephone1OrTelephone2(telephone1, telephone2);
    }


}
