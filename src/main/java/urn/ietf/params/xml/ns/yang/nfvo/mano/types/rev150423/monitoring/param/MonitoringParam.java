package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.JsonQueryMethod;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.MonitoringParamUiData;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.MonitoringParamValue;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.monitoring.param.JsonQueryParams;

/**
 * List of monitoring parameters at the network service level
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list monitoring-param {
 *     key "id"
 *     leaf id {
 *         type string;
 *     }
 *     leaf name {
 *         type string;
 *     }
 *     leaf http-endpoint-ref {
 *         type leafref;
 *     }
 *     leaf json-query-method {
 *         type json-query-method;
 *     }
 *     container json-query-params {
 *         leaf json-path {
 *             type string;
 *         }
 *         leaf object-path {
 *             type string;
 *         }
 *     }
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
 *     uses monitoring-param-ui-data;
 *     uses monitoring-param-value;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mano-types/monitoring-param/monitoring-param</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.MonitoringParamBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.MonitoringParamBuilder
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.MonitoringParamKey
 *
 */
public interface MonitoringParam
    extends
    ChildOf<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.MonitoringParam>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.MonitoringParam>,
    MonitoringParamUiData,
    MonitoringParamValue,
    Identifiable<MonitoringParamKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2015-04-23", "monitoring-param").intern();

    /**
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    java.lang.String getId();
    
    /**
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * @return <code>java.lang.String</code> <code>httpEndpointRef</code>, or <code>null</code> if not present
     */
    java.lang.String getHttpEndpointRef();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.JsonQueryMethod</code> <code>jsonQueryMethod</code>, or <code>null</code> if not present
     */
    JsonQueryMethod getJsonQueryMethod();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.monitoring.param.JsonQueryParams</code> <code>jsonQueryParams</code>, or <code>null</code> if not present
     */
    JsonQueryParams getJsonQueryParams();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.MonitoringParamKey</code> <code>key</code>, or <code>null</code> if not present
     */
    MonitoringParamKey getKey();

}

