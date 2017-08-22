package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vswitch.epa;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container vswitch-epa {
 *     leaf ovs-acceleration {
 *         type enumeration;
 *     }
 *     leaf ovs-offload {
 *         type enumeration;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mano-types/vswitch-epa/vswitch-epa</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vswitch.epa.VswitchEpaBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vswitch.epa.VswitchEpaBuilder
 *
 */
public interface VswitchEpa
    extends
    ChildOf<VswitchEpa>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vswitch.epa.VswitchEpa>
{


    public enum OvsAcceleration {
        MANDATORY(0, "MANDATORY"),
        
        PREFERRED(1, "PREFERRED"),
        
        DISABLED(2, "DISABLED")
        ;
    
        private static final java.util.Map<java.lang.Integer, OvsAcceleration> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, OvsAcceleration> b = com.google.common.collect.ImmutableMap.builder();
            for (OvsAcceleration enumItem : OvsAcceleration.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private OvsAcceleration(int value, java.lang.String name) {
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
         * @return corresponding OvsAcceleration item
         */
        public static OvsAcceleration forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }
    
    public enum OvsOffload {
        MANDATORY(0, "MANDATORY"),
        
        PREFERRED(1, "PREFERRED"),
        
        DISABLED(2, "DISABLED")
        ;
    
        private static final java.util.Map<java.lang.Integer, OvsOffload> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, OvsOffload> b = com.google.common.collect.ImmutableMap.builder();
            for (OvsOffload enumItem : OvsOffload.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private OvsOffload(int value, java.lang.String name) {
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
         * @return corresponding OvsOffload item
         */
        public static OvsOffload forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2015-04-23", "vswitch-epa").intern();

    /**
     * Specifies Open vSwitch acceleration mode. MANDATORY: OVS acceleration is 
     * required PREFERRED: OVS acceleration is preferred
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vswitch.epa.VswitchEpa.OvsAcceleration</code> <code>ovsAcceleration</code>, or <code>null</code> if not present
     */
    OvsAcceleration getOvsAcceleration();
    
    /**
     * Specifies Open vSwitch hardware offload mode. MANDATORY: OVS offload is required
     * PREFERRED: OVS offload is preferred
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vswitch.epa.VswitchEpa.OvsOffload</code> <code>ovsOffload</code>, or <code>null</code> if not present
     */
    OvsOffload getOvsOffload();

}

