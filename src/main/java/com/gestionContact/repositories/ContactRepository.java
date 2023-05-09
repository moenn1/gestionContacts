package com.gestionContact.repositories;
import com.gestionContact.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
    List<Contact> findByNomOrderByNomAsc(String nom);
    Contact findByTelephone1OrTelephone2(String telephone1, String telephone2);

}
