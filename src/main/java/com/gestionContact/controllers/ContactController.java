package com.gestionContact.controllers;

import com.gestionContact.models.Contact;
import com.gestionContact.models.Group;
import com.gestionContact.services.ContactService;
import com.gestionContact.services.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ContactController {
    @Autowired
    private final ContactService contactService;

    @Autowired
    private final GroupService groupService;

    public ContactController(ContactService contactService, GroupService groupService) {
        this.contactService = contactService;
        this.groupService = groupService;
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
        model.addAttribute("groups", groupService.findAll());
        return "addform";
    }

    @PostMapping("/add")
    public String createContact(@ModelAttribute("contact") Contact contact, @RequestParam("group") Long groupId, Model model) {
        Group group = groupService.findById(groupId);
        if (group != null) {
            contact.addGroup(group);
        }
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
    public String searchPage(Model model){
        model.addAttribute("contacts", contactService.findAll());
        return "search";
    }

    @PostMapping("/search")
    public String searchByVal(Model model, @RequestParam("param") String param, @RequestParam("val") String value) {
        if (param.equals("nom")) {
            model.addAttribute("contacts", contactService.findByNameApproximation(value));
        } else if (param.equals("telephone1")) {
            model.addAttribute("contacts", contactService.findByTelephone1(value));
        } else if (param.equals("telephone2")){
            model.addAttribute("contacts", contactService.findByTelephone2(value));
        } else if (param.equals("adresse")) {
            model.addAttribute("contacts", contactService.findByAdresse(value));
        } else if (param.equals("email_personnel")) {
            model.addAttribute("contacts", contactService.findByEmailPersonnel(value));
        } else if (param.equals("email_professionnel")) {
            model.addAttribute("contacts", contactService.findByEmailProfessionnel(value));
        } else if (param.equals("gender")) {
            model.addAttribute("contacts", contactService.findByGenre(value));
         /* } else if (param.equals("group")) {
            model.addAttribute("contacts", contactService.findByGroup(value));*/
        } else if (param.equals("prenom")) {
            model.addAttribute("contacts", contactService.findByPrenomOrderByNomAsc(value));
        } else {
            model.addAttribute("contacts", contactService.findAll());
        }

        return "search";
    }
}
