package urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715;
import java.io.Serializable;
import java.beans.ConstructorProperties;
import com.google.common.base.Preconditions;
import java.util.Objects;
import java.math.BigInteger;

/**
 * The counter64 type represents a non-negative integer
 *       that monotonically increases until it reaches a
 *       maximum value of 2^64-1 (18446744073709551615 decimal),
 *       when it wraps around and starts increasing again from zero.
 * 
 *       Counters have no defined 'initial' value, and thus, a
 *       single value of a counter has (in general) no information
 *       content.  Discontinuities in the monotonically increasing
 *       value normally occur at re-initialization of the
 *       management system, and at other times as specified in the
 *       description of a schema node using this type.  If such
 *       other times can occur, for example, the creation of
 *       a schema node of type counter64 at times other than
 *       re-initialization, then a corresponding schema node
 *       should be defined, with an appropriate type, to indicate
 *       the last discontinuity.
 * 
 *       The counter64 type should not be used for configuration
 *       schema nodes.  A default statement SHOULD NOT be used in
 *       combination with the type counter64.
 * 
 *       In the value set and its semantics, this type is equivalent
 *       to the Counter64 type of the SMIv2.
 *
 */
public class Counter64
 implements Serializable {
    private static final long serialVersionUID = -1099590625836683370L;
    private final BigInteger _value;

    private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECK_VALUERANGE_RANGES;
    static {
        @SuppressWarnings("unchecked")
        final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
        a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
        CHECK_VALUERANGE_RANGES = a;
    }
    private static void check_valueRange(final java.math.BigInteger value) {
        for (com.google.common.collect.Range<java.math.BigInteger> r : CHECK_VALUERANGE_RANGES) {
            if (r.contains(value)) {
                return;
            }
        }
        throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECK_VALUERANGE_RANGES)));
    }

    @ConstructorProperties("value")
    public Counter64(BigInteger _value) {
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
    public Counter64(Counter64 source) {
        this._value = source._value;
    }

    public static Counter64 getDefaultInstance(String defaultValue) {
        return new Counter64(new BigInteger(defaultValue));
    }

    public BigInteger getValue() {
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
        Counter64 other = (Counter64) obj;
        if (!Objects.equals(_value, other._value)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Counter64.class.getSimpleName()).append(" [");
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

