package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping vm-flavor {
 *     container vm-flavor {
 *         leaf vcpu-count {
 *             type uint16;
 *         }
 *         leaf memory-mb {
 *             type uint64;
 *         }
 *         leaf storage-gb {
 *             type uint64;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mano-types/vm-flavor</i>
 *
 */
public interface VmFlavor
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2015-04-23", "vm-flavor").intern();

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vm.flavor.VmFlavor</code> <code>vmFlavor</code>, or <code>null</code> if not present
     */
    urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vm.flavor.VmFlavor getVmFlavor();

}

