package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping monitoring-param-ui-data {
 *     leaf description {
 *         type string;
 *     }
 *     leaf group-tag {
 *         type string;
 *     }
 *     leaf widget-type {
 *         type widget-type;
 *     }
 *     leaf units {
 *         type string;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mano-types/monitoring-param-ui-data</i>
 *
 */
public interface MonitoringParamUiData
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2015-04-23", "monitoring-param-ui-data").intern();

    /**
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    java.lang.String getDescription();
    
    /**
     * A tag to group monitoring parameters
     *
     *
     *
     * @return <code>java.lang.String</code> <code>groupTag</code>, or <code>null</code> if not present
     */
    java.lang.String getGroupTag();
    
    /**
     * Defines the UI Display variant of measured counters.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.WidgetType</code> <code>widgetType</code>, or <code>null</code> if not present
     */
    WidgetType getWidgetType();
    
    /**
     * Measured Counter Units (e.g., Packets, Kbps, Mbps, etc.)
     *
     *
     *
     * @return <code>java.lang.String</code> <code>units</code>, or <code>null</code> if not present
     */
    java.lang.String getUnits();

}

