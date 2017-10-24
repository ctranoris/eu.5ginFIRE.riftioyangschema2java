package urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027;
import java.util.List;

import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.InputParameterXpath;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.IpProfileList;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.ConnectionPoint;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.ConstituentVnfd;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.InitialConfigPrimitive;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.KeyPair;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.MonitoringParam;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.ParameterPool;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.PlacementGroups;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.ScalingGroupDescriptor;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.ServicePrimitive;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.User;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.Vld;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.VnfDependency;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.Vnffgd;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>nsd</b>
 * <pre>
 * grouping nsd-descriptor {
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
 *     list connection-point {
 *         key "name"
 *         leaf name {
 *             type string;
 *         }
 *         leaf type {
 *             type connection-point-type;
 *         }
 *     }
 *     list vld {
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
 *             key "member-vnf-index-ref" 
 *         "vnfd-connection-point-ref"
 *             leaf member-vnf-index-ref {
 *                 type string;
 *             }
 *             leaf vnfd-id-ref {
 *                 type leafref;
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
 *         leaf mgmt-network {
 *             type mgmt-network;
 *         }
 *         choice init-params {
 *             case vim-network-profile {
 *                 leaf ip-profile-ref {
 *                     type string;
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
 *     list constituent-vnfd {
 *         key "member-vnf-index"
 *         leaf member-vnf-index {
 *             type uint64;
 *         }
 *         leaf vnfd-id-ref {
 *             type leafref;
 *         }
 *         leaf start-by-default {
 *             type start-by-default;
 *         }
 *     }
 *     list scaling-group-descriptor {
 *         key "name"
 *         leaf name {
 *             type string;
 *         }
 *         list scaling-policy {
 *             key "name"
 *             leaf name {
 *                 type string;
 *             }
 *             leaf scaling-type {
 *                 type scaling-policy-type;
 *             }
 *             leaf enabled {
 *                 type enabled;
 *             }
 *             leaf scale-in-operation-type {
 *                 type scale-in-operation-type;
 *             }
 *             leaf scale-out-operation-type {
 *                 type scale-out-operation-type;
 *             }
 *             leaf threshold-time {
 *                 type uint32;
 *             }
 *             leaf cooldown-time {
 *                 type uint32;
 *             }
 *             list scaling-criteria {
 *                 key "name"
 *                 leaf name {
 *                     type string;
 *                 }
 *                 leaf scale-in-threshold {
 *                     type uint64;
 *                 }
 *                 leaf scale-out-threshold {
 *                     type uint64;
 *                 }
 *                 leaf ns-monitoring-param-ref {
 *                     type leafref;
 *                 }
 *             }
 *         }
 *         list vnfd-member {
 *             key "member-vnf-index-ref"
 *             leaf member-vnf-index-ref {
 *                 type leafref;
 *             }
 *             leaf count {
 *                 type count;
 *             }
 *         }
 *         leaf min-instance-count {
 *             type min-instance-count;
 *         }
 *         leaf max-instance-count {
 *             type max-instance-count;
 *         }
 *         list scaling-config-action {
 *             key "trigger"
 *             leaf trigger {
 *                 type scaling-trigger;
 *             }
 *             leaf ns-config-primitive-name-ref {
 *                 type leafref;
 *             }
 *         }
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
 *         list member-vnfd {
 *             key "member-vnf-index-ref"
 *             leaf member-vnf-index-ref {
 *                 type leafref;
 *             }
 *             leaf vnfd-id-ref {
 *                 type leafref;
 *             }
 *         }
 *         uses placement-group-info;
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
 *     list vnf-dependency {
 *         key "vnf-source-ref"
 *         leaf vnf-source-ref {
 *             type leafref;
 *         }
 *         leaf vnf-depends-on-ref {
 *             type leafref;
 *         }
 *     }
 *     list vnffgd {
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
 *         leaf vendor {
 *             type string;
 *         }
 *         leaf description {
 *             type string;
 *         }
 *         leaf version {
 *             type string;
 *         }
 *         list rsp {
 *             key "id"
 *             leaf id {
 *                 type string;
 *             }
 *             leaf name {
 *                 type string;
 *             }
 *             list vnfd-connection-point-ref {
 *                 key "member-vnf-index-ref"
 *                 leaf member-vnf-index-ref {
 *                     type leafref;
 *                 }
 *                 leaf order {
 *                     type uint8;
 *                 }
 *                 leaf vnfd-id-ref {
 *                     type leafref;
 *                 }
 *                 leaf vnfd-connection-point-ref {
 *                     type leafref;
 *                 }
 *             }
 *         }
 *         list classifier {
 *             key "id"
 *             leaf id {
 *                 type string;
 *             }
 *             leaf name {
 *                 type string;
 *             }
 *             leaf rsp-id-ref {
 *                 type leafref;
 *             }
 *             leaf member-vnf-index-ref {
 *                 type leafref;
 *             }
 *             leaf vnfd-id-ref {
 *                 type leafref;
 *             }
 *             leaf vnfd-connection-point-ref {
 *                 type leafref;
 *             }
 *             list match-attributes {
 *                 key "id"
 *                 leaf id {
 *                     type string;
 *                 }
 *                 leaf ip-proto {
 *                     type uint8;
 *                 }
 *                 leaf source-ip-address {
 *                     type ip-address;
 *                 }
 *                 leaf destination-ip-address {
 *                     type ip-address;
 *                 }
 *                 leaf source-port {
 *                     type port-number;
 *                 }
 *                 leaf destination-port {
 *                     type port-number;
 *                 }
 *             }
 *         }
 *     }
 *     list monitoring-param {
 *         key "id"
 *         leaf id {
 *             type string;
 *         }
 *         leaf name {
 *             type string;
 *         }
 *         leaf value-type {
 *             type value-type;
 *         }
 *         container numeric-constraints {
 *             leaf min-value {
 *                 type uint64;
 *             }
 *             leaf max-value {
 *                 type uint64;
 *             }
 *         }
 *         container text-constraints {
 *             leaf min-length {
 *                 type uint8;
 *             }
 *             leaf max-length {
 *                 type uint8;
 *             }
 *         }
 *         leaf value-integer {
 *             type int64;
 *         }
 *         leaf value-decimal {
 *             type decimal64;
 *         }
 *         leaf value-string {
 *             type string;
 *         }
 *         leaf description {
 *             type string;
 *         }
 *         leaf group-tag {
 *             type string;
 *         }
 *         leaf widget-type {
 *             type widget-type;
 *         }
 *         leaf units {
 *             type string;
 *         }
 *         leaf aggregation-type {
 *             type aggregation-type;
 *         }
 *         list vnfd-monitoring-param {
 *             key "member-vnf-index-ref" 
 *         "vnfd-monitoring-param-ref"
 *             leaf vnfd-id-ref {
 *                 type leafref;
 *             }
 *             leaf vnfd-monitoring-param-ref {
 *                 type leafref;
 *             }
 *             leaf member-vnf-index-ref {
 *                 type leafref;
 *             }
 *         }
 *         uses monitoring-param-aggregation;
 *         uses monitoring-param-ui-data;
 *         uses monitoring-param-value;
 *     }
 *     list input-parameter-xpath {
 *         key "xpath"
 *         leaf xpath {
 *             type string;
 *         }
 *         leaf label {
 *             type string;
 *         }
 *         leaf default-value {
 *             type string;
 *         }
 *     }
 *     list parameter-pool {
 *         key "name"
 *         leaf name {
 *             type string;
 *         }
 *         container range {
 *             leaf start-value {
 *                 type uint32;
 *             }
 *             leaf end-value {
 *                 type uint32;
 *             }
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
 *         list parameter-group {
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
 *             leaf mandatory {
 *                 type mandatory;
 *             }
 *         }
 *         list vnf-primitive-group {
 *             key "member-vnf-index-ref"
 *             leaf member-vnf-index-ref {
 *                 type leafref;
 *             }
 *             leaf vnfd-id-ref {
 *                 type leafref;
 *             }
 *             leaf vnfd-name {
 *                 type leafref;
 *             }
 *             list primitive {
 *                 key "index"
 *                 leaf index {
 *                     type uint32;
 *                 }
 *                 leaf name {
 *                     type string;
 *                 }
 *             }
 *         }
 *         leaf user-defined-script {
 *             type string;
 *         }
 *         uses ui-primitive-group;
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
 *     list key-pair {
 *         key "name"
 *         leaf name {
 *             type string;
 *         }
 *         leaf akey {
 *             type string;
 *         }
 *     }
 *     list user {
 *         key "name"
 *         leaf name {
 *             type string;
 *         }
 *         leaf user-info {
 *             type string;
 *         }
 *         list key-pair {
 *             key "name"
 *             leaf name {
 *                 type string;
 *             }
 *             leaf akey {
 *                 type string;
 *             }
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>nsd/nsd-descriptor</i>
 *
 */
public interface NsdDescriptor
    extends
    DataObject,
    IpProfileList,
    InputParameterXpath
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsd",
        "2014-10-27", "nsd-descriptor").intern();

    /**
     * Identifier for the NSD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    java.lang.String getId();
    
    /**
     * NSD name.
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
     * Vendor of the NSD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vendor</code>, or <code>null</code> if not present
     */
    java.lang.String getVendor();
    
    /**
     * File path for the vendor-specific logo. For example, icons/mylogo.png. The logo 
     * should be part of the network service
     *
     *
     *
     * @return <code>java.lang.String</code> <code>logo</code>, or <code>null</code> if not present
     */
    java.lang.String getLogo();
    
    /**
     * Description of the NSD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    java.lang.String getDescription();
    
    /**
     * Version of the NSD
     *
     *
     *
     * @return <code>java.lang.String</code> <code>version</code>, or <code>null</code> if not present
     */
    java.lang.String getVersion();
    
    /**
     * List for external connection points. Each network service (NS) has one or more 
     * external connection points that connect the NS to other NSs or to external 
     * networks. Each NS exposes connection points to the orchestrator, which can 
     * construct network service chains by connecting the connection points between 
     * different NSs.
     *
     *
     *
     * @return <code>java.util.List</code> <code>connectionPoint</code>, or <code>null</code> if not present
     */
    List<ConnectionPoint> getConnectionPoint();
    
    /**
     * List of Virtual Link Descriptors (VLDs).
     *
     *
     *
     * @return <code>java.util.List</code> <code>vld</code>, or <code>null</code> if not present
     */
    List<Vld> getVld();
    
    /**
     * List of VNFDs that are part of this network service.
     *
     *
     *
     * @return <code>java.util.List</code> <code>constituentVnfd</code>, or <code>null</code> if not present
     */
    List<ConstituentVnfd> getConstituentVnfd();
    
    /**
     * Scaling group descriptor within this network service. The scaling group defines 
     * a group of VNFs, and the ratio of VNFs in the network service that is used as 
     * target for scaling action
     *
     *
     *
     * @return <code>java.util.List</code> <code>scalingGroupDescriptor</code>, or <code>null</code> if not present
     */
    List<ScalingGroupDescriptor> getScalingGroupDescriptor();
    
    /**
     * List of placement groups at NS level
     *
     *
     *
     * @return <code>java.util.List</code> <code>placementGroups</code>, or <code>null</code> if not present
     */
    List<PlacementGroups> getPlacementGroups();
    
    /**
     * List of VNF dependencies.
     *
     *
     *
     * @return <code>java.util.List</code> <code>vnfDependency</code>, or <code>null</code> if not present
     */
    List<VnfDependency> getVnfDependency();
    
    /**
     * List of VNF Forwarding Graph Descriptors (VNFFGD).
     *
     *
     *
     * @return <code>java.util.List</code> <code>vnffgd</code>, or <code>null</code> if not present
     */
    List<Vnffgd> getVnffgd();
    
    /**
     * List of monitoring parameters from VNFs that should be propogated up into NSR
     *
     *
     *
     * @return <code>java.util.List</code> <code>monitoringParam</code>, or <code>null</code> if not present
     */
    List<MonitoringParam> getMonitoringParam();
    
    /**
     * Pool of parameter values from which to choose during configuration.
     *
     *
     *
     * @return <code>java.util.List</code> <code>parameterPool</code>, or <code>null</code> if not present
     */
    List<ParameterPool> getParameterPool();
    
    /**
     * Network service level service primitives.
     *
     *
     *
     * @return <code>java.util.List</code> <code>servicePrimitive</code>, or <code>null</code> if not present
     */
    List<ServicePrimitive> getServicePrimitive();
    
    /**
     * Initial set of configuration primitives for NSD.
     *
     *
     *
     * @return <code>java.util.List</code> <code>initialConfigPrimitive</code>, or <code>null</code> if not present
     */
    List<InitialConfigPrimitive> getInitialConfigPrimitive();
    
    /**
     * Used to configure the list of public keys to be injected as part of NS 
     * instantiation
     *
     *
     *
     * @return <code>java.util.List</code> <code>keyPair</code>, or <code>null</code> if not present
     */
    List<KeyPair> getKeyPair();
    
    /**
     * List of users to be added through cloud-config
     *
     *
     *
     * @return <code>java.util.List</code> <code>user</code>, or <code>null</code> if not present
     */
    List<User> getUser();

}

