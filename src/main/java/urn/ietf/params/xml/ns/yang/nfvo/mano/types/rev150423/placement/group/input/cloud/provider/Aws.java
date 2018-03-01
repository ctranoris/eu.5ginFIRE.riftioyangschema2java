package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.CloudProvider;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * case aws {
 *     leaf aws-construct {
 *         type empty;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mano-types/placement-group-input/cloud-provider/aws</i>
 *
 */
public interface Aws
    extends
    DataObject,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.Aws>,
    CloudProvider
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2015-04-23", "aws").intern();

    /**
     * @return <code>java.lang.Boolean</code> <code>awsConstruct</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isAwsConstruct();

}

