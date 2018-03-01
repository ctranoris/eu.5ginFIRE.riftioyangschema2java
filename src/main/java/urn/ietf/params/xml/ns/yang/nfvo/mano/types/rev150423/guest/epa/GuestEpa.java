package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.guest.epa;
import java.util.List;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.guest.epa.GuestEpaBuilder.GuestEpaImpl;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.guest.epa.guest.epa.NumaPolicy;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.guest.epa.guest.epa.PcieDevice;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container guest-epa {
 *     leaf trusted-execution {
 *         type boolean;
 *     }
 *     leaf mempage-size {
 *         type enumeration;
 *     }
 *     leaf cpu-pinning-policy {
 *         type cpu-pinning-policy;
 *     }
 *     leaf cpu-thread-pinning-policy {
 *         type enumeration;
 *     }
 *     list pcie-device {
 *         key "device-id"
 *         leaf device-id {
 *             type string;
 *         }
 *         leaf count {
 *             type uint64;
 *         }
 *     }
 *     choice numa-policy {
 *         case numa-aware {
 *             container numa-node-policy {
 *                 leaf node-cnt {
 *                     type uint16;
 *                 }
 *                 leaf mem-policy {
 *                     type enumeration;
 *                 }
 *                 list node {
 *                     key "id"
 *                     leaf id {
 *                         type uint64;
 *                     }
 *                     list vcpu {
 *                         key "id"
 *                         leaf id {
 *                             type uint64;
 *                         }
 *                     }
 *                     leaf memory-mb {
 *                         type uint64;
 *                     }
 *                     choice om-numa-type {
 *                         case cores {
 *                             leaf num-cores {
 *                                 type uint8;
 *                             }
 *                         }
 *                         case paired-threads {
 *                             container paired-threads {
 *                                 leaf num-paired-threads {
 *                                     type uint8;
 *                                 }
 *                                 list paired-thread-ids {
 *                                     key "thread-a"
 *                                     leaf thread-a {
 *                                         type uint8;
 *                                     }
 *                                     leaf thread-b {
 *                                         type uint8;
 *                                     }
 *                                 }
 *                             }
 *                         }
 *                         case threads {
 *                             leaf num-threads {
 *                                 type uint8;
 *                             }
 *                         }
 *                     }
 *                 }
 *             }
 *         }
 *         case numa-unaware {
 *             leaf numa-unaware {
 *                 type empty;
 *             }
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mano-types/guest-epa/guest-epa</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.guest.epa.GuestEpaBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.guest.epa.GuestEpaBuilder
 *
 */
@JsonDeserialize(as = GuestEpaImpl.class)
public interface GuestEpa
    extends
    ChildOf<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.GuestEpa>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.guest.epa.GuestEpa>
{


    public enum MempageSize {
        LARGE(0, "LARGE"),
        
        SMALL(1, "SMALL"),
        
        SIZE2MB(2, "SIZE_2MB"),
        
        SIZE1GB(3, "SIZE_1GB"),
        
        PREFERLARGE(4, "PREFER_LARGE")
        ;
    
        private static final java.util.Map<java.lang.Integer, MempageSize> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, MempageSize> b = com.google.common.collect.ImmutableMap.builder();
            for (MempageSize enumItem : MempageSize.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private MempageSize(int value, java.lang.String name) {
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
         * @return corresponding MempageSize item
         */
        public static MempageSize forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }
    
    public enum CpuPinningPolicy {
        DEDICATED(0, "DEDICATED"),
        
        SHARED(1, "SHARED"),
        
        ANY(2, "ANY")
        ;
    
        private static final java.util.Map<java.lang.Integer, CpuPinningPolicy> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, CpuPinningPolicy> b = com.google.common.collect.ImmutableMap.builder();
            for (CpuPinningPolicy enumItem : CpuPinningPolicy.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private CpuPinningPolicy(int value, java.lang.String name) {
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
         * @return corresponding CpuPinningPolicy item
         */
        public static CpuPinningPolicy forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }
    
    public enum CpuThreadPinningPolicy {
        AVOID(0, "AVOID"),
        
        SEPARATE(1, "SEPARATE"),
        
        ISOLATE(2, "ISOLATE"),
        
        PREFER(3, "PREFER")
        ;
    
        private static final java.util.Map<java.lang.Integer, CpuThreadPinningPolicy> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, CpuThreadPinningPolicy> b = com.google.common.collect.ImmutableMap.builder();
            for (CpuThreadPinningPolicy enumItem : CpuThreadPinningPolicy.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private CpuThreadPinningPolicy(int value, java.lang.String name) {
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
         * @return corresponding CpuThreadPinningPolicy item
         */
        public static CpuThreadPinningPolicy forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2015-04-23", "guest-epa").intern();

    /**
     * This VM should be allocated from trusted pool
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>trustedExecution</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isTrustedExecution();
    
    /**
     * Memory page allocation size. If a VM requires hugepages, it should choose LARGE 
     * or SIZE_2MB or SIZE_1GB. If the VM prefers hugepages it should choose 
     * PREFER_LARGE. LARGE : Require hugepages (either 2MB or 1GB) SMALL : Doesn't 
     * require hugepages SIZE_2MB : Requires 2MB hugepages SIZE_1GB : Requires 1GB 
     * hugepages PREFER_LARGE : Application prefers hugepages
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.guest.epa.GuestEpa.MempageSize</code> <code>mempageSize</code>, or <code>null</code> if not present
     */
    MempageSize getMempageSize();
    
    /**
     * CPU pinning policy describes association between virtual CPUs in guest and the 
     * physical CPUs in the host. DEDICATED : Virtual CPUs are pinned to physical CPUs 
     * SHARED : Multiple VMs may share the same physical CPUs. ANY : Any policy is 
     * acceptable for the VM
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.guest.epa.GuestEpa.CpuPinningPolicy</code> <code>cpuPinningPolicy</code>, or <code>null</code> if not present
     */
    CpuPinningPolicy getCpuPinningPolicy();
    
    /**
     * CPU thread pinning policy describes how to place the guest CPUs when the host 
     * supports hyper threads: AVOID : Avoids placing a guest on a host with threads. 
     * SEPARATE: Places vCPUs on separate cores, and avoids placing two vCPUs on two 
     * threads of same core. ISOLATE : Places each vCPU on a different core, and places
     * no vCPUs from a different guest on the same core. PREFER : Attempts to place 
     * vCPUs on threads of the same core.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.guest.epa.GuestEpa.CpuThreadPinningPolicy</code> <code>cpuThreadPinningPolicy</code>, or <code>null</code> if not present
     */
    CpuThreadPinningPolicy getCpuThreadPinningPolicy();
    
    /**
     * List of pcie passthrough devices.
     *
     *
     *
     * @return <code>java.util.List</code> <code>pcieDevice</code>, or <code>null</code> if not present
     */
    List<PcieDevice> getPcieDevice();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.guest.epa.guest.epa.NumaPolicy</code> <code>numaPolicy</code>, or <code>null</code> if not present
     */
    NumaPolicy getNumaPolicy();

}

