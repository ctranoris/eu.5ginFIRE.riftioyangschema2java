package urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.catalog.Vnfd;

import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Virtual Network Function Descriptor (VNFD).
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>vnfd</b>
 * <pre>
 * container vnfd-catalog {
 *     list vnfd {
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
 *         leaf logo {
 *             type string;
 *         }
 *         leaf description {
 *             type string;
 *         }
 *         leaf version {
 *             type string;
 *         }
 *         container mgmt-interface {
 *             choice endpoint-type {
 *                 case cp {
 *                     leaf cp {
 *                         type leafref;
 *                     }
 *                 }
 *                 case ip {
 *                     leaf ip-address {
 *                         type ip-address;
 *                     }
 *                 }
 *                 case vdu-id {
 *                     leaf vdu-id {
 *                         type leafref;
 *                     }
 *                 }
 *             }
 *             leaf port {
 *                 type port-number;
 *             }
 *             container dashboard-params {
 *                 leaf path {
 *                     type string;
 *                 }
 *                 leaf https {
 *                     type boolean;
 *                 }
 *                 leaf port {
 *                     type port-number;
 *                 }
 *             }
 *         }
 *         list internal-vld {
 *             key "id"
 *             leaf id {
 *                 type string;
 *             }
 *             leaf name {
 *                 type string;
 *             }
 *             leaf short-name {
 *                 type string;
 *             }
 *             leaf description {
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
 *             list internal-connection-point {
 *                 key "id-ref"
 *                 leaf id-ref {
 *                     type leafref;
 *                 }
 *             }
 *             choice init-params {
 *                 case vim-network-profile {
 *                     leaf ip-profile-ref {
 *                         type leafref;
 *                     }
 *                 }
 *                 case vim-network-ref {
 *                     leaf vim-network-name {
 *                         type string;
 *                     }
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
 *         list connection-point {
 *             key "name"
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
 *         list vdu {
 *             key "id"
 *             leaf id {
 *                 type string;
 *             }
 *             leaf name {
 *                 type string;
 *             }
 *             leaf description {
 *                 type string;
 *             }
 *             leaf count {
 *                 type uint64;
 *             }
 *             leaf mgmt-vpci {
 *                 type string;
 *             }
 *             list alarm {
 *                 key "alarm-id"
 *                 leaf alarm-id {
 *                     type string;
 *                 }
 *                 leaf name {
 *                     type string;
 *                 }
 *                 leaf description {
 *                     type string;
 *                 }
 *                 leaf vdur-id {
 *                     type string;
 *                 }
 *                 container actions {
 *                     list ok {
 *                         key "url"
 *                         leaf url {
 *                             type string;
 *                         }
 *                     }
 *                     list insufficient-data {
 *                         key "url"
 *                         leaf url {
 *                             type string;
 *                         }
 *                     }
 *                     list alarm {
 *                         key "url"
 *                         leaf url {
 *                             type string;
 *                         }
 *                     }
 *                 }
 *                 leaf repeat {
 *                     type repeat;
 *                 }
 *                 leaf enabled {
 *                     type enabled;
 *                 }
 *                 leaf severity {
 *                     type alarm-severity-type;
 *                 }
 *                 leaf metric {
 *                     type alarm-metric-type;
 *                 }
 *                 leaf statistic {
 *                     type alarm-statistic-type;
 *                 }
 *                 leaf operation {
 *                     type alarm-operation-type;
 *                 }
 *                 leaf value {
 *                     type decimal64;
 *                 }
 *                 leaf period {
 *                     type uint32;
 *                 }
 *                 leaf evaluations {
 *                     type uint32;
 *                 }
 *                 uses alarm;
 *             }
 *             choice cloud-init-input {
 *                 case filename {
 *                     leaf cloud-init-file {
 *                         type string;
 *                     }
 *                 }
 *                 case inline {
 *                     leaf cloud-init {
 *                         type string;
 *                     }
 *                 }
 *             }
 *             list internal-connection-point {
 *                 key "id"
 *                 leaf name {
 *                     type string;
 *                 }
 *                 leaf id {
 *                     type string;
 *                 }
 *                 leaf short-name {
 *                     type string;
 *                 }
 *                 leaf type {
 *                     type connection-point-type;
 *                 }
 *                 leaf port-security-enabled {
 *                     type boolean;
 *                 }
 *                 uses common-connection-point;
 *             }
 *             list internal-interface {
 *                 key "name"
 *                 leaf name {
 *                     type string;
 *                 }
 *                 leaf vdu-internal-connection-point-ref {
 *                     type leafref;
 *                 }
 *                 container virtual-interface {
 *                     leaf type {
 *                         type type;
 *                     }
 *                     leaf vpci {
 *                         type string;
 *                     }
 *                     leaf bandwidth {
 *                         type uint64;
 *                     }
 *                 }
 *                 uses virtual-interface;
 *             }
 *             list external-interface {
 *                 key "name"
 *                 leaf name {
 *                     type string;
 *                 }
 *                 leaf vnfd-connection-point-ref {
 *                     type leafref;
 *                 }
 *                 container virtual-interface {
 *                     leaf type {
 *                         type type;
 *                     }
 *                     leaf vpci {
 *                         type string;
 *                     }
 *                     leaf bandwidth {
 *                         type uint64;
 *                     }
 *                 }
 *                 uses virtual-interface;
 *             }
 *             list volumes {
 *                 key "name"
 *                 leaf name {
 *                     type string;
 *                 }
 *                 leaf description {
 *                     type string;
 *                 }
 *                 leaf size {
 *                     type uint64;
 *                 }
 *                 choice volume-source {
 *                     case ephemeral {
 *                         leaf ephemeral {
 *                             type empty;
 *                         }
 *                     }
 *                     case image {
 *                         leaf image {
 *                             type string;
 *                         }
 *                         leaf image-checksum {
 *                             type string;
 *                         }
 *                     }
 *                 }
 *                 leaf device-bus {
 *                     type enumeration;
 *                 }
 *                 leaf device-type {
 *                     type enumeration;
 *                 }
 *                 uses volume-info;
 *             }
 *             container hypervisor-epa {
 *                 leaf type {
 *                     type enumeration;
 *                 }
 *                 leaf version {
 *                     type string;
 *                 }
 *             }
 *             container vm-flavor {
 *                 leaf vcpu-count {
 *                     type uint16;
 *                 }
 *                 leaf memory-mb {
 *                     type uint64;
 *                 }
 *                 leaf storage-gb {
 *                     type uint64;
 *                 }
 *             }
 *             container vswitch-epa {
 *                 leaf ovs-acceleration {
 *                     type enumeration;
 *                 }
 *                 leaf ovs-offload {
 *                     type enumeration;
 *                 }
 *             }
 *             leaf image {
 *                 type string;
 *             }
 *             leaf image-checksum {
 *                 type string;
 *             }
 *             container guest-epa {
 *                 leaf trusted-execution {
 *                     type boolean;
 *                 }
 *                 leaf mempage-size {
 *                     type enumeration;
 *                 }
 *                 leaf cpu-pinning-policy {
 *                     type cpu-pinning-policy;
 *                 }
 *                 leaf cpu-thread-pinning-policy {
 *                     type enumeration;
 *                 }
 *                 list pcie-device {
 *                     key "device-id"
 *                     leaf device-id {
 *                         type string;
 *                     }
 *                     leaf count {
 *                         type uint64;
 *                     }
 *                 }
 *                 choice numa-policy {
 *                     case numa-aware {
 *                         container numa-node-policy {
 *                             leaf node-cnt {
 *                                 type uint16;
 *                             }
 *                             leaf mem-policy {
 *                                 type enumeration;
 *                             }
 *                             list node {
 *                                 key "id"
 *                                 leaf id {
 *                                     type uint64;
 *                                 }
 *                                 list vcpu {
 *                                     key "id"
 *                                     leaf id {
 *                                         type uint64;
 *                                     }
 *                                 }
 *                                 leaf memory-mb {
 *                                     type uint64;
 *                                 }
 *                                 choice om-numa-type {
 *                                     case cores {
 *                                         leaf num-cores {
 *                                             type uint8;
 *                                         }
 *                                     }
 *                                     case paired-threads {
 *                                         container paired-threads {
 *                                             leaf num-paired-threads {
 *                                                 type uint8;
 *                                             }
 *                                             list paired-thread-ids {
 *                                                 key "thread-a"
 *                                                 leaf thread-a {
 *                                                     type uint8;
 *                                                 }
 *                                                 leaf thread-b {
 *                                                     type uint8;
 *                                                 }
 *                                             }
 *                                         }
 *                                     }
 *                                     case threads {
 *                                         leaf num-threads {
 *                                             type uint8;
 *                                         }
 *                                     }
 *                                 }
 *                             }
 *                         }
 *                     }
 *                     case numa-unaware {
 *                         leaf numa-unaware {
 *                             type empty;
 *                         }
 *                     }
 *                 }
 *             }
 *             container host-epa {
 *                 leaf cpu-model {
 *                     type enumeration;
 *                 }
 *                 leaf cpu-arch {
 *                     type enumeration;
 *                 }
 *                 leaf cpu-vendor {
 *                     type enumeration;
 *                 }
 *                 leaf cpu-socket-count {
 *                     type uint64;
 *                 }
 *                 leaf cpu-core-count {
 *                     type uint64;
 *                 }
 *                 leaf cpu-core-thread-count {
 *                     type uint64;
 *                 }
 *                 list cpu-feature {
 *                     key "feature"
 *                     leaf feature {
 *                         type cpu-feature-type;
 *                     }
 *                 }
 *                 leaf om-cpu-model-string {
 *                     type string;
 *                 }
 *                 list om-cpu-feature {
 *                     key "feature"
 *                     leaf feature {
 *                         type string;
 *                     }
 *                 }
 *             }
 *             container supplemental-boot-data {
 *                 leaf boot-data-drive {
 *                     type boot-data-drive;
 *                 }
 *                 list config-file {
 *                     key "source"
 *                     leaf source {
 *                         type string;
 *                     }
 *                     leaf dest {
 *                         type string;
 *                     }
 *                 }
 *                 uses config-file;
 *             }
 *             uses guest-epa;
 *             uses hypervisor-epa;
 *             uses vm-flavor;
 *             uses vswitch-epa;
 *             uses image-properties;
 *             uses host-epa;
 *             uses supplemental-boot-data;
 *         }
 *         list vdu-dependency {
 *             key "vdu-source-ref"
 *             leaf vdu-source-ref {
 *                 type leafref;
 *             }
 *             leaf vdu-depends-on-ref {
 *                 type leafref;
 *             }
 *         }
 *         leaf service-function-chain {
 *             type service-function-chain;
 *         }
 *         leaf service-function-type {
 *             type string;
 *         }
 *         list placement-groups {
 *             key "name"
 *             list member-vdus {
 *                 key "member-vdu-ref"
 *                 leaf member-vdu-ref {
 *                     type leafref;
 *                 }
 *             }
 *             leaf name {
 *                 type string;
 *             }
 *             leaf requirement {
 *                 type string;
 *             }
 *             leaf strategy {
 *                 type strategy;
 *             }
 *             uses placement-group-info;
 *         }
 *         container vnf-configuration {
 *             choice config-method {
 *                 case juju {
 *                     container juju {
 *                         leaf charm {
 *                             type string;
 *                         }
 *                     }
 *                 }
 *                 case netconf {
 *                     container netconf {
 *                         leaf target {
 *                             type enumeration;
 *                         }
 *                         leaf protocol {
 *                             type enumeration;
 *                         }
 *                         leaf port {
 *                             type port-number;
 *                         }
 *                     }
 *                 }
 *                 case rest {
 *                     container rest {
 *                         leaf port {
 *                             type port-number;
 *                         }
 *                     }
 *                 }
 *                 case script {
 *                     container script {
 *                         leaf script-type {
 *                             type enumeration;
 *                         }
 *                     }
 *                 }
 *             }
 *             container config-access {
 *                 leaf mgmt-ip-address {
 *                     type ip-address;
 *                 }
 *                 leaf username {
 *                     type string;
 *                 }
 *                 leaf password {
 *                     type string;
 *                 }
 *             }
 *             container config-attributes {
 *                 leaf config-priority {
 *                     type uint64;
 *                 }
 *                 leaf config-delay {
 *                     type uint64;
 *                 }
 *             }
 *             list service-primitive {
 *                 key "name"
 *                 leaf name {
 *                     type string;
 *                 }
 *                 list parameter {
 *                     key "name"
 *                     leaf name {
 *                         type string;
 *                     }
 *                     leaf data-type {
 *                         type parameter-data-type;
 *                     }
 *                     leaf mandatory {
 *                         type mandatory;
 *                     }
 *                     leaf default-value {
 *                         type string;
 *                     }
 *                     leaf parameter-pool {
 *                         type string;
 *                     }
 *                     leaf read-only {
 *                         type boolean;
 *                     }
 *                     leaf hidden {
 *                         type boolean;
 *                     }
 *                     uses primitive-parameter;
 *                 }
 *             }
 *             list initial-config-primitive {
 *                 key "seq"
 *                 leaf seq {
 *                     type uint64;
 *                 }
 *                 leaf name {
 *                     type string;
 *                 }
 *                 leaf user-defined-script {
 *                     type string;
 *                 }
 *                 list parameter {
 *                     key "name"
 *                     leaf name {
 *                         type string;
 *                     }
 *                     leaf value {
 *                         type string;
 *                     }
 *                 }
 *                 uses initial-config;
 *             }
 *             leaf config-template {
 *                 type string;
 *             }
 *         }
 *         list ip-profiles {
 *             key "name"
 *             leaf name {
 *                 type string;
 *             }
 *             leaf description {
 *                 type string;
 *             }
 *             container ip-profile-params {
 *                 leaf ip-version {
 *                     type ip-version;
 *                 }
 *                 leaf subnet-address {
 *                     type ip-prefix;
 *                 }
 *                 leaf gateway-address {
 *                     type ip-address;
 *                 }
 *                 leaf security-group {
 *                     type string;
 *                 }
 *                 list dns-server {
 *                     key "address"
 *                     leaf address {
 *                         type ip-address;
 *                     }
 *                 }
 *                 container dhcp-params {
 *                     leaf enabled {
 *                         type enabled;
 *                     }
 *                     leaf start-address {
 *                         type ip-address;
 *                     }
 *                     leaf count {
 *                         type uint32;
 *                     }
 *                 }
 *                 leaf subnet-prefix-pool {
 *                     type string;
 *                 }
 *             }
 *             uses ip-profile-info;
 *         }
 *         uses vnfd-descriptor;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vnfd/vnfd-catalog</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.VnfdCatalogBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.VnfdCatalogBuilder
 *
 */
public interface VnfdCatalog
    extends
    ChildOf<VnfdData>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.VnfdCatalog>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:vnfd",
        "2015-09-10", "vnfd-catalog").intern();

    /**
     * @return <code>java.util.List</code> <code>vnfd</code>, or <code>null</code> if not present
     */
    List<Vnfd> getVnfd();

}

