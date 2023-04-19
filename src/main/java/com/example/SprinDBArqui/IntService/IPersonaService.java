package com.example.SprinDBArqui.IntService;


import com.example.SprinDBArqui.Model.Persona;

import java.util.List;
import java.util.Optional;

public interface IPersonaService {

    // AQUI SE PROGRAMAN TODOS LOS METODOS QUE VOY A UTILIZAR

    public List<Persona> listar();

    public Optional<Persona> listarId(int id);

    public int guardar(Persona per);

    public void eliminar(int id);


}
