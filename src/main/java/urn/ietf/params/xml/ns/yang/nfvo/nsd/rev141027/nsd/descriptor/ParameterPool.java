package urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdDescriptor;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.parameter.pool.Range;

/**
 * Pool of parameter values from which to choose during configuration.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>nsd</b>
 * <pre>
 * list parameter-pool {
 *     key "name"
 *     leaf name {
 *         type string;
 *     }
 *     container range {
 *         leaf start-value {
 *             type uint32;
 *         }
 *         leaf end-value {
 *             type uint32;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>nsd/nsd-descriptor/parameter-pool</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.ParameterPoolBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.ParameterPoolBuilder
 * @see urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.ParameterPoolKey
 *
 */
public interface ParameterPool
    extends
    ChildOf<NsdDescriptor>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.ParameterPool>,
    Identifiable<ParameterPoolKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsd",
        "2014-10-27", "parameter-pool").intern();

    /**
     * Name of the configuration value pool
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * Create a range of values from which to populate the pool with
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.parameter.pool.Range</code> <code>range</code>, or <code>null</code> if not present
     */
    Range getRange();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.ParameterPoolKey</code> <code>key</code>, or <code>null</code> if not present
     */
    ParameterPoolKey getKey();

}

