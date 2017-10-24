package urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.scaling.group.descriptor;
import java.math.BigInteger;
import java.util.Objects;

import org.opendaylight.yangtools.yang.binding.Identifier;

public class VnfdMemberKey
 implements Identifier<VnfdMember> {
    private static final long serialVersionUID = -3252525076835844968L;
    private final BigInteger _memberVnfIndexRef;


    public VnfdMemberKey(BigInteger _memberVnfIndexRef) {
    
    
        this._memberVnfIndexRef = _memberVnfIndexRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public VnfdMemberKey(VnfdMemberKey source) {
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
        VnfdMemberKey other = (VnfdMemberKey) obj;
        if (!Objects.equals(_memberVnfIndexRef, other._memberVnfIndexRef)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.scaling.group.descriptor.VnfdMemberKey.class.getSimpleName()).append(" [");
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

