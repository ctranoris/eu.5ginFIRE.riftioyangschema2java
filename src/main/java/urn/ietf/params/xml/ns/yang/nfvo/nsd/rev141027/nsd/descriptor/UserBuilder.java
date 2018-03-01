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

import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.user.KeyPair;

/**
 * Class that builds {@link urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.User} instances.
 * 
 * @see urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.User
 *
 */
public class UserBuilder implements Builder<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.User> {

    private UserKey _key;
    private List<KeyPair> _keyPair;
    private java.lang.String _name;
    private java.lang.String _userInfo;

    Map<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.User>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.User>> augmentation = Collections.emptyMap();

    public UserBuilder() {
    }

    public UserBuilder(User base) {
        if (base.getKey() == null) {
            this._key = new UserKey(
                base.getName()
            );
            this._name = base.getName();
        } else {
            this._key = base.getKey();
            this._name = _key.getName();
        }
        this._keyPair = base.getKeyPair();
        this._userInfo = base.getUserInfo();
        if (base instanceof UserImpl) {
            UserImpl impl = (UserImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.User> casted =(AugmentationHolder<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.User>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public UserKey getKey() {
        return _key;
    }
    
    public List<KeyPair> getKeyPair() {
        return _keyPair;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public java.lang.String getUserInfo() {
        return _userInfo;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.User>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public UserBuilder setKey(final UserKey value) {
        this._key = value;
        return this;
    }
    
     
    public UserBuilder setKeyPair(final List<KeyPair> value) {
        this._keyPair = value;
        return this;
    }
    
     
    public UserBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
     
    public UserBuilder setUserInfo(final java.lang.String value) {
        this._userInfo = value;
        return this;
    }
    
    public UserBuilder addAugmentation(java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.User>> augmentationType, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.User> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public UserBuilder removeAugmentation(java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.User>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public User build() {
        return new UserImpl(this);
    }

    private static final class UserImpl implements User {

        @Override
        public java.lang.Class<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.User> getImplementedInterface() {
            return urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.User.class;
        }

        private final UserKey _key;
        private final List<KeyPair> _keyPair;
        private final java.lang.String _name;
        private final java.lang.String _userInfo;

        private Map<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.User>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.User>> augmentation = Collections.emptyMap();

        private UserImpl(UserBuilder base) {
            if (base.getKey() == null) {
                this._key = new UserKey(
                    base.getName()
                );
                this._name = base.getName();
            } else {
                this._key = base.getKey();
                this._name = _key.getName();
            }
            this._keyPair = base.getKeyPair();
            this._userInfo = base.getUserInfo();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.User>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.User>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.User>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.User>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public UserKey getKey() {
            return _key;
        }
        
        @Override
        public List<KeyPair> getKeyPair() {
            return _keyPair;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @Override
        public java.lang.String getUserInfo() {
            return _userInfo;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.User>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_keyPair);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_userInfo);
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
            if (!urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.User.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.User other = (urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.User)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_keyPair, other.getKeyPair())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_userInfo, other.getUserInfo())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                UserImpl otherImpl = (UserImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.User>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.User>> e : augmentation.entrySet()) {
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
            java.lang.String name = "User [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_keyPair != null) {
                builder.append("_keyPair=");
                builder.append(_keyPair);
                builder.append(", ");
            }
            if (_name != null) {
                builder.append("_name=");
                builder.append(_name);
                builder.append(", ");
            }
            if (_userInfo != null) {
                builder.append("_userInfo=");
                builder.append(_userInfo);
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
