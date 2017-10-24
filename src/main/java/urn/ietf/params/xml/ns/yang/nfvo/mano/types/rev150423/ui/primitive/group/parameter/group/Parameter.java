package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ui.primitive.group.parameter.group;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.PrimitiveParameter;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ui.primitive.group.ParameterGroup;

/**
 * List of parameters for the service primitive.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list parameter {
 *     key "name"
 *     leaf name {
 *         type string;
 *     }
 *     leaf data-type {
 *         type parameter-data-type;
 *     }
 *     leaf mandatory {
 *         type mandatory;
 *     }
 *     leaf default-value {
 *         type string;
 *     }
 *     leaf parameter-pool {
 *         type string;
 *     }
 *     leaf read-only {
 *         type boolean;
 *     }
 *     leaf hidden {
 *         type boolean;
 *     }
 *     uses primitive-parameter;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mano-types/ui-primitive-group/parameter-group/parameter</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ui.primitive.group.parameter.group.ParameterBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ui.primitive.group.parameter.group.ParameterBuilder
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ui.primitive.group.parameter.group.ParameterKey
 *
 */
public interface Parameter
    extends
    ChildOf<ParameterGroup>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ui.primitive.group.parameter.group.Parameter>,
    PrimitiveParameter,
    Identifiable<ParameterKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2015-04-23", "parameter").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ui.primitive.group.parameter.group.ParameterKey</code> <code>key</code>, or <code>null</code> if not present
     */
    ParameterKey getKey();

}

