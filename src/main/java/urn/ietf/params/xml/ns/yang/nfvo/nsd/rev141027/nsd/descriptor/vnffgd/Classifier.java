package urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.vnffgd;
import java.math.BigInteger;
import java.util.List;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.Vnffgd;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.vnffgd.classifier.MatchAttributes;

/**
 * List of classifier rules.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>nsd</b>
 * <pre>
 * list classifier {
 *     key "id"
 *     leaf id {
 *         type string;
 *     }
 *     leaf name {
 *         type string;
 *     }
 *     leaf rsp-id-ref {
 *         type leafref;
 *     }
 *     leaf member-vnf-index-ref {
 *         type leafref;
 *     }
 *     leaf vnfd-id-ref {
 *         type leafref;
 *     }
 *     leaf vnfd-connection-point-ref {
 *         type leafref;
 *     }
 *     list match-attributes {
 *         key "id"
 *         leaf id {
 *             type string;
 *         }
 *         leaf ip-proto {
 *             type uint8;
 *         }
 *         leaf source-ip-address {
 *             type ip-address;
 *         }
 *         leaf destination-ip-address {
 *             type ip-address;
 *         }
 *         leaf source-port {
 *             type port-number;
 *         }
 *         leaf destination-port {
 *             type port-number;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>nsd/nsd-descriptor/vnffgd/classifier</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.vnffgd.ClassifierBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.vnffgd.ClassifierBuilder
 * @see urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.vnffgd.ClassifierKey
 *
 */
public interface Classifier
    extends
    ChildOf<Vnffgd>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.vnffgd.Classifier>,
    Identifiable<ClassifierKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsd",
        "2014-10-27", "classifier").intern();

    /**
     * Identifier for the classifier rule.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    java.lang.String getId();
    
    /**
     * Name of the classifier.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * A reference to the RSP.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>rspIdRef</code>, or <code>null</code> if not present
     */
    java.lang.String getRspIdRef();
    
    /**
     * Reference to member-vnf within constituent-vnfds
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>memberVnfIndexRef</code>, or <code>null</code> if not present
     */
    BigInteger getMemberVnfIndexRef();
    
    /**
     * A reference to a VNFD
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnfdIdRef</code>, or <code>null</code> if not present
     */
    java.lang.Object getVnfdIdRef();
    
    /**
     * A reference to a connection point name
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnfdConnectionPointRef</code>, or <code>null</code> if not present
     */
    java.lang.Object getVnfdConnectionPointRef();
    
    /**
     * List of match attributes.
     *
     *
     *
     * @return <code>java.util.List</code> <code>matchAttributes</code>, or <code>null</code> if not present
     */
    List<MatchAttributes> getMatchAttributes();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.vnffgd.ClassifierKey</code> <code>key</code>, or <code>null</code> if not present
     */
    ClassifierKey getKey();

}

