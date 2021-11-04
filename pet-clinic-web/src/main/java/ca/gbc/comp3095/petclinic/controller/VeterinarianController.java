package ca.gbc.comp3095.petclinic.controller;

import ca.gbc.comp3095.petclinic.services.VeterinarianService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping({"/veterinarian"})
@Controller
public class VeterinarianController {

    private final VeterinarianService veterinarianService;

    public VeterinarianController(VeterinarianService veterinarianService) {
        this.veterinarianService = veterinarianService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listVets(Model model){
        model.addAttribute("vets", veterinarianService.findAll());
        return "veterinarian/index";
    }
}
