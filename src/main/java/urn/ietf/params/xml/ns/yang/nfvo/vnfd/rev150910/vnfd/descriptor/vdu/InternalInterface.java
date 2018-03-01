package urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.VirtualInterface;
import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.Vdu;

/**
 * List of internal interfaces for the VNF
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>vnfd</b>
 * <pre>
 * list internal-interface {
 *     key "name"
 *     leaf name {
 *         type string;
 *     }
 *     leaf vdu-internal-connection-point-ref {
 *         type leafref;
 *     }
 *     container virtual-interface {
 *         leaf type {
 *             type type;
 *         }
 *         leaf vpci {
 *             type string;
 *         }
 *         leaf bandwidth {
 *             type uint64;
 *         }
 *     }
 *     uses virtual-interface;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vnfd/vnfd-descriptor/vdu/internal-interface</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.InternalInterfaceBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.InternalInterfaceBuilder
 * @see urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.InternalInterfaceKey
 *
 */
public interface InternalInterface
    extends
    ChildOf<Vdu>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.InternalInterface>,
    VirtualInterface,
    Identifiable<InternalInterfaceKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:vnfd",
        "2015-09-10", "internal-interface").intern();

    /**
     * Name of internal interface. Note that this name has only local significance to 
     * the VDU.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * @return <code>java.lang.String</code> <code>vduInternalConnectionPointRef</code>, or <code>null</code> if not present
     */
    java.lang.String getVduInternalConnectionPointRef();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.InternalInterfaceKey</code> <code>key</code>, or <code>null</code> if not present
     */
    InternalInterfaceKey getKey();

}

