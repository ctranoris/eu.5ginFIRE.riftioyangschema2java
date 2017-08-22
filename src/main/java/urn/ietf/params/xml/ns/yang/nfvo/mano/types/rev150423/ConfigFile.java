package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * Grouping for files needed to be mounted into an additional drive
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping config-file {
 *     list config-file {
 *         key "source"
 *         leaf source {
 *             type string;
 *         }
 *         leaf dest {
 *             type string;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mano-types/config-file</i>
 *
 */
public interface ConfigFile
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2015-04-23", "config-file").intern();

    /**
     * List of configuration files to be written on an additional drive
     *
     *
     *
     * @return <code>java.util.List</code> <code>configFile</code>, or <code>null</code> if not present
     */
    List<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.config.file.ConfigFile> getConfigFile();

}

