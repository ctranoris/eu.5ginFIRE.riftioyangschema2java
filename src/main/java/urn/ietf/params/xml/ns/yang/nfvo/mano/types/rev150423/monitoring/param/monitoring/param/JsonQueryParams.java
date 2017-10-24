package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.monitoring.param;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.MonitoringParam;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container json-query-params {
 *     leaf json-path {
 *         type string;
 *     }
 *     leaf object-path {
 *         type string;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mano-types/monitoring-param/monitoring-param/json-query-params</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.monitoring.param.JsonQueryParamsBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.monitoring.param.JsonQueryParamsBuilder
 *
 */
public interface JsonQueryParams
    extends
    ChildOf<MonitoringParam>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.monitoring.param.JsonQueryParams>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2015-04-23", "json-query-params").intern();

    /**
     * The jsonpath to use to extract value from JSON structure
     *
     *
     *
     * @return <code>java.lang.String</code> <code>jsonPath</code>, or <code>null</code> if not present
     */
    java.lang.String getJsonPath();
    
    /**
     * The objectpath to use to extract value from JSON structure
     *
     *
     *
     * @return <code>java.lang.String</code> <code>objectPath</code>, or <code>null</code> if not present
     */
    java.lang.String getObjectPath();

}

