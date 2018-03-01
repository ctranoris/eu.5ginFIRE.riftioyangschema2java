package urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.scaling.group.descriptor;
import java.math.BigInteger;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.ScalingGroupDescriptor;

/**
 * List of VNFs in this scaling group
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>nsd</b>
 * <pre>
 * list vnfd-member {
 *     key "member-vnf-index-ref"
 *     leaf member-vnf-index-ref {
 *         type leafref;
 *     }
 *     leaf count {
 *         type count;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>nsd/nsd-descriptor/scaling-group-descriptor/vnfd-member</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.scaling.group.descriptor.VnfdMemberBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.scaling.group.descriptor.VnfdMemberBuilder
 * @see urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.scaling.group.descriptor.VnfdMemberKey
 *
 */
public interface VnfdMember
    extends
    ChildOf<ScalingGroupDescriptor>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.scaling.group.descriptor.VnfdMember>,
    Identifiable<VnfdMemberKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsd",
        "2014-10-27", "vnfd-member").intern();

    /**
     * Member VNF index of this member VNF
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>memberVnfIndexRef</code>, or <code>null</code> if not present
     */
    BigInteger getMemberVnfIndexRef();
    
    /**
     * Count of this member VNF within this scaling group. The count defines the number
     * of instances when a scaling action targets this scaling group.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>count</code>, or <code>null</code> if not present
     */
    java.lang.Long getCount();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.scaling.group.descriptor.VnfdMemberKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VnfdMemberKey getKey();

}

