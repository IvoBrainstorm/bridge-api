/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.mz.bridge.resource;

import co.mz.bridge.model.Provincia;
import co.mz.bridge.repository.ProvinciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ivofe
 */

@RestController
@RequestMapping(value = "/localizacao")
public class ProvinciaResource {
    
    @Autowired
    ProvinciaRepository provinciaRepository;
    

    @GetMapping("/provincias")
    public List<Provincia> getProvincias(){
        return provinciaRepository.findAll();
    }
    
    @PostMapping("/provincia")
    public Provincia setProvincia(@RequestBody Provincia provincia){
        return provinciaRepository.save(provincia);
    }
}
