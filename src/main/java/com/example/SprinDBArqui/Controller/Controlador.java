package com.example.SprinDBArqui.Controller;

import com.example.SprinDBArqui.InterfaceService.IPersonaService;
import com.example.SprinDBArqui.Model.Persona;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping
public class Controlador {
    @Autowired
    private IPersonaService serv;

    @GetMapping("/listar")
    public String listar(Model model){

        model.addAttribute("titulo", "Spring DB");

        List<Persona> person = serv.listar();

        model.addAttribute("datos", person);

        return "index";
    }

    @GetMapping("/new")
    public String agregarPersona(Model model){

        //Persona per = new Persona();

        model.addAttribute("titulo", "Insertar Persona");
        model.addAttribute("cuerpo", "USUARIO NUEVO");

        model.addAttribute("persona", new Persona());

        return "nuevo";
    }

    @PostMapping("/guardar")
    public String guardarPersona(@ModelAttribute Persona per){

        serv.guardar(per);
        return "redirect:/listar";
    }
/*
    @DeleteMapping("/listar/{codigo}")
    public String eliminarPersona(@PathVariable("codigo") int id){

        serv.eliminar(id);
        return "redirect:/listar";

    }
*/
}
