package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.om.numa.type.paired.threads.paired.threads;
import java.util.Objects;

import org.opendaylight.yangtools.yang.binding.Identifier;

public class PairedThreadIdsKey
 implements Identifier<PairedThreadIds> {
    private static final long serialVersionUID = 5657393331481948923L;
    private final java.lang.Short _threadA;


    public PairedThreadIdsKey(java.lang.Short _threadA) {
    
    
        this._threadA = _threadA;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public PairedThreadIdsKey(PairedThreadIdsKey source) {
        this._threadA = source._threadA;
    }


    public java.lang.Short getThreadA() {
        return _threadA;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_threadA);
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
        PairedThreadIdsKey other = (PairedThreadIdsKey) obj;
        if (!Objects.equals(_threadA, other._threadA)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.om.numa.type.paired.threads.paired.threads.PairedThreadIdsKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_threadA != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_threadA=");
            builder.append(_threadA);
        }
        return builder.append(']').toString();
    }
}

