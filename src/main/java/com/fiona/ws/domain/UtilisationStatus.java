/**
 * UtilisationStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fiona.ws.domain;

public class UtilisationStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected UtilisationStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NotSet = "NotSet";
    public static final java.lang.String _Red = "Red";
    public static final java.lang.String _Amber = "Amber";
    public static final java.lang.String _Green = "Green";
    public static final java.lang.String _Closed = "Closed";
    public static final UtilisationStatus NotSet = new UtilisationStatus(_NotSet);
    public static final UtilisationStatus Red = new UtilisationStatus(_Red);
    public static final UtilisationStatus Amber = new UtilisationStatus(_Amber);
    public static final UtilisationStatus Green = new UtilisationStatus(_Green);
    public static final UtilisationStatus Closed = new UtilisationStatus(_Closed);
    public java.lang.String getValue() { return _value_;}
    public static UtilisationStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        UtilisationStatus enumeration = (UtilisationStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static UtilisationStatus fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UtilisationStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.avenista.net/", "UtilisationStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
