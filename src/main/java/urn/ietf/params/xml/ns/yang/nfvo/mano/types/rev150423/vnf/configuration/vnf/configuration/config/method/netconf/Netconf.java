package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.config.method.netconf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.PortNumber;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.VnfConfiguration;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container netconf {
 *     leaf target {
 *         type enumeration;
 *     }
 *     leaf protocol {
 *         type enumeration;
 *     }
 *     leaf port {
 *         type port-number;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mano-types/vnf-configuration/vnf-configuration/config-method/netconf/netconf</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.config.method.netconf.NetconfBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.config.method.netconf.NetconfBuilder
 *
 */
public interface Netconf
    extends
    ChildOf<VnfConfiguration>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.config.method.netconf.Netconf>
{


    public enum Target {
        Running(0, "running"),
        
        Candidate(1, "candidate")
        ;
    
        private static final java.util.Map<java.lang.Integer, Target> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, Target> b = com.google.common.collect.ImmutableMap.builder();
            for (Target enumItem : Target.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private Target(int value, java.lang.String name) {
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
         * @return corresponding Target item
         */
        public static Target forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }
    
    public enum Protocol {
        None(0, "None"),
        
        Ssh(1, "ssh")
        ;
    
        private static final java.util.Map<java.lang.Integer, Protocol> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, Protocol> b = com.google.common.collect.ImmutableMap.builder();
            for (Protocol enumItem : Protocol.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private Protocol(int value, java.lang.String name) {
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
         * @return corresponding Protocol item
         */
        public static Protocol forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2015-04-23", "netconf").intern();

    /**
     * Netconf configuration target
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.config.method.netconf.Netconf.Target</code> <code>target</code>, or <code>null</code> if not present
     */
    Target getTarget();
    
    /**
     * Protocol to use for NETCONF, such as ssh
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.config.method.netconf.Netconf.Protocol</code> <code>protocol</code>, or <code>null</code> if not present
     */
    Protocol getProtocol();
    
    /**
     * Port for the NETCONF server.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.PortNumber</code> <code>port</code>, or <code>null</code> if not present
     */
    PortNumber getPort();

}

