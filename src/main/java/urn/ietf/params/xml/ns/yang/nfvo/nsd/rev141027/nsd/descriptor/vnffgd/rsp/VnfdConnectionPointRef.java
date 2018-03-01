package urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.vnffgd.rsp;
import java.math.BigInteger;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.vnffgd.Rsp;

/**
 * A list of references to connection points.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>nsd</b>
 * <pre>
 * list vnfd-connection-point-ref {
 *     key "member-vnf-index-ref"
 *     leaf member-vnf-index-ref {
 *         type leafref;
 *     }
 *     leaf order {
 *         type uint8;
 *     }
 *     leaf vnfd-id-ref {
 *         type leafref;
 *     }
 *     leaf vnfd-connection-point-ref {
 *         type leafref;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>nsd/nsd-descriptor/vnffgd/rsp/vnfd-connection-point-ref</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.vnffgd.rsp.VnfdConnectionPointRefBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.vnffgd.rsp.VnfdConnectionPointRefBuilder
 * @see urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.vnffgd.rsp.VnfdConnectionPointRefKey
 *
 */
public interface VnfdConnectionPointRef
    extends
    ChildOf<Rsp>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.vnffgd.rsp.VnfdConnectionPointRef>,
    Identifiable<VnfdConnectionPointRefKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsd",
        "2014-10-27", "vnfd-connection-point-ref").intern();

    /**
     * Reference to member-vnf within constituent-vnfds
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>memberVnfIndexRef</code>, or <code>null</code> if not present
     */
    BigInteger getMemberVnfIndexRef();
    
    /**
     * A number that denotes the order of a VNF in a chain
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>order</code>, or <code>null</code> if not present
     */
    java.lang.Short getOrder();
    
    /**
     * A reference to a vnfd
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnfdIdRef</code>, or <code>null</code> if not present
     */
    java.lang.Object getVnfdIdRef();
    
    /**
     * A reference to a connection point name
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnfdConnectionPointRef</code>, or <code>null</code> if not present
     */
    java.lang.Object getVnfdConnectionPointRef();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.vnffgd.rsp.VnfdConnectionPointRefKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VnfdConnectionPointRefKey getKey();

}

