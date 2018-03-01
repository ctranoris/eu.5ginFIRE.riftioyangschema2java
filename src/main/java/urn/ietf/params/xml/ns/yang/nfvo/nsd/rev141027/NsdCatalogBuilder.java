package urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.catalog.Nsd;

/**
 * Class that builds {@link urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdCatalog} instances.
 * 
 * @see urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdCatalog
 *
 */
public class NsdCatalogBuilder implements Builder<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdCatalog> {

    private List<Nsd> _nsd;

    Map<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdCatalog>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdCatalog>> augmentation = Collections.emptyMap();

    public NsdCatalogBuilder() {
    }

    public NsdCatalogBuilder(NsdCatalog base) {
        this._nsd = base.getNsd();
        if (base instanceof NsdCatalogImpl) {
            NsdCatalogImpl impl = (NsdCatalogImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdCatalog> casted =(AugmentationHolder<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdCatalog>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public List<Nsd> getNsd() {
        return _nsd;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdCatalog>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public NsdCatalogBuilder setNsd(final List<Nsd> value) {
        this._nsd = value;
        return this;
    }
    
    public NsdCatalogBuilder addAugmentation(java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdCatalog>> augmentationType, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdCatalog> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NsdCatalogBuilder removeAugmentation(java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdCatalog>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public NsdCatalog build() {
        return new NsdCatalogImpl(this);
    }

    private static final class NsdCatalogImpl implements NsdCatalog {

        @Override
        public java.lang.Class<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdCatalog> getImplementedInterface() {
            return urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdCatalog.class;
        }

        private final List<Nsd> _nsd;

        private Map<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdCatalog>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdCatalog>> augmentation = Collections.emptyMap();

        private NsdCatalogImpl(NsdCatalogBuilder base) {
            this._nsd = base.getNsd();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdCatalog>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdCatalog>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdCatalog>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdCatalog>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<Nsd> getNsd() {
            return _nsd;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdCatalog>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_nsd);
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
            if (!urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdCatalog.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdCatalog other = (urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdCatalog)obj;
            if (!Objects.equals(_nsd, other.getNsd())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NsdCatalogImpl otherImpl = (NsdCatalogImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdCatalog>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdCatalog>> e : augmentation.entrySet()) {
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
            java.lang.String name = "NsdCatalog [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_nsd != null) {
                builder.append("_nsd=");
                builder.append(_nsd);
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
