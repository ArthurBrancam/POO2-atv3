package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * BookController
 */
@Controller
@RequestMapping("/app")
public class BookController {

    @Autowired
    private BookService bs;

    @GetMapping("/Cadastro")
    public String c(){
        return "Cadastro";
    }

    @PostMapping("/Cadastro")
    public ModelAndView cadastraForm(@ModelAttribute Book book) {
        System.out.println(book);
        boolean insert;
        ModelAndView mv = new ModelAndView("Cadastro");
        insert = bs.addBook(book);
        System.out.println(book);
        mv.addObject("livros", bs.getBooks());
        mv.addObject("ins", insert); 
        
        return mv;
    }

    public ModelAndView getBooks() {
        ModelAndView mv = new ModelAndView("Cadastro");
            mv.addObject("livros", bs.getBooks());
        return mv;
    }

}