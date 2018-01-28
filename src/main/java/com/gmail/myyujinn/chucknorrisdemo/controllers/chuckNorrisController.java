package com.gmail.myyujinn.chucknorrisdemo.controllers;

import com.gmail.myyujinn.chucknorrisdemo.services.ChuckNorrisRandomQuote;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class chuckNorrisController {

    private ChuckNorrisRandomQuote chuckNorrisRandomQuote;

    public chuckNorrisController(ChuckNorrisRandomQuote chuckNorrisRandomQuote) {
        this.chuckNorrisRandomQuote = chuckNorrisRandomQuote;
    }

    @RequestMapping("/")
    public String quotes(Model model) {

        model.addAttribute("quote", chuckNorrisRandomQuote.sayQuote());

        return "chucknorris";
    }

}
