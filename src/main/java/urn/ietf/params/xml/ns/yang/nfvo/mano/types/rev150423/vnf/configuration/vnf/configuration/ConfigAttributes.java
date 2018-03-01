package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration;
import java.math.BigInteger;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.VnfConfiguration;

/**
 * Miscellaneous input parameters to be considered while processing the NSD to 
 * apply configuration
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container config-attributes {
 *     leaf config-priority {
 *         type uint64;
 *     }
 *     leaf config-delay {
 *         type uint64;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mano-types/vnf-configuration/vnf-configuration/config-attributes</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.ConfigAttributesBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.ConfigAttributesBuilder
 *
 */
public interface ConfigAttributes
    extends
    ChildOf<VnfConfiguration>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.ConfigAttributes>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2015-04-23", "config-attributes").intern();

    /**
     * Configuration priority - order of configuration to be applied to each VNF in 
     * this NS. A low number takes precedence over a high number
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>configPriority</code>, or <code>null</code> if not present
     */
    BigInteger getConfigPriority();
    
    /**
     * Wait (seconds) before applying the configuration to VNF
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>configDelay</code>, or <code>null</code> if not present
     */
    BigInteger getConfigDelay();

}

