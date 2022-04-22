package com.furnuture.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class TourController {

    @GetMapping("/investment")
    public String tickets(Model model){
        return "tour";
    }

}
