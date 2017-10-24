package urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.placement.groups;
import java.math.BigInteger;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.PlacementGroups;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.placement.groups.MemberVnfdBuilder.MemberVnfdImpl;

/**
 * List of VNFDs that are part of this placement group
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>nsd</b>
 * <pre>
 * list member-vnfd {
 *     key "member-vnf-index-ref"
 *     leaf member-vnf-index-ref {
 *         type leafref;
 *     }
 *     leaf vnfd-id-ref {
 *         type leafref;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>nsd/nsd-descriptor/placement-groups/member-vnfd</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.placement.groups.MemberVnfdBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.placement.groups.MemberVnfdBuilder
 * @see urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.placement.groups.MemberVnfdKey
 *
 */
@JsonDeserialize(as = MemberVnfdImpl.class)
public interface MemberVnfd
    extends
    ChildOf<PlacementGroups>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.placement.groups.MemberVnfd>,
    Identifiable<MemberVnfdKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsd",
        "2014-10-27", "member-vnfd").intern();

    /**
     * Member VNF index of this member VNF
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>memberVnfIndexRef</code>, or <code>null</code> if not present
     */
    BigInteger getMemberVnfIndexRef();
    
    /**
     * Identifier for the VNFD.
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnfdIdRef</code>, or <code>null</code> if not present
     */
    java.lang.Object getVnfdIdRef();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.placement.groups.MemberVnfdKey</code> <code>key</code>, or <code>null</code> if not present
     */
    MemberVnfdKey getKey();

}

