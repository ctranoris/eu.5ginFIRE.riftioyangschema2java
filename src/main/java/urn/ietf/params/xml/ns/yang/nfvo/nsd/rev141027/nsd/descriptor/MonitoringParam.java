package urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.MonitoringParamAggregation;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.MonitoringParamUiData;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.MonitoringParamValue;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdDescriptor;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.MonitoringParamBuilder.MonitoringParamImpl;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.monitoring.param.VnfdMonitoringParam;
import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.catalog.VnfdBuilder.VnfdImpl;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of monitoring parameters from VNFs that should be propogated up into NSR
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>nsd</b>
 * <pre>
 * list monitoring-param {
 *     key "id"
 *     leaf id {
 *         type string;
 *     }
 *     leaf name {
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
 *     leaf aggregation-type {
 *         type aggregation-type;
 *     }
 *     list vnfd-monitoring-param {
 *         key "member-vnf-index-ref" 
 *     "vnfd-monitoring-param-ref"
 *         leaf vnfd-id-ref {
 *             type leafref;
 *         }
 *         leaf vnfd-monitoring-param-ref {
 *             type leafref;
 *         }
 *         leaf member-vnf-index-ref {
 *             type leafref;
 *         }
 *     }
 *     uses monitoring-param-aggregation;
 *     uses monitoring-param-ui-data;
 *     uses monitoring-param-value;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>nsd/nsd-descriptor/monitoring-param</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.MonitoringParamBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.MonitoringParamBuilder
 * @see urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.MonitoringParamKey
 *
 */
@JsonIgnoreProperties( {"http-endpoint-ref", "json-query-method"} )
@JsonDeserialize(as = MonitoringParamImpl.class)
public interface MonitoringParam
    extends
    ChildOf<NsdDescriptor>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.MonitoringParam>,
    MonitoringParamAggregation,
    MonitoringParamUiData,
    MonitoringParamValue,
    Identifiable<MonitoringParamKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsd",
        "2014-10-27", "monitoring-param").intern();

    /**
     * Identifier for a monitoring parameter
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    java.lang.String getId();
    
    /**
     * Name of the monitoring parameter
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * A list of VNFD monitoring params
     *
     *
     *
     * @return <code>java.util.List</code> <code>vnfdMonitoringParam</code>, or <code>null</code> if not present
     */
    List<VnfdMonitoringParam> getVnfdMonitoringParam();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.MonitoringParamKey</code> <code>key</code>, or <code>null</code> if not present
     */
    MonitoringParamKey getKey();

}

