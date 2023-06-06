package com.gestionContact.controllers;

import com.gestionContact.models.Contact;
import com.gestionContact.models.Group;
import com.gestionContact.services.ContactService;
import com.gestionContact.services.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
public class ContactController {
    @Autowired
    private final ContactService contactService;

    @Autowired
    private final GroupService groupService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("totalContacts", contactService.count());
        model.addAttribute("totalGroups", groupService.count());
        int totalMale = contactService.countByGenre("male");
        int totalFemale = contactService.countByGenre("female");
        model.addAttribute("totalMale", totalMale);
        model.addAttribute("totalFemale", totalFemale);
        double percentageFemale = (double) totalFemale / (totalMale + totalFemale) * 100;
        double percentageMale = (double) totalMale / (totalMale + totalFemale) * 100;
        model.addAttribute("percentageFemale", percentageFemale);
        model.addAttribute("percentageMale", percentageMale);
        return "dashboard";
    }


    public ContactController(ContactService contactService, GroupService groupService) {
        this.contactService = contactService;
        this.groupService = groupService;
    }

    @GetMapping("/contacts/{id}")
    public String viewContact(@PathVariable("id") Long id, Model model) {
        Contact contact = contactService.findById(id);
        ArrayList<Group> groups = new ArrayList<>();
        groups = (ArrayList<Group>) contact.getGroupsList();
        model.addAttribute("contact", contact);
        model.addAttribute("groups", groups);
        return "contactdetails";
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
        contactService.save(contact, groupId);
        model.addAttribute("contacts", contactService.findAll());
        model.addAttribute("groups", groupService.findAll());
        return "overview";
    }

    @GetMapping("/contacts/edit/{id}")
    public String updateContactPage(@PathVariable("id") Long id, Model model){
        Contact con = contactService.findById(id);
        model.addAttribute("contact", con);
        model.addAttribute("groups", groupService.findAll());
        return "edit";
    }

    @PostMapping("/contacts/edit/{id}")
    public String updateContact(@PathVariable("id") Long id, @ModelAttribute Contact contact, @RequestParam("groupId") Long groupId) {
        contactService.save(contact, groupId);

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
        } else if (param.equals("prenom")) {
            model.addAttribute("contacts", contactService.findByPrenomOrderByNomAsc(value));
        } else {
            model.addAttribute("contacts", contactService.findAll());
        }

        return "search";
    }


    @PostMapping("/contacts/removeFromGroup/{id}")
    public String removeFromGroup(@PathVariable("id") Long id, @RequestParam("groupId") Long groupId) {
        Contact contact = contactService.findById(id);
        Group group = groupService.findById(groupId);
        if (!contact.getGroupsList().contains(group)) {
            return "redirect:/contacts/" + id;
        }
        contact.removeGroup(group);
        contactService.save(contact);
        return "redirect:/contacts/" + id;
    }

    @PostMapping("/contacts/addToGroup/{id}")
    public String addToGroup(@PathVariable("id") Long id, @RequestParam("groupId") Long groupId) {
        //if not already in group
        Contact contact = contactService.findById(id);
        Group group = groupService.findById(groupId);
        if (contact.getGroupsList().contains(group)) {
            return "redirect:/contacts/" + id;
        }
        contact.addGroup(group);
        contactService.save(contact);
        return "redirect:/contacts/" + id;
    }


}
