package ru.pcask.clients.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.pcask.clients.entities.Client;
import ru.pcask.clients.repositories.ClientRepository;

import java.util.List;
import java.util.Optional;


@Controller
@RequestMapping("/clients")
@ResponseBody
public class ClientAdminController {
    @Autowired
    private ClientRepository clientRepository;

    @GetMapping("/admin/")
    public String admin(){
        Iterable<Client> clients = clientRepository.findAll();
        String tmp = "clients";
        if (clients != null) {
            tmp = clients.toString();
        }
        return tmp;
    }
}
