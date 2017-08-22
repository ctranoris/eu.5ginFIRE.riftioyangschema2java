package urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.UiPrimitiveGroup;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdDescriptor;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.service.primitive.Parameter;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.service.primitive.VnfPrimitiveGroup;

import java.util.List;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * Network service level service primitives.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>nsd</b>
 * <pre>
 * list service-primitive {
 *     key "name"
 *     leaf name {
 *         type string;
 *     }
 *     list parameter {
 *         key "name"
 *         leaf name {
 *             type string;
 *         }
 *         leaf data-type {
 *             type parameter-data-type;
 *         }
 *         leaf mandatory {
 *             type mandatory;
 *         }
 *         leaf default-value {
 *             type string;
 *         }
 *         leaf parameter-pool {
 *             type string;
 *         }
 *         leaf read-only {
 *             type boolean;
 *         }
 *         leaf hidden {
 *             type boolean;
 *         }
 *         uses primitive-parameter;
 *     }
 *     list parameter-group {
 *         key "name"
 *         leaf name {
 *             type string;
 *         }
 *         list parameter {
 *             key "name"
 *             leaf name {
 *                 type string;
 *             }
 *             leaf data-type {
 *                 type parameter-data-type;
 *             }
 *             leaf mandatory {
 *                 type mandatory;
 *             }
 *             leaf default-value {
 *                 type string;
 *             }
 *             leaf parameter-pool {
 *                 type string;
 *             }
 *             leaf read-only {
 *                 type boolean;
 *             }
 *             leaf hidden {
 *                 type boolean;
 *             }
 *             uses primitive-parameter;
 *         }
 *         leaf mandatory {
 *             type mandatory;
 *         }
 *     }
 *     list vnf-primitive-group {
 *         key "member-vnf-index-ref"
 *         leaf member-vnf-index-ref {
 *             type leafref;
 *         }
 *         leaf vnfd-id-ref {
 *             type leafref;
 *         }
 *         leaf vnfd-name {
 *             type leafref;
 *         }
 *         list primitive {
 *             key "index"
 *             leaf index {
 *                 type uint32;
 *             }
 *             leaf name {
 *                 type string;
 *             }
 *         }
 *     }
 *     leaf user-defined-script {
 *         type string;
 *     }
 *     uses ui-primitive-group;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>nsd/nsd-descriptor/service-primitive</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.ServicePrimitiveBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.ServicePrimitiveBuilder
 * @see urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.ServicePrimitiveKey
 *
 */
public interface ServicePrimitive
    extends
    ChildOf<NsdDescriptor>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.ServicePrimitive>,
    UiPrimitiveGroup,
    Identifiable<ServicePrimitiveKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsd",
        "2014-10-27", "service-primitive").intern();

    /**
     * Name of the service primitive.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * List of parameters for the service primitive.
     *
     *
     *
     * @return <code>java.util.List</code> <code>parameter</code>, or <code>null</code> if not present
     */
    List<Parameter> getParameter();
    
    /**
     * List of service primitives grouped by VNF.
     *
     *
     *
     * @return <code>java.util.List</code> <code>vnfPrimitiveGroup</code>, or <code>null</code> if not present
     */
    List<VnfPrimitiveGroup> getVnfPrimitiveGroup();
    
    /**
     * A user defined script.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>userDefinedScript</code>, or <code>null</code> if not present
     */
    java.lang.String getUserDefinedScript();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.ServicePrimitiveKey</code> <code>key</code>, or <code>null</code> if not present
     */
    ServicePrimitiveKey getKey();

}

