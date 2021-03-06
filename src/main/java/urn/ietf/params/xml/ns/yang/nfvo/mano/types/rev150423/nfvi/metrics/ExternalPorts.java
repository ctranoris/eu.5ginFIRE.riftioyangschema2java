package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.nfvi.metrics;
import java.math.BigInteger;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.NfviMetrics;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container external-ports {
 *     leaf label {
 *         type label;
 *     }
 *     leaf total {
 *         type uint64;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mano-types/nfvi-metrics/external-ports</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.nfvi.metrics.ExternalPortsBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.nfvi.metrics.ExternalPortsBuilder
 *
 */
public interface ExternalPorts
    extends
    ChildOf<NfviMetrics>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.nfvi.metrics.ExternalPorts>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2015-04-23", "external-ports").intern();

    /**
     * Label to show in UI
     *
     *
     *
     * @return <code>java.lang.String</code> <code>label</code>, or <code>null</code> if not present
     */
    java.lang.String getLabel();
    
    /**
     * The total number of external ports.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>total</code>, or <code>null</code> if not present
     */
    BigInteger getTotal();

}

