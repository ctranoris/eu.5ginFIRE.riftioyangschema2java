package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping placement-group-info {
 *     leaf name {
 *         type string;
 *     }
 *     leaf requirement {
 *         type string;
 *     }
 *     leaf strategy {
 *         type strategy;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mano-types/placement-group-info</i>
 *
 */
public interface PlacementGroupInfo
    extends
    DataObject
{


    public enum Strategy {
        COLOCATION(0, "COLOCATION"),
        
        ISOLATION(1, "ISOLATION")
        ;
    
        private static final java.util.Map<java.lang.Integer, Strategy> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, Strategy> b = com.google.common.collect.ImmutableMap.builder();
            for (Strategy enumItem : Strategy.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private Strategy(int value, java.lang.String name) {
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
         * @return corresponding Strategy item
         */
        public static Strategy forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2015-04-23", "placement-group-info").intern();

    /**
     * Place group construct to define the compute resource placement strategy in cloud
     * environment
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * This is free text space used to describe the intent/rationale behind this 
     * placement group. This is for human consumption only
     *
     *
     *
     * @return <code>java.lang.String</code> <code>requirement</code>, or <code>null</code> if not present
     */
    java.lang.String getRequirement();
    
    /**
     * Strategy associated with this placement group Following values are possible - 
     * COLOCATION: Colocation strategy imply intent to share the physical 
     * infrastructure (hypervisor/network) among all members of this group. - 
     * ISOLATION: Isolation strategy imply intent to not share the physical 
     * infrastructure (hypervisor/network) among the members of this group. 
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.PlacementGroupInfo.Strategy</code> <code>strategy</code>, or <code>null</code> if not present
     */
    Strategy getStrategy();

}

