package urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.vld;
import org.opendaylight.yangtools.yang.binding.DataContainer;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Extra parameters for VLD instantiation
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>nsd</b>
 * <pre>
 * choice init-params {
 *     case vim-network-profile {
 *         leaf ip-profile-ref {
 *             type string;
 *         }
 *     }
 *     case vim-network-ref {
 *         leaf vim-network-name {
 *             type string;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>nsd/nsd-descriptor/vld/init-params</i>
 *
 */
public interface InitParams
    extends
    DataContainer
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsd",
        "2014-10-27", "init-params").intern();


}

