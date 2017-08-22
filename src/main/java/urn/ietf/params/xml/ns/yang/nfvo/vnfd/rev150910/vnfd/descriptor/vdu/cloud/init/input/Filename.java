package urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.cloud.init.input;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.CloudInitInput;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>vnfd</b>
 * <pre>
 * case filename {
 *     leaf cloud-init-file {
 *         type string;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vnfd/vnfd-descriptor/vdu/cloud-init-input/filename</i>
 *
 */
public interface Filename
    extends
    DataObject,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.cloud.init.input.Filename>,
    CloudInitInput
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:vnfd",
        "2015-09-10", "filename").intern();

    /**
     * Name of file with contents of cloud-init script in cloud-config format
     *
     *
     *
     * @return <code>java.lang.String</code> <code>cloudInitFile</code>, or <code>null</code> if not present
     */
    java.lang.String getCloudInitFile();

}

