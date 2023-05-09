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
        return "redirect:/contacts";
    }

    @GetMapping("/contacts")
    public String viewContact(Model model) {
        model.addAttribute("contacts", contactService.findAll());
        return "overview";
    }

    @GetMapping("/add")
    public String addContactForm(Model model) {
        return "addform";
    }

    @PostMapping("/add")
    public String createContact(@ModelAttribute Contact contact, Model model) {
        contactService.save(contact);
        model.addAttribute("contacts", contactService.findAll());
        return "overview";
    }

    @GetMapping("/contacts/edit/{id}")
    public String updateContactPage(@PathVariable("id") Long id, Model model){
        Contact con = contactService.findById(id);
        model.addAttribute("contact", con);
        return "edit";
    }

    @PostMapping("/contacts/edit/{id}")
    public String updateContact(@PathVariable("id") Long id, @ModelAttribute Contact contact) {
        contactService.updateContact(contact);
        return "redirect:/contacts";
    }

    @PostMapping("/contacts/delete/{id}")
    public String deleteContact(@PathVariable("id") Long id) {
        contactService.deleteById(id);
        return "redirect:/contacts";
    }


    @GetMapping("/search")
    public String searchPage(){
        return "search";
    }
}
