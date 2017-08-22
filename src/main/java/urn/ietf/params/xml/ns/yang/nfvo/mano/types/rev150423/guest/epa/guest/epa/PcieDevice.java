package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.guest.epa.guest.epa;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.guest.epa.GuestEpa;

import java.math.BigInteger;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of pcie passthrough devices.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list pcie-device {
 *     key "device-id"
 *     leaf device-id {
 *         type string;
 *     }
 *     leaf count {
 *         type uint64;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mano-types/guest-epa/guest-epa/pcie-device</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.guest.epa.guest.epa.PcieDeviceBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.guest.epa.guest.epa.PcieDeviceBuilder
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.guest.epa.guest.epa.PcieDeviceKey
 *
 */
public interface PcieDevice
    extends
    ChildOf<GuestEpa>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.guest.epa.guest.epa.PcieDevice>,
    Identifiable<PcieDeviceKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2015-04-23", "pcie-device").intern();

    /**
     * Device identifier.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>deviceId</code>, or <code>null</code> if not present
     */
    java.lang.String getDeviceId();
    
    /**
     * Number of devices to attach to the VM.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>count</code>, or <code>null</code> if not present
     */
    BigInteger getCount();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.guest.epa.guest.epa.PcieDeviceKey</code> <code>key</code>, or <code>null</code> if not present
     */
    PcieDeviceKey getKey();

}

