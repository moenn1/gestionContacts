package com.gestionContact.models;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.lang.reflect.Array;
import java.util.*;

@Entity
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String telephone1;
    private String telephone2;
    private String adresse;
    private String emailPersonnel;
    private String emailProfessionnel;
    private String genre;

    @ManyToMany
    @JoinTable(
            name = "contact_group",
            joinColumns = @JoinColumn(name = "contact_id"),
            inverseJoinColumns = @JoinColumn(name = "group_id"))
    private Set<Group> groups = new HashSet<>();

    public Set<Group> getGroups() {
        return groups;
    }

    public List<Group> getGroupsList() {
        return new ArrayList<>(groups);
    }

    public void setGroups(Set<Group> groups) {
        this.groups = groups;
    }

    public void addGroup(Group group) {
        this.groups.add(group);
        group.getContacts().add(this);
    }

    public void removeGroup(Group group) {
        this.groups.remove(group);
        group.getContacts().remove(this);
    }

    public Contact(){
    }

    public Contact(Long id, String nom, String prenom, String telephone1, String telephone2, String adresse, String emailPersonnel, String emailProfessionnel, String genre) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone1 = telephone1;
        this.telephone2 = telephone2;
        this.adresse = adresse;
        this.emailPersonnel = emailPersonnel;
        this.emailProfessionnel = emailProfessionnel;
        this.genre = genre;
    }

    public void setGroup(Group group) {
        this.groups = new HashSet<>();
        this.groups.add(group);
    }

    public Long getId() {
        return id;
    }

    public String getFullName() {
        return this.nom + " " + this.prenom;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone1() {
        return telephone1;
    }

    public void setTelephone1(String telephone1) {
        this.telephone1 = telephone1;
    }

    public String getTelephone2() {
        return telephone2;
    }

    public void setTelephone2(String telephone2) {
        this.telephone2 = telephone2;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmailPersonnel() {
        return emailPersonnel;
    }

    public void setEmailPersonnel(String emailPersonnel) {
        this.emailPersonnel = emailPersonnel;
    }

    public String getEmailProfessionnel() {
        return emailProfessionnel;
    }

    public void setEmailProfessionnel(String emailProfessionnel) {
        this.emailProfessionnel = emailProfessionnel;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}