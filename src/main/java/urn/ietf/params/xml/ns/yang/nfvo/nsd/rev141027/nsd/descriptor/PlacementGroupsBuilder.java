package urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import com.fasterxml.jackson.annotation.JsonProperty;

import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.PlacementGroupInfo.Strategy;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.placement.groups.MemberVnfd;

/**
 * Class that builds {@link urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.PlacementGroups} instances.
 * 
 * @see urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.PlacementGroups
 *
 */
public class PlacementGroupsBuilder implements Builder<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.PlacementGroups> {

    private PlacementGroupsKey _key;
    private List<MemberVnfd> _memberVnfd;
    private java.lang.String _name;
    private java.lang.String _requirement;
    private Strategy _strategy;

    Map<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.PlacementGroups>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.PlacementGroups>> augmentation = Collections.emptyMap();

    public PlacementGroupsBuilder() {
    }
    public PlacementGroupsBuilder(urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.PlacementGroupInfo arg) {
        this._name = arg.getName();
        this._requirement = arg.getRequirement();
        this._strategy = arg.getStrategy();
    }

    public PlacementGroupsBuilder(PlacementGroups base) {
        if (base.getKey() == null) {
            this._key = new PlacementGroupsKey(
                base.getName()
            );
            this._name = base.getName();
        } else {
            this._key = base.getKey();
            this._name = _key.getName();
        }
        this._memberVnfd = base.getMemberVnfd();
        this._requirement = base.getRequirement();
        this._strategy = base.getStrategy();
        if (base instanceof PlacementGroupsImpl) {
            PlacementGroupsImpl impl = (PlacementGroupsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.PlacementGroups> casted =(AugmentationHolder<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.PlacementGroups>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.PlacementGroupInfo</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.PlacementGroupInfo) {
            this._name = ((urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.PlacementGroupInfo)arg).getName();
            this._requirement = ((urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.PlacementGroupInfo)arg).getRequirement();
            this._strategy = ((urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.PlacementGroupInfo)arg).getStrategy();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.PlacementGroupInfo] \n" +
              "but was: " + arg
            );
        }
    }

    public PlacementGroupsKey getKey() {
        return _key;
    }
    
    public List<MemberVnfd> getMemberVnfd() {
        return _memberVnfd;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public java.lang.String getRequirement() {
        return _requirement;
    }
    
    public Strategy getStrategy() {
        return _strategy;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.PlacementGroups>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public PlacementGroupsBuilder setKey(final PlacementGroupsKey value) {
        this._key = value;
        return this;
    }
    
     
    public PlacementGroupsBuilder setMemberVnfd(final List<MemberVnfd> value) {
        this._memberVnfd = value;
        return this;
    }
    
     
    public PlacementGroupsBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
     
    public PlacementGroupsBuilder setRequirement(final java.lang.String value) {
        this._requirement = value;
        return this;
    }
    
     
    public PlacementGroupsBuilder setStrategy(final Strategy value) {
        this._strategy = value;
        return this;
    }
    
    public PlacementGroupsBuilder addAugmentation(java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.PlacementGroups>> augmentationType, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.PlacementGroups> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public PlacementGroupsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.PlacementGroups>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public PlacementGroups build() {
        return new PlacementGroupsImpl(this);
    }

    public static final class PlacementGroupsImpl implements PlacementGroups {

        @Override
        public java.lang.Class<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.PlacementGroups> getImplementedInterface() {
            return urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.PlacementGroups.class;
        }

        private final PlacementGroupsKey _key;
        @JsonProperty("member-vnfd")
        private final List<MemberVnfd> _memberVnfd;
        @JsonProperty("name")
        private final java.lang.String _name;
        @JsonProperty("requirement")
        private final java.lang.String _requirement;
        @JsonProperty("strategy")
        private final Strategy _strategy;

        private Map<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.PlacementGroups>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.PlacementGroups>> augmentation = Collections.emptyMap();

        private PlacementGroupsImpl(PlacementGroupsBuilder base) {
            if (base.getKey() == null) {
                this._key = new PlacementGroupsKey(
                    base.getName()
                );
                this._name = base.getName();
            } else {
                this._key = base.getKey();
                this._name = _key.getName();
            }
            this._memberVnfd = base.getMemberVnfd();
            this._requirement = base.getRequirement();
            this._strategy = base.getStrategy();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.PlacementGroups>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.PlacementGroups>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.PlacementGroups>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.PlacementGroups>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        public PlacementGroupsImpl(){
        	this( new PlacementGroupsBuilder() );
        }
        
        @Override
        public PlacementGroupsKey getKey() {
            return _key;
        }
        
        @Override
        public List<MemberVnfd> getMemberVnfd() {
            return _memberVnfd;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @Override
        public java.lang.String getRequirement() {
            return _requirement;
        }
        
        @Override
        public Strategy getStrategy() {
            return _strategy;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.PlacementGroups>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_memberVnfd);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_requirement);
            result = prime * result + Objects.hashCode(_strategy);
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
            if (!urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.PlacementGroups.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.PlacementGroups other = (urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.PlacementGroups)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_memberVnfd, other.getMemberVnfd())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_requirement, other.getRequirement())) {
                return false;
            }
            if (!Objects.equals(_strategy, other.getStrategy())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                PlacementGroupsImpl otherImpl = (PlacementGroupsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.PlacementGroups>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.PlacementGroups>> e : augmentation.entrySet()) {
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
            java.lang.String name = "PlacementGroups [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_memberVnfd != null) {
                builder.append("_memberVnfd=");
                builder.append(_memberVnfd);
                builder.append(", ");
            }
            if (_name != null) {
                builder.append("_name=");
                builder.append(_name);
                builder.append(", ");
            }
            if (_requirement != null) {
                builder.append("_requirement=");
                builder.append(_requirement);
                builder.append(", ");
            }
            if (_strategy != null) {
                builder.append("_strategy=");
                builder.append(_strategy);
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
