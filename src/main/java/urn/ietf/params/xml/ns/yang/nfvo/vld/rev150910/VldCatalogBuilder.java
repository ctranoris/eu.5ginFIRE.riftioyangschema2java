package urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.vld.catalog.Vld;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.VldCatalog} instances.
 * 
 * @see urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.VldCatalog
 *
 */
public class VldCatalogBuilder implements Builder<urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.VldCatalog> {

    private List<Vld> _vld;

    Map<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.VldCatalog>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.VldCatalog>> augmentation = Collections.emptyMap();

    public VldCatalogBuilder() {
    }

    public VldCatalogBuilder(VldCatalog base) {
        this._vld = base.getVld();
        if (base instanceof VldCatalogImpl) {
            VldCatalogImpl impl = (VldCatalogImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.VldCatalog> casted =(AugmentationHolder<urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.VldCatalog>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public List<Vld> getVld() {
        return _vld;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.VldCatalog>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public VldCatalogBuilder setVld(final List<Vld> value) {
        this._vld = value;
        return this;
    }
    
    public VldCatalogBuilder addAugmentation(java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.VldCatalog>> augmentationType, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.VldCatalog> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VldCatalogBuilder removeAugmentation(java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.VldCatalog>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VldCatalog build() {
        return new VldCatalogImpl(this);
    }

    private static final class VldCatalogImpl implements VldCatalog {

        @Override
        public java.lang.Class<urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.VldCatalog> getImplementedInterface() {
            return urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.VldCatalog.class;
        }

        private final List<Vld> _vld;

        private Map<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.VldCatalog>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.VldCatalog>> augmentation = Collections.emptyMap();

        private VldCatalogImpl(VldCatalogBuilder base) {
            this._vld = base.getVld();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.VldCatalog>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.VldCatalog>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.VldCatalog>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.VldCatalog>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<Vld> getVld() {
            return _vld;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.VldCatalog>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_vld);
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
            if (!urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.VldCatalog.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.VldCatalog other = (urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.VldCatalog)obj;
            if (!Objects.equals(_vld, other.getVld())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VldCatalogImpl otherImpl = (VldCatalogImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.VldCatalog>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.VldCatalog>> e : augmentation.entrySet()) {
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
            java.lang.String name = "VldCatalog [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_vld != null) {
                builder.append("_vld=");
                builder.append(_vld);
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
