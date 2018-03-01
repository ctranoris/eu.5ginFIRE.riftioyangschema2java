package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.config.method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.config.method.Rest} instances.
 * 
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.config.method.Rest
 *
 */
public class RestBuilder implements Builder<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.config.method.Rest> {

    private urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.config.method.rest.Rest _rest;

    Map<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.config.method.Rest>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.config.method.Rest>> augmentation = Collections.emptyMap();

    public RestBuilder() {
    }

    public RestBuilder(Rest base) {
        this._rest = base.getRest();
        if (base instanceof RestImpl) {
            RestImpl impl = (RestImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.config.method.Rest> casted =(AugmentationHolder<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.config.method.Rest>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.config.method.rest.Rest getRest() {
        return _rest;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.config.method.Rest>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public RestBuilder setRest(final urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.config.method.rest.Rest value) {
        this._rest = value;
        return this;
    }
    
    public RestBuilder addAugmentation(java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.config.method.Rest>> augmentationType, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.config.method.Rest> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public RestBuilder removeAugmentation(java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.config.method.Rest>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Rest build() {
        return new RestImpl(this);
    }

    private static final class RestImpl implements Rest {

        @Override
        public java.lang.Class<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.config.method.Rest> getImplementedInterface() {
            return urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.config.method.Rest.class;
        }

        private final urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.config.method.rest.Rest _rest;

        private Map<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.config.method.Rest>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.config.method.Rest>> augmentation = Collections.emptyMap();

        private RestImpl(RestBuilder base) {
            this._rest = base.getRest();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.config.method.Rest>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.config.method.Rest>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.config.method.Rest>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.config.method.Rest>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.config.method.rest.Rest getRest() {
            return _rest;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.config.method.Rest>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_rest);
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
            if (!urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.config.method.Rest.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.config.method.Rest other = (urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.config.method.Rest)obj;
            if (!Objects.equals(_rest, other.getRest())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RestImpl otherImpl = (RestImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.config.method.Rest>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.config.method.Rest>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Rest [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_rest != null) {
                builder.append("_rest=");
                builder.append(_rest);
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
