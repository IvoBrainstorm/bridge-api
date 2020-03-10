/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.mz.bridge.repository;

import co.mz.bridge.model.Provincia;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Ivofe
 */
public interface ProvinciaRepository extends JpaRepository<Provincia, Long>{
    
}
