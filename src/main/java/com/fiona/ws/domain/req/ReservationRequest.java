/**
 * ReservationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fiona.ws.domain.req;

import com.fiona.ws.domain.GuestInformation;

import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
public class ReservationRequest  implements java.io.Serializable {
   
	private static final long serialVersionUID = -3802373372663450513L;

	private java.lang.String restaurantID;

    private java.util.Calendar requestedDateTime;

    private short partySize;

    private GuestInformation mainParty;

    private GuestInformation[] otherParties;

   // private Limit[] limits;

   // private java.lang.String bookingContext;

   

   
}
