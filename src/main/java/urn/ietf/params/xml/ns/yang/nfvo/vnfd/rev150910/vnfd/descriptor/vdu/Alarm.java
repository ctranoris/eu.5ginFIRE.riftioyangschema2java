package urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.Vdu;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>vnfd</b>
 * <pre>
 * list alarm {
 *     key "alarm-id"
 *     leaf alarm-id {
 *         type string;
 *     }
 *     leaf name {
 *         type string;
 *     }
 *     leaf description {
 *         type string;
 *     }
 *     leaf vdur-id {
 *         type string;
 *     }
 *     container actions {
 *         list ok {
 *             key "url"
 *             leaf url {
 *                 type string;
 *             }
 *         }
 *         list insufficient-data {
 *             key "url"
 *             leaf url {
 *                 type string;
 *             }
 *         }
 *         list alarm {
 *             key "url"
 *             leaf url {
 *                 type string;
 *             }
 *         }
 *     }
 *     leaf repeat {
 *         type repeat;
 *     }
 *     leaf enabled {
 *         type enabled;
 *     }
 *     leaf severity {
 *         type alarm-severity-type;
 *     }
 *     leaf metric {
 *         type alarm-metric-type;
 *     }
 *     leaf statistic {
 *         type alarm-statistic-type;
 *     }
 *     leaf operation {
 *         type alarm-operation-type;
 *     }
 *     leaf value {
 *         type decimal64;
 *     }
 *     leaf period {
 *         type uint32;
 *     }
 *     leaf evaluations {
 *         type uint32;
 *     }
 *     uses alarm;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vnfd/vnfd-descriptor/vdu/alarm</i>
 * 
 * <p>To create instances of this class use {@link urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.AlarmBuilder}.
 * @see urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.AlarmBuilder
 * @see urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.AlarmKey
 *
 */
public interface Alarm
    extends
    ChildOf<Vdu>,
    Augmentable<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.Alarm>,
    urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.Alarm,
    Identifiable<AlarmKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:vnfd",
        "2015-09-10", "alarm").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.AlarmKey</code> <code>key</code>, or <code>null</code> if not present
     */
    AlarmKey getKey();

}

