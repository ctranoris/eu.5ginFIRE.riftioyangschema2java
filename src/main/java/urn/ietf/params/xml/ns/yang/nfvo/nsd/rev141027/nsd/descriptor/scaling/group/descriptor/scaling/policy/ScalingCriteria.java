package urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.scaling.group.descriptor.scaling.policy;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.scaling.group.descriptor.ScalingPolicy;

import java.math.BigInteger;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * list of conditions to be met for generating scaling requests
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>nsd</b>
 * <pre>
 * list scaling-criteria {
 *     key "name"
 *     leaf name {
 *         type string;
 *     }
 *     leaf scale-in-threshold {
 *         type uint64;
 *     }
 *     leaf scale-out-threshold {
 *         type uint64;
 *     }
 *     leaf ns-monitoring-param-ref {
 *         type leafref;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>nsd/nsd-descriptor/scaling-group-descriptor/scaling-policy/scaling-criteria</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.scaling.group.descriptor.scaling.policy.ScalingCriteriaBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.scaling.group.descriptor.scaling.policy.ScalingCriteriaBuilder
 * @see urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.scaling.group.descriptor.scaling.policy.ScalingCriteriaKey
 *
 */
public interface ScalingCriteria
    extends
    ChildOf<ScalingPolicy>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.scaling.group.descriptor.scaling.policy.ScalingCriteria>,
    Identifiable<ScalingCriteriaKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsd",
        "2014-10-27", "scaling-criteria").intern();

    /**
     * Name of the scaling criteria
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * Value below which scale-in requests are generated (depends on monitoring 
     * parameters)
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>scaleInThreshold</code>, or <code>null</code> if not present
     */
    BigInteger getScaleInThreshold();
    
    /**
     * Value above which scale-out requests are generated (depends on monitoring 
     * parameters)
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>scaleOutThreshold</code>, or <code>null</code> if not present
     */
    BigInteger getScaleOutThreshold();
    
    /**
     * Reference to the NS level monitoring parameter that is aggregated
     *
     *
     *
     * @return <code>java.lang.String</code> <code>nsMonitoringParamRef</code>, or <code>null</code> if not present
     */
    java.lang.String getNsMonitoringParamRef();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.scaling.group.descriptor.scaling.policy.ScalingCriteriaKey</code> <code>key</code>, or <code>null</code> if not present
     */
    ScalingCriteriaKey getKey();

}

