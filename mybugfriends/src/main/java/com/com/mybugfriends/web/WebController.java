package com.com.mybugfriends.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

    
    @Controller
    public class WebController {
    
        @GetMapping("/login")
        public String login() {
            return "login"; // palauttaa login.html
        }
    
        @GetMapping("/")
        public String index() {
            return "index"; // palauttaa index.html
        }
    
        @GetMapping("/etusivu")
        public String etusivu(Model model) {
            model.addAttribute("message", "Tervetuloa etusivulle!");
            return "etusivu"; // palauttaa etusivu.html
        }
    
        @GetMapping("/profiili")
        public String profiili(Model model) {
            // Esimerkki: lisää käyttäjänimi malliin
            model.addAttribute("username", "Käyttäjä123");
            return "profiili"; // palauttaa profiili.html
        }
    }
    
