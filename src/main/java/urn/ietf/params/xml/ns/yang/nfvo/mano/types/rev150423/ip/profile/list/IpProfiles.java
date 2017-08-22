package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ip.profile.list;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.IpProfileInfo;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.IpProfileList;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of IP Profiles. IP Profile describes the IP characteristics for the 
 * Virtual-Link
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list ip-profiles {
 *     key "name"
 *     leaf name {
 *         type string;
 *     }
 *     leaf description {
 *         type string;
 *     }
 *     container ip-profile-params {
 *         leaf ip-version {
 *             type ip-version;
 *         }
 *         leaf subnet-address {
 *             type ip-prefix;
 *         }
 *         leaf gateway-address {
 *             type ip-address;
 *         }
 *         leaf security-group {
 *             type string;
 *         }
 *         list dns-server {
 *             key "address"
 *             leaf address {
 *                 type ip-address;
 *             }
 *         }
 *         container dhcp-params {
 *             leaf enabled {
 *                 type enabled;
 *             }
 *             leaf start-address {
 *                 type ip-address;
 *             }
 *             leaf count {
 *                 type uint32;
 *             }
 *         }
 *         leaf subnet-prefix-pool {
 *             type string;
 *         }
 *     }
 *     uses ip-profile-info;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mano-types/ip-profile-list/ip-profiles</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ip.profile.list.IpProfilesBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ip.profile.list.IpProfilesBuilder
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ip.profile.list.IpProfilesKey
 *
 */
public interface IpProfiles
    extends
    ChildOf<IpProfileList>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ip.profile.list.IpProfiles>,
    IpProfileInfo,
    Identifiable<IpProfilesKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2015-04-23", "ip-profiles").intern();

    /**
     * Name of the IP-Profile
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * Description for IP profile
     *
     *
     *
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    java.lang.String getDescription();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ip.profile.list.IpProfilesKey</code> <code>key</code>, or <code>null</code> if not present
     */
    IpProfilesKey getKey();

}

