package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.input.parameter.xpath;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of xpaths to parameters inside the NSD the can be customized during the 
 * instantiation.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list input-parameter-xpath {
 *     key "xpath"
 *     leaf xpath {
 *         type string;
 *     }
 *     leaf label {
 *         type string;
 *     }
 *     leaf default-value {
 *         type string;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mano-types/input-parameter-xpath/input-parameter-xpath</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.input.parameter.xpath.InputParameterXpathBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.input.parameter.xpath.InputParameterXpathBuilder
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.input.parameter.xpath.InputParameterXpathKey
 *
 */
public interface InputParameterXpath
    extends
    ChildOf<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.InputParameterXpath>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.input.parameter.xpath.InputParameterXpath>,
    Identifiable<InputParameterXpathKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2015-04-23", "input-parameter-xpath").intern();

    /**
     * An xpath that specifies the element in a descriptor.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>xpath</code>, or <code>null</code> if not present
     */
    java.lang.String getXpath();
    
    /**
     * A descriptive string
     *
     *
     *
     * @return <code>java.lang.String</code> <code>label</code>, or <code>null</code> if not present
     */
    java.lang.String getLabel();
    
    /**
     * /nsd:nsd-catalog/nsd:nsd/nsd:vendor
     *
     *
     *
     * @return <code>java.lang.String</code> <code>defaultValue</code>, or <code>null</code> if not present
     */
    java.lang.String getDefaultValue();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.input.parameter.xpath.InputParameterXpathKey</code> <code>key</code>, or <code>null</code> if not present
     */
    InputParameterXpathKey getKey();

}

