package de.aittr.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DemoController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String getMap(){
        return "hello_view";
    }
}
