package urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.catalog;
import java.util.ArrayList;
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

import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ip.profile.list.IpProfiles;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vnf.configuration.VnfConfiguration;
import urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.nsd.descriptor.MonitoringParam;
import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.VnfdDescriptor.ServiceFunctionChain;
import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.ConnectionPoint;
import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.InternalVld;
import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.MgmtInterface;
import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.PlacementGroups;
import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.Vdu;
import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.VduDependency;

/**
 * Class that builds {@link urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.catalog.Vnfd} instances.
 * 
 * @see urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.catalog.Vnfd
 *
 */
public class VnfdBuilder implements Builder<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.catalog.Vnfd> {

    private List<ConnectionPoint> _connectionPoint;
    private java.lang.String _description;
    private java.lang.String _id;
    private List<InternalVld> _internalVld;
    private List<IpProfiles> _ipProfiles;
    private VnfdKey _key;
    private java.lang.String _logo;
    private MgmtInterface _mgmtInterface;
    private java.lang.String _name;
    private List<PlacementGroups> _placementGroups;
    private ServiceFunctionChain _serviceFunctionChain;
    private java.lang.String _serviceFunctionType;
    private java.lang.String _shortName;
    private List<Vdu> _vdu;
    private List<VduDependency> _vduDependency;
    private java.lang.String _vendor;
    private java.lang.String _version;
    private VnfConfiguration _vnfConfiguration;
    private List<MonitoringParam> _monitoringParam;

    Map<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.catalog.Vnfd>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.catalog.Vnfd>> augmentation = Collections.emptyMap();

    public VnfdBuilder() {
    }
    public VnfdBuilder(urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.VnfdDescriptor arg) {
        this._id = arg.getId();
        this._name = arg.getName();
        this._shortName = arg.getShortName();
        this._vendor = arg.getVendor();
        this._logo = arg.getLogo();
        this._description = arg.getDescription();
        this._version = arg.getVersion();
        this._mgmtInterface = arg.getMgmtInterface();
        this._internalVld = arg.getInternalVld();
        this._connectionPoint = arg.getConnectionPoint();
        this._vdu = arg.getVdu();
        this._vduDependency = arg.getVduDependency();
        this._serviceFunctionChain = arg.getServiceFunctionChain();
        this._serviceFunctionType = arg.getServiceFunctionType();
        this._placementGroups = arg.getPlacementGroups();
        this._ipProfiles = arg.getIpProfiles();
        this._vnfConfiguration = arg.getVnfConfiguration();
        this._monitoringParam = arg.getMonitoringParam();
    }
    public VnfdBuilder(urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.IpProfileList arg) {
        this._ipProfiles = arg.getIpProfiles();
    }
    public VnfdBuilder(urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.VnfConfiguration arg) {
        this._vnfConfiguration = arg.getVnfConfiguration();
    }

    public VnfdBuilder(Vnfd base) {
        if (base.getKey() == null) {
            this._key = new VnfdKey(
                base.getId()
            );
            this._id = base.getId();
        } else {
            this._key = base.getKey();
            this._id = _key.getId();
        }
        this._connectionPoint = base.getConnectionPoint();
        this._description = base.getDescription();
        this._internalVld = base.getInternalVld();
        this._ipProfiles = base.getIpProfiles();
        this._logo = base.getLogo();
        this._mgmtInterface = base.getMgmtInterface();
        this._name = base.getName();
        this._placementGroups = base.getPlacementGroups();
        this._serviceFunctionChain = base.getServiceFunctionChain();
        this._serviceFunctionType = base.getServiceFunctionType();
        this._shortName = base.getShortName();
        this._vdu = base.getVdu();
        this._vduDependency = base.getVduDependency();
        this._vendor = base.getVendor();
        this._version = base.getVersion();
        this._vnfConfiguration = base.getVnfConfiguration();
        if (base instanceof VnfdImpl) {
            VnfdImpl impl = (VnfdImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.catalog.Vnfd> casted =(AugmentationHolder<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.catalog.Vnfd>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.VnfConfiguration</li>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.IpProfileList</li>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.VnfdDescriptor</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.VnfConfiguration) {
            this._vnfConfiguration = ((urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.VnfConfiguration)arg).getVnfConfiguration();
            isValidArg = true;
        }
        if (arg instanceof urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.IpProfileList) {
            this._ipProfiles = ((urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.IpProfileList)arg).getIpProfiles();
            isValidArg = true;
        }
        if (arg instanceof urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.VnfdDescriptor) {
            this._id = ((urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.VnfdDescriptor)arg).getId();
            this._name = ((urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.VnfdDescriptor)arg).getName();
            this._shortName = ((urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.VnfdDescriptor)arg).getShortName();
            this._vendor = ((urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.VnfdDescriptor)arg).getVendor();
            this._logo = ((urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.VnfdDescriptor)arg).getLogo();
            this._description = ((urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.VnfdDescriptor)arg).getDescription();
            this._version = ((urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.VnfdDescriptor)arg).getVersion();
            this._mgmtInterface = ((urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.VnfdDescriptor)arg).getMgmtInterface();
            this._internalVld = ((urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.VnfdDescriptor)arg).getInternalVld();
            this._connectionPoint = ((urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.VnfdDescriptor)arg).getConnectionPoint();
            this._vdu = ((urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.VnfdDescriptor)arg).getVdu();
            this._vduDependency = ((urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.VnfdDescriptor)arg).getVduDependency();
            this._serviceFunctionChain = ((urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.VnfdDescriptor)arg).getServiceFunctionChain();
            this._serviceFunctionType = ((urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.VnfdDescriptor)arg).getServiceFunctionType();
            this._placementGroups = ((urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.VnfdDescriptor)arg).getPlacementGroups();
            this._monitoringParam = ((urn.ietf.params.xml.ns.yang.nfvo.nsd.rev141027.NsdDescriptor)arg).getMonitoringParam();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.VnfConfiguration, org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.IpProfileList, org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.VnfdDescriptor] \n" +
              "but was: " + arg
            );
        }
    }
    
    
    public List<MonitoringParam> getMonitoringParam() {
        return _monitoringParam;
    }

