package urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor;
import java.util.Objects;

import org.opendaylight.yangtools.yang.binding.Identifier;

public class VnfDependencyKey
 implements Identifier<VnfDependency> {
    private static final long serialVersionUID = -7804090137105401358L;
    private final java.lang.String _vnfSourceRef;


    public VnfDependencyKey(java.lang.String _vnfSourceRef) {
    
    
        this._vnfSourceRef = _vnfSourceRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public VnfDependencyKey(VnfDependencyKey source) {
        this._vnfSourceRef = source._vnfSourceRef;
    }


    public java.lang.String getVnfSourceRef() {
        return _vnfSourceRef;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_vnfSourceRef);
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
        VnfDependencyKey other = (VnfDependencyKey) obj;
        if (!Objects.equals(_vnfSourceRef, other._vnfSourceRef)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.VnfDependencyKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_vnfSourceRef != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_vnfSourceRef=");
            builder.append(_vnfSourceRef);
        }
        return builder.append(']').toString();
    }
}

