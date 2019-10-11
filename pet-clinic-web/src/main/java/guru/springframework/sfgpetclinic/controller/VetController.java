package guru.springframework.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by thamhv on 10/12/2019.
 */
@Controller
@RequestMapping("/vets")
public class VetController {

    @RequestMapping({"","/","index","index.html"})
    public String listVets(){
        return "vets/index";
    }
}
