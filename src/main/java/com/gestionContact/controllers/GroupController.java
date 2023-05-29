package com.gestionContact.controllers;


import com.gestionContact.services.ContactService;
import com.gestionContact.services.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GroupController {
    @Autowired
    GroupService groupService;

    @Autowired
    ContactService contactService;

    @GetMapping("/groups")
    public String groupsPage(){
        return "groups";
    }



}
