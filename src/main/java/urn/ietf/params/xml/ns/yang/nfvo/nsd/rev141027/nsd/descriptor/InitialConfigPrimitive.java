package urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.InitialConfig;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdDescriptor;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.InitialConfigPrimitiveBuilder.InitialConfigPrimitiveImpl;

import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * Initial set of configuration primitives for NSD.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>nsd</b>
 * <pre>
 * list initial-config-primitive {
 *     key "seq"
 *     leaf seq {
 *         type uint64;
 *     }
 *     leaf name {
 *         type string;
 *     }
 *     leaf user-defined-script {
 *         type string;
 *     }
 *     list parameter {
 *         key "name"
 *         leaf name {
 *             type string;
 *         }
 *         leaf value {
 *             type string;
 *         }
 *     }
 *     uses initial-config;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>nsd/nsd-descriptor/initial-config-primitive</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.InitialConfigPrimitiveBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.InitialConfigPrimitiveBuilder
 * @see urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.InitialConfigPrimitiveKey
 *
 */
@JsonDeserialize(as = InitialConfigPrimitiveImpl.class)
public interface InitialConfigPrimitive
    extends
    ChildOf<NsdDescriptor>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.InitialConfigPrimitive>,
    InitialConfig,
    Identifiable<InitialConfigPrimitiveKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsd",
        "2014-10-27", "initial-config-primitive").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.InitialConfigPrimitiveKey</code> <code>key</code>, or <code>null</code> if not present
     */
    InitialConfigPrimitiveKey getKey();

}

