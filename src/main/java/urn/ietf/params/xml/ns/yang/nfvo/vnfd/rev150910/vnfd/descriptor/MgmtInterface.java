package urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.PortNumber;
import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.VnfdDescriptor;
import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.MgmtInterfaceBuilder.MgmtInterfaceImpl;
import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.mgmt._interface.DashboardParams;
import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.mgmt._interface.EndpointType;

/**
 * Interface over which the VNF is managed.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>vnfd</b>
 * <pre>
 * container mgmt-interface {
 *     choice endpoint-type {
 *         case cp {
 *             leaf cp {
 *                 type leafref;
 *             }
 *         }
 *         case ip {
 *             leaf ip-address {
 *                 type ip-address;
 *             }
 *         }
 *         case vdu-id {
 *             leaf vdu-id {
 *                 type leafref;
 *             }
 *         }
 *     }
 *     leaf port {
 *         type port-number;
 *     }
 *     container dashboard-params {
 *         leaf path {
 *             type string;
 *         }
 *         leaf https {
 *             type boolean;
 *         }
 *         leaf port {
 *             type port-number;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vnfd/vnfd-descriptor/mgmt-interface</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.MgmtInterfaceBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.MgmtInterfaceBuilder
 *
 */
@JsonDeserialize(as = MgmtInterfaceImpl.class)
public interface MgmtInterface
    extends
    ChildOf<VnfdDescriptor>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.MgmtInterface>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:vnfd",
        "2015-09-10", "mgmt-interface").intern();

    /**
     * Indicates the type of management endpoint.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.mgmt._interface.EndpointType</code> <code>endpointType</code>, or <code>null</code> if not present
     */
    EndpointType getEndpointType();
    
    /**
     * Port for the management interface.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.PortNumber</code> <code>port</code>, or <code>null</code> if not present
     */
    PortNumber getPort();
    
    /**
     * Parameters for the VNF dashboard
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.mgmt._interface.DashboardParams</code> <code>dashboardParams</code>, or <code>null</code> if not present
     */
    DashboardParams getDashboardParams();

}

