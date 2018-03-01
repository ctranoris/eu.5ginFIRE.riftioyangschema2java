package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.http.endpoint;
import java.util.Objects;

import org.opendaylight.yangtools.yang.binding.Identifier;

public class HeadersKey
 implements Identifier<Headers> {
    private static final long serialVersionUID = -2733270426406096924L;
    private final java.lang.String _akey;


    public HeadersKey(java.lang.String _akey) {
    
    
        this._akey = _akey;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public HeadersKey(HeadersKey source) {
        this._akey = source._akey;
    }


    public java.lang.String getAkey() {
        return _akey;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_akey);
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
        HeadersKey other = (HeadersKey) obj;
        if (!Objects.equals(_akey, other._akey)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.http.endpoint.HeadersKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_akey != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_akey=");
            builder.append(_akey);
        }
        return builder.append(']').toString();
    }
}

