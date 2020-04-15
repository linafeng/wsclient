/**
 * RestaurantUtilisationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fiona.ws.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Setter;


@Setter
@XmlRootElement(name="GetRestaurantUtilisationResult")
public class RestaurantUtilisationResponse  implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 2609563972137176321L;
	@XmlElement(name = "ReportName")
	private java.lang.String reportName;
	@XmlElement(name = "RestaurantsUtilisation")
    private RestaurantUtilisation[] restaurantsUtilisation;

    public RestaurantUtilisationResponse() {
    }

    public RestaurantUtilisationResponse(
           java.lang.String reportName,
           RestaurantUtilisation[] restaurantsUtilisation) {
           this.reportName = reportName;
           this.restaurantsUtilisation = restaurantsUtilisation;
    }





   

   

    
   

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RestaurantUtilisationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.avenista.net/", "RestaurantUtilisationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.avenista.net/", "ReportName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restaurantsUtilisation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.avenista.net/", "RestaurantsUtilisation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.avenista.net/", "RestaurantUtilisation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.avenista.net/", "RestaurantUtilisation"));
        typeDesc.addFieldDesc(elemField);
    }




}
