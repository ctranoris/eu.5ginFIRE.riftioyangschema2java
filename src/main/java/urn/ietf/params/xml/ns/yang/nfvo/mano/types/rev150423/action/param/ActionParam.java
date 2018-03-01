package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.action.param;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Uri;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.HttpMethod;

/**
 * List of action parameters to control VNF
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list action-param {
 *     key "id"
 *     leaf id {
 *         type string;
 *     }
 *     leaf name {
 *         type string;
 *     }
 *     leaf description {
 *         type string;
 *     }
 *     leaf group-tag {
 *         type string;
 *     }
 *     leaf url {
 *         type uri;
 *     }
 *     leaf method {
 *         type method;
 *     }
 *     leaf payload {
 *         type string;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mano-types/action-param/action-param</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.action.param.ActionParamBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.action.param.ActionParamBuilder
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.action.param.ActionParamKey
 *
 */
public interface ActionParam
    extends
    ChildOf<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ActionParam>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.action.param.ActionParam>,
    Identifiable<ActionParamKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2015-04-23", "action-param").intern();

    /**
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    java.lang.String getId();
    
    /**
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    java.lang.String getDescription();
    
    /**
     * A tag to group monitoring parameter
     *
     *
     *
     * @return <code>java.lang.String</code> <code>groupTag</code>, or <code>null</code> if not present
     */
    java.lang.String getGroupTag();
    
    /**
     * This is the URL where to perform the operation
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Uri</code> <code>url</code>, or <code>null</code> if not present
     */
    Uri getUrl();
    
    /**
     * This is the method to be performed at the uri. POST by default for action
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.HttpMethod</code> <code>method</code>, or <code>null</code> if not present
     */
    HttpMethod getMethod();
    
    /**
     * This is the operation payload or payload template to be sent in the data for 
     * this operation call
     *
     *
     *
     * @return <code>java.lang.String</code> <code>payload</code>, or <code>null</code> if not present
     */
    java.lang.String getPayload();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.action.param.ActionParamKey</code> <code>key</code>, or <code>null</code> if not present
     */
    ActionParamKey getKey();

}

