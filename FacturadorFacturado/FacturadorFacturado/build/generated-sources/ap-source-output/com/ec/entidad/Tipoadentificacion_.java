package com.ec.entidad;

import com.ec.entidad.Cliente;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-14T16:10:14")
@StaticMetamodel(Tipoadentificacion.class)
public class Tipoadentificacion_ { 

    public static volatile SingularAttribute<Tipoadentificacion, String> tidCodigo;
    public static volatile SingularAttribute<Tipoadentificacion, Integer> idTipoIdentificacion;
    public static volatile SingularAttribute<Tipoadentificacion, String> tidNombre;
    public static volatile CollectionAttribute<Tipoadentificacion, Cliente> clienteCollection;

}