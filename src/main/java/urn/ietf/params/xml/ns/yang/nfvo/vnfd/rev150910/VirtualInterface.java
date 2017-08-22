package urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>vnfd</b>
 * <pre>
 * grouping virtual-interface {
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
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vnfd/virtual-interface</i>
 *
 */
public interface VirtualInterface
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:vnfd",
        "2015-09-10", "virtual-interface").intern();

    /**
     * Container for the virtual interface properties
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.virtual._interface.VirtualInterface</code> <code>virtualInterface</code>, or <code>null</code> if not present
     */
    urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.virtual._interface.VirtualInterface getVirtualInterface();

}

