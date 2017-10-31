package urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715;
import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Preconditions;

/**
 * The port-number type represents a 16-bit port number of an
 *       Internet transport-layer protocol such as UDP, TCP, DCCP, or
 *       SCTP.  Port numbers are assigned by IANA.  A current list of
 *       all assignments is available from &amp;lt;http://www.iana.org/&amp;gt;.
 * 
 *       Note that the port number value zero is reserved by IANA.  In
 *       situations where the value zero does not make sense, it can
 *       be excluded by subtyping the port-number type.
 *       In the value set and its semantics, this type is equivalent
 *       to the InetPortNumber textual convention of the SMIv2.
 *
 */
public class PortNumber
 implements Serializable {
    private static final long serialVersionUID = -5341082755708920855L;
    

    @JsonProperty("value")        
    private final java.lang.String _value;

    private static void check_valueRange(final int value) {
        if (value >= 0 && value <= 65535) {
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..65535]].", value));
    }


    public PortNumber() {
    	_value = "";
    }
    public PortNumber(java.lang.Integer v) {
    	this._value = v+"";
    }
    //@ConstructorProperties("value")
    public PortNumber(String v) {
    	
    	java.lang.Integer _value = java.lang.Integer.valueOf( v );
    	
    	
        if (_value != null) {
            check_valueRange(_value);
            }
    
    
        Preconditions.checkNotNull(_value, "Supplied value may not be null");
    
    
        this._value = v;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
//    public PortNumber(PortNumber source) {
//        this._value = source._value;
//    }

    public static PortNumber getDefaultInstance(String defaultValue) {
        return new PortNumber( defaultValue );
    }

    public java.lang.String getValue() {
        return _value;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_value);
        return result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        PortNumber other = (PortNumber) obj;
        if (!Objects.equals(_value, other._value)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.PortNumber.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_value != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_value=");
            builder.append(_value);
        }
        return builder.append(']').toString();
    }
}

