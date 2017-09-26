package urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;

import org.codehaus.jackson.annotate.JsonProperty;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.guest.epa.GuestEpa;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.host.epa.HostEpa;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.hypervisor.epa.HypervisorEpa;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.supplemental.boot.data.SupplementalBootData;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vm.flavor.VmFlavor;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.vswitch.epa.VswitchEpa;
import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.Alarm;
import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.CloudInitInput;
import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.ExternalInterface;
import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.InternalConnectionPoint;
import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.InternalInterface;
import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.Volumes;
import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.cloud.init.input.Filename;
import urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.vdu.cloud.init.input.FilenameBuilder;

import java.util.Objects;
import java.math.BigInteger;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.Vdu} instances.
 * 
 * @see urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.Vdu
 *
 */
public class VduBuilder implements Builder<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.Vdu> {

    private List<Alarm> _alarm;
    private CloudInitInput _cloudInitInput;
    private BigInteger _count;
    private java.lang.String _description;
    private List<ExternalInterface> _externalInterface;
    private GuestEpa _guestEpa;
    private HostEpa _hostEpa;
    private HypervisorEpa _hypervisorEpa;
    private java.lang.String _id;
    private java.lang.String _image;
    private java.lang.String _imageChecksum;
    private List<InternalConnectionPoint> _internalConnectionPoint;
    private List<InternalInterface> _internalInterface;
    private VduKey _key;
    private java.lang.String _mgmtVpci;
    private java.lang.String _name;
    private SupplementalBootData _supplementalBootData;
    private VmFlavor _vmFlavor;
    private List<Volumes> _volumes;
    private VswitchEpa _vswitchEpa;

    Map<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.Vdu>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.Vdu>> augmentation = Collections.emptyMap();

    public VduBuilder() {
    }
    public VduBuilder(urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.GuestEpa arg) {
        this._guestEpa = arg.getGuestEpa();
    }
    public VduBuilder(urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.HypervisorEpa arg) {
        this._hypervisorEpa = arg.getHypervisorEpa();
    }
    public VduBuilder(urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.VmFlavor arg) {
        this._vmFlavor = arg.getVmFlavor();
    }
    public VduBuilder(urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.VswitchEpa arg) {
        this._vswitchEpa = arg.getVswitchEpa();
    }
    public VduBuilder(urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ImageProperties arg) {
        this._image = arg.getImage();
        this._imageChecksum = arg.getImageChecksum();
    }
    public VduBuilder(urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.HostEpa arg) {
        this._hostEpa = arg.getHostEpa();
    }
    public VduBuilder(urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.SupplementalBootData arg) {
        this._supplementalBootData = arg.getSupplementalBootData();
    }

