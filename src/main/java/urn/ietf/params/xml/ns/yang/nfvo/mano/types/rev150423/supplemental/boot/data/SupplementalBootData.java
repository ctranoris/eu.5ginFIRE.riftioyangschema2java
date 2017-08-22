package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.supplemental.boot.data;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ConfigFile;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container supplemental-boot-data {
 *     list config-file {
 *         key "source"
 *         leaf source {
 *             type string;
 *         }
 *         leaf dest {
 *             type string;
 *         }
 *     }
 *     leaf boot-data-drive {
 *         type boot-data-drive;
 *     }
 *     uses config-file;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mano-types/supplemental-boot-data/supplemental-boot-data</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.supplemental.boot.data.SupplementalBootDataBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.supplemental.boot.data.SupplementalBootDataBuilder
 *
 */
public interface SupplementalBootData
    extends
    ChildOf<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.SupplementalBootData>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.supplemental.boot.data.SupplementalBootData>,
    ConfigFile
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2015-04-23", "supplemental-boot-data").intern();

    /**
     * Some VIMs implement additional drives to host config-files or meta-data
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>bootDataDrive</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isBootDataDrive();

}

