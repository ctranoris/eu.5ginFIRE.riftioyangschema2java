package urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715;
import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.util.Objects;

import com.google.common.base.Preconditions;

/**
 * This type represents an XPATH 1.0 expression.
 * 
 *       When a schema node is defined that uses this type, the
 *       description of the schema node MUST specify the XPath
 *       context in which the XPath expression is evaluated.
 *
 */
public class Xpath10
 implements Serializable {
    private static final long serialVersionUID = -7666326053651229181L;
    private final java.lang.String _value;


    @ConstructorProperties("value")
    public Xpath10(java.lang.String _value) {
    
    
        Preconditions.checkNotNull(_value, "Supplied value may not be null");
    
    
        this._value = _value;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public Xpath10(Xpath10 source) {
        this._value = source._value;
    }

    public static Xpath10 getDefaultInstance(String defaultValue) {
        return new Xpath10(defaultValue);
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
        Xpath10 other = (Xpath10) obj;
        if (!Objects.equals(_value, other._value)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Xpath10.class.getSimpleName()).append(" [");
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

