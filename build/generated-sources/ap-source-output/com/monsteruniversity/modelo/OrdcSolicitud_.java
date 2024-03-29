package com.monsteruniversity.modelo;

import com.monsteruniversity.modelo.Bien;
import com.monsteruniversity.modelo.OrdcSolicitudPK;
import com.monsteruniversity.modelo.OrdenContractual;
import com.monsteruniversity.modelo.Solicitud;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-06-12T19:45:54")
@StaticMetamodel(OrdcSolicitud.class)
public class OrdcSolicitud_ { 

    public static volatile SingularAttribute<OrdcSolicitud, OrdcSolicitudPK> ordcSolicitudPK;
    public static volatile SingularAttribute<OrdcSolicitud, OrdenContractual> ordenContractual;
    public static volatile SingularAttribute<OrdcSolicitud, Solicitud> solicitud;
    public static volatile SingularAttribute<OrdcSolicitud, BigDecimal> ordcSolCantidadDespachada;
    public static volatile SingularAttribute<OrdcSolicitud, BigDecimal> ordcSolCantidadSolicitada;
    public static volatile SingularAttribute<OrdcSolicitud, Bien> bien;

}