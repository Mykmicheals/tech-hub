package com.anon.techhub.dao;

import com.anon.techhub.entity.Phone;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class PhoneImplementation implements PhoneDao{


    private EntityManager phoneEntity;
    @Autowired
    public  PhoneImplementation(EntityManager thePhoneEntity){
        this.phoneEntity =  thePhoneEntity;
    }
    @Override
    @Transactional
    public Phone save(Phone phone) {
         phoneEntity.persist(phone);
        return phone;
    }
}
