package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ip.profile.info.ip.profile.params;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ip.profile.info.IpProfileParams;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list dns-server {
 *     key "address"
 *     leaf address {
 *         type ip-address;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mano-types/ip-profile-info/ip-profile-params/dns-server</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ip.profile.info.ip.profile.params.DnsServerBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ip.profile.info.ip.profile.params.DnsServerBuilder
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ip.profile.info.ip.profile.params.DnsServerKey
 *
 */
public interface DnsServer
    extends
    ChildOf<IpProfileParams>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ip.profile.info.ip.profile.params.DnsServer>,
    Identifiable<DnsServerKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2015-04-23", "dns-server").intern();

    /**
     * List of DNS Servers associated with IP Profile
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>address</code>, or <code>null</code> if not present
     */
    IpAddress getAddress();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ip.profile.info.ip.profile.params.DnsServerKey</code> <code>key</code>, or <code>null</code> if not present
     */
    DnsServerKey getKey();

}

