package urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.internal.vld;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.InternalVld;

/**
 * List of internal connection points in this VLD
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>vnfd</b>
 * <pre>
 * list internal-connection-point {
 *     key "id-ref"
 *     leaf id-ref {
 *         type leafref;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vnfd/vnfd-descriptor/internal-vld/internal-connection-point</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.internal.vld.InternalConnectionPointBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.internal.vld.InternalConnectionPointBuilder
 * @see urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.internal.vld.InternalConnectionPointKey
 *
 */
public interface InternalConnectionPoint
    extends
    ChildOf<InternalVld>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.internal.vld.InternalConnectionPoint>,
    Identifiable<InternalConnectionPointKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:vnfd",
        "2015-09-10", "internal-connection-point").intern();

    /**
     * reference to the internal connection point id
     *
     *
     *
     * @return <code>java.lang.String</code> <code>idRef</code>, or <code>null</code> if not present
     */
    java.lang.String getIdRef();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.internal.vld.InternalConnectionPointKey</code> <code>key</code>, or <code>null</code> if not present
     */
    InternalConnectionPointKey getKey();

}

