/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.tallermueblesjta.persistencia;

import co.edu.uptc.sw2.tallermueblesjta.entities.Factura;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author USER-LENOVO
 */
@Stateless
public class FacturaDao {
   @PersistenceContext
    private EntityManager em;
    
    public List<Factura> listaFactura(){
    String query="Select e from Factura e";
    return em.createQuery(query).getResultList();
    }
    
    public Factura guardarFactura(Factura factura){
     em.persist(factura);
    return factura;
    } 
    public Factura editarFactura(Factura factura) {
        em.merge(factura);
        return factura;
    }

    public Factura eliminarFactura(Factura factura) {
        em.remove(factura);
        return factura;
    }
}
