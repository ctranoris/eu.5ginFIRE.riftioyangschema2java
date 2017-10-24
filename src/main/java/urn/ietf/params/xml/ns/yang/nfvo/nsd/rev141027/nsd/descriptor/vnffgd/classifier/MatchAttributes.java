package urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.vnffgd.classifier;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.PortNumber;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.vnffgd.Classifier;

/**
 * List of match attributes.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>nsd</b>
 * <pre>
 * list match-attributes {
 *     key "id"
 *     leaf id {
 *         type string;
 *     }
 *     leaf ip-proto {
 *         type uint8;
 *     }
 *     leaf source-ip-address {
 *         type ip-address;
 *     }
 *     leaf destination-ip-address {
 *         type ip-address;
 *     }
 *     leaf source-port {
 *         type port-number;
 *     }
 *     leaf destination-port {
 *         type port-number;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>nsd/nsd-descriptor/vnffgd/classifier/match-attributes</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.vnffgd.classifier.MatchAttributesBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.vnffgd.classifier.MatchAttributesBuilder
 * @see urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.vnffgd.classifier.MatchAttributesKey
 *
 */
public interface MatchAttributes
    extends
    ChildOf<Classifier>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.vnffgd.classifier.MatchAttributes>,
    Identifiable<MatchAttributesKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsd",
        "2014-10-27", "match-attributes").intern();

    /**
     * Identifier for the classifier match attribute rule.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    java.lang.String getId();
    
    /**
     * Internet Protocol.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>ipProto</code>, or <code>null</code> if not present
     */
    java.lang.Short getIpProto();
    
    /**
     * Source IP address.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>sourceIpAddress</code>, or <code>null</code> if not present
     */
    IpAddress getSourceIpAddress();
    
    /**
     * Destination IP address.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>destinationIpAddress</code>, or <code>null</code> if not present
     */
    IpAddress getDestinationIpAddress();
    
    /**
     * Source port number.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.PortNumber</code> <code>sourcePort</code>, or <code>null</code> if not present
     */
    PortNumber getSourcePort();
    
    /**
     * Destination port number.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.PortNumber</code> <code>destinationPort</code>, or <code>null</code> if not present
     */
    PortNumber getDestinationPort();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.vnffgd.classifier.MatchAttributesKey</code> <code>key</code>, or <code>null</code> if not present
     */
    MatchAttributesKey getKey();

}

