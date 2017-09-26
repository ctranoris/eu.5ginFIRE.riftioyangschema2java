package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.VnfConfigurationBuilder.VnfConfigurationImpl;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.ConfigAccess;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.ConfigAttributes;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.ConfigMethod;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.InitialConfigPrimitive;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.ServicePrimitive;
import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.catalog.VnfdBuilder.VnfdImpl;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Information about the VNF configuration. Note: If the NS contains multiple 
 * instances of the same VNF, each instance could have a different configuration.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container vnf-configuration {
 *     choice config-method {
 *         case juju {
 *             container juju {
 *                 leaf charm {
 *                     type string;
 *                 }
 *             }
 *         }
 *         case netconf {
 *             container netconf {
 *                 leaf target {
 *                     type enumeration;
 *                 }
 *                 leaf protocol {
 *                     type enumeration;
 *                 }
 *                 leaf port {
 *                     type port-number;
 *                 }
 *             }
 *         }
 *         case rest {
 *             container rest {
 *                 leaf port {
 *                     type port-number;
 *                 }
 *             }
 *         }
 *         case script {
 *             container script {
 *                 leaf script-type {
 *                     type enumeration;
 *                 }
 *             }
 *         }
 *     }
 *     container config-access {
 *         leaf mgmt-ip-address {
 *             type ip-address;
 *         }
 *         leaf username {
 *             type string;
 *         }
 *         leaf password {
 *             type string;
 *         }
 *     }
 *     container config-attributes {
 *         leaf config-priority {
 *             type uint64;
 *         }
 *         leaf config-delay {
 *             type uint64;
 *         }
 *     }
 *     list service-primitive {
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
 *     }
 *     list initial-config-primitive {
 *         key "seq"
 *         leaf seq {
 *             type uint64;
 *         }
 *         leaf name {
 *             type string;
 *         }
 *         leaf user-defined-script {
 *             type string;
 *         }
 *         list parameter {
 *             key "name"
 *             leaf name {
 *                 type string;
 *             }
 *             leaf value {
 *                 type string;
 *             }
 *         }
 *         uses initial-config;
 *     }
 *     leaf config-template {
 *         type string;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mano-types/vnf-configuration/vnf-configuration</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.VnfConfigurationBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.VnfConfigurationBuilder
 *
 */
@JsonDeserialize(as = VnfConfigurationImpl.class)
@JsonIgnoreProperties( {"config-attributes", "script", "initial-config-primitive"} )
public interface VnfConfiguration
    extends
    ChildOf<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.VnfConfiguration>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.VnfConfiguration>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2015-04-23", "vnf-configuration").intern();

    /**
     * Defines the configuration method for the VNF.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.ConfigMethod</code> <code>configMethod</code>, or <code>null</code> if not present
     */
    ConfigMethod getConfigMethod();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.ConfigAccess</code> <code>configAccess</code>, or <code>null</code> if not present
     */
    ConfigAccess getConfigAccess();
    
    /**
     * Miscellaneous input parameters to be considered while processing the NSD to 
     * apply configuration
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.ConfigAttributes</code> <code>configAttributes</code>, or <code>null</code> if not present
     */
    ConfigAttributes getConfigAttributes();
    
    /**
     * List of service primitives supported by the configuration agent for this VNF.
     *
     *
     *
     * @return <code>java.util.List</code> <code>servicePrimitive</code>, or <code>null</code> if not present
     */
    List<ServicePrimitive> getServicePrimitive();
    
    /**
     * Initial set of configuration primitives.
     *
     *
     *
     * @return <code>java.util.List</code> <code>initialConfigPrimitive</code>, or <code>null</code> if not present
     */
    List<InitialConfigPrimitive> getInitialConfigPrimitive();
    
    /**
     * Configuration template for each VNF
     *
     *
     *
     * @return <code>java.lang.String</code> <code>configTemplate</code>, or <code>null</code> if not present
     */
    java.lang.String getConfigTemplate();

}

