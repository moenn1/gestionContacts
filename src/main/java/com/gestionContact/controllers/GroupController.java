package com.gestionContact.controllers;


import com.gestionContact.models.Group;
import com.gestionContact.services.ContactService;
import com.gestionContact.services.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class GroupController {
    @Autowired
    GroupService groupService;

    @Autowired
    ContactService contactService;

    //Done
    @GetMapping("/groups")
    public String groupsPage(Model model){
        model.addAttribute("groups", groupService.countAllGroups());
        return "groups";
    }

    //Done
    @GetMapping("/groups/add")
    public String addGroupPage(Model model){
        model.addAttribute("contacts", contactService.findAll());
        return "addgroup";
    }

    @PostMapping("/groups/add")
    public String addGroup(Model model, @ModelAttribute("group") Group group){
        groupService.save(group);
        return viewGroupContacts(model, group.getName());
    }

    //done
    @GetMapping("/groups/edit/{name}")
    public String editGroupPage(Model model, @PathVariable("name") String name){
        model.addAttribute("group", groupService.findByName(name));
        return "editgroup";
    }

    //done
    @PostMapping("groups/edit/{name}")
    public String editGroup(Model model, @PathVariable("name") String name, @ModelAttribute("group") Group group){
        Group group1 = groupService.findByName(name);
        group1.setName(group.getName());
        groupService.save(group1);
        model.addAttribute("groups", groupService.countAllGroups());
        return "groups";
    }

    //Done
    @PostMapping("/groups/delete/{name}")
    public String deleteGroup(Model model, @PathVariable("name") String name){
        groupService.delete(groupService.findByName(name));
        model.addAttribute("groups", groupService.countAllGroups());
        return "groups";
    }


    //Done
    @GetMapping("/groups/contacts/{name}")
    public String viewGroupContacts(Model model, @PathVariable("name") String name){
        model.addAttribute("contacts", groupService.findByName(name).getContacts());
        model.addAttribute("group", groupService.findByName(name));
        return "groupcontacts";
    }


}
