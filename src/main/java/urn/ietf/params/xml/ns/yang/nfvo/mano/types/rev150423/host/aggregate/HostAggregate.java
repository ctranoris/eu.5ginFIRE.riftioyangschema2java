package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.host.aggregate;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * Name of the Host Aggregate
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list host-aggregate {
 *     key "metadata-key"
 *     leaf metadata-key {
 *         type string;
 *     }
 *     leaf metadata-value {
 *         type string;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mano-types/host-aggregate/host-aggregate</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.host.aggregate.HostAggregateBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.host.aggregate.HostAggregateBuilder
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.host.aggregate.HostAggregateKey
 *
 */
public interface HostAggregate
    extends
    ChildOf<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.HostAggregate>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.host.aggregate.HostAggregate>,
    Identifiable<HostAggregateKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2015-04-23", "host-aggregate").intern();

    /**
     * Name of the additional information attached to the host-aggregate
     *
     *
     *
     * @return <code>java.lang.String</code> <code>metadataKey</code>, or <code>null</code> if not present
     */
    java.lang.String getMetadataKey();
    
    /**
     * Value of the corresponding metadata-key
     *
     *
     *
     * @return <code>java.lang.String</code> <code>metadataValue</code>, or <code>null</code> if not present
     */
    java.lang.String getMetadataValue();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.host.aggregate.HostAggregateKey</code> <code>key</code>, or <code>null</code> if not present
     */
    HostAggregateKey getKey();

}

