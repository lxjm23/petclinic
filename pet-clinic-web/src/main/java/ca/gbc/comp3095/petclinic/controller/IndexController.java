package ca.gbc.comp3095.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    //http://localhost:8080/    values below
    @RequestMapping({"", "/", "index.html"})
    public String index(){
        //send to templates/owner/index.html
        return "index";
    }
}
