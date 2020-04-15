/**
 * ResUtilisationTimeSlot.java
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
public class ResUtilisationTimeSlot  implements java.io.Serializable {
    private java.util.Calendar timeSlotTime;

    private UtilisationStatus displayValue;

    private boolean utilisationOverridden;

    private UtilisationStatus originalDisplayValue;

    private double utilisationAsPercentage;

    private double availabilityAsPercentage;

    private int maxPhysicalCapacity;

    private int physicalUtilisation;

    private int OBMCoverLimitTS;

    private int OBMCoverLimitSitting;

    private int OBMCoverLimitSession;

    private int arrivalsCovers;

    private int OBMCoversCapacity;

    private double unallocatedUtilisation;

    private java.util.Calendar intersectionStart;

    private java.util.Calendar intersectionFinish;

    private int timeSlotStatus;

    public ResUtilisationTimeSlot() {
    }

    public ResUtilisationTimeSlot(
           java.util.Calendar timeSlotTime,
           UtilisationStatus displayValue,
           boolean utilisationOverridden,
           UtilisationStatus originalDisplayValue,
           double utilisationAsPercentage,
           double availabilityAsPercentage,
           int maxPhysicalCapacity,
           int physicalUtilisation,
           int OBMCoverLimitTS,
           int OBMCoverLimitSitting,
           int OBMCoverLimitSession,
           int arrivalsCovers,
           int OBMCoversCapacity,
           double unallocatedUtilisation,
           java.util.Calendar intersectionStart,
           java.util.Calendar intersectionFinish,
           int timeSlotStatus) {
           this.timeSlotTime = timeSlotTime;
           this.displayValue = displayValue;
           this.utilisationOverridden = utilisationOverridden;
           this.originalDisplayValue = originalDisplayValue;
           this.utilisationAsPercentage = utilisationAsPercentage;
           this.availabilityAsPercentage = availabilityAsPercentage;
           this.maxPhysicalCapacity = maxPhysicalCapacity;
           this.physicalUtilisation = physicalUtilisation;
           this.OBMCoverLimitTS = OBMCoverLimitTS;
           this.OBMCoverLimitSitting = OBMCoverLimitSitting;
           this.OBMCoverLimitSession = OBMCoverLimitSession;
           this.arrivalsCovers = arrivalsCovers;
           this.OBMCoversCapacity = OBMCoversCapacity;
           this.unallocatedUtilisation = unallocatedUtilisation;
           this.intersectionStart = intersectionStart;
           this.intersectionFinish = intersectionFinish;
           this.timeSlotStatus = timeSlotStatus;
    }


    /**
     * Gets the timeSlotTime value for this ResUtilisationTimeSlot.
     * 
     * @return timeSlotTime
     */
    public java.util.Calendar getTimeSlotTime() {
        return timeSlotTime;
    }


    /**
     * Sets the timeSlotTime value for this ResUtilisationTimeSlot.
     * 
     * @param timeSlotTime
     */
    public void setTimeSlotTime(java.util.Calendar timeSlotTime) {
        this.timeSlotTime = timeSlotTime;
    }


    /**
     * Gets the displayValue value for this ResUtilisationTimeSlot.
     * 
     * @return displayValue
     */
    public UtilisationStatus getDisplayValue() {
        return displayValue;
    }


    /**
     * Sets the displayValue value for this ResUtilisationTimeSlot.
     * 
     * @param displayValue
     */
    public void setDisplayValue(UtilisationStatus displayValue) {
        this.displayValue = displayValue;
    }


    /**
     * Gets the utilisationOverridden value for this ResUtilisationTimeSlot.
     * 
     * @return utilisationOverridden
     */
    public boolean isUtilisationOverridden() {
        return utilisationOverridden;
    }


    /**
     * Sets the utilisationOverridden value for this ResUtilisationTimeSlot.
     * 
     * @param utilisationOverridden
     */
    public void setUtilisationOverridden(boolean utilisationOverridden) {
        this.utilisationOverridden = utilisationOverridden;
    }


    /**
     * Gets the originalDisplayValue value for this ResUtilisationTimeSlot.
     * 
     * @return originalDisplayValue
     */
    public UtilisationStatus getOriginalDisplayValue() {
        return originalDisplayValue;
    }


    /**
     * Sets the originalDisplayValue value for this ResUtilisationTimeSlot.
     * 
     * @param originalDisplayValue
     */
    public void setOriginalDisplayValue(UtilisationStatus originalDisplayValue) {
        this.originalDisplayValue = originalDisplayValue;
    }



    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResUtilisationTimeSlot)) return false;
        ResUtilisationTimeSlot other = (ResUtilisationTimeSlot) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.timeSlotTime==null && other.getTimeSlotTime()==null) || 
             (this.timeSlotTime!=null &&
              this.timeSlotTime.equals(other.getTimeSlotTime()))) &&
            ((this.displayValue==null && other.getDisplayValue()==null) || 
             (this.displayValue!=null &&
              this.displayValue.equals(other.getDisplayValue()))) &&
            this.utilisationOverridden == other.isUtilisationOverridden() &&
            ((this.originalDisplayValue==null && other.getOriginalDisplayValue()==null) || 
             (this.originalDisplayValue!=null &&
              this.originalDisplayValue.equals(other.getOriginalDisplayValue()))) &&
            this.utilisationAsPercentage == other.getUtilisationAsPercentage() &&
            this.availabilityAsPercentage == other.getAvailabilityAsPercentage() &&
            this.maxPhysicalCapacity == other.getMaxPhysicalCapacity() &&
            this.physicalUtilisation == other.getPhysicalUtilisation() &&
            this.OBMCoverLimitTS == other.getOBMCoverLimitTS() &&
            this.OBMCoverLimitSitting == other.getOBMCoverLimitSitting() &&
            this.OBMCoverLimitSession == other.getOBMCoverLimitSession() &&
            this.arrivalsCovers == other.getArrivalsCovers() &&
            this.OBMCoversCapacity == other.getOBMCoversCapacity() &&
            this.unallocatedUtilisation == other.getUnallocatedUtilisation() &&
            ((this.intersectionStart==null && other.getIntersectionStart()==null) || 
             (this.intersectionStart!=null &&
              this.intersectionStart.equals(other.getIntersectionStart()))) &&
            ((this.intersectionFinish==null && other.getIntersectionFinish()==null) || 
             (this.intersectionFinish!=null &&
              this.intersectionFinish.equals(other.getIntersectionFinish()))) &&
            this.timeSlotStatus == other.getTimeSlotStatus();
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
        if (getTimeSlotTime() != null) {
            _hashCode += getTimeSlotTime().hashCode();
        }
        if (getDisplayValue() != null) {
            _hashCode += getDisplayValue().hashCode();
        }
        _hashCode += (isUtilisationOverridden() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getOriginalDisplayValue() != null) {
            _hashCode += getOriginalDisplayValue().hashCode();
        }
        _hashCode += new Double(getUtilisationAsPercentage()).hashCode();
        _hashCode += new Double(getAvailabilityAsPercentage()).hashCode();
        _hashCode += getMaxPhysicalCapacity();
        _hashCode += getPhysicalUtilisation();
        _hashCode += getOBMCoverLimitTS();
        _hashCode += getOBMCoverLimitSitting();
        _hashCode += getOBMCoverLimitSession();
        _hashCode += getArrivalsCovers();
        _hashCode += getOBMCoversCapacity();
        _hashCode += new Double(getUnallocatedUtilisation()).hashCode();
        if (getIntersectionStart() != null) {
            _hashCode += getIntersectionStart().hashCode();
        }
        if (getIntersectionFinish() != null) {
            _hashCode += getIntersectionFinish().hashCode();
        }
        _hashCode += getTimeSlotStatus();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResUtilisationTimeSlot.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.avenista.net/", "ResUtilisationTimeSlot"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeSlotTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.avenista.net/", "TimeSlotTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.avenista.net/", "DisplayValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.avenista.net/", "UtilisationStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("utilisationOverridden");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.avenista.net/", "UtilisationOverridden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalDisplayValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.avenista.net/", "OriginalDisplayValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.avenista.net/", "UtilisationStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("utilisationAsPercentage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.avenista.net/", "UtilisationAsPercentage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availabilityAsPercentage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.avenista.net/", "AvailabilityAsPercentage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxPhysicalCapacity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.avenista.net/", "MaxPhysicalCapacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("physicalUtilisation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.avenista.net/", "PhysicalUtilisation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OBMCoverLimitTS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.avenista.net/", "OBMCoverLimitTS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OBMCoverLimitSitting");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.avenista.net/", "OBMCoverLimitSitting"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OBMCoverLimitSession");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.avenista.net/", "OBMCoverLimitSession"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrivalsCovers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.avenista.net/", "ArrivalsCovers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OBMCoversCapacity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.avenista.net/", "OBMCoversCapacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unallocatedUtilisation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.avenista.net/", "UnallocatedUtilisation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intersectionStart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.avenista.net/", "IntersectionStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intersectionFinish");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.avenista.net/", "IntersectionFinish"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeSlotStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.avenista.net/", "TimeSlotStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
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
