package urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.vld.catalog.Vld;

import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>vld</b>
 * <pre>
 * container vld-catalog {
 *     list vld {
 *         key "id"
 *         leaf id {
 *             type uuid;
 *         }
 *         leaf name {
 *             type string;
 *         }
 *         leaf short-name {
 *             type string;
 *         }
 *         leaf vendor {
 *             type string;
 *         }
 *         leaf description {
 *             type string;
 *         }
 *         leaf version {
 *             type string;
 *         }
 *         leaf type {
 *             type virtual-link-type;
 *         }
 *         leaf root-bandwidth {
 *             type uint64;
 *         }
 *         leaf leaf-bandwidth {
 *             type uint64;
 *         }
 *         list vnfd-connection-point-ref {
 *             key "vnfd-ref" 
 *         "member-vnf-index-ref"
 *             leaf vnfd-ref {
 *                 type leafref;
 *             }
 *             leaf member-vnf-index-ref {
 *                 type uint64;
 *             }
 *             leaf vnfd-connection-point-ref {
 *                 type leafref;
 *             }
 *         }
 *         container provider-network {
 *             leaf physical-network {
 *                 type string;
 *             }
 *             leaf overlay-type {
 *                 type enumeration;
 *             }
 *             leaf segmentation_id {
 *                 type uint32;
 *             }
 *         }
 *         uses provider-network;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vld/vld-catalog</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.VldCatalogBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.VldCatalogBuilder
 *
 */
public interface VldCatalog
    extends
    ChildOf<VldData>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.VldCatalog>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:vld",
        "2015-09-10", "vld-catalog").intern();

    /**
     * @return <code>java.util.List</code> <code>vld</code>, or <code>null</code> if not present
     */
    List<Vld> getVld();

}

