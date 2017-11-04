/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TMoney.Controllers;

import TMoney.dao.IPersonneEnvoyantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ipsis
 */
@RestController
public class PersonneController {
    
    @Autowired
    private IPersonneEnvoyantRepository personneEnvRepository;
    
    @RequestMapping("/test")
    public String Tests(){
        return "Thierno Aliou";
    }
    
}
