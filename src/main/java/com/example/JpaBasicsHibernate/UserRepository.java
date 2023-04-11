package com.example.JpaBasicsHibernate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User,Integer>{//Data Types :primitive & wrap type;only write wrap type
     //C->C=extends;  i->C=implements;   i->i= extends;

     //JPA is the interface its give ORM implementations

    //whose give JpaRepository interface implementation: Hibernates

    //If the class whose give JpaRepository implementations : we give the implementations
}
