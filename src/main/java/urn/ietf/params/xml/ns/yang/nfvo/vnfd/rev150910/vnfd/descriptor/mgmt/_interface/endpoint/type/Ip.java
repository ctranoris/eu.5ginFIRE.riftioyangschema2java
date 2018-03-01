package urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.mgmt._interface.endpoint.type;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.mgmt._interface.EndpointType;

/**
 * Specifies the static IP address for managing the VNF.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>vnfd</b>
 * <pre>
 * case ip {
 *     leaf ip-address {
 *         type ip-address;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vnfd/vnfd-descriptor/mgmt-interface/endpoint-type/ip</i>
 *
 */
public interface Ip
    extends
    DataObject,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.mgmt._interface.endpoint.type.Ip>,
    EndpointType
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:vnfd",
        "2015-09-10", "ip").intern();

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>ipAddress</code>, or <code>null</code> if not present
     */
    IpAddress getIpAddress();

}

