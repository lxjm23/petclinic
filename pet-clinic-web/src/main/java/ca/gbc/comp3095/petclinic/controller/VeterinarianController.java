package ca.gbc.comp3095.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping({"/veterinarian"})
@Controller
public class VeterinarianController {

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listVets(){
        return "veterinarian/index";
    }
}
