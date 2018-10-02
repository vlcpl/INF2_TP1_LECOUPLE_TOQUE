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
public class Client{
    @Id
    @Column(nullable = false, length = 8)
    private String clientNumber;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private String birthDate;
}
