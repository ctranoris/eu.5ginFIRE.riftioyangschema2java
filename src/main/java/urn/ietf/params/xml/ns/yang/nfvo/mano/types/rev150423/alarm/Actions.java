package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.alarm;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.Alarm;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.alarm.actions.InsufficientData;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.alarm.actions.Ok;

import java.util.List;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container actions {
 *     list ok {
 *         key "url"
 *         leaf url {
 *             type string;
 *         }
 *     }
 *     list insufficient-data {
 *         key "url"
 *         leaf url {
 *             type string;
 *         }
 *     }
 *     list alarm {
 *         key "url"
 *         leaf url {
 *             type string;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mano-types/alarm/actions</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.alarm.ActionsBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.alarm.ActionsBuilder
 *
 */
public interface Actions
    extends
    ChildOf<Alarm>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.alarm.Actions>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2015-04-23", "actions").intern();

    /**
     * @return <code>java.util.List</code> <code>ok</code>, or <code>null</code> if not present
     */
    List<Ok> getOk();
    
    /**
     * @return <code>java.util.List</code> <code>insufficientData</code>, or <code>null</code> if not present
     */
    List<InsufficientData> getInsufficientData();
    
    /**
     * @return <code>java.util.List</code> <code>alarm</code>, or <code>null</code> if not present
     */
    List<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.alarm.actions.Alarm> getAlarm();

}

