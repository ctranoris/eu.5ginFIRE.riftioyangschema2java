package urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.vld.catalog;
import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.VirtualLinkType;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.provider.network.ProviderNetwork;
import urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.vld.catalog.vld.VnfdConnectionPointRef;

/**
 * Class that builds {@link urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.vld.catalog.Vld} instances.
 * 
 * @see urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.vld.catalog.Vld
 *
 */
public class VldBuilder implements Builder<urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.vld.catalog.Vld> {

    private java.lang.String _description;
    private Uuid _id;
    private VldKey _key;
    private BigInteger _leafBandwidth;
    private java.lang.String _name;
    private ProviderNetwork _providerNetwork;
    private BigInteger _rootBandwidth;
    private java.lang.String _shortName;
    private VirtualLinkType _type;
    private java.lang.String _vendor;
    private java.lang.String _version;
    private List<VnfdConnectionPointRef> _vnfdConnectionPointRef;

    Map<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.vld.catalog.Vld>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.vld.catalog.Vld>> augmentation = Collections.emptyMap();

    public VldBuilder() {
    }
    public VldBuilder(urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ProviderNetwork arg) {
        this._providerNetwork = arg.getProviderNetwork();
    }

    public VldBuilder(Vld base) {
        if (base.getKey() == null) {
            this._key = new VldKey(
                base.getId()
            );
            this._id = base.getId();
        } else {
            this._key = base.getKey();
            this._id = _key.getId();
        }
        this._description = base.getDescription();
        this._leafBandwidth = base.getLeafBandwidth();
        this._name = base.getName();
        this._providerNetwork = base.getProviderNetwork();
        this._rootBandwidth = base.getRootBandwidth();
        this._shortName = base.getShortName();
        this._type = base.getType();
        this._vendor = base.getVendor();
        this._version = base.getVersion();
        this._vnfdConnectionPointRef = base.getVnfdConnectionPointRef();
        if (base instanceof VldImpl) {
            VldImpl impl = (VldImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.vld.catalog.Vld> casted =(AugmentationHolder<urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.vld.catalog.Vld>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ProviderNetwork</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ProviderNetwork) {
            this._providerNetwork = ((urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ProviderNetwork)arg).getProviderNetwork();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ProviderNetwork] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getDescription() {
        return _description;
    }
    
    public Uuid getId() {
        return _id;
    }
    
    public VldKey getKey() {
        return _key;
    }
    
    public BigInteger getLeafBandwidth() {
        return _leafBandwidth;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public ProviderNetwork getProviderNetwork() {
        return _providerNetwork;
    }
    
    public BigInteger getRootBandwidth() {
        return _rootBandwidth;
    }
    
    public java.lang.String getShortName() {
        return _shortName;
    }
    
    public VirtualLinkType getType() {
        return _type;
    }
    
    public java.lang.String getVendor() {
        return _vendor;
    }
    
    public java.lang.String getVersion() {
        return _version;
    }
    
    public List<VnfdConnectionPointRef> getVnfdConnectionPointRef() {
        return _vnfdConnectionPointRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.vld.catalog.Vld>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public VldBuilder setDescription(final java.lang.String value) {
        this._description = value;
        return this;
    }
    
     
    public VldBuilder setId(final Uuid value) {
        this._id = value;
        return this;
    }
    
     
    public VldBuilder setKey(final VldKey value) {
        this._key = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKLEAFBANDWIDTHRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKLEAFBANDWIDTHRANGE_RANGES = a;
     }
     private static void checkLeafBandwidthRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKLEAFBANDWIDTHRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKLEAFBANDWIDTHRANGE_RANGES)));
     }
    
    public VldBuilder setLeafBandwidth(final BigInteger value) {
    if (value != null) {
        checkLeafBandwidthRange(value);
    }
        this._leafBandwidth = value;
        return this;
    }
    
     
    public VldBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
     
    public VldBuilder setProviderNetwork(final ProviderNetwork value) {
        this._providerNetwork = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKROOTBANDWIDTHRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKROOTBANDWIDTHRANGE_RANGES = a;
     }
     private static void checkRootBandwidthRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKROOTBANDWIDTHRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKROOTBANDWIDTHRANGE_RANGES)));
     }
    
    public VldBuilder setRootBandwidth(final BigInteger value) {
    if (value != null) {
        checkRootBandwidthRange(value);
    }
        this._rootBandwidth = value;
        return this;
    }
    
     
    public VldBuilder setShortName(final java.lang.String value) {
        this._shortName = value;
        return this;
    }
    
     
    public VldBuilder setType(final VirtualLinkType value) {
        this._type = value;
        return this;
    }
    
     
    public VldBuilder setVendor(final java.lang.String value) {
        this._vendor = value;
        return this;
    }
    
     
    public VldBuilder setVersion(final java.lang.String value) {
        this._version = value;
        return this;
    }
    
     
    public VldBuilder setVnfdConnectionPointRef(final List<VnfdConnectionPointRef> value) {
        this._vnfdConnectionPointRef = value;
        return this;
    }
    
    public VldBuilder addAugmentation(java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.vld.catalog.Vld>> augmentationType, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.vld.catalog.Vld> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VldBuilder removeAugmentation(java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.vld.catalog.Vld>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Vld build() {
        return new VldImpl(this);
    }

    private static final class VldImpl implements Vld {

        @Override
        public java.lang.Class<urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.vld.catalog.Vld> getImplementedInterface() {
            return urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.vld.catalog.Vld.class;
        }

        private final java.lang.String _description;
        private final Uuid _id;
        private final VldKey _key;
        private final BigInteger _leafBandwidth;
        private final java.lang.String _name;
        private final ProviderNetwork _providerNetwork;
        private final BigInteger _rootBandwidth;
        private final java.lang.String _shortName;
        private final VirtualLinkType _type;
        private final java.lang.String _vendor;
        private final java.lang.String _version;
        private final List<VnfdConnectionPointRef> _vnfdConnectionPointRef;

        private Map<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.vld.catalog.Vld>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.vld.catalog.Vld>> augmentation = Collections.emptyMap();

        private VldImpl(VldBuilder base) {
            if (base.getKey() == null) {
                this._key = new VldKey(
                    base.getId()
                );
                this._id = base.getId();
            } else {
                this._key = base.getKey();
                this._id = _key.getId();
            }
            this._description = base.getDescription();
            this._leafBandwidth = base.getLeafBandwidth();
            this._name = base.getName();
            this._providerNetwork = base.getProviderNetwork();
            this._rootBandwidth = base.getRootBandwidth();
            this._shortName = base.getShortName();
            this._type = base.getType();
            this._vendor = base.getVendor();
            this._version = base.getVersion();
            this._vnfdConnectionPointRef = base.getVnfdConnectionPointRef();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.vld.catalog.Vld>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.vld.catalog.Vld>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.vld.catalog.Vld>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.vld.catalog.Vld>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getDescription() {
            return _description;
        }
        
        @Override
        public Uuid getId() {
            return _id;
        }
        
        @Override
        public VldKey getKey() {
            return _key;
        }
        
        @Override
        public BigInteger getLeafBandwidth() {
            return _leafBandwidth;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @Override
        public ProviderNetwork getProviderNetwork() {
            return _providerNetwork;
        }
        
        @Override
        public BigInteger getRootBandwidth() {
            return _rootBandwidth;
        }
        
        @Override
        public java.lang.String getShortName() {
            return _shortName;
        }
        
        @Override
        public VirtualLinkType getType() {
            return _type;
        }
        
        @Override
        public java.lang.String getVendor() {
            return _vendor;
        }
        
        @Override
        public java.lang.String getVersion() {
            return _version;
        }
        
        @Override
        public List<VnfdConnectionPointRef> getVnfdConnectionPointRef() {
            return _vnfdConnectionPointRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.vld.catalog.Vld>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_leafBandwidth);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_providerNetwork);
            result = prime * result + Objects.hashCode(_rootBandwidth);
            result = prime * result + Objects.hashCode(_shortName);
            result = prime * result + Objects.hashCode(_type);
            result = prime * result + Objects.hashCode(_vendor);
            result = prime * result + Objects.hashCode(_version);
            result = prime * result + Objects.hashCode(_vnfdConnectionPointRef);
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
            if (!urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.vld.catalog.Vld.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.vld.catalog.Vld other = (urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.vld.catalog.Vld)obj;
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_leafBandwidth, other.getLeafBandwidth())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_providerNetwork, other.getProviderNetwork())) {
                return false;
            }
            if (!Objects.equals(_rootBandwidth, other.getRootBandwidth())) {
                return false;
            }
            if (!Objects.equals(_shortName, other.getShortName())) {
                return false;
            }
            if (!Objects.equals(_type, other.getType())) {
                return false;
            }
            if (!Objects.equals(_vendor, other.getVendor())) {
                return false;
            }
            if (!Objects.equals(_version, other.getVersion())) {
                return false;
            }
            if (!Objects.equals(_vnfdConnectionPointRef, other.getVnfdConnectionPointRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VldImpl otherImpl = (VldImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.vld.catalog.Vld>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vld.rev150910.vld.catalog.Vld>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Vld [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_description != null) {
                builder.append("_description=");
                builder.append(_description);
                builder.append(", ");
            }
            if (_id != null) {
                builder.append("_id=");
                builder.append(_id);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_leafBandwidth != null) {
                builder.append("_leafBandwidth=");
                builder.append(_leafBandwidth);
                builder.append(", ");
            }
            if (_name != null) {
                builder.append("_name=");
                builder.append(_name);
                builder.append(", ");
            }
            if (_providerNetwork != null) {
                builder.append("_providerNetwork=");
                builder.append(_providerNetwork);
                builder.append(", ");
            }
            if (_rootBandwidth != null) {
                builder.append("_rootBandwidth=");
                builder.append(_rootBandwidth);
                builder.append(", ");
            }
            if (_shortName != null) {
                builder.append("_shortName=");
                builder.append(_shortName);
                builder.append(", ");
            }
            if (_type != null) {
                builder.append("_type=");
                builder.append(_type);
                builder.append(", ");
            }
            if (_vendor != null) {
                builder.append("_vendor=");
                builder.append(_vendor);
                builder.append(", ");
            }
            if (_version != null) {
                builder.append("_version=");
                builder.append(_version);
                builder.append(", ");
            }
            if (_vnfdConnectionPointRef != null) {
                builder.append("_vnfdConnectionPointRef=");
                builder.append(_vnfdConnectionPointRef);
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
