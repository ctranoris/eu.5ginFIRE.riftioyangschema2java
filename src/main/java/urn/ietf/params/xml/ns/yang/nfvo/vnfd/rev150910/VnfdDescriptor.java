package urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.IpProfileList;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.VnfConfiguration;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.MonitoringParam;
import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.ConnectionPoint;
import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.InternalVld;
import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.MgmtInterface;
import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.PlacementGroups;
import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.Vdu;
import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.VduDependency;

import java.util.List;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>vnfd</b>
 * <pre>
 * grouping vnfd-descriptor {
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
 *     leaf logo {
 *         type string;
 *     }
 *     leaf description {
 *         type string;
 *     }
 *     leaf version {
 *         type string;
 *     }
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
 *     container mgmt-interface {
 *         choice endpoint-type {
 *             case cp {
 *                 leaf cp {
 *                     type leafref;
 *                 }
 *             }
 *             case ip {
 *                 leaf ip-address {
 *                     type ip-address;
 *                 }
 *             }
 *             case vdu-id {
 *                 leaf vdu-id {
 *                     type leafref;
 *                 }
 *             }
 *         }
 *         leaf port {
 *             type port-number;
 *         }
 *         container dashboard-params {
 *             leaf path {
 *                 type string;
 *             }
 *             leaf https {
 *                 type boolean;
 *             }
 *             leaf port {
 *                 type port-number;
 *             }
 *         }
 *     }
 *     list internal-vld {
 *         key "id"
 *         leaf id {
 *             type string;
 *         }
 *         leaf name {
 *             type string;
 *         }
 *         leaf short-name {
 *             type string;
 *         }
 *         leaf description {
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
 *         list internal-connection-point {
 *             key "id-ref"
 *             leaf id-ref {
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
 *         choice init-params {
 *             case vim-network-profile {
 *                 leaf ip-profile-ref {
 *                     type leafref;
 *                 }
 *             }
 *             case vim-network-ref {
 *                 leaf vim-network-name {
 *                     type string;
 *                 }
 *             }
 *         }
 *         uses provider-network;
 *     }
 *     list ip-profiles {
 *         key "name"
 *         leaf name {
 *             type string;
 *         }
 *         leaf description {
 *             type string;
 *         }
 *         container ip-profile-params {
 *             leaf ip-version {
 *                 type ip-version;
 *             }
 *             leaf subnet-address {
 *                 type ip-prefix;
 *             }
 *             leaf gateway-address {
 *                 type ip-address;
 *             }
 *             leaf security-group {
 *                 type string;
 *             }
 *             list dns-server {
 *                 key "address"
 *                 leaf address {
 *                     type ip-address;
 *                 }
 *             }
 *             container dhcp-params {
 *                 leaf enabled {
 *                     type enabled;
 *                 }
 *                 leaf start-address {
 *                     type ip-address;
 *                 }
 *                 leaf count {
 *                     type uint32;
 *                 }
 *             }
 *             leaf subnet-prefix-pool {
 *                 type string;
 *             }
 *         }
 *         uses ip-profile-info;
 *     }
 *     list connection-point {
 *         key "name"
 *         leaf name {
 *             type string;
 *         }
 *         leaf id {
 *             type string;
 *         }
 *         leaf short-name {
 *             type string;
 *         }
 *         leaf type {
 *             type connection-point-type;
 *         }
 *         leaf port-security-enabled {
 *             type boolean;
 *         }
 *         uses common-connection-point;
 *     }
 *     list vdu {
 *         key "id"
 *         leaf id {
 *             type string;
 *         }
 *         leaf name {
 *             type string;
 *         }
 *         leaf description {
 *             type string;
 *         }
 *         leaf count {
 *             type uint64;
 *         }
 *         leaf mgmt-vpci {
 *             type string;
 *         }
 *         container vm-flavor {
 *             leaf vcpu-count {
 *                 type uint16;
 *             }
 *             leaf memory-mb {
 *                 type uint64;
 *             }
 *             leaf storage-gb {
 *                 type uint64;
 *             }
 *         }
 *         container guest-epa {
 *             leaf trusted-execution {
 *                 type boolean;
 *             }
 *             leaf mempage-size {
 *                 type enumeration;
 *             }
 *             leaf cpu-pinning-policy {
 *                 type cpu-pinning-policy;
 *             }
 *             leaf cpu-thread-pinning-policy {
 *                 type enumeration;
 *             }
 *             list pcie-device {
 *                 key "device-id"
 *                 leaf device-id {
 *                     type string;
 *                 }
 *                 leaf count {
 *                     type uint64;
 *                 }
 *             }
 *             choice numa-policy {
 *                 case numa-aware {
 *                     container numa-node-policy {
 *                         leaf node-cnt {
 *                             type uint16;
 *                         }
 *                         leaf mem-policy {
 *                             type enumeration;
 *                         }
 *                         list node {
 *                             key "id"
 *                             leaf id {
 *                                 type uint64;
 *                             }
 *                             list vcpu {
 *                                 key "id"
 *                                 leaf id {
 *                                     type uint64;
 *                                 }
 *                             }
 *                             leaf memory-mb {
 *                                 type uint64;
 *                             }
 *                             choice om-numa-type {
 *                                 case cores {
 *                                     leaf num-cores {
 *                                         type uint8;
 *                                     }
 *                                 }
 *                                 case paired-threads {
 *                                     container paired-threads {
 *                                         leaf num-paired-threads {
 *                                             type uint8;
 *                                         }
 *                                         list paired-thread-ids {
 *                                             key "thread-a"
 *                                             leaf thread-a {
 *                                                 type uint8;
 *                                             }
 *                                             leaf thread-b {
 *                                                 type uint8;
 *                                             }
 *                                         }
 *                                     }
 *                                 }
 *                                 case threads {
 *                                     leaf num-threads {
 *                                         type uint8;
 *                                     }
 *                                 }
 *                             }
 *                         }
 *                     }
 *                 }
 *                 case numa-unaware {
 *                     leaf numa-unaware {
 *                         type empty;
 *                     }
 *                 }
 *             }
 *         }
 *         container vswitch-epa {
 *             leaf ovs-acceleration {
 *                 type enumeration;
 *             }
 *             leaf ovs-offload {
 *                 type enumeration;
 *             }
 *         }
 *         container hypervisor-epa {
 *             leaf type {
 *                 type enumeration;
 *             }
 *             leaf version {
 *                 type string;
 *             }
 *         }
 *         container host-epa {
 *             leaf cpu-model {
 *                 type enumeration;
 *             }
 *             leaf cpu-arch {
 *                 type enumeration;
 *             }
 *             leaf cpu-vendor {
 *                 type enumeration;
 *             }
 *             leaf cpu-socket-count {
 *                 type uint64;
 *             }
 *             leaf cpu-core-count {
 *                 type uint64;
 *             }
 *             leaf cpu-core-thread-count {
 *                 type uint64;
 *             }
 *             list cpu-feature {
 *                 key "feature"
 *                 leaf feature {
 *                     type cpu-feature-type;
 *                 }
 *             }
 *             leaf om-cpu-model-string {
 *                 type string;
 *             }
 *             list om-cpu-feature {
 *                 key "feature"
 *                 leaf feature {
 *                     type string;
 *                 }
 *             }
 *         }
 *         list alarm {
 *             key "alarm-id"
 *             leaf alarm-id {
 *                 type string;
 *             }
 *             leaf name {
 *                 type string;
 *             }
 *             leaf description {
 *                 type string;
 *             }
 *             leaf vdur-id {
 *                 type string;
 *             }
 *             container actions {
 *                 list ok {
 *                     key "url"
 *                     leaf url {
 *                         type string;
 *                     }
 *                 }
 *                 list insufficient-data {
 *                     key "url"
 *                     leaf url {
 *                         type string;
 *                     }
 *                 }
 *                 list alarm {
 *                     key "url"
 *                     leaf url {
 *                         type string;
 *                     }
 *                 }
 *             }
 *             leaf repeat {
 *                 type repeat;
 *             }
 *             leaf enabled {
 *                 type enabled;
 *             }
 *             leaf severity {
 *                 type alarm-severity-type;
 *             }
 *             leaf metric {
 *                 type alarm-metric-type;
 *             }
 *             leaf statistic {
 *                 type alarm-statistic-type;
 *             }
 *             leaf operation {
 *                 type alarm-operation-type;
 *             }
 *             leaf value {
 *                 type decimal64;
 *             }
 *             leaf period {
 *                 type uint32;
 *             }
 *             leaf evaluations {
 *                 type uint32;
 *             }
 *             uses alarm;
 *         }
 *         leaf image {
 *             type string;
 *         }
 *         leaf image-checksum {
 *             type string;
 *         }
 *         choice cloud-init-input {
 *             case filename {
 *                 leaf cloud-init-file {
 *                     type string;
 *                 }
 *             }
 *             case inline {
 *                 leaf cloud-init {
 *                     type string;
 *                 }
 *             }
 *         }
 *         container supplemental-boot-data {
 *             leaf boot-data-drive {
 *                 type boot-data-drive;
 *             }
 *             list config-file {
 *                 key "source"
 *                 leaf source {
 *                     type string;
 *                 }
 *                 leaf dest {
 *                     type string;
 *                 }
 *             }
 *             uses config-file;
 *         }
 *         list internal-connection-point {
 *             key "id"
 *             leaf name {
 *                 type string;
 *             }
 *             leaf id {
 *                 type string;
 *             }
 *             leaf short-name {
 *                 type string;
 *             }
 *             leaf type {
 *                 type connection-point-type;
 *             }
 *             leaf port-security-enabled {
 *                 type boolean;
 *             }
 *             uses common-connection-point;
 *         }
 *         list internal-interface {
 *             key "name"
 *             leaf name {
 *                 type string;
 *             }
 *             leaf vdu-internal-connection-point-ref {
 *                 type leafref;
 *             }
 *             container virtual-interface {
 *                 leaf type {
 *                     type type;
 *                 }
 *                 leaf vpci {
 *                     type string;
 *                 }
 *                 leaf bandwidth {
 *                     type uint64;
 *                 }
 *             }
 *             uses virtual-interface;
 *         }
 *         list external-interface {
 *             key "name"
 *             leaf name {
 *                 type string;
 *             }
 *             leaf vnfd-connection-point-ref {
 *                 type leafref;
 *             }
 *             container virtual-interface {
 *                 leaf type {
 *                     type type;
 *                 }
 *                 leaf vpci {
 *                     type string;
 *                 }
 *                 leaf bandwidth {
 *                     type uint64;
 *                 }
 *             }
 *             uses virtual-interface;
 *         }
 *         list volumes {
 *             key "name"
 *             leaf name {
 *                 type string;
 *             }
 *             leaf description {
 *                 type string;
 *             }
 *             leaf size {
 *                 type uint64;
 *             }
 *             choice volume-source {
 *                 case ephemeral {
 *                     leaf ephemeral {
 *                         type empty;
 *                     }
 *                 }
 *                 case image {
 *                     leaf image {
 *                         type string;
 *                     }
 *                     leaf image-checksum {
 *                         type string;
 *                     }
 *                 }
 *             }
 *             leaf device-bus {
 *                 type enumeration;
 *             }
 *             leaf device-type {
 *                 type enumeration;
 *             }
 *             uses volume-info;
 *         }
 *         uses guest-epa;
 *         uses hypervisor-epa;
 *         uses vm-flavor;
 *         uses vswitch-epa;
 *         uses image-properties;
 *         uses host-epa;
 *         uses supplemental-boot-data;
 *     }
 *     list vdu-dependency {
 *         key "vdu-source-ref"
 *         leaf vdu-source-ref {
 *             type leafref;
 *         }
 *         leaf vdu-depends-on-ref {
 *             type leafref;
 *         }
 *     }
 *     leaf service-function-chain {
 *         type service-function-chain;
 *     }
 *     leaf service-function-type {
 *         type string;
 *     }
 *     list placement-groups {
 *         key "name"
 *         leaf name {
 *             type string;
 *         }
 *         leaf requirement {
 *             type string;
 *         }
 *         leaf strategy {
 *             type strategy;
 *         }
 *         list member-vdus {
 *             key "member-vdu-ref"
 *             leaf member-vdu-ref {
 *                 type leafref;
 *             }
 *         }
 *         uses placement-group-info;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vnfd/vnfd-descriptor</i>
 *
 */
public interface VnfdDescriptor
    extends
    DataObject,
    IpProfileList,
    VnfConfiguration
{


    public enum ServiceFunctionChain {
        UNAWARE(0, "UNAWARE"),
        
        CLASSIFIER(1, "CLASSIFIER"),
        
        SF(2, "SF"),
        
        SFF(3, "SFF")
        ;
    
        private static final java.util.Map<java.lang.Integer, ServiceFunctionChain> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, ServiceFunctionChain> b = com.google.common.collect.ImmutableMap.builder();
            for (ServiceFunctionChain enumItem : ServiceFunctionChain.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private ServiceFunctionChain(int value, java.lang.String name) {
            this.value = value;
            this.name = name;
        }
    
        /**
         * Returns the name of the enumeration item as it is specified in the input yang.
         *
         * @return the name of the enumeration item as it is specified in the input yang
         */
        public java.lang.String getName() {
            return name;
        }
    
        /**
         * @return integer value
         */
        public int getIntValue() {
            return value;
        }
    
        /**
         * @param valueArg integer value
         * @return corresponding ServiceFunctionChain item
         */
        public static ServiceFunctionChain forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:vnfd",
        "2015-09-10", "vnfd-descriptor").intern();

    /**
     * Identifier for the VNFD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    java.lang.String getId();
    
    /**
     * VNFD name.
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
     * Vendor of the VNFD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vendor</code>, or <code>null</code> if not present
     */
    java.lang.String getVendor();
    
    /**
     * Vendor logo for the Virtual Network Function
     *
     *
     *
     * @return <code>java.lang.String</code> <code>logo</code>, or <code>null</code> if not present
     */
    java.lang.String getLogo();
    
    /**
     * Description of the VNFD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    java.lang.String getDescription();
    
    /**
     * Version of the VNFD
     *
     *
     *
     * @return <code>java.lang.String</code> <code>version</code>, or <code>null</code> if not present
     */
    java.lang.String getVersion();
    
    /**
     * Interface over which the VNF is managed.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.MgmtInterface</code> <code>mgmtInterface</code>, or <code>null</code> if not present
     */
    MgmtInterface getMgmtInterface();
    
    /**
     * List of Internal Virtual Link Descriptors (VLD). The internal VLD describes the 
     * basic topology of the connectivity such as E-LAN, E-Line, E-Tree. between 
     * internal VNF components of the system.
     *
     *
     *
     * @return <code>java.util.List</code> <code>internalVld</code>, or <code>null</code> if not present
     */
    List<InternalVld> getInternalVld();
    
    /**
     * List for external connection points. Each VNF has one or more external 
     * connection points that connect the VNF to other VNFs or to external networks. 
     * Each VNF exposes connection points to the orchestrator, which can construct 
     * network services by connecting the connection points between different VNFs. The
     * NFVO will use VLDs and VNFFGs at the network service level to construct network 
     * services.
     *
     *
     *
     * @return <code>java.util.List</code> <code>connectionPoint</code>, or <code>null</code> if not present
     */
    List<ConnectionPoint> getConnectionPoint();
    
    /**
     * List of Virtual Deployment Units
     *
     *
     *
     * @return <code>java.util.List</code> <code>vdu</code>, or <code>null</code> if not present
     */
    List<Vdu> getVdu();
    
    /**
     * List of VDU dependencies.
     *
     *
     *
     * @return <code>java.util.List</code> <code>vduDependency</code>, or <code>null</code> if not present
     */
    List<VduDependency> getVduDependency();
    
    /**
     * Type of node in Service Function Chaining Architecture
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.VnfdDescriptor.ServiceFunctionChain</code> <code>serviceFunctionChain</code>, or <code>null</code> if not present
     */
    ServiceFunctionChain getServiceFunctionChain();
    
    /**
     * Type of Service Function. NOTE: This needs to map with Service Function Type in 
     * ODL to support VNFFG. Service Function Type is mandatory param in ODL SFC. This 
     * is temporarily set to string for ease of use
     *
     *
     *
     * @return <code>java.lang.String</code> <code>serviceFunctionType</code>, or <code>null</code> if not present
     */
    java.lang.String getServiceFunctionType();
    
    /**
     * List of placement groups at VNF level
     *
     *
     *
     * @return <code>java.util.List</code> <code>placementGroups</code>, or <code>null</code> if not present
     */
    List<PlacementGroups> getPlacementGroups();
    
    
    /**
     * List of monitoring parameters from VNFs that should be propogated up into NSR
     *
     *
     *
     * @return <code>java.util.List</code> <code>monitoringParam</code>, or <code>null</code> if not present
     */
    List<MonitoringParam> getMonitoringParam();

}

