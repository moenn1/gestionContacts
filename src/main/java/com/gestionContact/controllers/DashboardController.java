package com.gestionContact.controllers;

import com.gestionContact.models.Contact;
import com.gestionContact.models.Group;
import com.gestionContact.services.ContactService;
import com.gestionContact.services.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class DashboardController {
    @Autowired
    private final ContactService contactService;

    @Autowired
    private final GroupService groupService;

    public DashboardController(ContactService contactService, GroupService groupService) {
        this.contactService = contactService;
        this.groupService = groupService;
    }

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


}
