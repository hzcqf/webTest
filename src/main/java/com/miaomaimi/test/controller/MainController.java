package com.miaomaimi.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MainController {

    @RequestMapping("/")
    private String index(Model model){
        return "main";
    }

}
