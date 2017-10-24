package urn.ietf.params.xml.ns.yang.nfvo.vnffgd.rev141027;
import java.util.List;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.vnffgd.rev141027.vnffgd.catalog.Vnffgd;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>vnffgd</b>
 * <pre>
 * container vnffgd-catalog {
 *     list vnffgd {
 *         key "id"
 *         leaf name {
 *             type string;
 *         }
 *         leaf id {
 *             type uuid;
 *         }
 *         leaf provider {
 *             type string;
 *         }
 *         leaf description {
 *             type string;
 *         }
 *         leaf version {
 *             type string;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vnffgd/vnffgd-catalog</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.vnffgd.rev141027.VnffgdCatalogBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.vnffgd.rev141027.VnffgdCatalogBuilder
 *
 */
public interface VnffgdCatalog
    extends
    ChildOf<VnffgdData>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.vnffgd.rev141027.VnffgdCatalog>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:vnffgd",
        "2014-10-27", "vnffgd-catalog").intern();

    /**
     * @return <code>java.util.List</code> <code>vnffgd</code>, or <code>null</code> if not present
     */
    List<Vnffgd> getVnffgd();

}

