package com.example.JPAdemo.repository;

import com.example.JPAdemo.entities.person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class JpaRepository {

    @PersistenceContext
    public EntityManager entityManager;

    public person findPersonByID(int id){
        return entityManager.find(person.class, id);
    }

    public person update(person person){
        return entityManager.merge(person);
    }

    public void deleteById(int id){
        person person = findPersonByID(id);
        entityManager.remove(person);
    }

    public List<person> findALlPeople() {
        TypedQuery<person> query = entityManager.createNamedQuery("Find_All_People", person.class);
        return query.getResultList();
    }

}
