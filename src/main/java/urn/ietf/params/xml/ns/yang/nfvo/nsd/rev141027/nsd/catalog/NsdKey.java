package urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.catalog;
import java.util.Objects;

import org.opendaylight.yangtools.yang.binding.Identifier;

public class NsdKey
 implements Identifier<Nsd> {
    private static final long serialVersionUID = 8060294317279421094L;
    private final java.lang.String _id;


    public NsdKey(java.lang.String _id) {
    
    
        this._id = _id;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public NsdKey(NsdKey source) {
        this._id = source._id;
    }


    public java.lang.String getId() {
        return _id;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_id);
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
        NsdKey other = (NsdKey) obj;
        if (!Objects.equals(_id, other._id)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.catalog.NsdKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_id != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_id=");
            builder.append(_id);
        }
        return builder.append(']').toString();
    }
}

