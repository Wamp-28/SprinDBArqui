package com.example.SprinDBArqui.Interfaces;

import com.example.SprinDBArqui.Model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersona extends JpaRepository<Persona, Integer> {



}
