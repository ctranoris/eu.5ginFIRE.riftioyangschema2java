package urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.vld.catalog.vld;
import java.math.BigInteger;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.vld.catalog.Vld;

/**
 * A list of references to connection points.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>vld</b>
 * <pre>
 * list vnfd-connection-point-ref {
 *     key "vnfd-ref" 
 * "member-vnf-index-ref"
 *     leaf vnfd-ref {
 *         type leafref;
 *     }
 *     leaf member-vnf-index-ref {
 *         type uint64;
 *     }
 *     leaf vnfd-connection-point-ref {
 *         type leafref;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vld/vld-catalog/vld/vnfd-connection-point-ref</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.vld.catalog.vld.VnfdConnectionPointRefBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.vld.catalog.vld.VnfdConnectionPointRefBuilder
 * @see urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.vld.catalog.vld.VnfdConnectionPointRefKey
 *
 */
public interface VnfdConnectionPointRef
    extends
    ChildOf<Vld>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.vld.catalog.vld.VnfdConnectionPointRef>,
    Identifiable<VnfdConnectionPointRefKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:vld",
        "2015-09-10", "vnfd-connection-point-ref").intern();

    /**
     * A reference to a vnfd
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vnfdRef</code>, or <code>null</code> if not present
     */
    java.lang.String getVnfdRef();
    
    /**
     * A reference to the consituent-vnfd id in nsd. Should have been a leafref to: 
     * '/nsd:nsd-catalog:/nsd:nsd/constituent-vnfd/member-vnf-index-ref'. Instead using
     * direct leaf to avoid circular reference.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>memberVnfIndexRef</code>, or <code>null</code> if not present
     */
    BigInteger getMemberVnfIndexRef();
    
    /**
     * A reference to a connection point name in a vnfd
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
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.vld.catalog.vld.VnfdConnectionPointRefKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VnfdConnectionPointRefKey getKey();

}

