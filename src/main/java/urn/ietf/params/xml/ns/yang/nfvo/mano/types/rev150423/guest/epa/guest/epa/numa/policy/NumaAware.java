package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.guest.epa.guest.epa.numa.policy;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.guest.epa.guest.epa.NumaPolicy;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.guest.epa.guest.epa.numa.policy.numa.aware.NumaNodePolicy;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * case numa-aware {
 *     container numa-node-policy {
 *         leaf node-cnt {
 *             type uint16;
 *         }
 *         leaf mem-policy {
 *             type enumeration;
 *         }
 *         list node {
 *             key "id"
 *             leaf id {
 *                 type uint64;
 *             }
 *             list vcpu {
 *                 key "id"
 *                 leaf id {
 *                     type uint64;
 *                 }
 *             }
 *             leaf memory-mb {
 *                 type uint64;
 *             }
 *             choice om-numa-type {
 *                 case cores {
 *                     leaf num-cores {
 *                         type uint8;
 *                     }
 *                 }
 *                 case paired-threads {
 *                     container paired-threads {
 *                         leaf num-paired-threads {
 *                             type uint8;
 *                         }
 *                         list paired-thread-ids {
 *                             key "thread-a"
 *                             leaf thread-a {
 *                                 type uint8;
 *                             }
 *                             leaf thread-b {
 *                                 type uint8;
 *                             }
 *                         }
 *                     }
 *                 }
 *                 case threads {
 *                     leaf num-threads {
 *                         type uint8;
 *                     }
 *                 }
 *             }
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mano-types/guest-epa/guest-epa/numa-policy/numa-aware</i>
 *
 */
public interface NumaAware
    extends
    DataObject,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.guest.epa.guest.epa.numa.policy.NumaAware>,
    NumaPolicy
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2015-04-23", "numa-aware").intern();

    /**
     * This policy defines NUMA topology of the guest. Specifically identifies if the 
     * guest should be run on a host with one NUMA node or multiple NUMA nodes. As an 
     * example a guest might need 8 VCPUs and 4 GB of memory. However, it might need 
     * the VCPUs and memory distributed across multiple NUMA nodes. In this scenario, 
     * NUMA node 1 could run with 6 VCPUs and 3GB, and NUMA node 2 could run with 2 
     * VCPUs and 1GB.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.guest.epa.guest.epa.numa.policy.numa.aware.NumaNodePolicy</code> <code>numaNodePolicy</code>, or <code>null</code> if not present
     */
    NumaNodePolicy getNumaNodePolicy();

}

