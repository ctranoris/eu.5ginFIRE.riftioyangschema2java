package urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715;
import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.util.Objects;

import com.google.common.base.Preconditions;

/**
 * The counter32 type represents a non-negative integer
 *       that monotonically increases until it reaches a
 *       maximum value of 2^32-1 (4294967295 decimal), when it
 *       wraps around and starts increasing again from zero.
 * 
 *       Counters have no defined 'initial' value, and thus, a
 *       single value of a counter has (in general) no information
 *       content.  Discontinuities in the monotonically increasing
 *       value normally occur at re-initialization of the
 *       management system, and at other times as specified in the
 *       description of a schema node using this type.  If such
 *       other times can occur, for example, the creation of
 *       a schema node of type counter32 at times other than
 *       re-initialization, then a corresponding schema node
 *       should be defined, with an appropriate type, to indicate
 *       the last discontinuity.
 * 
 *       The counter32 type should not be used for configuration
 *       schema nodes.  A default statement SHOULD NOT be used in
 *       combination with the type counter32.
 * 
 *       In the value set and its semantics, this type is equivalent
 *       to the Counter32 type of the SMIv2.
 *
 */
public class Counter32
 implements Serializable {
    private static final long serialVersionUID = -3046049553917040756L;
    private final java.lang.Long _value;

    private static void check_valueRange(final long value) {
        if (value >= 0L && value <= 4294967295L) {
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
    }

    @ConstructorProperties("value")
    public Counter32(java.lang.Long _value) {
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
    public Counter32(Counter32 source) {
        this._value = source._value;
    }

    public static Counter32 getDefaultInstance(String defaultValue) {
        return new Counter32(java.lang.Long.valueOf(defaultValue));
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
        Counter32 other = (Counter32) obj;
        if (!Objects.equals(_value, other._value)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Counter32.class.getSimpleName()).append(" [");
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

