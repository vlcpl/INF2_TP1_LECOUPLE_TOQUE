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
@Entity
public class Account {
    @Id
    @Column(nullable = false, length = 11)
    private String accountNumber;
    @Column(nullable = false)
    private String label;
    @Column(nullable = false, length = 27)
    private String IBAN;
    @Column(nullable = false)
    private BankBranch bankBranch;
    @Column(nullable = false)
    private double totalMoney;
}
