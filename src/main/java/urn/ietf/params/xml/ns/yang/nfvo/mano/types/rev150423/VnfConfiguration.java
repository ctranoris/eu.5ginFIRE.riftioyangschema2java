package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping vnf-configuration {
 *     container vnf-configuration {
 *         choice config-method {
 *             case juju {
 *                 container juju {
 *                     leaf charm {
 *                         type string;
 *                     }
 *                 }
 *             }
 *             case netconf {
 *                 container netconf {
 *                     leaf target {
 *                         type enumeration;
 *                     }
 *                     leaf protocol {
 *                         type enumeration;
 *                     }
 *                     leaf port {
 *                         type port-number;
 *                     }
 *                 }
 *             }
 *             case rest {
 *                 container rest {
 *                     leaf port {
 *                         type port-number;
 *                     }
 *                 }
 *             }
 *             case script {
 *                 container script {
 *                     leaf script-type {
 *                         type enumeration;
 *                     }
 *                 }
 *             }
 *         }
 *         container config-access {
 *             leaf mgmt-ip-address {
 *                 type ip-address;
 *             }
 *             leaf username {
 *                 type string;
 *             }
 *             leaf password {
 *                 type string;
 *             }
 *         }
 *         container config-attributes {
 *             leaf config-priority {
 *                 type uint64;
 *             }
 *             leaf config-delay {
 *                 type uint64;
 *             }
 *         }
 *         list service-primitive {
 *             key "name"
 *             leaf name {
 *                 type string;
 *             }
 *             list parameter {
 *                 key "name"
 *                 leaf name {
 *                     type string;
 *                 }
 *                 leaf data-type {
 *                     type parameter-data-type;
 *                 }
 *                 leaf mandatory {
 *                     type mandatory;
 *                 }
 *                 leaf default-value {
 *                     type string;
 *                 }
 *                 leaf parameter-pool {
 *                     type string;
 *                 }
 *                 leaf read-only {
 *                     type boolean;
 *                 }
 *                 leaf hidden {
 *                     type boolean;
 *                 }
 *                 uses primitive-parameter;
 *             }
 *         }
 *         list initial-config-primitive {
 *             key "seq"
 *             leaf seq {
 *                 type uint64;
 *             }
 *             leaf name {
 *                 type string;
 *             }
 *             leaf user-defined-script {
 *                 type string;
 *             }
 *             list parameter {
 *                 key "name"
 *                 leaf name {
 *                     type string;
 *                 }
 *                 leaf value {
 *                     type string;
 *                 }
 *             }
 *             uses initial-config;
 *         }
 *         leaf config-template {
 *             type string;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mano-types/vnf-configuration</i>
 *
 */
public interface VnfConfiguration
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2015-04-23", "vnf-configuration").intern();

    /**
     * Information about the VNF configuration. Note: If the NS contains multiple 
     * instances of the same VNF, each instance could have a different configuration.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.VnfConfiguration</code> <code>vnfConfiguration</code>, or <code>null</code> if not present
     */
    urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.VnfConfiguration getVnfConfiguration();

}

