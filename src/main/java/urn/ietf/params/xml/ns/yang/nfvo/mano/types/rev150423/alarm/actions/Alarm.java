package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.alarm.actions;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.alarm.Actions;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list alarm {
 *     key "url"
 *     leaf url {
 *         type string;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mano-types/alarm/actions/alarm</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.alarm.actions.AlarmBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.alarm.actions.AlarmBuilder
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.alarm.actions.AlarmKey
 *
 */
public interface Alarm
    extends
    ChildOf<Actions>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.alarm.actions.Alarm>,
    Identifiable<AlarmKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2015-04-23", "alarm").intern();

    /**
     * @return <code>java.lang.String</code> <code>url</code>, or <code>null</code> if not present
     */
    java.lang.String getUrl();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.alarm.actions.AlarmKey</code> <code>key</code>, or <code>null</code> if not present
     */
    AlarmKey getKey();

}

