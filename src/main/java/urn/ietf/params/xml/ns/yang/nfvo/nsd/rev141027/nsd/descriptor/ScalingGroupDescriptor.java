package urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdDescriptor;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.scaling.group.descriptor.ScalingConfigAction;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.scaling.group.descriptor.ScalingPolicy;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.scaling.group.descriptor.VnfdMember;

import java.util.List;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * Scaling group descriptor within this network service. The scaling group defines 
 * a group of VNFs, and the ratio of VNFs in the network service that is used as 
 * target for scaling action
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>nsd</b>
 * <pre>
 * list scaling-group-descriptor {
 *     key "name"
 *     leaf name {
 *         type string;
 *     }
 *     list scaling-policy {
 *         key "name"
 *         leaf name {
 *             type string;
 *         }
 *         leaf scaling-type {
 *             type scaling-policy-type;
 *         }
 *         leaf enabled {
 *             type enabled;
 *         }
 *         leaf scale-in-operation-type {
 *             type scale-in-operation-type;
 *         }
 *         leaf scale-out-operation-type {
 *             type scale-out-operation-type;
 *         }
 *         leaf threshold-time {
 *             type uint32;
 *         }
 *         leaf cooldown-time {
 *             type uint32;
 *         }
 *         list scaling-criteria {
 *             key "name"
 *             leaf name {
 *                 type string;
 *             }
 *             leaf scale-in-threshold {
 *                 type uint64;
 *             }
 *             leaf scale-out-threshold {
 *                 type uint64;
 *             }
 *             leaf ns-monitoring-param-ref {
 *                 type leafref;
 *             }
 *         }
 *     }
 *     list vnfd-member {
 *         key "member-vnf-index-ref"
 *         leaf member-vnf-index-ref {
 *             type leafref;
 *         }
 *         leaf count {
 *             type count;
 *         }
 *     }
 *     leaf min-instance-count {
 *         type min-instance-count;
 *     }
 *     leaf max-instance-count {
 *         type max-instance-count;
 *     }
 *     list scaling-config-action {
 *         key "trigger"
 *         leaf trigger {
 *             type scaling-trigger;
 *         }
 *         leaf ns-config-primitive-name-ref {
 *             type leafref;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>nsd/nsd-descriptor/scaling-group-descriptor</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.ScalingGroupDescriptorBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.ScalingGroupDescriptorBuilder
 * @see urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.ScalingGroupDescriptorKey
 *
 */
public interface ScalingGroupDescriptor
    extends
    ChildOf<NsdDescriptor>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.ScalingGroupDescriptor>,
    Identifiable<ScalingGroupDescriptorKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsd",
        "2014-10-27", "scaling-group-descriptor").intern();

    /**
     * Name of this scaling group.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * @return <code>java.util.List</code> <code>scalingPolicy</code>, or <code>null</code> if not present
     */
    List<ScalingPolicy> getScalingPolicy();
    
    /**
     * List of VNFs in this scaling group
     *
     *
     *
     * @return <code>java.util.List</code> <code>vnfdMember</code>, or <code>null</code> if not present
     */
    List<VnfdMember> getVnfdMember();
    
    /**
     * Minimum number of instances of the scaling group that are allowed in a single 
     * network service. These instances are created by default when the network service
     * is instantiated.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>minInstanceCount</code>, or <code>null</code> if not present
     */
    java.lang.Long getMinInstanceCount();
    
    /**
     * Maximum number of instances of this scaling group that are allowed in a single 
     * network service. The network service scaling fails when the number of service 
     * group instances exceeds the max-instance-count specified.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>maxInstanceCount</code>, or <code>null</code> if not present
     */
    java.lang.Long getMaxInstanceCount();
    
    /**
     * List of scaling config actions
     *
     *
     *
     * @return <code>java.util.List</code> <code>scalingConfigAction</code>, or <code>null</code> if not present
     */
    List<ScalingConfigAction> getScalingConfigAction();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.ScalingGroupDescriptorKey</code> <code>key</code>, or <code>null</code> if not present
     */
    ScalingGroupDescriptorKey getKey();

}

