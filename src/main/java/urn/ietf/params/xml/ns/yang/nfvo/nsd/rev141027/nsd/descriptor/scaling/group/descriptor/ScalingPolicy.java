package urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.scaling.group.descriptor;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.ScalingCriteriaOperation;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.ScalingPolicyType;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.ScalingGroupDescriptor;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.scaling.group.descriptor.scaling.policy.ScalingCriteria;

import java.util.List;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>nsd</b>
 * <pre>
 * list scaling-policy {
 *     key "name"
 *     leaf name {
 *         type string;
 *     }
 *     leaf scaling-type {
 *         type scaling-policy-type;
 *     }
 *     leaf enabled {
 *         type enabled;
 *     }
 *     leaf scale-in-operation-type {
 *         type scale-in-operation-type;
 *     }
 *     leaf scale-out-operation-type {
 *         type scale-out-operation-type;
 *     }
 *     leaf threshold-time {
 *         type uint32;
 *     }
 *     leaf cooldown-time {
 *         type uint32;
 *     }
 *     list scaling-criteria {
 *         key "name"
 *         leaf name {
 *             type string;
 *         }
 *         leaf scale-in-threshold {
 *             type uint64;
 *         }
 *         leaf scale-out-threshold {
 *             type uint64;
 *         }
 *         leaf ns-monitoring-param-ref {
 *             type leafref;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>nsd/nsd-descriptor/scaling-group-descriptor/scaling-policy</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.scaling.group.descriptor.ScalingPolicyBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.scaling.group.descriptor.ScalingPolicyBuilder
 * @see urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.scaling.group.descriptor.ScalingPolicyKey
 *
 */
public interface ScalingPolicy
    extends
    ChildOf<ScalingGroupDescriptor>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.scaling.group.descriptor.ScalingPolicy>,
    Identifiable<ScalingPolicyKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsd",
        "2014-10-27", "scaling-policy").intern();

    /**
     * Name of the scaling policy
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * Type of scaling
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.ScalingPolicyType</code> <code>scalingType</code>, or <code>null</code> if not present
     */
    ScalingPolicyType getScalingType();
    
    /**
     * Specifies if the scaling policy can be applied
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>enabled</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isEnabled();
    
    /**
     * Operation to be applied to check between scaling criterias to check if the scale
     * in threshold condition has been met. Defaults to AND
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.ScalingCriteriaOperation</code> <code>scaleInOperationType</code>, or <code>null</code> if not present
     */
    ScalingCriteriaOperation getScaleInOperationType();
    
    /**
     * Operation to be applied to check between scaling criterias to check if the scale
     * out threshold condition has been met. Defaults to OR
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.ScalingCriteriaOperation</code> <code>scaleOutOperationType</code>, or <code>null</code> if not present
     */
    ScalingCriteriaOperation getScaleOutOperationType();
    
    /**
     * The duration for which the criteria must hold true
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>thresholdTime</code>, or <code>null</code> if not present
     */
    java.lang.Long getThresholdTime();
    
    /**
     * The duration after a scaling-in/scaling-out action has been triggered, for which
     * there will be no further scaling activity
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>cooldownTime</code>, or <code>null</code> if not present
     */
    java.lang.Long getCooldownTime();
    
    /**
     * list of conditions to be met for generating scaling requests
     *
     *
     *
     * @return <code>java.util.List</code> <code>scalingCriteria</code>, or <code>null</code> if not present
     */
    List<ScalingCriteria> getScalingCriteria();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.scaling.group.descriptor.ScalingPolicyKey</code> <code>key</code>, or <code>null</code> if not present
     */
    ScalingPolicyKey getKey();

}