    public VduBuilder(Vdu base) {
        if (base.getKey() == null) {
            this._key = new VduKey(
                base.getId()
            );
            this._id = base.getId();
        } else {
            this._key = base.getKey();
            this._id = _key.getId();
        }
        this._alarm = base.getAlarm();
        this._cloudInitInput = base.getCloudInitInput();
        this._count = base.getCount();
        this._description = base.getDescription();
        this._externalInterface = base.getExternalInterface();
        this._guestEpa = base.getGuestEpa();
        this._hostEpa = base.getHostEpa();
        this._hypervisorEpa = base.getHypervisorEpa();
        this._image = base.getImage();
        this._imageChecksum = base.getImageChecksum();
        this._internalConnectionPoint = base.getInternalConnectionPoint();
        this._internalInterface = base.getInternalInterface();
        this._mgmtVpci = base.getMgmtVpci();
        this._name = base.getName();
        this._supplementalBootData = base.getSupplementalBootData();
        this._vmFlavor = base.getVmFlavor();
        this._volumes = base.getVolumes();
        this._vswitchEpa = base.getVswitchEpa();
        if (base instanceof VduImpl) {
            VduImpl impl = (VduImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.Vdu> casted =(AugmentationHolder<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.Vdu>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.VmFlavor</li>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.VswitchEpa</li>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.GuestEpa</li>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.HypervisorEpa</li>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ImageProperties</li>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.HostEpa</li>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.SupplementalBootData</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.VmFlavor) {
            this._vmFlavor = ((urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.VmFlavor)arg).getVmFlavor();
            isValidArg = true;
        }
        if (arg instanceof urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.VswitchEpa) {
            this._vswitchEpa = ((urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.VswitchEpa)arg).getVswitchEpa();
            isValidArg = true;
        }
        if (arg instanceof urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.GuestEpa) {
            this._guestEpa = ((urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.GuestEpa)arg).getGuestEpa();
            isValidArg = true;
        }
        if (arg instanceof urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.HypervisorEpa) {
            this._hypervisorEpa = ((urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.HypervisorEpa)arg).getHypervisorEpa();
            isValidArg = true;
        }
        if (arg instanceof urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ImageProperties) {
            this._image = ((urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ImageProperties)arg).getImage();
            this._imageChecksum = ((urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ImageProperties)arg).getImageChecksum();
            isValidArg = true;
        }
        if (arg instanceof urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.HostEpa) {
            this._hostEpa = ((urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.HostEpa)arg).getHostEpa();
            isValidArg = true;
        }
        if (arg instanceof urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.SupplementalBootData) {
            this._supplementalBootData = ((urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.SupplementalBootData)arg).getSupplementalBootData();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.VmFlavor, org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.VswitchEpa, org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.GuestEpa, org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.HypervisorEpa, org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ImageProperties, org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.HostEpa, org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.SupplementalBootData] \n" +
              "but was: " + arg
            );
        }
    }

    public List<Alarm> getAlarm() {
        return _alarm;
    }
    
    public CloudInitInput getCloudInitInput() {
        return _cloudInitInput;
    }
    
    public BigInteger getCount() {
        return _count;
    }
    
    public java.lang.String getDescription() {
        return _description;
    }
    
    public List<ExternalInterface> getExternalInterface() {
        return _externalInterface;
    }
    
    public GuestEpa getGuestEpa() {
        return _guestEpa;
    }
    
    public HostEpa getHostEpa() {
        return _hostEpa;
    }
    
    public HypervisorEpa getHypervisorEpa() {
        return _hypervisorEpa;
    }
    
    public java.lang.String getId() {
        return _id;
    }
    
    public java.lang.String getImage() {
        return _image;
    }
    
    public java.lang.String getImageChecksum() {
        return _imageChecksum;
    }
    
    public List<InternalConnectionPoint> getInternalConnectionPoint() {
        return _internalConnectionPoint;
    }
    
    public List<InternalInterface> getInternalInterface() {
        return _internalInterface;
    }
    
    public VduKey getKey() {
        return _key;
    }
    
