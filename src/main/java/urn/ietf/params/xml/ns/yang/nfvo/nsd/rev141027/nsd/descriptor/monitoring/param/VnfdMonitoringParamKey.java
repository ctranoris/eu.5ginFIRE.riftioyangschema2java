package urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.monitoring.param;
import java.math.BigInteger;
import java.util.Objects;

import org.opendaylight.yangtools.yang.binding.Identifier;

public class VnfdMonitoringParamKey
 implements Identifier<VnfdMonitoringParam> {
    private static final long serialVersionUID = -450412236573364984L;
    private final java.lang.Object _vnfdMonitoringParamRef;
    private final BigInteger _memberVnfIndexRef;


    public VnfdMonitoringParamKey(BigInteger _memberVnfIndexRef, java.lang.Object _vnfdMonitoringParamRef) {
    
    
        this._vnfdMonitoringParamRef = _vnfdMonitoringParamRef;
        this._memberVnfIndexRef = _memberVnfIndexRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public VnfdMonitoringParamKey(VnfdMonitoringParamKey source) {
        this._vnfdMonitoringParamRef = source._vnfdMonitoringParamRef;
        this._memberVnfIndexRef = source._memberVnfIndexRef;
    }


    public java.lang.Object getVnfdMonitoringParamRef() {
        return _vnfdMonitoringParamRef;
    }
    
    public BigInteger getMemberVnfIndexRef() {
        return _memberVnfIndexRef;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_vnfdMonitoringParamRef);
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
        VnfdMonitoringParamKey other = (VnfdMonitoringParamKey) obj;
        if (!Objects.equals(_vnfdMonitoringParamRef, other._vnfdMonitoringParamRef)) {
            return false;
        }
        if (!Objects.equals(_memberVnfIndexRef, other._memberVnfIndexRef)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.monitoring.param.VnfdMonitoringParamKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_vnfdMonitoringParamRef != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_vnfdMonitoringParamRef=");
            builder.append(_vnfdMonitoringParamRef);
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

