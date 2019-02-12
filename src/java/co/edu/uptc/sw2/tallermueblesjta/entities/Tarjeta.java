/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.tallermueblesjta.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author USER-LENOVO
 */
@Entity
@XmlRootElement
public class Tarjeta {
    @Id
    private int numeroTarjeta;
    private double cupoTarjeta;

    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public double getCupoTarjeta() {
        return cupoTarjeta;
    }

    public void setCupoTarjeta(double cupoTarjeta) {
        this.cupoTarjeta = cupoTarjeta;
    }
    
}
