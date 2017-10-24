package urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.monitoring.param;
import java.math.BigInteger;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.MonitoringParam;

/**
 * A list of VNFD monitoring params
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>nsd</b>
 * <pre>
 * list vnfd-monitoring-param {
 *     key "member-vnf-index-ref" 
 * "vnfd-monitoring-param-ref"
 *     leaf vnfd-id-ref {
 *         type leafref;
 *     }
 *     leaf vnfd-monitoring-param-ref {
 *         type leafref;
 *     }
 *     leaf member-vnf-index-ref {
 *         type leafref;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>nsd/nsd-descriptor/monitoring-param/vnfd-monitoring-param</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.monitoring.param.VnfdMonitoringParamBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.monitoring.param.VnfdMonitoringParamBuilder
 * @see urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.monitoring.param.VnfdMonitoringParamKey
 *
 */
public interface VnfdMonitoringParam
    extends
    ChildOf<MonitoringParam>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.monitoring.param.VnfdMonitoringParam>,
    Identifiable<VnfdMonitoringParamKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsd",
        "2014-10-27", "vnfd-monitoring-param").intern();

    /**
     * A reference to a VNFD. This is a leafref
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnfdIdRef</code>, or <code>null</code> if not present
     */
    java.lang.Object getVnfdIdRef();
    
    /**
     * A reference to the VNFD monitoring param
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnfdMonitoringParamRef</code>, or <code>null</code> if not present
     */
    java.lang.Object getVnfdMonitoringParamRef();
    
    /**
     * Mandatory reference to member-vnf within constituent-vnfds
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>memberVnfIndexRef</code>, or <code>null</code> if not present
     */
    BigInteger getMemberVnfIndexRef();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.monitoring.param.VnfdMonitoringParamKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VnfdMonitoringParamKey getKey();

}

