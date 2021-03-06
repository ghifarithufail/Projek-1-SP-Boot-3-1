/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spboot.MotorTuaMuseum.services;

import com.spboot.MotorTuaMuseum.interfaces.Data_diriInterface;
import com.spboot.MotorTuaMuseum.models.Data_diri;
import com.spboot.MotorTuaMuseum.repositories.Data_diriRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Asus
 */
@Service
public class Data_diriService implements Data_diriInterface {

    @Autowired
    private Data_diriRepository data_diriRepository;
    
    @Override
    public List<Data_diri> getAll() {
        return data_diriRepository.findAll();
    }

    @Override
    public void store(Data_diri data_diri) {
        this.data_diriRepository.save(data_diri);
    }
}
