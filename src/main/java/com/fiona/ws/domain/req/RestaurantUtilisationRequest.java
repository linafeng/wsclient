/**
 * RestaurantUtilisationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fiona.ws.domain.req;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.fiona.ws.pms.JaxbDateSerializer;

import lombok.Setter;
@Setter
@XmlRootElement(name="RestaurantUtilisationRequest")
public class RestaurantUtilisationRequest  implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2488576998678040800L;
	
	@XmlElementWrapper(name="RestaurantIDs")
	@XmlElement(name="string")
    private java.lang.String[] restaurantIDs;
	@XmlElement(name="DataPoint")
	@XmlJavaTypeAdapter(JaxbDateSerializer.class)  
    private java.util.Calendar dataPoint;
	@XmlElement(name="Options")		
    private UtilisationRequestOptions options;

    public RestaurantUtilisationRequest() {
    }

    public RestaurantUtilisationRequest(
           java.lang.String[] restaurantIDs,
           java.util.Calendar dataPoint,
           UtilisationRequestOptions options) {
           this.restaurantIDs = restaurantIDs;
           this.dataPoint = dataPoint;
           this.options = options;
    }


}
