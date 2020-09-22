package org.gvozdetscky.sarafan.controller;

import org.gvozdetscky.sarafan.domain.User;
import org.gvozdetscky.sarafan.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

/**
 * @author Egor Gvozdetscky
 */
@Controller
@RequestMapping("/")
public class MainController {

    private MessageRepository messageRepository;

    @Autowired
    public MainController(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @GetMapping
    public String mainPage(Model model, @AuthenticationPrincipal User user) {
        HashMap<Object, Object> data = new HashMap<>();

        data.put("profile", user);
        data.put("messages", messageRepository.findAll());

        model.addAttribute("frontendData", data);
        return "index";
    }
}
