package urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.VnfdDescriptor;

/**
 * List of VDU dependencies.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>vnfd</b>
 * <pre>
 * list vdu-dependency {
 *     key "vdu-source-ref"
 *     leaf vdu-source-ref {
 *         type leafref;
 *     }
 *     leaf vdu-depends-on-ref {
 *         type leafref;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vnfd/vnfd-descriptor/vdu-dependency</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.VduDependencyBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.VduDependencyBuilder
 * @see urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.VduDependencyKey
 *
 */
public interface VduDependency
    extends
    ChildOf<VnfdDescriptor>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.VduDependency>,
    Identifiable<VduDependencyKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:vnfd",
        "2015-09-10", "vdu-dependency").intern();

    /**
     * @return <code>java.lang.String</code> <code>vduSourceRef</code>, or <code>null</code> if not present
     */
    java.lang.String getVduSourceRef();
    
    /**
     * Reference to the VDU on which the source VDU depends.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vduDependsOnRef</code>, or <code>null</code> if not present
     */
    java.lang.String getVduDependsOnRef();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.VduDependencyKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VduDependencyKey getKey();

}

