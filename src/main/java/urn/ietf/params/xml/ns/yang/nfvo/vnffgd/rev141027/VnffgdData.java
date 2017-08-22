package urn.ietf.params.xml.ns.yang.nfvo.vnffgd.rev141027;
import org.opendaylight.yangtools.yang.binding.DataRoot;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>vnffgd</b>
 * <pre>
 * module vnffgd {
 *     yang-version 1;
 *     namespace "urn:ietf:params:xml:ns:yang:nfvo:vnffgd";
 *     prefix "vnffgd";
 * 
 *     import ietf-inet-types { prefix "inet"; }
 *     
 *     import ietf-yang-types { prefix "yang"; }
 *     
 *     import mano-types { prefix "manotypes"; }
 *     
 *     import rw-pb-ext { prefix "rwpb"; }
 *     revision 2014-10-27 {
 *         description "";
 *     }
 * 
 *     container vnffgd-catalog {
 *         list vnffgd {
 *             key "id"
 *             leaf name {
 *                 type string;
 *             }
 *             leaf id {
 *                 type uuid;
 *             }
 *             leaf provider {
 *                 type string;
 *             }
 *             leaf description {
 *                 type string;
 *             }
 *             leaf version {
 *                 type string;
 *             }
 *         }
 *     }
 * }
 * </pre>
 *
 */
public interface VnffgdData
    extends
    DataRoot
{




    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnffgd.rev141027.VnffgdCatalog</code> <code>vnffgdCatalog</code>, or <code>null</code> if not present
     */
    VnffgdCatalog getVnffgdCatalog();

}

