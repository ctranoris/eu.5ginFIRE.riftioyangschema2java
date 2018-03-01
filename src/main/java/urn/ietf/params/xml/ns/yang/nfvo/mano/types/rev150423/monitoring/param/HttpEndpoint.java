package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param;
import java.util.List;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.PortNumber;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.HttpMethod;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.MonitoringParam;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.http.endpoint.Headers;

/**
 * List of http endpoints to be used by monitoring params
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list http-endpoint {
 *     key "path"
 *     leaf path {
 *         type string;
 *     }
 *     leaf https {
 *         type https;
 *     }
 *     leaf port {
 *         type port-number;
 *     }
 *     leaf username {
 *         type string;
 *     }
 *     leaf password {
 *         type string;
 *     }
 *     leaf polling-interval-secs {
 *         type polling-interval-secs;
 *     }
 *     leaf method {
 *         type method;
 *     }
 *     list headers {
 *         key "akey"
 *         leaf akey {
 *             type string;
 *         }
 *         leaf value {
 *             type string;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mano-types/monitoring-param/http-endpoint</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.HttpEndpointBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.HttpEndpointBuilder
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.HttpEndpointKey
 *
 */
public interface HttpEndpoint
    extends
    ChildOf<MonitoringParam>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.HttpEndpoint>,
    Identifiable<HttpEndpointKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2015-04-23", "http-endpoint").intern();

    /**
     * The HTTP path on the management server
     *
     *
     *
     * @return <code>java.lang.String</code> <code>path</code>, or <code>null</code> if not present
     */
    java.lang.String getPath();
    
    /**
     * Pick HTTPS instead of HTTP , Default is false
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>https</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isHttps();
    
    /**
     * The HTTP port to connect to
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.PortNumber</code> <code>port</code>, or <code>null</code> if not present
     */
    PortNumber getPort();
    
    /**
     * The HTTP basic auth username
     *
     *
     *
     * @return <code>java.lang.String</code> <code>username</code>, or <code>null</code> if not present
     */
    java.lang.String getUsername();
    
    /**
     * The HTTP basic auth password
     *
     *
     *
     * @return <code>java.lang.String</code> <code>password</code>, or <code>null</code> if not present
     */
    java.lang.String getPassword();
    
    /**
     * The HTTP polling interval in seconds
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>pollingIntervalSecs</code>, or <code>null</code> if not present
     */
    java.lang.Short getPollingIntervalSecs();
    
    /**
     * Method that the URI should perform. Deafult action is GET.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.HttpMethod</code> <code>method</code>, or <code>null</code> if not present
     */
    HttpMethod getMethod();
    
    /**
     * Custom HTTP headers to put on HTTP request
     *
     *
     *
     * @return <code>java.util.List</code> <code>headers</code>, or <code>null</code> if not present
     */
    List<Headers> getHeaders();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.HttpEndpointKey</code> <code>key</code>, or <code>null</code> if not present
     */
    HttpEndpointKey getKey();

}

