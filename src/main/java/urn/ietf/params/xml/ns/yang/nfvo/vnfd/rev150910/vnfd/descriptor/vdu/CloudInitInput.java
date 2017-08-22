package urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu;
import org.opendaylight.yangtools.yang.binding.DataContainer;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Indicates how the contents of cloud-init script are provided. There are 2 
 * choices - inline or in a file
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>vnfd</b>
 * <pre>
 * choice cloud-init-input {
 *     case filename {
 *         leaf cloud-init-file {
 *             type string;
 *         }
 *     }
 *     case inline {
 *         leaf cloud-init {
 *             type string;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vnfd/vnfd-descriptor/vdu/cloud-init-input</i>
 *
 */
public interface CloudInitInput
    extends
    DataContainer
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:vnfd",
        "2015-09-10", "cloud-init-input").intern();


}

