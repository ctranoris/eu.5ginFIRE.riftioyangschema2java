package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.Openmano} instances.
 * 
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.Openmano
 *
 */
public class OpenmanoBuilder implements Builder<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.Openmano> {

    private java.lang.Boolean _openmanoConstruct;

    Map<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.Openmano>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.Openmano>> augmentation = Collections.emptyMap();

    public OpenmanoBuilder() {
    }

    public OpenmanoBuilder(Openmano base) {
        this._openmanoConstruct = base.isOpenmanoConstruct();
        if (base instanceof OpenmanoImpl) {
            OpenmanoImpl impl = (OpenmanoImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.Openmano> casted =(AugmentationHolder<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.Openmano>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.Boolean isOpenmanoConstruct() {
        return _openmanoConstruct;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.Openmano>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public OpenmanoBuilder setOpenmanoConstruct(final java.lang.Boolean value) {
        this._openmanoConstruct = value;
        return this;
    }
    
    public OpenmanoBuilder addAugmentation(java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.Openmano>> augmentationType, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.Openmano> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public OpenmanoBuilder removeAugmentation(java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.Openmano>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Openmano build() {
        return new OpenmanoImpl(this);
    }

    private static final class OpenmanoImpl implements Openmano {

        @Override
        public java.lang.Class<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.Openmano> getImplementedInterface() {
            return urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.Openmano.class;
        }

        private final java.lang.Boolean _openmanoConstruct;

        private Map<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.Openmano>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.Openmano>> augmentation = Collections.emptyMap();

        private OpenmanoImpl(OpenmanoBuilder base) {
            this._openmanoConstruct = base.isOpenmanoConstruct();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.Openmano>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.Openmano>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.Openmano>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.Openmano>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Boolean isOpenmanoConstruct() {
            return _openmanoConstruct;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.Openmano>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_openmanoConstruct);
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
            if (!urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.Openmano.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.Openmano other = (urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.Openmano)obj;
            if (!Objects.equals(_openmanoConstruct, other.isOpenmanoConstruct())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                OpenmanoImpl otherImpl = (OpenmanoImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.Openmano>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.Openmano>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Openmano [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_openmanoConstruct != null) {
                builder.append("_openmanoConstruct=");
                builder.append(_openmanoConstruct);
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
