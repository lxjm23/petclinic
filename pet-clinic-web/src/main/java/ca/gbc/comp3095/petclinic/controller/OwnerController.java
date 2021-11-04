package ca.gbc.comp3095.petclinic.controller;

import ca.gbc.comp3095.petclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    //http://localhost:8080/owners/    values below
    @RequestMapping({"","/", "/index", "/index.html"})
    public String listOwner(Model model){
        model.addAttribute("owners", ownerService.findAll());

        //send to templates/owner/index.html
        return "owner/index";
    }
}
