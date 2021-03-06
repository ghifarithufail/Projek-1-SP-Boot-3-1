/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spboot.MotorTuaMuseum.services;

import com.spboot.MotorTuaMuseum.interfaces.RsvInterface;
import com.spboot.MotorTuaMuseum.models.Rsv;
import com.spboot.MotorTuaMuseum.repositories.RsvRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Asus
 */
@Service
public class RsvService implements RsvInterface {

    
    @Override
public Rsv getById(long id) {
  Optional < Rsv > optional = rsvRepository.findById(id);

  if (!optional.isPresent()) {
    throw new RuntimeException(" Rsv not found for id :: " + id);
  }

  Rsv rsv = optional.get();
  return rsv;
}

@Override
public void delete(long id) {
  this.rsvRepository.deleteById(id);
}
    @Autowired
    private RsvRepository rsvRepository;
    
    @Override
    public List<Rsv> getAll() {
        return rsvRepository.findAll();
    }

    @Override
    public void store(Rsv rsv) {
        this.rsvRepository.save(rsv);
    }
}
