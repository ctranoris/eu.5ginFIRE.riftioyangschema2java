package urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.parameter.pool;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.ParameterPool;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Create a range of values from which to populate the pool with
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>nsd</b>
 * <pre>
 * container range {
 *     leaf start-value {
 *         type uint32;
 *     }
 *     leaf end-value {
 *         type uint32;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>nsd/nsd-descriptor/parameter-pool/range</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.parameter.pool.RangeBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.parameter.pool.RangeBuilder
 *
 */
public interface Range
    extends
    ChildOf<ParameterPool>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.parameter.pool.Range>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsd",
        "2014-10-27", "range").intern();

    /**
     * Generated pool values start at this value
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>startValue</code>, or <code>null</code> if not present
     */
    java.lang.Long getStartValue();
    
    /**
     * Generated pool values stop at this value
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>endValue</code>, or <code>null</code> if not present
     */
    java.lang.Long getEndValue();

}

