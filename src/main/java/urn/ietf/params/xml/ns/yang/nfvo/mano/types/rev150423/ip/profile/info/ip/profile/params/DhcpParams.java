package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ip.profile.info.ip.profile.params;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ip.profile.info.IpProfileParams;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container dhcp-params {
 *     leaf enabled {
 *         type enabled;
 *     }
 *     leaf start-address {
 *         type ip-address;
 *     }
 *     leaf count {
 *         type uint32;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mano-types/ip-profile-info/ip-profile-params/dhcp-params</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ip.profile.info.ip.profile.params.DhcpParamsBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ip.profile.info.ip.profile.params.DhcpParamsBuilder
 *
 */
public interface DhcpParams
    extends
    ChildOf<IpProfileParams>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ip.profile.info.ip.profile.params.DhcpParams>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2015-04-23", "dhcp-params").intern();

    /**
     * This flag indicates if DHCP is enabled or not
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>enabled</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isEnabled();
    
    /**
     * Start IP address of the IP-Address range associated with DHCP domain
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>startAddress</code>, or <code>null</code> if not present
     */
    IpAddress getStartAddress();
    
    /**
     * Size of the DHCP pool associated with DHCP domain
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>count</code>, or <code>null</code> if not present
     */
    java.lang.Long getCount();

}

