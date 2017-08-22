package urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.PlacementGroupInfo;
import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.VnfdDescriptor;
import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.placement.groups.MemberVdus;

import java.util.List;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of placement groups at VNF level
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>vnfd</b>
 * <pre>
 * list placement-groups {
 *     key "name"
 *     leaf name {
 *         type string;
 *     }
 *     leaf requirement {
 *         type string;
 *     }
 *     leaf strategy {
 *         type strategy;
 *     }
 *     list member-vdus {
 *         key "member-vdu-ref"
 *         leaf member-vdu-ref {
 *             type leafref;
 *         }
 *     }
 *     uses placement-group-info;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vnfd/vnfd-descriptor/placement-groups</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.PlacementGroupsBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.PlacementGroupsBuilder
 * @see urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.PlacementGroupsKey
 *
 */
public interface PlacementGroups
    extends
    ChildOf<VnfdDescriptor>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.PlacementGroups>,
    PlacementGroupInfo,
    Identifiable<PlacementGroupsKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:vnfd",
        "2015-09-10", "placement-groups").intern();

    /**
     * List of VDUs that are part of this placement group
     *
     *
     *
     * @return <code>java.util.List</code> <code>memberVdus</code>, or <code>null</code> if not present
     */
    List<MemberVdus> getMemberVdus();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.PlacementGroupsKey</code> <code>key</code>, or <code>null</code> if not present
     */
    PlacementGroupsKey getKey();

}

