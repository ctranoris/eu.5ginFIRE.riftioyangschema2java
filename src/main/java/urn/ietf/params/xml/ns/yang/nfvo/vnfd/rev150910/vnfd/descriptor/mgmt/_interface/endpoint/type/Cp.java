package urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.mgmt._interface.endpoint.type;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.mgmt._interface.EndpointType;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Use the ip address associated with this connection point.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>vnfd</b>
 * <pre>
 * case cp {
 *     leaf cp {
 *         type leafref;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vnfd/vnfd-descriptor/mgmt-interface/endpoint-type/cp</i>
 *
 */
public interface Cp
    extends
    DataObject,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.mgmt._interface.endpoint.type.Cp>,
    EndpointType
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:vnfd",
        "2015-09-10", "cp").intern();

    /**
     * @return <code>java.lang.String</code> <code>cp</code>, or <code>null</code> if not present
     */
    java.lang.String getCp();

}

