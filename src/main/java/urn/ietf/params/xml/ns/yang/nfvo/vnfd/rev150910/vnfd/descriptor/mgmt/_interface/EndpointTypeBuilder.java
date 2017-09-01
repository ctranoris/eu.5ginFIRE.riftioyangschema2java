package urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.mgmt._interface;
import org.opendaylight.yangtools.yang.binding.DataContainer;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Indicates the type of management endpoint.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>vnfd</b>
 * <pre>
 * choice endpoint-type {
 *     case cp {
 *         leaf cp {
 *             type leafref;
 *         }
 *     }
 *     case ip {
 *         leaf ip-address {
 *             type ip-address;
 *         }
 *     }
 *     case vdu-id {
 *         leaf vdu-id {
 *             type leafref;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vnfd/vnfd-descriptor/mgmt-interface/endpoint-type</i>
 *
 */
public interface EndpointTypeBuilder
    extends
    DataContainer
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:vnfd",
        "2015-09-10", "endpoint-type").intern();


}

