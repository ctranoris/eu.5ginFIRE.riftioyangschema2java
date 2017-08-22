package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ip.profile.info.IpProfileParams;

/**
 * Grouping for IP-Profile
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping ip-profile-info {
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
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mano-types/ip-profile-info</i>
 *
 */
public interface IpProfileInfo
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2015-04-23", "ip-profile-info").intern();

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ip.profile.info.IpProfileParams</code> <code>ipProfileParams</code>, or <code>null</code> if not present
     */
    IpProfileParams getIpProfileParams();

}

