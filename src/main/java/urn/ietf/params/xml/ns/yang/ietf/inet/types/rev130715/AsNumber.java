package urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715;
import java.io.Serializable;
import java.beans.ConstructorProperties;
import com.google.common.base.Preconditions;
import java.util.Objects;

/**
 * The as-number type represents autonomous system numbers
 *       which identify an Autonomous System (AS).  An AS is a set
 *       of routers under a single technical administration, using
 *       an interior gateway protocol and common metrics to route
 *       packets within the AS, and using an exterior gateway
 *       protocol to route packets to other ASes.  IANA maintains
 *       the AS number space and has delegated large parts to the
 *       regional registries.
 * 
 *       Autonomous system numbers were originally limited to 16
 *       bits.  BGP extensions have enlarged the autonomous system
 *       number space to 32 bits.  This type therefore uses an uint32
 *       base type without a range restriction in order to support
 *       a larger autonomous system number space.
 * 
 *       In the value set and its semantics, this type is equivalent
 *       to the InetAutonomousSystemNumber textual convention of
 *       the SMIv2.
 *
 */
public class AsNumber
 implements Serializable {
    private static final long serialVersionUID = 3880971349126258475L;
    private final java.lang.Long _value;

    private static void check_valueRange(final long value) {
        if (value >= 0L && value <= 4294967295L) {
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
    }

    @ConstructorProperties("value")
    public AsNumber(java.lang.Long _value) {
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
    public AsNumber(AsNumber source) {
        this._value = source._value;
    }

    public static AsNumber getDefaultInstance(String defaultValue) {
        return new AsNumber(java.lang.Long.valueOf(defaultValue));
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
        AsNumber other = (AsNumber) obj;
        if (!Objects.equals(_value, other._value)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.AsNumber.class.getSimpleName()).append(" [");
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

