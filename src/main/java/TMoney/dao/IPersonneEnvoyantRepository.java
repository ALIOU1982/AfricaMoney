/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TMoney.dao;

import TMoney.Entities.PersonneEnvoyant;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ipsis
 */
public interface IPersonneEnvoyantRepository extends JpaRepository<PersonneEnvoyant, Long> {
    
}