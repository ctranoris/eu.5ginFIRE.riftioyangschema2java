package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.CloudProvider;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * case vsphere {
 *     leaf vsphere-construct {
 *         type empty;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mano-types/placement-group-input/cloud-provider/vsphere</i>
 *
 */
public interface Vsphere
    extends
    DataObject,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.Vsphere>,
    CloudProvider
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2015-04-23", "vsphere").intern();

    /**
     * @return <code>java.lang.Boolean</code> <code>vsphereConstruct</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isVsphereConstruct();

}

