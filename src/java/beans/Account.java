/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.persistence.*;

/**
 * Classe représentant un compte bancaire
 * @author Valentin LECOUPLE & Yann Toqué
 */
@Entity
public class Account {
    /**
     * Numéro du compte. PK de la table
     */
    @Id
    @Column(nullable = false, length = 11)
    private String accountNumber;
    
    /**
     * Label du compte
     */
    @Column(nullable = false)
    private String label;
    
    /**
     * IBAN du compte. Maximum de 27 caractères
     */
    @Column(nullable = false, length = 27)
    private String IBAN;
    
    /**
     * Agence à laquelle le compte est lié
     */
    @Column(nullable = false)
    private BankBranch bankBranch;
    
    /**
     * Somme d'argent présente sur le compte
     */
    @Column(nullable = false)
    private double totalMoney;
}
