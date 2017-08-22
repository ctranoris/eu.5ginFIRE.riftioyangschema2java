package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.provider.network;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for the provider network.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container provider-network {
 *     leaf physical-network {
 *         type string;
 *     }
 *     leaf overlay-type {
 *         type enumeration;
 *     }
 *     leaf segmentation_id {
 *         type uint32;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mano-types/provider-network/provider-network</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.provider.network.ProviderNetworkBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.provider.network.ProviderNetworkBuilder
 *
 */
public interface ProviderNetwork
    extends
    ChildOf<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ProviderNetwork>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.provider.network.ProviderNetwork>
{


    public enum OverlayType {
        LOCAL(0, "LOCAL"),
        
        FLAT(1, "FLAT"),
        
        VLAN(2, "VLAN"),
        
        VXLAN(3, "VXLAN"),
        
        GRE(4, "GRE")
        ;
    
        private static final java.util.Map<java.lang.Integer, OverlayType> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, OverlayType> b = com.google.common.collect.ImmutableMap.builder();
            for (OverlayType enumItem : OverlayType.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private OverlayType(int value, java.lang.String name) {
            this.value = value;
            this.name = name;
        }
    
        /**
         * Returns the name of the enumeration item as it is specified in the input yang.
         *
         * @return the name of the enumeration item as it is specified in the input yang
         */
        public java.lang.String getName() {
            return name;
        }
    
        /**
         * @return integer value
         */
        public int getIntValue() {
            return value;
        }
    
        /**
         * @param valueArg integer value
         * @return corresponding OverlayType item
         */
        public static OverlayType forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2015-04-23", "provider-network").intern();

    /**
     * Name of the physical network on which the provider network is built.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>physicalNetwork</code>, or <code>null</code> if not present
     */
    java.lang.String getPhysicalNetwork();
    
    /**
     * Type of the overlay network. LOCAL - Provider network implemented in a single 
     * compute node FLAT - Provider network shared by all tenants VLAN - Provider 
     * network implemented using 802.1Q tagging VXLAN - Provider networks implemented 
     * using RFC 7348 GRE - Provider networks implemented using GRE tunnels
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.provider.network.ProviderNetwork.OverlayType</code> <code>overlayType</code>, or <code>null</code> if not present
     */
    OverlayType getOverlayType();
    
    /**
     * ID of segregated virtual networks
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>segmentationId</code>, or <code>null</code> if not present
     */
    java.lang.Long getSegmentationId();

}

