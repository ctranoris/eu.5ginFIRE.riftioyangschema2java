package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration;
import java.math.BigInteger;
import java.util.Objects;

import org.opendaylight.yangtools.yang.binding.Identifier;

public class InitialConfigPrimitiveKey
 implements Identifier<InitialConfigPrimitive> {
    private static final long serialVersionUID = -4777051358093348125L;
    private final BigInteger _seq;


    public InitialConfigPrimitiveKey(BigInteger _seq) {
    
    
        this._seq = _seq;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public InitialConfigPrimitiveKey(InitialConfigPrimitiveKey source) {
        this._seq = source._seq;
    }


    public BigInteger getSeq() {
        return _seq;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_seq);
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
        InitialConfigPrimitiveKey other = (InitialConfigPrimitiveKey) obj;
        if (!Objects.equals(_seq, other._seq)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.InitialConfigPrimitiveKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_seq != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_seq=");
            builder.append(_seq);
        }
        return builder.append(']').toString();
    }
}

