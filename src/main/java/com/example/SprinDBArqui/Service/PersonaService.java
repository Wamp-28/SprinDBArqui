package com.example.SprinDBArqui.Service;

import com.example.SprinDBArqui.IntService.IPersonaService;
import com.example.SprinDBArqui.Interfaces.IPersona;
import com.example.SprinDBArqui.Model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService implements IPersonaService {


    // AQUI SE IMPLEMENTA DE IPERSONASERVICE QUE ES DONDE ESTAN TODOS LOS METODOS

    @Autowired
    private IPersona data;  // se inyecta el repository


    @Override
    public List<Persona> listar() {
        return data.findAll();
    }

    @Override
    public Optional<Persona> listarId(int id) {
        return Optional.empty();
    }

    @Override
    public int guardar(Persona per) {
        return 0;
    }

    @Override
    public void eliminar(int id) {

    }
}
