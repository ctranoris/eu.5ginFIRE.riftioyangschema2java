package urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715;
import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

import com.google.common.base.Preconditions;

/**
 * The gauge64 type represents a non-negative integer, which
 *       may increase or decrease, but shall never exceed a maximum
 *       value, nor fall below a minimum value.  The maximum value
 *       cannot be greater than 2^64-1 (18446744073709551615), and
 *       the minimum value cannot be smaller than 0.  The value of
 *       a gauge64 has its maximum value whenever the information
 *       being modeled is greater than or equal to its maximum
 *       value, and has its minimum value whenever the information
 *       being modeled is smaller than or equal to its minimum value.
 *       If the information being modeled subsequently decreases
 *       below (increases above) the maximum (minimum) value, the
 *       gauge64 also decreases (increases).
 * 
 *       In the value set and its semantics, this type is equivalent
 *       to the CounterBasedGauge64 SMIv2 textual convention defined
 *       in RFC 2856
 *
 */
public class Gauge64
 implements Serializable {
    private static final long serialVersionUID = 5150183143609367620L;
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
    public Gauge64(BigInteger _value) {
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
    public Gauge64(Gauge64 source) {
        this._value = source._value;
    }

    public static Gauge64 getDefaultInstance(String defaultValue) {
        return new Gauge64(new BigInteger(defaultValue));
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
        Gauge64 other = (Gauge64) obj;
        if (!Objects.equals(_value, other._value)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Gauge64.class.getSimpleName()).append(" [");
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

