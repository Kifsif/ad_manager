package ru.pcask.client.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/client")
@ResponseBody
public class AdminController {

    @GetMapping("/admin/")
    public String admin(){
        return "client";
    }

}
