package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.guest.epa.guest.epa.numa.policy.numa.aware;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.guest.epa.GuestEpa;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.Node;

import java.util.List;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * This policy defines NUMA topology of the guest. Specifically identifies if the 
 * guest should be run on a host with one NUMA node or multiple NUMA nodes. As an 
 * example a guest might need 8 VCPUs and 4 GB of memory. However, it might need 
 * the VCPUs and memory distributed across multiple NUMA nodes. In this scenario, 
 * NUMA node 1 could run with 6 VCPUs and 3GB, and NUMA node 2 could run with 2 
 * VCPUs and 1GB.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container numa-node-policy {
 *     leaf node-cnt {
 *         type uint16;
 *     }
 *     leaf mem-policy {
 *         type enumeration;
 *     }
 *     list node {
 *         key "id"
 *         leaf id {
 *             type uint64;
 *         }
 *         list vcpu {
 *             key "id"
 *             leaf id {
 *                 type uint64;
 *             }
 *         }
 *         leaf memory-mb {
 *             type uint64;
 *         }
 *         choice om-numa-type {
 *             case cores {
 *                 leaf num-cores {
 *                     type uint8;
 *                 }
 *             }
 *             case paired-threads {
 *                 container paired-threads {
 *                     leaf num-paired-threads {
 *                         type uint8;
 *                     }
 *                     list paired-thread-ids {
 *                         key "thread-a"
 *                         leaf thread-a {
 *                             type uint8;
 *                         }
 *                         leaf thread-b {
 *                             type uint8;
 *                         }
 *                     }
 *                 }
 *             }
 *             case threads {
 *                 leaf num-threads {
 *                     type uint8;
 *                 }
 *             }
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mano-types/guest-epa/guest-epa/numa-policy/numa-aware/numa-node-policy</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.guest.epa.guest.epa.numa.policy.numa.aware.NumaNodePolicyBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.guest.epa.guest.epa.numa.policy.numa.aware.NumaNodePolicyBuilder
 *
 */
public interface NumaNodePolicy
    extends
    ChildOf<GuestEpa>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.guest.epa.guest.epa.numa.policy.numa.aware.NumaNodePolicy>
{


    public enum MemPolicy {
        STRICT(0, "STRICT"),
        
        PREFERRED(1, "PREFERRED")
        ;
    
        private static final java.util.Map<java.lang.Integer, MemPolicy> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, MemPolicy> b = com.google.common.collect.ImmutableMap.builder();
            for (MemPolicy enumItem : MemPolicy.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private MemPolicy(int value, java.lang.String name) {
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
         * @return corresponding MemPolicy item
         */
        public static MemPolicy forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2015-04-23", "numa-node-policy").intern();

    /**
     * The number of NUMA nodes to expose to the VM.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>nodeCnt</code>, or <code>null</code> if not present
     */
    java.lang.Integer getNodeCnt();
    
    /**
     * This policy specifies how the memory should be allocated in a multi-node 
     * scenario. STRICT : The memory must be allocated strictly from the memory 
     * attached to the NUMA node. PREFERRED : The memory should be allocated 
     * preferentially from the memory attached to the NUMA node
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.guest.epa.guest.epa.numa.policy.numa.aware.NumaNodePolicy.MemPolicy</code> <code>memPolicy</code>, or <code>null</code> if not present
     */
    MemPolicy getMemPolicy();
    
    /**
     * @return <code>java.util.List</code> <code>node</code>, or <code>null</code> if not present
     */
    List<Node> getNode();

}

