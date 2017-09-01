package urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.CommonConnectionPoint;
import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.VnfdDescriptor;
import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.ConnectionPointBuilder.ConnectionPointImpl;
import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.InternalVldBuilder.InternalVldImpl;

import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List for external connection points. Each VNF has one or more external 
 * connection points that connect the VNF to other VNFs or to external networks. 
 * Each VNF exposes connection points to the orchestrator, which can construct 
 * network services by connecting the connection points between different VNFs. 
 * NFVO will use VLDs and VNFFGs at the network service level to construct network 
 * services.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>vnfd</b>
 * <pre>
 * list connection-point {
 *     key "name"
 *     leaf name {
 *         type string;
 *     }
 *     leaf id {
 *         type string;
 *     }
 *     leaf short-name {
 *         type string;
 *     }
 *     leaf type {
 *         type connection-point-type;
 *     }
 *     leaf port-security-enabled {
 *         type boolean;
 *     }
 *     uses common-connection-point;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vnfd/vnfd-descriptor/connection-point</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.ConnectionPointBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.ConnectionPointBuilder
 * @see urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.ConnectionPointKey
 *
 */
@JsonDeserialize(as = ConnectionPointImpl.class)
public interface ConnectionPoint
    extends
    ChildOf<VnfdDescriptor>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.ConnectionPoint>,
    CommonConnectionPoint,
    Identifiable<ConnectionPointKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:vnfd",
        "2015-09-10", "connection-point").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.ConnectionPointKey</code> <code>key</code>, or <code>null</code> if not present
     */
    ConnectionPointKey getKey();

}

