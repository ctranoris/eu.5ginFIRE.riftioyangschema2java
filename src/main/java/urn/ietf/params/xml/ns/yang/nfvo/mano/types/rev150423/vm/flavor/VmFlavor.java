package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vm.flavor;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container vm-flavor {
 *     leaf vcpu-count {
 *         type uint16;
 *     }
 *     leaf memory-mb {
 *         type uint64;
 *     }
 *     leaf storage-gb {
 *         type uint64;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mano-types/vm-flavor/vm-flavor</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vm.flavor.VmFlavorBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vm.flavor.VmFlavorBuilder
 *
 */
public interface VmFlavor
    extends
    ChildOf<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.VmFlavor>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vm.flavor.VmFlavor>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2015-04-23", "vm-flavor").intern();

    /**
     * Number of VCPUs for the VM.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>vcpuCount</code>, or <code>null</code> if not present
     */
    java.lang.Integer getVcpuCount();
    
    /**
     * Amount of memory in MB.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>memoryMb</code>, or <code>null</code> if not present
     */
    BigInteger getMemoryMb();
    
    /**
     * Amount of disk space in GB.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>storageGb</code>, or <code>null</code> if not present
     */
    BigInteger getStorageGb();

}

