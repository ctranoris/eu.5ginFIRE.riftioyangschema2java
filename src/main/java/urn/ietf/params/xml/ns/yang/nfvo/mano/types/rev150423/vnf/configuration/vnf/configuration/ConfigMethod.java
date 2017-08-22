package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration;
import org.opendaylight.yangtools.yang.binding.DataContainer;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Defines the configuration method for the VNF.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * choice config-method {
 *     case juju {
 *         container juju {
 *             leaf charm {
 *                 type string;
 *             }
 *         }
 *     }
 *     case netconf {
 *         container netconf {
 *             leaf target {
 *                 type enumeration;
 *             }
 *             leaf protocol {
 *                 type enumeration;
 *             }
 *             leaf port {
 *                 type port-number;
 *             }
 *         }
 *     }
 *     case rest {
 *         container rest {
 *             leaf port {
 *                 type port-number;
 *             }
 *         }
 *     }
 *     case script {
 *         container script {
 *             leaf script-type {
 *                 type enumeration;
 *             }
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mano-types/vnf-configuration/vnf-configuration/config-method</i>
 *
 */
public interface ConfigMethod
    extends
    DataContainer
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2015-04-23", "config-method").intern();


}

