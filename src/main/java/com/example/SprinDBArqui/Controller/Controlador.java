package com.example.SprinDBArqui.Controller;

import com.example.SprinDBArqui.IntService.IPersonaService;
import com.example.SprinDBArqui.Model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class Controlador {

    @Autowired
    private IPersonaService serv;

    @GetMapping("/listar")
    public String listar(Model model){


        model.addAttribute("titulo", "Spring DB");
        model.addAttribute("cuerpo", "Usuarios");

        List<Persona> person = serv.listar();

        model.addAttribute("datos", person);

        return "index";
    }







}
