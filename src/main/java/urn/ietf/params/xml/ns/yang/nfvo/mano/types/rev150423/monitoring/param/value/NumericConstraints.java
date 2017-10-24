package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.value;
import java.math.BigInteger;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.MonitoringParamValue;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container numeric-constraints {
 *     leaf min-value {
 *         type uint64;
 *     }
 *     leaf max-value {
 *         type uint64;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mano-types/monitoring-param-value/numeric-constraints</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.value.NumericConstraintsBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.value.NumericConstraintsBuilder
 *
 */
public interface NumericConstraints
    extends
    ChildOf<MonitoringParamValue>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.value.NumericConstraints>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2015-04-23", "numeric-constraints").intern();

    /**
     * Minimum value for the parameter
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>minValue</code>, or <code>null</code> if not present
     */
    BigInteger getMinValue();
    
    /**
     * Maximum value for the parameter
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>maxValue</code>, or <code>null</code> if not present
     */
    BigInteger getMaxValue();

}

