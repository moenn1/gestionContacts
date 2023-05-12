package com.gestionContact.repositories;

import com.gestionContact.models.Contact;
import com.gestionContact.models.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<Group, Long> {
}
