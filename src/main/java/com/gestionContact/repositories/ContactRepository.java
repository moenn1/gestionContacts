package com.gestionContact.repositories;
import com.gestionContact.models.Contact;
import com.gestionContact.models.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
    List<Contact> findByNomOrderByNomAsc(String nom);

    List<Contact> findByPrenomOrderByNomAsc(String prenom);
    Contact findByTelephone1(String telephone1);

    Contact findByTelephone2(String telephone2);

    Contact findByEmailProfessionnel(String emailProfessionnel);

    Contact findByEmailPersonnel(String emailPersonnel);

    Contact findByAdresse(String adresse);

    List<Contact> findByGenre(String genre);
    //List<Contact> findByGroup(String group);

    int countByNom(String nom);

    int countByGenre(String genre);

}
