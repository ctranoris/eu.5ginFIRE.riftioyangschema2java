package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.volume.info.volume.source;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ImageProperties;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.volume.info.VolumeSource;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * case image {
 *     leaf image {
 *         type string;
 *     }
 *     leaf image-checksum {
 *         type string;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mano-types/volume-info/volume-source/image</i>
 *
 */
public interface Image
    extends
    DataObject,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.volume.info.volume.source.Image>,
    ImageProperties,
    VolumeSource
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2015-04-23", "image").intern();


}

