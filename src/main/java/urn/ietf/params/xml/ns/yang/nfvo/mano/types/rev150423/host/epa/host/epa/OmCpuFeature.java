package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.host.epa.host.epa;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.host.epa.HostEpa;

/**
 * List of OpenMANO CPU features
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list om-cpu-feature {
 *     key "feature"
 *     leaf feature {
 *         type string;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mano-types/host-epa/host-epa/om-cpu-feature</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.host.epa.host.epa.OmCpuFeatureBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.host.epa.host.epa.OmCpuFeatureBuilder
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.host.epa.host.epa.OmCpuFeatureKey
 *
 */
public interface OmCpuFeature
    extends
    ChildOf<HostEpa>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.host.epa.host.epa.OmCpuFeature>,
    Identifiable<OmCpuFeatureKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2015-04-23", "om-cpu-feature").intern();

    /**
     * CPU feature
     *
     *
     *
     * @return <code>java.lang.String</code> <code>feature</code>, or <code>null</code> if not present
     */
    java.lang.String getFeature();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.host.epa.host.epa.OmCpuFeatureKey</code> <code>key</code>, or <code>null</code> if not present
     */
    OmCpuFeatureKey getKey();

}

