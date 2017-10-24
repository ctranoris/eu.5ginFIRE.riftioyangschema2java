package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.VnfConfiguration;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container config-access {
 *     leaf mgmt-ip-address {
 *         type ip-address;
 *     }
 *     leaf username {
 *         type string;
 *     }
 *     leaf password {
 *         type string;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mano-types/vnf-configuration/vnf-configuration/config-access</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.ConfigAccessBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.ConfigAccessBuilder
 *
 */
public interface ConfigAccess
    extends
    ChildOf<VnfConfiguration>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.ConfigAccess>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2015-04-23", "config-access").intern();

    /**
     * IP address to be used to configure this VNF, optional if it is possible to 
     * resolve dynamically.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>mgmtIpAddress</code>, or <code>null</code> if not present
     */
    IpAddress getMgmtIpAddress();
    
    /**
     * User name for configuration.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>username</code>, or <code>null</code> if not present
     */
    java.lang.String getUsername();
    
    /**
     * Password for configuration access authentication.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>password</code>, or <code>null</code> if not present
     */
    java.lang.String getPassword();

}

