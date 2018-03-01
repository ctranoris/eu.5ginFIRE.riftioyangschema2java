package urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715;
import java.beans.ConstructorProperties;
import java.io.Serializable;

import com.google.common.base.Preconditions;

/**
 * An IPv6 address without a zone index.  This type, derived from
 *        ipv6-address, may be used in situations where the zone is
 *        known from the context and hence no zone index is needed.
 *
 */
public class Ipv6AddressNoZone extends Ipv6Address
 implements Serializable {
    private static final long serialVersionUID = -8132834319977195251L;


    @ConstructorProperties("value")
    public Ipv6AddressNoZone(java.lang.String _value) {
        super(_value);
    
    
        Preconditions.checkNotNull(_value, "Supplied value may not be null");
    
    
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public Ipv6AddressNoZone(Ipv6AddressNoZone source) {
        super(source);
    }
    /**
     * Creates a new instance from Ipv6Address
     *
     * @param source Source object
     */
    public Ipv6AddressNoZone(Ipv6Address source) {
            super(source);
    }

    public static Ipv6AddressNoZone getDefaultInstance(String defaultValue) {
        return new Ipv6AddressNoZone(defaultValue);
    }





}

