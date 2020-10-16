package ru.pcask.users.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.pcask.users.entities.User;
import ru.pcask.users.repositories.UserRepository;


@Controller
@RequestMapping("/users")
@ResponseBody
public class UserAdminController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/admin")
    public String admin(){
        Iterable<User> users = userRepository.findAll();

        String tmp = "users";
        if (users != null) {
            tmp = users.toString();
        }
        return tmp;

    }
}
