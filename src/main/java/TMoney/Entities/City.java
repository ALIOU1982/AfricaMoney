/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TMoney.Entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author ipsis
 */
@Entity
public class City implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long identifiant;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String states;

    // ... additional members, often include @OneToMany mappings

    protected City() {
        // no-args constructor required by JPA spec
        // this one is protected since it shouldn't be used directly
    }

    public City(String name, String states) {
        this.name = name;
        this.states = states;
    }
    
  /*  public City(){
        super();
     }*/

    public String getName() {
        return this.name;
    }

    public String getStates() {
        return this.states;
    }

    // ... etc

}