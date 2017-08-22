package urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910;
import org.opendaylight.yangtools.yang.binding.DataRoot;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>vld</b>
 * <pre>
 * module vld {
 *     yang-version 1;
 *     namespace "urn:ietf:params:xml:ns:yang:nfvo:vld";
 *     prefix "vld";
 * 
 *     import vnfd { prefix "vnfd"; }
 *     
 *     import ietf-inet-types { prefix "inet"; }
 *     
 *     import ietf-yang-types { prefix "yang"; }
 *     
 *     import mano-types { prefix "manotypes"; }
 *     
 *     import rw-pb-ext { prefix "rwpb"; }
 *     revision 2015-09-10 {
 *         description "";
 *     }
 * 
 *     container vld-catalog {
 *         list vld {
 *             key "id"
 *             leaf id {
 *                 type uuid;
 *             }
 *             leaf name {
 *                 type string;
 *             }
 *             leaf short-name {
 *                 type string;
 *             }
 *             leaf vendor {
 *                 type string;
 *             }
 *             leaf description {
 *                 type string;
 *             }
 *             leaf version {
 *                 type string;
 *             }
 *             leaf type {
 *                 type virtual-link-type;
 *             }
 *             leaf root-bandwidth {
 *                 type uint64;
 *             }
 *             leaf leaf-bandwidth {
 *                 type uint64;
 *             }
 *             list vnfd-connection-point-ref {
 *                 key "vnfd-ref" 
 *             "member-vnf-index-ref"
 *                 leaf vnfd-ref {
 *                     type leafref;
 *                 }
 *                 leaf member-vnf-index-ref {
 *                     type uint64;
 *                 }
 *                 leaf vnfd-connection-point-ref {
 *                     type leafref;
 *                 }
 *             }
 *             container provider-network {
 *                 leaf physical-network {
 *                     type string;
 *                 }
 *                 leaf overlay-type {
 *                     type enumeration;
 *                 }
 *                 leaf segmentation_id {
 *                     type uint32;
 *                 }
 *             }
 *             uses provider-network;
 *         }
 *     }
 * }
 * </pre>
 *
 */
public interface VldData
    extends
    DataRoot
{




    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.VldCatalog</code> <code>vldCatalog</code>, or <code>null</code> if not present
     */
    VldCatalog getVldCatalog();

}

