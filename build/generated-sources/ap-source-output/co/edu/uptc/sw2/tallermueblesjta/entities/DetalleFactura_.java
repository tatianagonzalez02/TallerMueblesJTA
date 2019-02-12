package co.edu.uptc.sw2.tallermueblesjta.entities;

import co.edu.uptc.sw2.tallermueblesjta.entities.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-02-11T21:57:16")
@StaticMetamodel(DetalleFactura.class)
public class DetalleFactura_ { 

    public static volatile SingularAttribute<DetalleFactura, Producto> producto;
    public static volatile SingularAttribute<DetalleFactura, Integer> cantidad;
    public static volatile SingularAttribute<DetalleFactura, Integer> totalProducto;

}