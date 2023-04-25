package com.example.SprinDBArqui.Service;

import com.example.SprinDBArqui.InterfaceService.IPersonaService;
import com.example.SprinDBArqui.Interfaces.IPersona;
import com.example.SprinDBArqui.Model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    private IPersona data;
    @Override
    public List<Persona> listar() {
        return data.findAll();
    }
    @Override
    public Optional<Persona> listarId(int id) {
        return Optional.empty();
    }
    @Override
    public void guardar(Persona per) {
        data.save(per);
    }
    @Override
    public void eliminar(int id) {
        data.deleteById(id);
    }
}
