package com.gestionContact.repositories;

import com.gestionContact.models.Contact;
import com.gestionContact.models.Group;
import org.aspectj.weaver.patterns.HasMemberTypePattern;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public interface GroupRepository extends JpaRepository<Group, Long> {

    @Query("SELECT COUNT(c) FROM Contact c JOIN c.groups g WHERE g.name = :name")
    public int countByName(@Param("name") String name);

    public Group findByName(String name);
}
