package urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.cloud.init.input;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.CloudInitInput;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>vnfd</b>
 * <pre>
 * case inline {
 *     leaf cloud-init {
 *         type string;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vnfd/vnfd-descriptor/vdu/cloud-init-input/inline</i>
 *
 */
public interface Inline
    extends
    DataObject,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.cloud.init.input.Inline>,
    CloudInitInput
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:vnfd",
        "2015-09-10", "inline").intern();

    /**
     * Contents of cloud-init script, provided inline, in cloud-config format
     *
     *
     *
     * @return <code>java.lang.String</code> <code>cloudInit</code>, or <code>null</code> if not present
     */
    java.lang.String getCloudInit();

}

