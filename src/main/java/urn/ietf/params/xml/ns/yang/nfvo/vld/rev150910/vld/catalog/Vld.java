package urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.vld.catalog;
import java.math.BigInteger;
import java.util.List;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ProviderNetwork;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.VirtualLinkType;
import urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.VldCatalog;
import urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.vld.catalog.vld.VnfdConnectionPointRef;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>vld</b>
 * <pre>
 * list vld {
 *     key "id"
 *     leaf id {
 *         type uuid;
 *     }
 *     leaf name {
 *         type string;
 *     }
 *     leaf short-name {
 *         type string;
 *     }
 *     leaf vendor {
 *         type string;
 *     }
 *     leaf description {
 *         type string;
 *     }
 *     leaf version {
 *         type string;
 *     }
 *     leaf type {
 *         type virtual-link-type;
 *     }
 *     leaf root-bandwidth {
 *         type uint64;
 *     }
 *     leaf leaf-bandwidth {
 *         type uint64;
 *     }
 *     list vnfd-connection-point-ref {
 *         key "vnfd-ref" 
 *     "member-vnf-index-ref"
 *         leaf vnfd-ref {
 *             type leafref;
 *         }
 *         leaf member-vnf-index-ref {
 *             type uint64;
 *         }
 *         leaf vnfd-connection-point-ref {
 *             type leafref;
 *         }
 *     }
 *     container provider-network {
 *         leaf physical-network {
 *             type string;
 *         }
 *         leaf overlay-type {
 *             type enumeration;
 *         }
 *         leaf segmentation_id {
 *             type uint32;
 *         }
 *     }
 *     uses provider-network;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vld/vld-catalog/vld</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.vld.catalog.VldBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.vld.catalog.VldBuilder
 * @see urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.vld.catalog.VldKey
 *
 */
public interface Vld
    extends
    ChildOf<VldCatalog>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.vld.catalog.Vld>,
    ProviderNetwork,
    Identifiable<VldKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:vld",
        "2015-09-10", "vld").intern();

    /**
     * Identifier for the VLD.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>id</code>, or <code>null</code> if not present
     */
    Uuid getId();
    
    /**
     * Virtual Link Descriptor (VLD) name.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * Short name for VLD for UI
     *
     *
     *
     * @return <code>java.lang.String</code> <code>shortName</code>, or <code>null</code> if not present
     */
    java.lang.String getShortName();
    
    /**
     * Provider of the VLD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vendor</code>, or <code>null</code> if not present
     */
    java.lang.String getVendor();
    
    /**
     * Description of the VLD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    java.lang.String getDescription();
    
    /**
     * Version of the VLD
     *
     *
     *
     * @return <code>java.lang.String</code> <code>version</code>, or <code>null</code> if not present
     */
    java.lang.String getVersion();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.VirtualLinkType</code> <code>type</code>, or <code>null</code> if not present
     */
    VirtualLinkType getType();
    
    /**
     * For ELAN this is the aggregate bandwidth.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>rootBandwidth</code>, or <code>null</code> if not present
     */
    BigInteger getRootBandwidth();
    
    /**
     * For ELAN this is the bandwidth of branches.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>leafBandwidth</code>, or <code>null</code> if not present
     */
    BigInteger getLeafBandwidth();
    
    /**
     * A list of references to connection points.
     *
     *
     *
     * @return <code>java.util.List</code> <code>vnfdConnectionPointRef</code>, or <code>null</code> if not present
     */
    List<VnfdConnectionPointRef> getVnfdConnectionPointRef();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.vld.catalog.VldKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VldKey getKey();

}

