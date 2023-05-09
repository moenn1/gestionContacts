package com.gestionContact.controllers;

import com.gestionContact.models.Contact;
import com.gestionContact.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ContactController {
    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/contacts")
    public String viewContact(Model model) {
        model.addAttribute("contacts", contactService.findAll());
        return "contact-list";
    }

    @PostMapping("/contacts")
    public String createContact(@ModelAttribute Contact contact, Model model) {
        contactService.save(contact);
        model.addAttribute("contacts", contactService.findAll());
        return "contact-list";
    }

    @PostMapping("/contacts/edit/{id}")
    public String updateContact(@PathVariable("id") Long id, @ModelAttribute Contact contact) {
        Contact con = contactService.findById(id);
        con.setGenre(contact.getGenre());
        con.setAdresse(contact.getAdresse());
        con.setNom(contact.getNom());
        con.setPrenom(contact.getPrenom());
        con.setEmailPersonnel(contact.getEmailPersonnel());
        con.setEmailProfessionnel(contact.getEmailProfessionnel());
        con.setTelephone1(contact.getTelephone1());
        con.setTelephone2(contact.getTelephone2());
        contactService.save(con);
        return "contact-list";
    }

    @PostMapping("/contacts/delete/{id}")
    public String deleteContact(@PathVariable("id") Long id) {
        contactService.deleteById(id);
        return "contact-list";
    }
}