    public java.lang.String getMgmtVpci() {
        return _mgmtVpci;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public SupplementalBootData getSupplementalBootData() {
        return _supplementalBootData;
    }
    
    public VmFlavor getVmFlavor() {
        return _vmFlavor;
    }
    
    public List<Volumes> getVolumes() {
        return _volumes;
    }
    
    public VswitchEpa getVswitchEpa() {
        return _vswitchEpa;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.Vdu>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public VduBuilder setAlarm(final List<Alarm> value) {
        this._alarm = value;
        return this;
    }
    
     
    public VduBuilder setCloudInitInput(final CloudInitInput value) {
        this._cloudInitInput = value;
        return this;
    }
    
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKCOUNTRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKCOUNTRANGE_RANGES = a;
     }
     private static void checkCountRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKCOUNTRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKCOUNTRANGE_RANGES)));
     }
    
    public VduBuilder setCount(final BigInteger value) {
    if (value != null) {
        checkCountRange(value);
    }
        this._count = value;
        return this;
    }
    
     
    public VduBuilder setDescription(final java.lang.String value) {
        this._description = value;
        return this;
    }
    
     
    public VduBuilder setExternalInterface(final List<ExternalInterface> value) {
        this._externalInterface = value;
        return this;
    }
    
     
    public VduBuilder setGuestEpa(final GuestEpa value) {
        this._guestEpa = value;
        return this;
    }
    
     
    public VduBuilder setHostEpa(final HostEpa value) {
        this._hostEpa = value;
        return this;
    }
    
     
    public VduBuilder setHypervisorEpa(final HypervisorEpa value) {
        this._hypervisorEpa = value;
        return this;
    }
    
     
    public VduBuilder setId(final java.lang.String value) {
        this._id = value;
        return this;
    }
    
     
    public VduBuilder setImage(final java.lang.String value) {
        this._image = value;
        return this;
    }
    
     
    public VduBuilder setImageChecksum(final java.lang.String value) {
        this._imageChecksum = value;
        return this;
    }
    
     
    public VduBuilder setInternalConnectionPoint(final List<InternalConnectionPoint> value) {
        this._internalConnectionPoint = value;
        return this;
    }
    
     
    public VduBuilder setInternalInterface(final List<InternalInterface> value) {
        this._internalInterface = value;
        return this;
    }
    
     
    public VduBuilder setKey(final VduKey value) {
        this._key = value;
        return this;
    }
    
     
    public VduBuilder setMgmtVpci(final java.lang.String value) {
        this._mgmtVpci = value;
        return this;
    }
    
     
    public VduBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
     
    public VduBuilder setSupplementalBootData(final SupplementalBootData value) {
        this._supplementalBootData = value;
        return this;
    }
    
     
    public VduBuilder setVmFlavor(final VmFlavor value) {
        this._vmFlavor = value;
        return this;
    }
    
     
    public VduBuilder setVolumes(final List<Volumes> value) {
        this._volumes = value;
        return this;
    }
    
     
    public VduBuilder setVswitchEpa(final VswitchEpa value) {
        this._vswitchEpa = value;
        return this;
    }
    
    public VduBuilder addAugmentation(java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.Vdu>> augmentationType, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.Vdu> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VduBuilder removeAugmentation(java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.Vdu>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Vdu build() {
        return new VduImpl(this);
    }

    public static final class VduImpl implements Vdu {

        @Override
        public java.lang.Class<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.Vdu> getImplementedInterface() {
            return urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.Vdu.class;
        }

        private final List<Alarm> _alarm;
        
        private CloudInitInput _cloudInitInput;
        @JsonProperty("count")
        private final BigInteger _count; 
        @JsonProperty("description")
        private final java.lang.String _description;
        @JsonProperty("external-interface")
        private final List<ExternalInterface> _externalInterface = new ArrayList<ExternalInterface>();  
        @JsonProperty("guest-epa")
        private final GuestEpa _guestEpa;
        private final HostEpa _hostEpa;
        private final HypervisorEpa _hypervisorEpa;
        @JsonProperty("id")
        private final java.lang.String _id;
        @JsonProperty("image")
        private final java.lang.String _image;
        @JsonProperty("image-checksum")
        private final java.lang.String _imageChecksum;
        private final List<InternalConnectionPoint> _internalConnectionPoint;
        private final List<InternalInterface> _internalInterface;
        private final VduKey _key;
        private final java.lang.String _mgmtVpci;
        @JsonProperty("name")
        private final java.lang.String _name;
        @JsonProperty("supplemental-boot-data")
        private final SupplementalBootData _supplementalBootData; 
        @JsonProperty("vm-flavor")
        private final VmFlavor _vmFlavor;
        private final List<Volumes> _volumes;
        private final VswitchEpa _vswitchEpa;

        private Map<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.Vdu>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.Vdu>> augmentation = Collections.emptyMap();

        private VduImpl(VduBuilder base) {
            if (base.getKey() == null) {
                this._key = new VduKey(
                    base.getId()
                );
                this._id = base.getId();
            } else {
                this._key = base.getKey();
                this._id = _key.getId();
            }
            this._alarm = base.getAlarm();
            this._cloudInitInput = base.getCloudInitInput();
            this._count = base.getCount();
            this._description = base.getDescription();
//            this._externalInterface = base.getExternalInterface();
            this._guestEpa = base.getGuestEpa();
            this._hostEpa = base.getHostEpa();
            this._hypervisorEpa = base.getHypervisorEpa();
            this._image = base.getImage();
            this._imageChecksum = base.getImageChecksum();
            this._internalConnectionPoint = base.getInternalConnectionPoint();
            this._internalInterface = base.getInternalInterface();
            this._mgmtVpci = base.getMgmtVpci();
            this._name = base.getName();
            this._supplementalBootData = base.getSupplementalBootData();
            this._vmFlavor = base.getVmFlavor();
            this._volumes = base.getVolumes();
            this._vswitchEpa = base.getVswitchEpa();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.Vdu>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.Vdu>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.Vdu>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.Vdu>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        public VduImpl(){
        	this(new VduBuilder() );
        }
        
        @Override
        public List<Alarm> getAlarm() {
            return _alarm;
        }
        
        @Override
        public CloudInitInput getCloudInitInput() {
            return _cloudInitInput;
        }
        
        @Override
        public BigInteger getCount() {
            return _count;
        }
        
        @Override
        public java.lang.String getDescription() {
            return _description;
        }
        
        @Override
        public List<ExternalInterface> getExternalInterface() {
            return _externalInterface;
        }
        
        @Override
        public GuestEpa getGuestEpa() {
            return _guestEpa;
        }
        
        @Override
        public HostEpa getHostEpa() {
            return _hostEpa;
        }
        
        @Override
        public HypervisorEpa getHypervisorEpa() {
            return _hypervisorEpa;
        }
        
        @Override
        public java.lang.String getId() {
            return _id;
        }
        
        @Override
        public java.lang.String getImage() {
            return _image;
        }
        
        @Override
        public java.lang.String getImageChecksum() {
            return _imageChecksum;
        }
        
        @Override
        public List<InternalConnectionPoint> getInternalConnectionPoint() {
            return _internalConnectionPoint;
        }
        
        @Override
        public List<InternalInterface> getInternalInterface() {
            return _internalInterface;
        }
        
        @Override
        public VduKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getMgmtVpci() {
            return _mgmtVpci;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @Override
        public SupplementalBootData getSupplementalBootData() {
            return _supplementalBootData;
        }
        
        @Override
        public VmFlavor getVmFlavor() {
            return _vmFlavor;
        }
        
        @Override
        public List<Volumes> getVolumes() {
            return _volumes;
        }
        
        @Override
        public VswitchEpa getVswitchEpa() {
            return _vswitchEpa;
        }
        
                
        @JsonProperty("cloud-init-file")
        public void setCloudInitInputFile(final String value) {
        	
        	FilenameBuilder f = new FilenameBuilder();
        	f.setCloudInitFile(value);
            this._cloudInitInput = f.build();
            

        }
        
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.Vdu>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_alarm);
            result = prime * result + Objects.hashCode(_cloudInitInput);
            result = prime * result + Objects.hashCode(_count);
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_externalInterface);
            result = prime * result + Objects.hashCode(_guestEpa);
            result = prime * result + Objects.hashCode(_hostEpa);
            result = prime * result + Objects.hashCode(_hypervisorEpa);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_image);
            result = prime * result + Objects.hashCode(_imageChecksum);
            result = prime * result + Objects.hashCode(_internalConnectionPoint);
            result = prime * result + Objects.hashCode(_internalInterface);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_mgmtVpci);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_supplementalBootData);
            result = prime * result + Objects.hashCode(_vmFlavor);
            result = prime * result + Objects.hashCode(_volumes);
            result = prime * result + Objects.hashCode(_vswitchEpa);
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
            if (!urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.Vdu.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.Vdu other = (urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.Vdu)obj;
            if (!Objects.equals(_alarm, other.getAlarm())) {
                return false;
            }
            if (!Objects.equals(_cloudInitInput, other.getCloudInitInput())) {
                return false;
            }
            if (!Objects.equals(_count, other.getCount())) {
                return false;
            }
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_externalInterface, other.getExternalInterface())) {
                return false;
            }
            if (!Objects.equals(_guestEpa, other.getGuestEpa())) {
                return false;
            }
            if (!Objects.equals(_hostEpa, other.getHostEpa())) {
                return false;
            }
            if (!Objects.equals(_hypervisorEpa, other.getHypervisorEpa())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_image, other.getImage())) {
                return false;
            }
            if (!Objects.equals(_imageChecksum, other.getImageChecksum())) {
                return false;
            }
            if (!Objects.equals(_internalConnectionPoint, other.getInternalConnectionPoint())) {
                return false;
            }
            if (!Objects.equals(_internalInterface, other.getInternalInterface())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_mgmtVpci, other.getMgmtVpci())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_supplementalBootData, other.getSupplementalBootData())) {
                return false;
            }
            if (!Objects.equals(_vmFlavor, other.getVmFlavor())) {
                return false;
            }
            if (!Objects.equals(_volumes, other.getVolumes())) {
                return false;
            }
            if (!Objects.equals(_vswitchEpa, other.getVswitchEpa())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VduImpl otherImpl = (VduImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.Vdu>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev150910.vnfd.descriptor.Vdu>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Vdu [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_alarm != null) {
                builder.append("_alarm=");
                builder.append(_alarm);
                builder.append(", ");
            }
            if (_cloudInitInput != null) {
                builder.append("_cloudInitInput=");
                builder.append(_cloudInitInput);
                builder.append(", ");
            }
            if (_count != null) {
                builder.append("_count=");
                builder.append(_count);
                builder.append(", ");
            }
            if (_description != null) {
                builder.append("_description=");
                builder.append(_description);
                builder.append(", ");
            }
            if (_externalInterface != null) {
                builder.append("_externalInterface=");
                builder.append(_externalInterface);
                builder.append(", ");
            }
            if (_guestEpa != null) {
                builder.append("_guestEpa=");
                builder.append(_guestEpa);
                builder.append(", ");
            }
            if (_hostEpa != null) {
                builder.append("_hostEpa=");
                builder.append(_hostEpa);
                builder.append(", ");
            }
            if (_hypervisorEpa != null) {
                builder.append("_hypervisorEpa=");
                builder.append(_hypervisorEpa);
                builder.append(", ");
            }
            if (_id != null) {
                builder.append("_id=");
                builder.append(_id);
                builder.append(", ");
            }
            if (_image != null) {
                builder.append("_image=");
                builder.append(_image);
                builder.append(", ");
            }
            if (_imageChecksum != null) {
                builder.append("_imageChecksum=");
                builder.append(_imageChecksum);
                builder.append(", ");
            }
            if (_internalConnectionPoint != null) {
                builder.append("_internalConnectionPoint=");
                builder.append(_internalConnectionPoint);
                builder.append(", ");
            }
            if (_internalInterface != null) {
                builder.append("_internalInterface=");
                builder.append(_internalInterface);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_mgmtVpci != null) {
                builder.append("_mgmtVpci=");
                builder.append(_mgmtVpci);
                builder.append(", ");
            }
            if (_name != null) {
                builder.append("_name=");
                builder.append(_name);
                builder.append(", ");
            }
            if (_supplementalBootData != null) {
                builder.append("_supplementalBootData=");
                builder.append(_supplementalBootData);
                builder.append(", ");
            }
            if (_vmFlavor != null) {
                builder.append("_vmFlavor=");
                builder.append(_vmFlavor);
                builder.append(", ");
            }
            if (_volumes != null) {
                builder.append("_volumes=");
                builder.append(_volumes);
                builder.append(", ");
            }
            if (_vswitchEpa != null) {
                builder.append("_vswitchEpa=");
                builder.append(_vswitchEpa);
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
