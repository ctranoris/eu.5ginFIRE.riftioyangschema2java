package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ui.primitive.group;
import java.util.List;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.UiPrimitiveGroup;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ui.primitive.group.parameter.group.Parameter;

/**
 * Grouping of parameters which are logically grouped in UI
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list parameter-group {
 *     key "name"
 *     leaf name {
 *         type string;
 *     }
 *     list parameter {
 *         key "name"
 *         leaf name {
 *             type string;
 *         }
 *         leaf data-type {
 *             type parameter-data-type;
 *         }
 *         leaf mandatory {
 *             type mandatory;
 *         }
 *         leaf default-value {
 *             type string;
 *         }
 *         leaf parameter-pool {
 *             type string;
 *         }
 *         leaf read-only {
 *             type boolean;
 *         }
 *         leaf hidden {
 *             type boolean;
 *         }
 *         uses primitive-parameter;
 *     }
 *     leaf mandatory {
 *         type mandatory;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mano-types/ui-primitive-group/parameter-group</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ui.primitive.group.ParameterGroupBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ui.primitive.group.ParameterGroupBuilder
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ui.primitive.group.ParameterGroupKey
 *
 */
public interface ParameterGroup
    extends
    ChildOf<UiPrimitiveGroup>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ui.primitive.group.ParameterGroup>,
    Identifiable<ParameterGroupKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2015-04-23", "parameter-group").intern();

    /**
     * Name of the parameter group
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * List of parameters for the service primitive.
     *
     *
     *
     * @return <code>java.util.List</code> <code>parameter</code>, or <code>null</code> if not present
     */
    List<Parameter> getParameter();
    
    /**
     * Is this parameter group mandatory
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>mandatory</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isMandatory();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ui.primitive.group.ParameterGroupKey</code> <code>key</code>, or <code>null</code> if not present
     */
    ParameterGroupKey getKey();

}

