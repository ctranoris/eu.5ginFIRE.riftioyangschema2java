package urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715;
import java.io.Serializable;
import java.beans.ConstructorProperties;
import com.google.common.base.Preconditions;
import java.util.Objects;

/**
 * The gauge32 type represents a non-negative integer, which
 *       may increase or decrease, but shall never exceed a maximum
 *       value, nor fall below a minimum value.  The maximum value
 *       cannot be greater than 2^32-1 (4294967295 decimal), and
 *       the minimum value cannot be smaller than 0.  The value of
 *       a gauge32 has its maximum value whenever the information
 *       being modeled is greater than or equal to its maximum
 *       value, and has its minimum value whenever the information
 *       being modeled is smaller than or equal to its minimum value.
 *       If the information being modeled subsequently decreases
 *       below (increases above) the maximum (minimum) value, the
 *       gauge32 also decreases (increases).
 * 
 *       In the value set and its semantics, this type is equivalent
 *       to the Gauge32 type of the SMIv2.
 *
 */
public class Gauge32
 implements Serializable {
    private static final long serialVersionUID = 479794927691891393L;
    private final java.lang.Long _value;

    private static void check_valueRange(final long value) {
        if (value >= 0L && value <= 4294967295L) {
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
    }

    @ConstructorProperties("value")
    public Gauge32(java.lang.Long _value) {
        if (_value != null) {
            check_valueRange(_value);
            }
    
    
        Preconditions.checkNotNull(_value, "Supplied value may not be null");
    
    
        this._value = _value;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public Gauge32(Gauge32 source) {
        this._value = source._value;
    }

    public static Gauge32 getDefaultInstance(String defaultValue) {
        return new Gauge32(java.lang.Long.valueOf(defaultValue));
    }

    public java.lang.Long getValue() {
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
        Gauge32 other = (Gauge32) obj;
        if (!Objects.equals(_value, other._value)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Gauge32.class.getSimpleName()).append(" [");
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

