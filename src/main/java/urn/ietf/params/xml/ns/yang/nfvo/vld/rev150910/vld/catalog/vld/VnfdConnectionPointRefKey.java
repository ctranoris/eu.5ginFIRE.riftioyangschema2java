package urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.vld.catalog.vld;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;
import java.math.BigInteger;

public class VnfdConnectionPointRefKey
 implements Identifier<VnfdConnectionPointRef> {
    private static final long serialVersionUID = 7592477851105032730L;
    private final java.lang.String _vnfdRef;
    private final BigInteger _memberVnfIndexRef;


    public VnfdConnectionPointRefKey(BigInteger _memberVnfIndexRef, java.lang.String _vnfdRef) {
    
    
        this._vnfdRef = _vnfdRef;
        this._memberVnfIndexRef = _memberVnfIndexRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public VnfdConnectionPointRefKey(VnfdConnectionPointRefKey source) {
        this._vnfdRef = source._vnfdRef;
        this._memberVnfIndexRef = source._memberVnfIndexRef;
    }


    public java.lang.String getVnfdRef() {
        return _vnfdRef;
    }
    
    public BigInteger getMemberVnfIndexRef() {
        return _memberVnfIndexRef;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_vnfdRef);
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
        VnfdConnectionPointRefKey other = (VnfdConnectionPointRefKey) obj;
        if (!Objects.equals(_vnfdRef, other._vnfdRef)) {
            return false;
        }
        if (!Objects.equals(_memberVnfIndexRef, other._memberVnfIndexRef)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.vld.catalog.vld.VnfdConnectionPointRefKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_vnfdRef != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_vnfdRef=");
            builder.append(_vnfdRef);
        }
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

