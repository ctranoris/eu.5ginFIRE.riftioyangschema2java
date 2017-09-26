package urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.placement.groups;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.PlacementGroups;
import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.PlacementGroupsBuilder.PlacementGroupsImpl;
import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.placement.groups.MemberVdusBuilder.MemberVdusImpl;

import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of VDUs that are part of this placement group
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>vnfd</b>
 * <pre>
 * list member-vdus {
 *     key "member-vdu-ref"
 *     leaf member-vdu-ref {
 *         type leafref;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vnfd/vnfd-descriptor/placement-groups/member-vdus</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.placement.groups.MemberVdusBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.placement.groups.MemberVdusBuilder
 * @see urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.placement.groups.MemberVdusKey
 *
 */
@JsonDeserialize(as = MemberVdusImpl.class)
public interface MemberVdus
    extends
    ChildOf<PlacementGroups>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.placement.groups.MemberVdus>,
    Identifiable<MemberVdusKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:vnfd",
        "2015-09-10", "member-vdus").intern();

    /**
     * @return <code>java.lang.String</code> <code>memberVduRef</code>, or <code>null</code> if not present
     */
    java.lang.String getMemberVduRef();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.placement.groups.MemberVdusKey</code> <code>key</code>, or <code>null</code> if not present
     */
    MemberVdusKey getKey();

}

