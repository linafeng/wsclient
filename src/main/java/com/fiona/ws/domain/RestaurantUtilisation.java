/**
 * RestaurantUtilisation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fiona.ws.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class RestaurantUtilisation  implements java.io.Serializable {
    private java.lang.String restaurantID;

    private java.lang.String restaurantName;

    private RestaurantSessionType sessionType;

    private java.lang.String sessionTypeName;

    private java.util.Calendar sessionStartTime;

    private java.util.Calendar sessionLastArrivalTime;

    private java.util.Calendar sessionEndTime;

    private int timeSlotInterval;

    private DisplayPageType displayPage;

    private int displayListOrder;

    private ResUtilisationTimeSlot[] timeSlots;

    public RestaurantUtilisation() {
    }

    public RestaurantUtilisation(
           java.lang.String restaurantID,
           java.lang.String restaurantName,
           RestaurantSessionType sessionType,
           java.lang.String sessionTypeName,
           java.util.Calendar sessionStartTime,
           java.util.Calendar sessionLastArrivalTime,
           java.util.Calendar sessionEndTime,
           int timeSlotInterval,
           DisplayPageType displayPage,
           int displayListOrder,
           ResUtilisationTimeSlot[] timeSlots) {
           this.restaurantID = restaurantID;
           this.restaurantName = restaurantName;
           this.sessionType = sessionType;
           this.sessionTypeName = sessionTypeName;
           this.sessionStartTime = sessionStartTime;
           this.sessionLastArrivalTime = sessionLastArrivalTime;
           this.sessionEndTime = sessionEndTime;
           this.timeSlotInterval = timeSlotInterval;
           this.displayPage = displayPage;
           this.displayListOrder = displayListOrder;
           this.timeSlots = timeSlots;
    }


    /**
     * Gets the restaurantID value for this RestaurantUtilisation.
     * 
     * @return restaurantID
     */
    public java.lang.String getRestaurantID() {
        return restaurantID;
    }


    /**
     * Sets the restaurantID value for this RestaurantUtilisation.
     * 
     * @param restaurantID
     */
    public void setRestaurantID(java.lang.String restaurantID) {
        this.restaurantID = restaurantID;
    }


    /**
     * Gets the restaurantName value for this RestaurantUtilisation.
     * 
     * @return restaurantName
     */
    public java.lang.String getRestaurantName() {
        return restaurantName;
    }


    /**
     * Sets the restaurantName value for this RestaurantUtilisation.
     * 
     * @param restaurantName
     */
    public void setRestaurantName(java.lang.String restaurantName) {
        this.restaurantName = restaurantName;
    }


  

  






    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RestaurantUtilisation)) return false;
        RestaurantUtilisation other = (RestaurantUtilisation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.restaurantID==null && other.getRestaurantID()==null) || 
             (this.restaurantID!=null &&
              this.restaurantID.equals(other.getRestaurantID()))) &&
            ((this.restaurantName==null && other.getRestaurantName()==null) || 
             (this.restaurantName!=null &&
              this.restaurantName.equals(other.getRestaurantName()))) &&
            ((this.sessionType==null && other.getSessionType()==null) || 
             (this.sessionType!=null &&
              this.sessionType.equals(other.getSessionType()))) &&
            ((this.sessionTypeName==null && other.getSessionTypeName()==null) || 
             (this.sessionTypeName!=null &&
              this.sessionTypeName.equals(other.getSessionTypeName()))) &&
            ((this.sessionStartTime==null && other.getSessionStartTime()==null) || 
             (this.sessionStartTime!=null &&
              this.sessionStartTime.equals(other.getSessionStartTime()))) &&
            ((this.sessionLastArrivalTime==null && other.getSessionLastArrivalTime()==null) || 
             (this.sessionLastArrivalTime!=null &&
              this.sessionLastArrivalTime.equals(other.getSessionLastArrivalTime()))) &&
            ((this.sessionEndTime==null && other.getSessionEndTime()==null) || 
             (this.sessionEndTime!=null &&
              this.sessionEndTime.equals(other.getSessionEndTime()))) &&
            this.timeSlotInterval == other.getTimeSlotInterval() &&
            ((this.displayPage==null && other.getDisplayPage()==null) || 
             (this.displayPage!=null &&
              this.displayPage.equals(other.getDisplayPage()))) &&
            this.displayListOrder == other.getDisplayListOrder() &&
            ((this.timeSlots==null && other.getTimeSlots()==null) || 
             (this.timeSlots!=null &&
              java.util.Arrays.equals(this.timeSlots, other.getTimeSlots())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getRestaurantID() != null) {
            _hashCode += getRestaurantID().hashCode();
        }
        if (getRestaurantName() != null) {
            _hashCode += getRestaurantName().hashCode();
        }
        if (getSessionType() != null) {
            _hashCode += getSessionType().hashCode();
        }
        if (getSessionTypeName() != null) {
            _hashCode += getSessionTypeName().hashCode();
        }
        if (getSessionStartTime() != null) {
            _hashCode += getSessionStartTime().hashCode();
        }
        if (getSessionLastArrivalTime() != null) {
            _hashCode += getSessionLastArrivalTime().hashCode();
        }
        if (getSessionEndTime() != null) {
            _hashCode += getSessionEndTime().hashCode();
        }
        _hashCode += getTimeSlotInterval();
        if (getDisplayPage() != null) {
            _hashCode += getDisplayPage().hashCode();
        }
        _hashCode += getDisplayListOrder();
        if (getTimeSlots() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTimeSlots());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTimeSlots(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RestaurantUtilisation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.avenista.net/", "RestaurantUtilisation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restaurantID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.avenista.net/", "RestaurantID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restaurantName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.avenista.net/", "RestaurantName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.avenista.net/", "SessionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.avenista.net/", "RestaurantSessionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.avenista.net/", "SessionTypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.avenista.net/", "SessionStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionLastArrivalTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.avenista.net/", "SessionLastArrivalTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.avenista.net/", "SessionEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeSlotInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.avenista.net/", "TimeSlotInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayPage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.avenista.net/", "DisplayPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.avenista.net/", "DisplayPageType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayListOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.avenista.net/", "DisplayListOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeSlots");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.avenista.net/", "TimeSlots"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.avenista.net/", "ResUtilisationTimeSlot"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.avenista.net/", "ResUtilisationTimeSlot"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
