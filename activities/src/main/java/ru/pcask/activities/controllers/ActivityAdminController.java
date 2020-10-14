package ru.pcask.activities.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/activities")
@ResponseBody
public class ActivityAdminController {

    @GetMapping("/admin/")
    public String admin(){
        return "activities_type";
    }

}