    public VnfdBuilder setMonitoringParam(final List<MonitoringParam> value) {
        this._monitoringParam = value;
        return this;
    }
    
    
    public List<ConnectionPoint> getConnectionPoint() {
        return _connectionPoint;
    }
    
    public java.lang.String getDescription() {
        return _description;
    }
    
    public java.lang.String getId() {
        return _id;
    }
    
    public List<InternalVld> getInternalVld() {
        return _internalVld;
    }
    
    public List<IpProfiles> getIpProfiles() {
        return _ipProfiles;
    }
    
    public VnfdKey getKey() {
        return _key;
    }
    
    public java.lang.String getLogo() {
        return _logo;
    }
    
    public MgmtInterface getMgmtInterface() {
        return _mgmtInterface;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public List<PlacementGroups> getPlacementGroups() {
        return _placementGroups;
    }
    
    public ServiceFunctionChain getServiceFunctionChain() {
        return _serviceFunctionChain;
    }
    
    public java.lang.String getServiceFunctionType() {
        return _serviceFunctionType;
    }
    
    public java.lang.String getShortName() {
        return _shortName;
    }
    
    public List<Vdu> getVdu() {
        return _vdu;
    }
    
    public List<VduDependency> getVduDependency() {
        return _vduDependency;
    }
    
    public java.lang.String getVendor() {
        return _vendor;
    }
    
    public java.lang.String getVersion() {
        return _version;
    }
    
    public VnfConfiguration getVnfConfiguration() {
        return _vnfConfiguration;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.catalog.Vnfd>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public VnfdBuilder setConnectionPoint(final List<ConnectionPoint> value) {
        this._connectionPoint = value;
        return this;
    }
    
     
    public VnfdBuilder setDescription(final java.lang.String value) {
        this._description = value;
        return this;
    }
    
     
    public VnfdBuilder setId(final java.lang.String value) {
        this._id = value;
        return this;
    }
    
     
    public VnfdBuilder setInternalVld(final List<InternalVld> value) {
        this._internalVld = value;
        return this;
    }
    
     
    public VnfdBuilder setIpProfiles(final List<IpProfiles> value) {
        this._ipProfiles = value;
        return this;
    }
    
     
    public VnfdBuilder setKey(final VnfdKey value) {
        this._key = value;
        return this;
    }
    
     
    public VnfdBuilder setLogo(final java.lang.String value) {
        this._logo = value;
        return this;
    }
    
     
    public VnfdBuilder setMgmtInterface(final MgmtInterface value) {
        this._mgmtInterface = value;
        return this;
    }
    
     
    public VnfdBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
     
    public VnfdBuilder setPlacementGroups(final List<PlacementGroups> value) {
        this._placementGroups = value;
        return this;
    }
    
     
    public VnfdBuilder setServiceFunctionChain(final ServiceFunctionChain value) {
        this._serviceFunctionChain = value;
        return this;
    }
    
     
    public VnfdBuilder setServiceFunctionType(final java.lang.String value) {
        this._serviceFunctionType = value;
        return this;
    }
    
     
    public VnfdBuilder setShortName(final java.lang.String value) {
        this._shortName = value;
        return this;
    }
    
     
    public VnfdBuilder setVdu(final List<Vdu> value) {
        this._vdu = value;
        return this;
    }
    
     
    public VnfdBuilder setVduDependency(final List<VduDependency> value) {
        this._vduDependency = value;
        return this;
    }
    
     
    public VnfdBuilder setVendor(final java.lang.String value) {
        this._vendor = value;
        return this;
    }
    
     
    public VnfdBuilder setVersion(final java.lang.String value) {
        this._version = value;
        return this;
    }
    
     
    public VnfdBuilder setVnfConfiguration(final VnfConfiguration value) {
        this._vnfConfiguration = value;
        return this;
    }
    
    public VnfdBuilder addAugmentation(java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.catalog.Vnfd>> augmentationType, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.catalog.Vnfd> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VnfdBuilder removeAugmentation(java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.catalog.Vnfd>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Vnfd build() {
        return new VnfdImpl(this);
    }

    public static final class VnfdImpl implements Vnfd {

        @Override
        public java.lang.Class<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.catalog.Vnfd> getImplementedInterface() {
            return urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.catalog.Vnfd.class;
        }

        @JsonProperty("connection-point")
        private final List<ConnectionPoint> _connectionPoint  = new ArrayList<ConnectionPoint>();  
        @JsonProperty("description")
        private final java.lang.String _description;
        @JsonProperty("id")
        private final java.lang.String _id;
        private final List<InternalVld> _internalVld  = new ArrayList<InternalVld>(); 
        private final List<IpProfiles> _ipProfiles;
        private final VnfdKey _key;
        @JsonProperty("logo")
        private final java.lang.String _logo;
        @JsonProperty("mgmt-interface")        
        private final MgmtInterface _mgmtInterface;
        @JsonProperty("name")
        private final java.lang.String _name;
        @JsonProperty("placement-groups")
        private final List<PlacementGroups> _placementGroups;
        @JsonProperty("service-function-chain")
        private final ServiceFunctionChain _serviceFunctionChain;
        private final java.lang.String _serviceFunctionType;
        @JsonProperty("short-name")
        private final java.lang.String _shortName;
        @JsonProperty("vdu")
        private final List<Vdu> _vdu = new ArrayList<Vdu>();  
        private final List<VduDependency> _vduDependency;
        @JsonProperty("vendor")
        private final java.lang.String _vendor;
        @JsonProperty("version")
        private final java.lang.String _version;
        @JsonProperty("vnf-configuration")
        private final VnfConfiguration _vnfConfiguration;
        @JsonProperty("monitoring-param")
        private final List<MonitoringParam> _monitoringParam;

        private Map<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.catalog.Vnfd>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.catalog.Vnfd>> augmentation = Collections.emptyMap();

        private VnfdImpl(VnfdBuilder base) {
            if (base.getKey() == null) {
                this._key = new VnfdKey(
                    base.getId()
                );
                this._id = base.getId();
            } else {
                this._key = base.getKey();
                this._id = _key.getId();
            }
//            this._connectionPoint = base.getConnectionPoint();
            this._description = base.getDescription();
//            this._internalVld = base.getInternalVld();
            this._ipProfiles = base.getIpProfiles();
            this._logo = base.getLogo();
            this._mgmtInterface = base.getMgmtInterface();
            this._name = base.getName();
            this._placementGroups = base.getPlacementGroups();
            this._serviceFunctionChain = base.getServiceFunctionChain();
            this._serviceFunctionType = base.getServiceFunctionType();
            this._shortName = base.getShortName();
            this._monitoringParam = base.getMonitoringParam();
//            this._vdu = base.getVdu();
            this._vduDependency = base.getVduDependency();
            this._vendor = base.getVendor();
            this._version = base.getVersion();
            this._vnfConfiguration = base.getVnfConfiguration();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.catalog.Vnfd>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.catalog.Vnfd>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.catalog.Vnfd>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.catalog.Vnfd>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }
        
        public VnfdImpl(){
        	this( new VnfdBuilder() );
        }

        @Override
        public List<ConnectionPoint> getConnectionPoint() {
            return _connectionPoint;
        }
        
        @Override
        public java.lang.String getDescription() {
            return _description;
        }
        
        @Override
        public java.lang.String getId() {
            return _id;
        }
        
        @Override
        public List<InternalVld> getInternalVld() {
            return _internalVld;
        }
        
        @Override
        public List<IpProfiles> getIpProfiles() {
            return _ipProfiles;
        }
        
        @Override
        public VnfdKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getLogo() {
            return _logo;
        }
        
        @Override
        public MgmtInterface getMgmtInterface() {
            return _mgmtInterface;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @Override
        public List<PlacementGroups> getPlacementGroups() {
            return _placementGroups;
        }
        
        @Override
        public ServiceFunctionChain getServiceFunctionChain() {
            return _serviceFunctionChain;
        }
        
        @Override
        public java.lang.String getServiceFunctionType() {
            return _serviceFunctionType;
        }
        
        @Override
        public java.lang.String getShortName() {
            return _shortName;
        }
        
        @Override
        public List<Vdu> getVdu() {
            return _vdu;
        }
        
        @Override
        public List<VduDependency> getVduDependency() {
            return _vduDependency;
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
        public VnfConfiguration getVnfConfiguration() {
            return _vnfConfiguration;
        }
        
        @Override
        public List<MonitoringParam> getMonitoringParam() {
            return _monitoringParam;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.catalog.Vnfd>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_connectionPoint);
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_internalVld);
            result = prime * result + Objects.hashCode(_ipProfiles);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_logo);
            result = prime * result + Objects.hashCode(_mgmtInterface);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_placementGroups);
            result = prime * result + Objects.hashCode(_serviceFunctionChain);
            result = prime * result + Objects.hashCode(_serviceFunctionType);
            result = prime * result + Objects.hashCode(_shortName);
            result = prime * result + Objects.hashCode(_vdu);
            result = prime * result + Objects.hashCode(_vduDependency);
            result = prime * result + Objects.hashCode(_vendor);
            result = prime * result + Objects.hashCode(_version);
            result = prime * result + Objects.hashCode(_vnfConfiguration);
            result = prime * result + Objects.hashCode(augmentation);
            result = prime * result + Objects.hashCode(_monitoringParam);
        
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
            if (!urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.catalog.Vnfd.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.catalog.Vnfd other = (urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.catalog.Vnfd)obj;
            if (!Objects.equals(_connectionPoint, other.getConnectionPoint())) {
                return false;
            }
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_internalVld, other.getInternalVld())) {
                return false;
            }
            if (!Objects.equals(_ipProfiles, other.getIpProfiles())) {
                return false;
            }
            if (!Objects.equals(_monitoringParam, other.getMonitoringParam())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_logo, other.getLogo())) {
                return false;
            }
            if (!Objects.equals(_mgmtInterface, other.getMgmtInterface())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_placementGroups, other.getPlacementGroups())) {
                return false;
            }
            if (!Objects.equals(_serviceFunctionChain, other.getServiceFunctionChain())) {
                return false;
            }
            if (!Objects.equals(_serviceFunctionType, other.getServiceFunctionType())) {
                return false;
            }
            if (!Objects.equals(_shortName, other.getShortName())) {
                return false;
            }
            if (!Objects.equals(_vdu, other.getVdu())) {
                return false;
            }
            if (!Objects.equals(_vduDependency, other.getVduDependency())) {
                return false;
            }
            if (!Objects.equals(_vendor, other.getVendor())) {
                return false;
            }
            if (!Objects.equals(_version, other.getVersion())) {
                return false;
            }
            if (!Objects.equals(_vnfConfiguration, other.getVnfConfiguration())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnfdImpl otherImpl = (VnfdImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.catalog.Vnfd>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.catalog.Vnfd>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Vnfd [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_connectionPoint != null) {
                builder.append("_connectionPoint=");
                builder.append(_connectionPoint);
                builder.append(", ");
            }
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
            if (_internalVld != null) {
                builder.append("_internalVld=");
                builder.append(_internalVld);
                builder.append(", ");
            }
            if (_monitoringParam != null) {
                builder.append("_monitoringParam=");
                builder.append(_monitoringParam);
                builder.append(", ");
            }
            if (_ipProfiles != null) {
                builder.append("_ipProfiles=");
                builder.append(_ipProfiles);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_logo != null) {
                builder.append("_logo=");
                builder.append(_logo);
                builder.append(", ");
            }
            if (_mgmtInterface != null) {
                builder.append("_mgmtInterface=");
                builder.append(_mgmtInterface);
                builder.append(", ");
            }
            if (_name != null) {
                builder.append("_name=");
                builder.append(_name);
                builder.append(", ");
            }
            if (_placementGroups != null) {
                builder.append("_placementGroups=");
                builder.append(_placementGroups);
                builder.append(", ");
            }
            if (_serviceFunctionChain != null) {
                builder.append("_serviceFunctionChain=");
                builder.append(_serviceFunctionChain);
                builder.append(", ");
            }
            if (_serviceFunctionType != null) {
                builder.append("_serviceFunctionType=");
                builder.append(_serviceFunctionType);
                builder.append(", ");
            }
            if (_shortName != null) {
                builder.append("_shortName=");
                builder.append(_shortName);
                builder.append(", ");
            }
            if (_vdu != null) {
                builder.append("_vdu=");
                builder.append(_vdu);
                builder.append(", ");
            }
            if (_vduDependency != null) {
                builder.append("_vduDependency=");
                builder.append(_vduDependency);
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
            if (_vnfConfiguration != null) {
                builder.append("_vnfConfiguration=");
                builder.append(_vnfConfiguration);
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
