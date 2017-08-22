package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.value.NumericConstraints;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.value.TextConstraints;

import java.math.BigDecimal;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping monitoring-param-value {
 *     leaf value-type {
 *         type value-type;
 *     }
 *     container numeric-constraints {
 *         leaf min-value {
 *             type uint64;
 *         }
 *         leaf max-value {
 *             type uint64;
 *         }
 *     }
 *     container text-constraints {
 *         leaf min-length {
 *             type uint8;
 *         }
 *         leaf max-length {
 *             type uint8;
 *         }
 *     }
 *     leaf value-integer {
 *         type int64;
 *     }
 *     leaf value-decimal {
 *         type decimal64;
 *     }
 *     leaf value-string {
 *         type string;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mano-types/monitoring-param-value</i>
 *
 */
public interface MonitoringParamValue
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2015-04-23", "monitoring-param-value").intern();

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ParamValueType</code> <code>valueType</code>, or <code>null</code> if not present
     */
    ParamValueType getValueType();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.value.NumericConstraints</code> <code>numericConstraints</code>, or <code>null</code> if not present
     */
    NumericConstraints getNumericConstraints();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.value.TextConstraints</code> <code>textConstraints</code>, or <code>null</code> if not present
     */
    TextConstraints getTextConstraints();
    
    /**
     * Current value for an integer parameter
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>valueInteger</code>, or <code>null</code> if not present
     */
    java.lang.Long getValueInteger();
    
    /**
     * Current value for a decimal parameter
     *
     *
     *
     * @return <code>java.math.BigDecimal</code> <code>valueDecimal</code>, or <code>null</code> if not present
     */
    BigDecimal getValueDecimal();
    
    /**
     * Current value for a string parameter
     *
     *
     *
     * @return <code>java.lang.String</code> <code>valueString</code>, or <code>null</code> if not present
     */
    java.lang.String getValueString();

}

