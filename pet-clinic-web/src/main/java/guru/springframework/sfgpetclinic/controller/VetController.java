package guru.springframework.sfgpetclinic.controller;

import guru.springframework.sfgpetclinic.service.map.VetMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by thamhv on 10/12/2019.
 */
@Controller
public class VetController {

    private VetMapService vetMapService;

    @Autowired
    public VetController(VetMapService vetMapService) {
        this.vetMapService = vetMapService;
    }

    @RequestMapping({"/vets","/vets.html","/vets/index","/vets/index.html"})
    public String listVets(Model model){

        model.addAttribute("vets",vetMapService.findAll());

        return "vets/index";
    }
}
