/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.persistence.*;

/**
 * Classe représentant un client de la banque
 * @author Valentin LECOUPLE & Yann Toqué
 */
@Entity
public class Client{
    
    /**
     * Numéro du client. PK de la table
     */
    @Id
    @Column(nullable = false, length = 8)
    private String clientNumber;
    
    /**
     * Nom de fammilee du client
     */
    @Column(nullable = false)
    private String lastName;
    
    /**
     * Prénom du client
     */
    @Column(nullable = false)
    private String firstName;
    
    /**
     * Date de naissance du client
     */
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private String birthDate;
}
