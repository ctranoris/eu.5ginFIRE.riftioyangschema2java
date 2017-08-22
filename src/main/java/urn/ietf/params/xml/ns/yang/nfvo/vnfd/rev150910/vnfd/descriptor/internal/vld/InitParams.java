package urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.internal.vld;
import org.opendaylight.yangtools.yang.binding.DataContainer;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Extra parameters for VLD instantiation
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>vnfd</b>
 * <pre>
 * choice init-params {
 *     case vim-network-profile {
 *         leaf ip-profile-ref {
 *             type leafref;
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
 * <i>vnfd/vnfd-descriptor/internal-vld/init-params</i>
 *
 */
public interface InitParams
    extends
    DataContainer
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:vnfd",
        "2015-09-10", "init-params").intern();


}

