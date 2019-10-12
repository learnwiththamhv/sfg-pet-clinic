package guru.springframework.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by thamhv on 10/12/2019.
 */
@Controller
@RequestMapping("/owners")
public class OwnerController {

    @RequestMapping({"","/","index","index.html"})
    public String listOwners(){
        return "owners/index";
    }
}
