/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TMoney.Entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

/**
 *
 * @author ipsis
 */
@Entity(name = "PersonneEnvoyant")
@Table(name = "PersonneSend")
public class PersonneEnvoyant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersonneEnvoyant;

    @Column(nullable = false)
    private String nom;
    
    @Column(nullable = false)
    private String prenom;
    
    @Column(nullable = false)
    @NotNull
    private String email;
    
    @Column(nullable = false)
    @NotNull
    @Length(min=6, max=15)
    private String motDePasse;
    
    @Column(nullable = false)
    private String sexe;
    
    @Column(nullable = false)
    private String matrimonial;
    
     @Column(nullable = false)
    private String telephone;
    
    @Column(nullable = false)
    private Long totalPoint;

    @Column(nullable = false)
    @NotNull
    private Boolean status;
    
    @Column(nullable = false)
    private Date naissance;

    protected PersonneEnvoyant() {
        // no-args constructor required by JPA spec
        // this one is protected since it shouldn't be used directly
    }

    public PersonneEnvoyant(String nom, String prenom, Long totalPoint, String email, String motDePasse, String matrimonial,
            Date naissance, Boolean status, String sexe, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.totalPoint = totalPoint;
        this.email = email;
        this.motDePasse = motDePasse;
        this.matrimonial = matrimonial;
        this.naissance = naissance;
        this.status = status;
        this.sexe = sexe;
        this.telephone = telephone;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the motDePasse
     */
    public String getMotDePasse() {
        return motDePasse;
    }

    /**
     * @param motDePasse the motDePasse to set
     */
    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    /**
     * @return the sexe
     */
    public String getSexe() {
        return sexe;
    }

    /**
     * @param sexe the sexe to set
     */
    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    /**
     * @return the matrimonial
     */
    public String getMatrimonial() {
        return matrimonial;
    }

    /**
     * @param matrimonial the matrimonial to set
     */
    public void setMatrimonial(String matrimonial) {
        this.matrimonial = matrimonial;
    }

    /**
     * @return the telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * @param telephone the telephone to set
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * @return the totalPoint
     */
    public Long getTotalPoint() {
        return totalPoint;
    }

    /**
     * @param totalPoint the totalPoint to set
     */
    public void setTotalPoint(Long totalPoint) {
        this.totalPoint = totalPoint;
    }

    /**
     * @return the status
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * @return the naissance
     */
    public Date getNaissance() {
        return naissance;
    }

    /**
     * @param naissance the naissance to set
     */
    public void setNaissance(Date naissance) {
        this.naissance = naissance;
    }    
}