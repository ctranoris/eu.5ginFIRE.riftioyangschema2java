package urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.scaling.group.descriptor;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.ScalingTrigger;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.ScalingGroupDescriptor;

/**
 * List of scaling config actions
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>nsd</b>
 * <pre>
 * list scaling-config-action {
 *     key "trigger"
 *     leaf trigger {
 *         type scaling-trigger;
 *     }
 *     leaf ns-config-primitive-name-ref {
 *         type leafref;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>nsd/nsd-descriptor/scaling-group-descriptor/scaling-config-action</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.scaling.group.descriptor.ScalingConfigActionBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.scaling.group.descriptor.ScalingConfigActionBuilder
 * @see urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.scaling.group.descriptor.ScalingConfigActionKey
 *
 */
public interface ScalingConfigAction
    extends
    ChildOf<ScalingGroupDescriptor>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.scaling.group.descriptor.ScalingConfigAction>,
    Identifiable<ScalingConfigActionKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsd",
        "2014-10-27", "scaling-config-action").intern();

    /**
     * Scaling trigger
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.ScalingTrigger</code> <code>trigger</code>, or <code>null</code> if not present
     */
    ScalingTrigger getTrigger();
    
    /**
     * Reference to the NS config name primitive
     *
     *
     *
     * @return <code>java.lang.String</code> <code>nsConfigPrimitiveNameRef</code>, or <code>null</code> if not present
     */
    java.lang.String getNsConfigPrimitiveNameRef();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.scaling.group.descriptor.ScalingConfigActionKey</code> <code>key</code>, or <code>null</code> if not present
     */
    ScalingConfigActionKey getKey();

}

