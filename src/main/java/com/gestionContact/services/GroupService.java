package com.gestionContact.services;

import org.springframework.beans.factory.annotation.Autowired;
import com.gestionContact.models.Group;
import com.gestionContact.repositories.GroupRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;

@Service
public class GroupService {
    @Autowired
    GroupRepository groupRepository;

    public GroupService(GroupRepository groupRepository){
        this.groupRepository = groupRepository;
    }

    public void save(Group group){
        groupRepository.save(group);
    }

    public void delete(Group group){
        groupRepository.delete(group);
    }


    public Group findById(Long id) {
        return groupRepository.findById(id).orElse(null);
    }

    public Iterable<Group> findAll() {
        return groupRepository.findAll();
    }

    public long count() {
        return groupRepository.count();
    }

    public boolean existsById(Long id) {
        return groupRepository.existsById(id);
    }

    public void deleteById(Long id) {
        groupRepository.deleteById(id);
    }


    public void deleteAll() {
        groupRepository.deleteAll();
    }

    public void deleteAll(Iterable<Group> Groups) {
        groupRepository.deleteAll(Groups);
    }

    public Iterable<Group> saveAll(Iterable<Group> Groups) {
        return groupRepository.saveAll(Groups);
    }


    public HashMap<String, Integer> countAllGroups() {
        HashMap<String, Integer> groups = new HashMap<>();
        for (Group group : groupRepository.findAll()) {
            groups.put(group.getName(), groupRepository.countByName(group.getName()));
            System.out.println(group.getName() + " " + groupRepository.countByName(group.getName()));
        }
        return groups;
    }

    public Group findByName(String name) {
        return groupRepository.findByName(name);
    }
}
