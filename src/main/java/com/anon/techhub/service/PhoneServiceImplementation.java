package com.anon.techhub.service;

import com.anon.techhub.dao.PhoneDao;
import com.anon.techhub.entity.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service

public class PhoneServiceImplementation implements PhoneService{
    PhoneDao phoneService;
    @Autowired
   public PhoneServiceImplementation(PhoneDao phoneService){
        this.phoneService=phoneService;
    }
    @Override
    @Transactional
    public Phone save(Phone phone) {
        phoneService.save(phone);
        return phone;
    }
}
