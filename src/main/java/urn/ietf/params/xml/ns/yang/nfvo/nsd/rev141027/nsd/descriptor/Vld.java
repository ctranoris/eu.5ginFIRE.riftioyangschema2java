package urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor;
import java.math.BigInteger;
import java.util.List;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ProviderNetwork;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.VirtualLinkType;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdDescriptor;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.VldBuilder.VldImpl;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.vld.InitParams;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.vld.VnfdConnectionPointRef;

/**
 * List of Virtual Link Descriptors (VLDs).
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>nsd</b>
 * <pre>
 * list vld {
 *     key "id"
 *     leaf id {
 *         type string;
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
 *         key "member-vnf-index-ref" 
 *     "vnfd-connection-point-ref"
 *         leaf member-vnf-index-ref {
 *             type string;
 *         }
 *         leaf vnfd-id-ref {
 *             type leafref;
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
 *     leaf mgmt-network {
 *         type mgmt-network;
 *     }
 *     choice init-params {
 *         case vim-network-profile {
 *             leaf ip-profile-ref {
 *                 type string;
 *             }
 *         }
 *         case vim-network-ref {
 *             leaf vim-network-name {
 *                 type string;
 *             }
 *         }
 *     }
 *     uses provider-network;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>nsd/nsd-descriptor/vld</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.VldBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.VldBuilder
 * @see urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.VldKey
 *
 */
@JsonDeserialize(as = VldImpl.class)
@JsonIgnoreProperties( {"vim-network-name", "ip-profile-ref"} )
public interface Vld
    extends
    ChildOf<NsdDescriptor>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.Vld>,
    ProviderNetwork,
    Identifiable<VldKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsd",
        "2014-10-27", "vld").intern();

    /**
     * Identifier for the VLD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    java.lang.String getId();
    
    /**
     * Virtual Link Descriptor (VLD) name.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * Short name to appear as label in the UI
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
     * Flag indicating whether this network is a VIM management network
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>mgmtNetwork</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isMgmtNetwork();
    
    /**
     * Extra parameters for VLD instantiation
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.vld.InitParams</code> <code>initParams</code>, or <code>null</code> if not present
     */
    InitParams getInitParams();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.VldKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VldKey getKey();

}

