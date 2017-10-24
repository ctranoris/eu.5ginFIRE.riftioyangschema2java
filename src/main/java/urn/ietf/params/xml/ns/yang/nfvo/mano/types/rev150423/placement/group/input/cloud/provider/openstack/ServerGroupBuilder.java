package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.openstack;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.openstack.ServerGroup} instances.
 * 
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.openstack.ServerGroup
 *
 */
public class ServerGroupBuilder implements Builder<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.openstack.ServerGroup> {

    private java.lang.String _name;

    Map<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.openstack.ServerGroup>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.openstack.ServerGroup>> augmentation = Collections.emptyMap();

    public ServerGroupBuilder() {
    }

    public ServerGroupBuilder(ServerGroup base) {
        this._name = base.getName();
        if (base instanceof ServerGroupImpl) {
            ServerGroupImpl impl = (ServerGroupImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.openstack.ServerGroup> casted =(AugmentationHolder<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.openstack.ServerGroup>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.String getName() {
        return _name;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.openstack.ServerGroup>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public ServerGroupBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
    public ServerGroupBuilder addAugmentation(java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.openstack.ServerGroup>> augmentationType, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.openstack.ServerGroup> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ServerGroupBuilder removeAugmentation(java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.openstack.ServerGroup>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ServerGroup build() {
        return new ServerGroupImpl(this);
    }

    private static final class ServerGroupImpl implements ServerGroup {

        @Override
        public java.lang.Class<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.openstack.ServerGroup> getImplementedInterface() {
            return urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.openstack.ServerGroup.class;
        }

        private final java.lang.String _name;

        private Map<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.openstack.ServerGroup>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.openstack.ServerGroup>> augmentation = Collections.emptyMap();

        private ServerGroupImpl(ServerGroupBuilder base) {
            this._name = base.getName();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.openstack.ServerGroup>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.openstack.ServerGroup>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.openstack.ServerGroup>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.openstack.ServerGroup>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.openstack.ServerGroup>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_name);
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
            if (!urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.openstack.ServerGroup.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.openstack.ServerGroup other = (urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.openstack.ServerGroup)obj;
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ServerGroupImpl otherImpl = (ServerGroupImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.openstack.ServerGroup>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.placement.group.input.cloud.provider.openstack.ServerGroup>> e : augmentation.entrySet()) {
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
            java.lang.String name = "ServerGroup [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_name != null) {
                builder.append("_name=");
                builder.append(_name);
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
