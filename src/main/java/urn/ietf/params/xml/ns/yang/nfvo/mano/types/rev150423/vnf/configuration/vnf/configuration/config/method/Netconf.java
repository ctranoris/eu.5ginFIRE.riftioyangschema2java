package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.config.method;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.ConfigMethod;

/**
 * Use NETCONF for configuring the VNF.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * case netconf {
 *     container netconf {
 *         leaf target {
 *             type enumeration;
 *         }
 *         leaf protocol {
 *             type enumeration;
 *         }
 *         leaf port {
 *             type port-number;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mano-types/vnf-configuration/vnf-configuration/config-method/netconf</i>
 *
 */
public interface Netconf
    extends
    DataObject,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.config.method.Netconf>,
    ConfigMethod
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2015-04-23", "netconf").intern();

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.config.method.netconf.Netconf</code> <code>netconf</code>, or <code>null</code> if not present
     */
    urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.config.method.netconf.Netconf getNetconf();

}

