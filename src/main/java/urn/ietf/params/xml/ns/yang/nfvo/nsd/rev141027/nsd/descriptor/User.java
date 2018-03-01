package urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor;
import java.util.List;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdDescriptor;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.user.KeyPair;

/**
 * List of users to be added through cloud-config
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>nsd</b>
 * <pre>
 * list user {
 *     key "name"
 *     leaf name {
 *         type string;
 *     }
 *     leaf user-info {
 *         type string;
 *     }
 *     list key-pair {
 *         key "name"
 *         leaf name {
 *             type string;
 *         }
 *         leaf akey {
 *             type string;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>nsd/nsd-descriptor/user</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.UserBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.UserBuilder
 * @see urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.UserKey
 *
 */
public interface User
    extends
    ChildOf<NsdDescriptor>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.User>,
    Identifiable<UserKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsd",
        "2014-10-27", "user").intern();

    /**
     * Name of the user 
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * The user name's real name
     *
     *
     *
     * @return <code>java.lang.String</code> <code>userInfo</code>, or <code>null</code> if not present
     */
    java.lang.String getUserInfo();
    
    /**
     * Used to configure the list of public keys to be injected as part of NS 
     * instantiation
     *
     *
     *
     * @return <code>java.util.List</code> <code>keyPair</code>, or <code>null</code> if not present
     */
    List<KeyPair> getKeyPair();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.UserKey</code> <code>key</code>, or <code>null</code> if not present
     */
    UserKey getKey();

}

