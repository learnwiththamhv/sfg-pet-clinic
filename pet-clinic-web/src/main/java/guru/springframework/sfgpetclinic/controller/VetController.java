package guru.springframework.sfgpetclinic.controller;

import guru.springframework.sfgpetclinic.service.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by thamhv on 10/12/2019.
 */
@Controller
public class VetController {

    private VetService vetService;

    @Autowired
    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets","/vets.html","/vets/index","/vets/index.html"})
    public String listVets(Model model){

        model.addAttribute("vets",vetService.findAll());

        return "vets/index";
    }
}
