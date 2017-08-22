package urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ConnectionPointType;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>vnfd</b>
 * <pre>
 * grouping common-connection-point {
 *     leaf name {
 *         type string;
 *     }
 *     leaf id {
 *         type string;
 *     }
 *     leaf short-name {
 *         type string;
 *     }
 *     leaf type {
 *         type connection-point-type;
 *     }
 *     leaf port-security-enabled {
 *         type boolean;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vnfd/common-connection-point</i>
 *
 */
public interface CommonConnectionPoint
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:vnfd",
        "2015-09-10", "common-connection-point").intern();

    /**
     * Name of the connection point
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * Identifier for the internal connection points
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    java.lang.String getId();
    
    /**
     * Short name to appear as label in the UI
     *
     *
     *
     * @return <code>java.lang.String</code> <code>shortName</code>, or <code>null</code> if not present
     */
    java.lang.String getShortName();
    
    /**
     * Type of the connection point.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ConnectionPointType</code> <code>type</code>, or <code>null</code> if not present
     */
    ConnectionPointType getType();
    
    /**
     * Enables the port security for the port
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>portSecurityEnabled</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isPortSecurityEnabled();

}

