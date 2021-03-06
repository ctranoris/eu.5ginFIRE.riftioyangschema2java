package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node;
import org.opendaylight.yangtools.yang.binding.DataContainer;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * OpenMANO Numa type selection
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * choice om-numa-type {
 *     case cores {
 *         leaf num-cores {
 *             type uint8;
 *         }
 *     }
 *     case paired-threads {
 *         container paired-threads {
 *             leaf num-paired-threads {
 *                 type uint8;
 *             }
 *             list paired-thread-ids {
 *                 key "thread-a"
 *                 leaf thread-a {
 *                     type uint8;
 *                 }
 *                 leaf thread-b {
 *                     type uint8;
 *                 }
 *             }
 *         }
 *     }
 *     case threads {
 *         leaf num-threads {
 *             type uint8;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mano-types/guest-epa/guest-epa/numa-policy/numa-aware/numa-node-policy/node/om-numa-type</i>
 *
 */
public interface OmNumaType
    extends
    DataContainer
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2015-04-23", "om-numa-type").intern();


}

