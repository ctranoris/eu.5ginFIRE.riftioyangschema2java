package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.nfvi.metrics;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.NfviMetrics;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.nfvi.metrics.network.Incoming;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.nfvi.metrics.network.Outgoing;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container network {
 *     leaf label {
 *         type label;
 *     }
 *     container incoming {
 *         leaf label {
 *             type label;
 *         }
 *         leaf bytes {
 *             type uint64;
 *         }
 *         leaf packets {
 *             type uint64;
 *         }
 *         leaf byte-rate {
 *             type decimal64;
 *         }
 *         leaf packet-rate {
 *             type decimal64;
 *         }
 *     }
 *     container outgoing {
 *         leaf label {
 *             type label;
 *         }
 *         leaf bytes {
 *             type uint64;
 *         }
 *         leaf packets {
 *             type uint64;
 *         }
 *         leaf byte-rate {
 *             type decimal64;
 *         }
 *         leaf packet-rate {
 *             type decimal64;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mano-types/nfvi-metrics/network</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.nfvi.metrics.NetworkBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.nfvi.metrics.NetworkBuilder
 *
 */
public interface Network
    extends
    ChildOf<NfviMetrics>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.nfvi.metrics.Network>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2015-04-23", "network").intern();

    /**
     * Label to show in UI
     *
     *
     *
     * @return <code>java.lang.String</code> <code>label</code>, or <code>null</code> if not present
     */
    java.lang.String getLabel();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.nfvi.metrics.network.Incoming</code> <code>incoming</code>, or <code>null</code> if not present
     */
    Incoming getIncoming();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.nfvi.metrics.network.Outgoing</code> <code>outgoing</code>, or <code>null</code> if not present
     */
    Outgoing getOutgoing();

}

