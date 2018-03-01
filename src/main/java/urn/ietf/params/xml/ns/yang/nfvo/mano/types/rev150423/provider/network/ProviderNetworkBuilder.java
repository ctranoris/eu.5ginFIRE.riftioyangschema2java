package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.provider.network;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.provider.network.ProviderNetwork.OverlayType;

/**
 * Class that builds {@link urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.provider.network.ProviderNetwork} instances.
 * 
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.provider.network.ProviderNetwork
 *
 */
public class ProviderNetworkBuilder implements Builder<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.provider.network.ProviderNetwork> {

    private OverlayType _overlayType;
    private java.lang.String _physicalNetwork;
    private java.lang.Long _segmentationId;

    Map<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.provider.network.ProviderNetwork>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.provider.network.ProviderNetwork>> augmentation = Collections.emptyMap();

    public ProviderNetworkBuilder() {
    }

    public ProviderNetworkBuilder(ProviderNetwork base) {
        this._overlayType = base.getOverlayType();
        this._physicalNetwork = base.getPhysicalNetwork();
        this._segmentationId = base.getSegmentationId();
        if (base instanceof ProviderNetworkImpl) {
            ProviderNetworkImpl impl = (ProviderNetworkImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.provider.network.ProviderNetwork> casted =(AugmentationHolder<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.provider.network.ProviderNetwork>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public OverlayType getOverlayType() {
        return _overlayType;
    }
    
    public java.lang.String getPhysicalNetwork() {
        return _physicalNetwork;
    }
    
    public java.lang.Long getSegmentationId() {
        return _segmentationId;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.provider.network.ProviderNetwork>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public ProviderNetworkBuilder setOverlayType(final OverlayType value) {
        this._overlayType = value;
        return this;
    }
    
     
    public ProviderNetworkBuilder setPhysicalNetwork(final java.lang.String value) {
        this._physicalNetwork = value;
        return this;
    }
    
     
     private static void checkSegmentationIdRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public ProviderNetworkBuilder setSegmentationId(final java.lang.Long value) {
    if (value != null) {
        checkSegmentationIdRange(value);
    }
        this._segmentationId = value;
        return this;
    }
    
    public ProviderNetworkBuilder addAugmentation(java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.provider.network.ProviderNetwork>> augmentationType, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.provider.network.ProviderNetwork> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ProviderNetworkBuilder removeAugmentation(java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.provider.network.ProviderNetwork>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ProviderNetwork build() {
        return new ProviderNetworkImpl(this);
    }

    private static final class ProviderNetworkImpl implements ProviderNetwork {

        @Override
        public java.lang.Class<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.provider.network.ProviderNetwork> getImplementedInterface() {
            return urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.provider.network.ProviderNetwork.class;
        }

        private final OverlayType _overlayType;
        private final java.lang.String _physicalNetwork;
        private final java.lang.Long _segmentationId;

        private Map<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.provider.network.ProviderNetwork>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.provider.network.ProviderNetwork>> augmentation = Collections.emptyMap();

        private ProviderNetworkImpl(ProviderNetworkBuilder base) {
            this._overlayType = base.getOverlayType();
            this._physicalNetwork = base.getPhysicalNetwork();
            this._segmentationId = base.getSegmentationId();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.provider.network.ProviderNetwork>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.provider.network.ProviderNetwork>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.provider.network.ProviderNetwork>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.provider.network.ProviderNetwork>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public OverlayType getOverlayType() {
            return _overlayType;
        }
        
        @Override
        public java.lang.String getPhysicalNetwork() {
            return _physicalNetwork;
        }
        
        @Override
        public java.lang.Long getSegmentationId() {
            return _segmentationId;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.provider.network.ProviderNetwork>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        private int hash = 0;
        private volatile boolean hashValid = false;
        
        @Override
        public int hashCode() {
            if (hashValid) {
                return hash;
            }
        
            final int prime = 31;
            int result = 1;
            result = prime * result + Objects.hashCode(_overlayType);
            result = prime * result + Objects.hashCode(_physicalNetwork);
            result = prime * result + Objects.hashCode(_segmentationId);
            result = prime * result + Objects.hashCode(augmentation);
        
            hash = result;
            hashValid = true;
            return result;
        }

        @Override
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataObject)) {
                return false;
            }
            if (!urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.provider.network.ProviderNetwork.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.provider.network.ProviderNetwork other = (urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.provider.network.ProviderNetwork)obj;
            if (!Objects.equals(_overlayType, other.getOverlayType())) {
                return false;
            }
            if (!Objects.equals(_physicalNetwork, other.getPhysicalNetwork())) {
                return false;
            }
            if (!Objects.equals(_segmentationId, other.getSegmentationId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ProviderNetworkImpl otherImpl = (ProviderNetworkImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.provider.network.ProviderNetwork>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.provider.network.ProviderNetwork>> e : augmentation.entrySet()) {
                    if (!e.getValue().equals(other.getAugmentation(e.getKey()))) {
                        return false;
                    }
                }
                // .. and give the other one the chance to do the same
                if (!obj.equals(this)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.String name = "ProviderNetwork [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_overlayType != null) {
                builder.append("_overlayType=");
                builder.append(_overlayType);
                builder.append(", ");
            }
            if (_physicalNetwork != null) {
                builder.append("_physicalNetwork=");
                builder.append(_physicalNetwork);
                builder.append(", ");
            }
            if (_segmentationId != null) {
                builder.append("_segmentationId=");
                builder.append(_segmentationId);
            }
            final int builderLength = builder.length();
            final int builderAdditionalLength = builder.substring(name.length(), builderLength).length();
            if (builderAdditionalLength > 2 && !builder.substring(builderLength - 2, builderLength).equals(", ")) {
                builder.append(", ");
            }
            builder.append("augmentation=");
            builder.append(augmentation.values());
            return builder.append(']').toString();
        }
    }

}
