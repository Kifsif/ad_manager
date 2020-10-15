package ru.pcask.agent_profiles.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping("/profiles/")
@ResponseBody
public class AgentProfileAdminController {
    @GetMapping("/admin/")
    public String admin(){
        return "agent_profile";
    }
}
