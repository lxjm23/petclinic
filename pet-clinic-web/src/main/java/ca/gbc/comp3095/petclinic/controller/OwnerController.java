package ca.gbc.comp3095.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    //http://localhost:8080/owners/    values below
    @RequestMapping({"","/", "/index", "/index.html"})
    public String listOwner(){
        //send to templates/owner/index.html
        return "owner/index";
    }
}
