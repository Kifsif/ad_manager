package ru.pcask.activities_type.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/activities_type")
@ResponseBody
public class Admin {

    @GetMapping("/admin/")
    public String admin(){
        return "activities_type";
    }

}
