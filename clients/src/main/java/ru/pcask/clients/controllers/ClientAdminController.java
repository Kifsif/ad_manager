package ru.pcask.clients.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/clients")
@ResponseBody
public class ClientAdminController {
    @GetMapping("/admin/")
    public String admin(){
        return "clients";
    }
}
