/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.tallermueblesjta.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lorespitia_24
 */
@Entity
@XmlRootElement
public class Factura {
    
    @Id
    private int idFactura;
    private int valorFactura;
    private ClienteTienda clienteTienda;
    private Date fecha;

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public int getValorFactura() {
        return valorFactura;
    }

    public void setValorFactura(int valorFactura) {
        this.valorFactura = valorFactura;
    }

    public ClienteTienda getClienteTienda() {
        return clienteTienda;
    }

    public void setClienteTienda(ClienteTienda clienteTienda) {
        this.clienteTienda = clienteTienda;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
}
