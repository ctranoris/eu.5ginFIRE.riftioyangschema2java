package urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.virtual._interface;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for the virtual interface properties
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>vnfd</b>
 * <pre>
 * container virtual-interface {
 *     leaf type {
 *         type type;
 *     }
 *     leaf vpci {
 *         type string;
 *     }
 *     leaf bandwidth {
 *         type uint64;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vnfd/virtual-interface/virtual-interface</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.virtual._interface.VirtualInterfaceBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.virtual._interface.VirtualInterfaceBuilder
 *
 */
public interface VirtualInterface
    extends
    ChildOf<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.VirtualInterface>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.virtual._interface.VirtualInterface>
{


    public enum Type {
        OMMGMT(0, "OM-MGMT"),
        
        PCIPASSTHROUGH(1, "PCI-PASSTHROUGH"),
        
        SRIOV(2, "SR-IOV"),
        
        VIRTIO(3, "VIRTIO"),
        
        E1000(4, "E1000"),
        
        RTL8139(5, "RTL8139"),
        
        PCNET(6, "PCNET")
        ;
    
        private static final java.util.Map<java.lang.Integer, Type> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, Type> b = com.google.common.collect.ImmutableMap.builder();
            for (Type enumItem : Type.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private Type(int value, java.lang.String name) {
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
         * @return corresponding Type item
         */
        public static Type forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:vnfd",
        "2015-09-10", "virtual-interface").intern();

    /**
     * Specifies the type of virtual interface between VM and host. VIRTIO : Use the 
     * traditional VIRTIO interface. PCI-PASSTHROUGH : Use PCI-PASSTHROUGH interface. 
     * SR-IOV : Use SR-IOV interface. E1000 : Emulate E1000 interface. RTL8139 : 
     * Emulate RTL8139 interface. PCNET : Emulate PCNET interface. OM-MGMT : Used to 
     * specify openmano mgmt external-connection type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.virtual._interface.VirtualInterface.Type</code> <code>type</code>, or <code>null</code> if not present
     */
    Type getType();
    
    /**
     * Specifies the virtual PCI address. Expressed in the following format 
     * dddd:dd:dd.d. For example 0000:00:12.0. This information can be used to pass as 
     * metadata during the VM creation.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vpci</code>, or <code>null</code> if not present
     */
    java.lang.String getVpci();
    
    /**
     * Aggregate bandwidth of the NIC.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>bandwidth</code>, or <code>null</code> if not present
     */
    BigInteger getBandwidth();

}

