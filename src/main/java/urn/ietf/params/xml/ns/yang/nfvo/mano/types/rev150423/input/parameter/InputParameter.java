package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.input.parameter;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of input parameters
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list input-parameter {
 *     key "xpath"
 *     leaf xpath {
 *         type string;
 *     }
 *     leaf value {
 *         type string;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mano-types/input-parameter/input-parameter</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.input.parameter.InputParameterBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.input.parameter.InputParameterBuilder
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.input.parameter.InputParameterKey
 *
 */
public interface InputParameter
    extends
    ChildOf<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.InputParameter>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.input.parameter.InputParameter>,
    Identifiable<InputParameterKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2015-04-23", "input-parameter").intern();

    /**
     * An xpath that specfies which element in a descriptor is to be modified.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>xpath</code>, or <code>null</code> if not present
     */
    java.lang.String getXpath();
    
    /**
     * The value that the element specified by the xpath should take when a record is 
     * created.
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
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.input.parameter.InputParameterKey</code> <code>key</code>, or <code>null</code> if not present
     */
    InputParameterKey getKey();

}

