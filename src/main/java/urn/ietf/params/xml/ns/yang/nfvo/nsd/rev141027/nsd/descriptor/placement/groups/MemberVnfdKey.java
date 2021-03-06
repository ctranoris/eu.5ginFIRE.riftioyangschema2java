package urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.placement.groups;
import java.math.BigInteger;
import java.util.Objects;

import org.opendaylight.yangtools.yang.binding.Identifier;

public class MemberVnfdKey
 implements Identifier<MemberVnfd> {
    private static final long serialVersionUID = 519011361002322048L;
    private final BigInteger _memberVnfIndexRef;


    public MemberVnfdKey(BigInteger _memberVnfIndexRef) {
    
    
        this._memberVnfIndexRef = _memberVnfIndexRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public MemberVnfdKey(MemberVnfdKey source) {
        this._memberVnfIndexRef = source._memberVnfIndexRef;
    }


    public BigInteger getMemberVnfIndexRef() {
        return _memberVnfIndexRef;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_memberVnfIndexRef);
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
        MemberVnfdKey other = (MemberVnfdKey) obj;
        if (!Objects.equals(_memberVnfIndexRef, other._memberVnfIndexRef)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.placement.groups.MemberVnfdKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_memberVnfIndexRef != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_memberVnfIndexRef=");
            builder.append(_memberVnfIndexRef);
        }
        return builder.append(']').toString();
    }
}

