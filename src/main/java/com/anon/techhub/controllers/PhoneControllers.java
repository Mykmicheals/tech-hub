package com.anon.techhub.controllers;

import com.anon.techhub.entity.Phone;
import com.anon.techhub.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/phone")
@Controller
public class PhoneControllers {

   private PhoneService phoneService;
    @Autowired
    public PhoneControllers(PhoneService phoneService){
        this.phoneService=phoneService;
    }

    @GetMapping("/get")
    public String hello(){
        return "Good to know";
    }
    @PostMapping("/create")
    public Phone createPhone(@RequestBody Phone phone){
        return phoneService.save(phone);
    }
}
