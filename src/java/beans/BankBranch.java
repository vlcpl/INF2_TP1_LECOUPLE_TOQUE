/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.persistence.*;
/**
 *
 * @author Valentin LECOUPLE & Yann Toqué
 */

/**
 * Cette classe correspond à l'Agence bancaire
 */
@Entity
public class BankBranch {
    
    /**
     * Clé primaire de l'entité BankBranch
     */
    @Id
    @Column(nullable = false, length = 5)
    private String code;
    
    /**
     * Adresse de la BankBranch
     */
    @Column(nullable = false)
    private String address;
}
