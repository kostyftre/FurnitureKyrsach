package com.furnuture.controlers;


import com.furnuture.controlers.domain.Tickets;
import com.furnuture.repos.SellerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class PeopleController {

    @Autowired
    SellerRepo sellerRepo;

    @GetMapping("/people")
    public String people(Map<String, Object> model){

        Iterable<Tickets> tickets = sellerRepo.findAll();
        model.put("Tickets", tickets);
        return "participant";

    }


}
