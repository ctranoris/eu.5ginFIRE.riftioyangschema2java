package urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715;
import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;

/**
 * The object-identifier type represents administratively
 *       assigned names in a registration-hierarchical-name tree.
 * 
 *       Values of this type are denoted as a sequence of numerical
 *       non-negative sub-identifier values.  Each sub-identifier
 *       value MUST NOT exceed 2^32-1 (4294967295).  Sub-identifiers
 *       are separated by single dots and without any intermediate
 *       whitespace.
 * 
 *       The ASN.1 standard restricts the value space of the first
 *       sub-identifier to 0, 1, or 2.  Furthermore, the value space
 *       of the second sub-identifier is restricted to the range
 *       0 to 39 if the first sub-identifier is 0 or 1.  Finally,
 *       the ASN.1 standard requires that an object identifier
 *       has always at least two sub-identifiers.  The pattern
 *       captures these restrictions.
 * 
 *       Although the number of sub-identifiers is not limited,
 *       module designers should realize that there may be
 *       implementations that stick with the SMIv2 limit of 128
 *       sub-identifiers.
 * 
 *       This type is a superset of the SMIv2 OBJECT IDENTIFIER type
 *       since it is not restricted to 128 sub-identifiers.  Hence,
 *       this type SHOULD NOT be used to represent the SMIv2 OBJECT
 *       IDENTIFIER type; the object-identifier-128 type SHOULD be
 *       used instead.
 *
 */
public class ObjectIdentifier
 implements Serializable {
    private static final long serialVersionUID = -3841231238929928407L;
    private static final Pattern[] patterns;
    public static final List<String> PATTERN_CONSTANTS = ImmutableList.of("^(([0-1](\\.[1-3]?[0-9]))|(2\\.(0|([1-9]\\d*))))(\\.(0|([1-9]\\d*)))*$");
    
    static {
        final Pattern a[] = new Pattern[PATTERN_CONSTANTS.size()];
        int i = 0;
        for (String regEx : PATTERN_CONSTANTS) {
            a[i++] = Pattern.compile(regEx);
        }
    
        patterns = a;
    }
    private final java.lang.String _value;

    private static void check_valueLength(final String value) {
    }

    @ConstructorProperties("value")
    public ObjectIdentifier(java.lang.String _value) {
        if (_value != null) {
            check_valueLength(_value);
            }
    
    
        Preconditions.checkNotNull(_value, "Supplied value may not be null");
    
            for (Pattern p : patterns) {
                Preconditions.checkArgument(p.matcher(_value).matches(), "Supplied value \"%s\" does not match required pattern \"%s\"", _value, p);
            }
    
        this._value = _value;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public ObjectIdentifier(ObjectIdentifier source) {
        this._value = source._value;
    }

    public static ObjectIdentifier getDefaultInstance(String defaultValue) {
        return new ObjectIdentifier(defaultValue);
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
        ObjectIdentifier other = (ObjectIdentifier) obj;
        if (!Objects.equals(_value, other._value)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.ObjectIdentifier.class.getSimpleName()).append(" [");
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

