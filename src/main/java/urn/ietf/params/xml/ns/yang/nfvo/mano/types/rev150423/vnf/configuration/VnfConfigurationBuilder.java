package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;

import java.util.HashMap;

import org.codehaus.jackson.annotate.JsonProperty;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.ConfigAccess;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.ConfigAttributes;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.ConfigMethod;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.InitialConfigPrimitive;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.vnf.configuration.ServicePrimitive;

import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.VnfConfiguration} instances.
 * 
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.VnfConfiguration
 *
 */
public class VnfConfigurationBuilder implements Builder<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.VnfConfiguration> {

    private ConfigAccess _configAccess;
    private ConfigAttributes _configAttributes;
    private ConfigMethod _configMethod;
    private java.lang.String _configTemplate;
    private List<InitialConfigPrimitive> _initialConfigPrimitive;
    private List<ServicePrimitive> _servicePrimitive;

    Map<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.VnfConfiguration>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.VnfConfiguration>> augmentation = Collections.emptyMap();

    public VnfConfigurationBuilder() {
    }

    public VnfConfigurationBuilder(VnfConfiguration base) {
        this._configAccess = base.getConfigAccess();
        this._configAttributes = base.getConfigAttributes();
        this._configMethod = base.getConfigMethod();
        this._configTemplate = base.getConfigTemplate();
        this._initialConfigPrimitive = base.getInitialConfigPrimitive();
        this._servicePrimitive = base.getServicePrimitive();
        if (base instanceof VnfConfigurationImpl) {
            VnfConfigurationImpl impl = (VnfConfigurationImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.VnfConfiguration> casted =(AugmentationHolder<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.VnfConfiguration>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public ConfigAccess getConfigAccess() {
        return _configAccess;
    }
    
    public ConfigAttributes getConfigAttributes() {
        return _configAttributes;
    }
    
    public ConfigMethod getConfigMethod() {
        return _configMethod;
    }
    
    public java.lang.String getConfigTemplate() {
        return _configTemplate;
    }
    
    public List<InitialConfigPrimitive> getInitialConfigPrimitive() {
        return _initialConfigPrimitive;
    }
    
    public List<ServicePrimitive> getServicePrimitive() {
        return _servicePrimitive;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.VnfConfiguration>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public VnfConfigurationBuilder setConfigAccess(final ConfigAccess value) {
        this._configAccess = value;
        return this;
    }
    
     
    public VnfConfigurationBuilder setConfigAttributes(final ConfigAttributes value) {
        this._configAttributes = value;
        return this;
    }
    
     
    public VnfConfigurationBuilder setConfigMethod(final ConfigMethod value) {
        this._configMethod = value;
        return this;
    }
    
     
    public VnfConfigurationBuilder setConfigTemplate(final java.lang.String value) {
        this._configTemplate = value;
        return this;
    }
    
     
    public VnfConfigurationBuilder setInitialConfigPrimitive(final List<InitialConfigPrimitive> value) {
        this._initialConfigPrimitive = value;
        return this;
    }
    
     
    public VnfConfigurationBuilder setServicePrimitive(final List<ServicePrimitive> value) {
        this._servicePrimitive = value;
        return this;
    }
    
    public VnfConfigurationBuilder addAugmentation(java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.VnfConfiguration>> augmentationType, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.VnfConfiguration> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VnfConfigurationBuilder removeAugmentation(java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.VnfConfiguration>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VnfConfiguration build() {
        return new VnfConfigurationImpl(this);
    }

    public static final class VnfConfigurationImpl implements VnfConfiguration {

        @Override
        public java.lang.Class<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.VnfConfiguration> getImplementedInterface() {
            return urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.VnfConfiguration.class;
        }

        private final ConfigAccess _configAccess;
        private final ConfigAttributes _configAttributes;
        private final ConfigMethod _configMethod;
        @JsonProperty("config-template")        
        private final java.lang.String _configTemplate;
        private final List<InitialConfigPrimitive> _initialConfigPrimitive;
        private final List<ServicePrimitive> _servicePrimitive;

        private Map<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.VnfConfiguration>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.VnfConfiguration>> augmentation = Collections.emptyMap();

        private VnfConfigurationImpl(VnfConfigurationBuilder base) {
            this._configAccess = base.getConfigAccess();
            this._configAttributes = base.getConfigAttributes();
            this._configMethod = base.getConfigMethod();
            this._configTemplate = base.getConfigTemplate();
            this._initialConfigPrimitive = base.getInitialConfigPrimitive();
            this._servicePrimitive = base.getServicePrimitive();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.VnfConfiguration>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.VnfConfiguration>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.VnfConfiguration>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.VnfConfiguration>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        public VnfConfigurationImpl() {
        	this( new VnfConfigurationBuilder());
        }
        @Override
        public ConfigAccess getConfigAccess() {
            return _configAccess;
        }
        
        @Override
        public ConfigAttributes getConfigAttributes() {
            return _configAttributes;
        }
        
        @Override
        public ConfigMethod getConfigMethod() {
            return _configMethod;
        }
        
        @Override
        public java.lang.String getConfigTemplate() {
            return _configTemplate;
        }
        
        @Override
        public List<InitialConfigPrimitive> getInitialConfigPrimitive() {
            return _initialConfigPrimitive;
        }
        
        @Override
        public List<ServicePrimitive> getServicePrimitive() {
            return _servicePrimitive;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.VnfConfiguration>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_configAccess);
            result = prime * result + Objects.hashCode(_configAttributes);
            result = prime * result + Objects.hashCode(_configMethod);
            result = prime * result + Objects.hashCode(_configTemplate);
            result = prime * result + Objects.hashCode(_initialConfigPrimitive);
            result = prime * result + Objects.hashCode(_servicePrimitive);
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
            if (!urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.VnfConfiguration.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.VnfConfiguration other = (urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.VnfConfiguration)obj;
            if (!Objects.equals(_configAccess, other.getConfigAccess())) {
                return false;
            }
            if (!Objects.equals(_configAttributes, other.getConfigAttributes())) {
                return false;
            }
            if (!Objects.equals(_configMethod, other.getConfigMethod())) {
                return false;
            }
            if (!Objects.equals(_configTemplate, other.getConfigTemplate())) {
                return false;
            }
            if (!Objects.equals(_initialConfigPrimitive, other.getInitialConfigPrimitive())) {
                return false;
            }
            if (!Objects.equals(_servicePrimitive, other.getServicePrimitive())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnfConfigurationImpl otherImpl = (VnfConfigurationImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.VnfConfiguration>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.VnfConfiguration>> e : augmentation.entrySet()) {
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
            java.lang.String name = "VnfConfiguration [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_configAccess != null) {
                builder.append("_configAccess=");
                builder.append(_configAccess);
                builder.append(", ");
            }
            if (_configAttributes != null) {
                builder.append("_configAttributes=");
                builder.append(_configAttributes);
                builder.append(", ");
            }
            if (_configMethod != null) {
                builder.append("_configMethod=");
                builder.append(_configMethod);
                builder.append(", ");
            }
            if (_configTemplate != null) {
                builder.append("_configTemplate=");
                builder.append(_configTemplate);
                builder.append(", ");
            }
            if (_initialConfigPrimitive != null) {
                builder.append("_initialConfigPrimitive=");
                builder.append(_initialConfigPrimitive);
                builder.append(", ");
            }
            if (_servicePrimitive != null) {
                builder.append("_servicePrimitive=");
                builder.append(_servicePrimitive);
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
