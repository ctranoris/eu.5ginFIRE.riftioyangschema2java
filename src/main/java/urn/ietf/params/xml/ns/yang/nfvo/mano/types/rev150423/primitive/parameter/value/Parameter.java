package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.primitive.parameter.value;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.PrimitiveParameterValue;

/**
 * List of parameters to the configuration primitive.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list parameter {
 *     key "name"
 *     leaf name {
 *         type string;
 *     }
 *     leaf value {
 *         type string;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mano-types/primitive-parameter-value/parameter</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.primitive.parameter.value.ParameterBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.primitive.parameter.value.ParameterBuilder
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.primitive.parameter.value.ParameterKey
 *
 */
public interface Parameter
    extends
    ChildOf<PrimitiveParameterValue>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.primitive.parameter.value.Parameter>,
    Identifiable<ParameterKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2015-04-23", "parameter").intern();

    /**
     * Name of the parameter.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * Value associated with the name.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>value</code>, or <code>null</code> if not present
     */
    java.lang.String getValue();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.primitive.parameter.value.ParameterKey</code> <code>key</code>, or <code>null</code> if not present
     */
    ParameterKey getKey();

}

