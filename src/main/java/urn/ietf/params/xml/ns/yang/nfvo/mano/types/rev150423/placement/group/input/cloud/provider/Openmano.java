package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.CloudProvider;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * case openmano {
 *     leaf openmano-construct {
 *         type empty;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mano-types/placement-group-input/cloud-provider/openmano</i>
 *
 */
public interface Openmano
    extends
    DataObject,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.Openmano>,
    CloudProvider
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2015-04-23", "openmano").intern();

    /**
     * @return <code>java.lang.Boolean</code> <code>openmanoConstruct</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isOpenmanoConstruct();

}

