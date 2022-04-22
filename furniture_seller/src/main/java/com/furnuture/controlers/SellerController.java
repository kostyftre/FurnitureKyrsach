package com.furnuture.controlers;

import com.furnuture.controlers.domain.Tickets;
import com.furnuture.repos.SellerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class SellerController {
    @Autowired
    private SellerRepo sellerRepo;

    @GetMapping("/registration")
    public String ticketss(Map<String, Object> model) {

        Iterable<Tickets> tickets = sellerRepo.findAll();

        model.put("tickets",tickets);

        return "ticketSeller";
    }


    @PostMapping("/registration")
    public String add(@RequestParam String text,@RequestParam String tag,@RequestParam String country, Map<String, Object> model) {
      Tickets ticket = new Tickets(text, tag, country);

      sellerRepo.save(ticket);

      Iterable<Tickets> tickets = sellerRepo.findAll();

      model.put("tickets",tickets);

      return "ticketSeller";
    }




}
