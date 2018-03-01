package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.nfvi.metrics.network;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.nfvi.metrics.Network;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container incoming {
 *     leaf label {
 *         type label;
 *     }
 *     leaf bytes {
 *         type uint64;
 *     }
 *     leaf packets {
 *         type uint64;
 *     }
 *     leaf byte-rate {
 *         type decimal64;
 *     }
 *     leaf packet-rate {
 *         type decimal64;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mano-types/nfvi-metrics/network/incoming</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.nfvi.metrics.network.IncomingBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.nfvi.metrics.network.IncomingBuilder
 *
 */
public interface Incoming
    extends
    ChildOf<Network>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.nfvi.metrics.network.Incoming>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2015-04-23", "incoming").intern();

    /**
     * Label to show in UI
     *
     *
     *
     * @return <code>java.lang.String</code> <code>label</code>, or <code>null</code> if not present
     */
    java.lang.String getLabel();
    
    /**
     * The cumulative number of incoming bytes.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>bytes</code>, or <code>null</code> if not present
     */
    BigInteger getBytes();
    
    /**
     * The cumulative number of incoming packets.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>packets</code>, or <code>null</code> if not present
     */
    BigInteger getPackets();
    
    /**
     * The current incoming byte-rate (bytes per second).
     *
     *
     *
     * @return <code>java.math.BigDecimal</code> <code>byteRate</code>, or <code>null</code> if not present
     */
    BigDecimal getByteRate();
    
    /**
     * The current incoming packet (packets per second).
     *
     *
     *
     * @return <code>java.math.BigDecimal</code> <code>packetRate</code>, or <code>null</code> if not present
     */
    BigDecimal getPacketRate();

}

