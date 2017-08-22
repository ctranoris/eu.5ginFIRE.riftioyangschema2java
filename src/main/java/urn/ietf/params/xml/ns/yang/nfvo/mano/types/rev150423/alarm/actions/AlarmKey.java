package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.alarm.actions;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class AlarmKey
 implements Identifier<Alarm> {
    private static final long serialVersionUID = 5352316849637502229L;
    private final java.lang.String _url;


    public AlarmKey(java.lang.String _url) {
    
    
        this._url = _url;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public AlarmKey(AlarmKey source) {
        this._url = source._url;
    }


    public java.lang.String getUrl() {
        return _url;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_url);
        return result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        AlarmKey other = (AlarmKey) obj;
        if (!Objects.equals(_url, other._url)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.alarm.actions.AlarmKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_url != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_url=");
            builder.append(_url);
        }
        return builder.append(']').toString();
    }
}

