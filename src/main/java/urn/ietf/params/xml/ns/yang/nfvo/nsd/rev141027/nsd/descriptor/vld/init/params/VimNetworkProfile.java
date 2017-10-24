package urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.vld.init.params;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.vld.InitParams;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>nsd</b>
 * <pre>
 * case vim-network-profile {
 *     leaf ip-profile-ref {
 *         type string;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>nsd/nsd-descriptor/vld/init-params/vim-network-profile</i>
 *
 */
public interface VimNetworkProfile
    extends
    DataObject,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.vld.init.params.VimNetworkProfile>,
    InitParams
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsd",
        "2014-10-27", "vim-network-profile").intern();

    /**
     * Named reference to IP-profile object
     *
     *
     *
     * @return <code>java.lang.String</code> <code>ipProfileRef</code>, or <code>null</code> if not present
     */
    java.lang.String getIpProfileRef();

}

