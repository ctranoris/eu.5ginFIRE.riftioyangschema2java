package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423;
import java.util.List;

import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ui.primitive.group.ParameterGroup;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping ui-primitive-group {
 *     list parameter-group {
 *         key "name"
 *         leaf name {
 *             type string;
 *         }
 *         list parameter {
 *             key "name"
 *             leaf name {
 *                 type string;
 *             }
 *             leaf data-type {
 *                 type parameter-data-type;
 *             }
 *             leaf mandatory {
 *                 type mandatory;
 *             }
 *             leaf default-value {
 *                 type string;
 *             }
 *             leaf parameter-pool {
 *                 type string;
 *             }
 *             leaf read-only {
 *                 type boolean;
 *             }
 *             leaf hidden {
 *                 type boolean;
 *             }
 *             uses primitive-parameter;
 *         }
 *         leaf mandatory {
 *             type mandatory;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mano-types/ui-primitive-group</i>
 *
 */
public interface UiPrimitiveGroup
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2015-04-23", "ui-primitive-group").intern();

    /**
     * Grouping of parameters which are logically grouped in UI
     *
     *
     *
     * @return <code>java.util.List</code> <code>parameterGroup</code>, or <code>null</code> if not present
     */
    List<ParameterGroup> getParameterGroup();

}

