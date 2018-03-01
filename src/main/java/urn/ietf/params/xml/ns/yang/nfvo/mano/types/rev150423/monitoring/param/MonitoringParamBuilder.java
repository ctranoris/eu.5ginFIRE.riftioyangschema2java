package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.JsonQueryMethod;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.ParamValueType;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.WidgetType;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.monitoring.param.JsonQueryParams;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.value.NumericConstraints;
import urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.value.TextConstraints;

/**
 * Class that builds {@link urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.MonitoringParam} instances.
 * 
 * @see urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.MonitoringParam
 *
 */
public class MonitoringParamBuilder implements Builder<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.MonitoringParam> {

    private java.lang.String _description;
    private java.lang.String _groupTag;
    private java.lang.String _httpEndpointRef;
    private java.lang.String _id;
    private JsonQueryMethod _jsonQueryMethod;
    private JsonQueryParams _jsonQueryParams;
    private MonitoringParamKey _key;
    private java.lang.String _name;
    private NumericConstraints _numericConstraints;
    private TextConstraints _textConstraints;
    private java.lang.String _units;
    private BigDecimal _valueDecimal;
    private java.lang.Long _valueInteger;
    private java.lang.String _valueString;
    private ParamValueType _valueType;
    private WidgetType _widgetType;

    Map<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.MonitoringParam>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.MonitoringParam>> augmentation = Collections.emptyMap();

    public MonitoringParamBuilder() {
    }
    public MonitoringParamBuilder(urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.MonitoringParamUiData arg) {
        this._description = arg.getDescription();
        this._groupTag = arg.getGroupTag();
        this._widgetType = arg.getWidgetType();
        this._units = arg.getUnits();
    }
    public MonitoringParamBuilder(urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.MonitoringParamValue arg) {
        this._valueType = arg.getValueType();
        this._numericConstraints = arg.getNumericConstraints();
        this._textConstraints = arg.getTextConstraints();
        this._valueInteger = arg.getValueInteger();
        this._valueDecimal = arg.getValueDecimal();
        this._valueString = arg.getValueString();
    }

    public MonitoringParamBuilder(MonitoringParam base) {
        if (base.getKey() == null) {
            this._key = new MonitoringParamKey(
                base.getId()
            );
            this._id = base.getId();
        } else {
            this._key = base.getKey();
            this._id = _key.getId();
        }
        this._description = base.getDescription();
        this._groupTag = base.getGroupTag();
        this._httpEndpointRef = base.getHttpEndpointRef();
        this._jsonQueryMethod = base.getJsonQueryMethod();
        this._jsonQueryParams = base.getJsonQueryParams();
        this._name = base.getName();
        this._numericConstraints = base.getNumericConstraints();
        this._textConstraints = base.getTextConstraints();
        this._units = base.getUnits();
        this._valueDecimal = base.getValueDecimal();
        this._valueInteger = base.getValueInteger();
        this._valueString = base.getValueString();
        this._valueType = base.getValueType();
        this._widgetType = base.getWidgetType();
        if (base instanceof MonitoringParamImpl) {
            MonitoringParamImpl impl = (MonitoringParamImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.MonitoringParam> casted =(AugmentationHolder<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.MonitoringParam>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.MonitoringParamValue</li>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.MonitoringParamUiData</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.MonitoringParamValue) {
            this._valueType = ((urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.MonitoringParamValue)arg).getValueType();
            this._numericConstraints = ((urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.MonitoringParamValue)arg).getNumericConstraints();
            this._textConstraints = ((urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.MonitoringParamValue)arg).getTextConstraints();
            this._valueInteger = ((urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.MonitoringParamValue)arg).getValueInteger();
            this._valueDecimal = ((urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.MonitoringParamValue)arg).getValueDecimal();
            this._valueString = ((urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.MonitoringParamValue)arg).getValueString();
            isValidArg = true;
        }
        if (arg instanceof urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.MonitoringParamUiData) {
            this._description = ((urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.MonitoringParamUiData)arg).getDescription();
            this._groupTag = ((urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.MonitoringParamUiData)arg).getGroupTag();
            this._widgetType = ((urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.MonitoringParamUiData)arg).getWidgetType();
            this._units = ((urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.MonitoringParamUiData)arg).getUnits();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.MonitoringParamValue, org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.MonitoringParamUiData] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getDescription() {
        return _description;
    }
    
    public java.lang.String getGroupTag() {
        return _groupTag;
    }
    
    public java.lang.String getHttpEndpointRef() {
        return _httpEndpointRef;
    }
    
    public java.lang.String getId() {
        return _id;
    }
    
    public JsonQueryMethod getJsonQueryMethod() {
        return _jsonQueryMethod;
    }
    
    public JsonQueryParams getJsonQueryParams() {
        return _jsonQueryParams;
    }
    
    public MonitoringParamKey getKey() {
        return _key;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public NumericConstraints getNumericConstraints() {
        return _numericConstraints;
    }
    
    public TextConstraints getTextConstraints() {
        return _textConstraints;
    }
    
    public java.lang.String getUnits() {
        return _units;
    }
    
    public BigDecimal getValueDecimal() {
        return _valueDecimal;
    }
    
    public java.lang.Long getValueInteger() {
        return _valueInteger;
    }
    
    public java.lang.String getValueString() {
        return _valueString;
    }
    
    public ParamValueType getValueType() {
        return _valueType;
    }
    
    public WidgetType getWidgetType() {
        return _widgetType;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.MonitoringParam>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public MonitoringParamBuilder setDescription(final java.lang.String value) {
        this._description = value;
        return this;
    }
    
     
    public MonitoringParamBuilder setGroupTag(final java.lang.String value) {
        this._groupTag = value;
        return this;
    }
    
     
    public MonitoringParamBuilder setHttpEndpointRef(final java.lang.String value) {
        this._httpEndpointRef = value;
        return this;
    }
    
     
    public MonitoringParamBuilder setId(final java.lang.String value) {
        this._id = value;
        return this;
    }
    
     
    public MonitoringParamBuilder setJsonQueryMethod(final JsonQueryMethod value) {
        this._jsonQueryMethod = value;
        return this;
    }
    
     
    public MonitoringParamBuilder setJsonQueryParams(final JsonQueryParams value) {
        this._jsonQueryParams = value;
        return this;
    }
    
     
    public MonitoringParamBuilder setKey(final MonitoringParamKey value) {
        this._key = value;
        return this;
    }
    
     
    public MonitoringParamBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
     
    public MonitoringParamBuilder setNumericConstraints(final NumericConstraints value) {
        this._numericConstraints = value;
        return this;
    }
    
     
    public MonitoringParamBuilder setTextConstraints(final TextConstraints value) {
        this._textConstraints = value;
        return this;
    }
    
     
    public MonitoringParamBuilder setUnits(final java.lang.String value) {
        this._units = value;
        return this;
    }
    
     
    public MonitoringParamBuilder setValueDecimal(final BigDecimal value) {
        this._valueDecimal = value;
        return this;
    }
    
     
    public MonitoringParamBuilder setValueInteger(final java.lang.Long value) {
        this._valueInteger = value;
        return this;
    }
    
     
    public MonitoringParamBuilder setValueString(final java.lang.String value) {
        this._valueString = value;
        return this;
    }
    
     
    public MonitoringParamBuilder setValueType(final ParamValueType value) {
        this._valueType = value;
        return this;
    }
    
     
    public MonitoringParamBuilder setWidgetType(final WidgetType value) {
        this._widgetType = value;
        return this;
    }
    
    public MonitoringParamBuilder addAugmentation(java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.MonitoringParam>> augmentationType, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.MonitoringParam> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public MonitoringParamBuilder removeAugmentation(java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.MonitoringParam>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public MonitoringParam build() {
        return new MonitoringParamImpl(this);
    }

    private static final class MonitoringParamImpl implements MonitoringParam {

        @Override
        public java.lang.Class<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.MonitoringParam> getImplementedInterface() {
            return urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.MonitoringParam.class;
        }

        private final java.lang.String _description;
        private final java.lang.String _groupTag;
        private final java.lang.String _httpEndpointRef;
        private final java.lang.String _id;
        private final JsonQueryMethod _jsonQueryMethod;
        private final JsonQueryParams _jsonQueryParams;
        private final MonitoringParamKey _key;
        private final java.lang.String _name;
        private final NumericConstraints _numericConstraints;
        private final TextConstraints _textConstraints;
        private final java.lang.String _units;
        private final BigDecimal _valueDecimal;
        private final java.lang.Long _valueInteger;
        private final java.lang.String _valueString;
        private final ParamValueType _valueType;
        private final WidgetType _widgetType;

        private Map<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.MonitoringParam>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.MonitoringParam>> augmentation = Collections.emptyMap();

        private MonitoringParamImpl(MonitoringParamBuilder base) {
            if (base.getKey() == null) {
                this._key = new MonitoringParamKey(
                    base.getId()
                );
                this._id = base.getId();
            } else {
                this._key = base.getKey();
                this._id = _key.getId();
            }
            this._description = base.getDescription();
            this._groupTag = base.getGroupTag();
            this._httpEndpointRef = base.getHttpEndpointRef();
            this._jsonQueryMethod = base.getJsonQueryMethod();
            this._jsonQueryParams = base.getJsonQueryParams();
            this._name = base.getName();
            this._numericConstraints = base.getNumericConstraints();
            this._textConstraints = base.getTextConstraints();
            this._units = base.getUnits();
            this._valueDecimal = base.getValueDecimal();
            this._valueInteger = base.getValueInteger();
            this._valueString = base.getValueString();
            this._valueType = base.getValueType();
            this._widgetType = base.getWidgetType();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.MonitoringParam>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.MonitoringParam>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.MonitoringParam>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.MonitoringParam>>singletonMap(e.getKey(), e.getValue());
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
        public java.lang.String getGroupTag() {
            return _groupTag;
        }
        
        @Override
        public java.lang.String getHttpEndpointRef() {
            return _httpEndpointRef;
        }
        
        @Override
        public java.lang.String getId() {
            return _id;
        }
        
        @Override
        public JsonQueryMethod getJsonQueryMethod() {
            return _jsonQueryMethod;
        }
        
        @Override
        public JsonQueryParams getJsonQueryParams() {
            return _jsonQueryParams;
        }
        
        @Override
        public MonitoringParamKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @Override
        public NumericConstraints getNumericConstraints() {
            return _numericConstraints;
        }
        
        @Override
        public TextConstraints getTextConstraints() {
            return _textConstraints;
        }
        
        @Override
        public java.lang.String getUnits() {
            return _units;
        }
        
        @Override
        public BigDecimal getValueDecimal() {
            return _valueDecimal;
        }
        
        @Override
        public java.lang.Long getValueInteger() {
            return _valueInteger;
        }
        
        @Override
        public java.lang.String getValueString() {
            return _valueString;
        }
        
        @Override
        public ParamValueType getValueType() {
            return _valueType;
        }
        
        @Override
        public WidgetType getWidgetType() {
            return _widgetType;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.MonitoringParam>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_groupTag);
            result = prime * result + Objects.hashCode(_httpEndpointRef);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_jsonQueryMethod);
            result = prime * result + Objects.hashCode(_jsonQueryParams);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_numericConstraints);
            result = prime * result + Objects.hashCode(_textConstraints);
            result = prime * result + Objects.hashCode(_units);
            result = prime * result + Objects.hashCode(_valueDecimal);
            result = prime * result + Objects.hashCode(_valueInteger);
            result = prime * result + Objects.hashCode(_valueString);
            result = prime * result + Objects.hashCode(_valueType);
            result = prime * result + Objects.hashCode(_widgetType);
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
            if (!urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.MonitoringParam.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.MonitoringParam other = (urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.MonitoringParam)obj;
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_groupTag, other.getGroupTag())) {
                return false;
            }
            if (!Objects.equals(_httpEndpointRef, other.getHttpEndpointRef())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_jsonQueryMethod, other.getJsonQueryMethod())) {
                return false;
            }
            if (!Objects.equals(_jsonQueryParams, other.getJsonQueryParams())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_numericConstraints, other.getNumericConstraints())) {
                return false;
            }
            if (!Objects.equals(_textConstraints, other.getTextConstraints())) {
                return false;
            }
            if (!Objects.equals(_units, other.getUnits())) {
                return false;
            }
            if (!Objects.equals(_valueDecimal, other.getValueDecimal())) {
                return false;
            }
            if (!Objects.equals(_valueInteger, other.getValueInteger())) {
                return false;
            }
            if (!Objects.equals(_valueString, other.getValueString())) {
                return false;
            }
            if (!Objects.equals(_valueType, other.getValueType())) {
                return false;
            }
            if (!Objects.equals(_widgetType, other.getWidgetType())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                MonitoringParamImpl otherImpl = (MonitoringParamImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.MonitoringParam>>, Augmentation<urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.monitoring.param.MonitoringParam>> e : augmentation.entrySet()) {
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
            java.lang.String name = "MonitoringParam [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_description != null) {
                builder.append("_description=");
                builder.append(_description);
                builder.append(", ");
            }
            if (_groupTag != null) {
                builder.append("_groupTag=");
                builder.append(_groupTag);
                builder.append(", ");
            }
            if (_httpEndpointRef != null) {
                builder.append("_httpEndpointRef=");
                builder.append(_httpEndpointRef);
                builder.append(", ");
            }
            if (_id != null) {
                builder.append("_id=");
                builder.append(_id);
                builder.append(", ");
            }
            if (_jsonQueryMethod != null) {
                builder.append("_jsonQueryMethod=");
                builder.append(_jsonQueryMethod);
                builder.append(", ");
            }
            if (_jsonQueryParams != null) {
                builder.append("_jsonQueryParams=");
                builder.append(_jsonQueryParams);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_name != null) {
                builder.append("_name=");
                builder.append(_name);
                builder.append(", ");
            }
            if (_numericConstraints != null) {
                builder.append("_numericConstraints=");
                builder.append(_numericConstraints);
                builder.append(", ");
            }
            if (_textConstraints != null) {
                builder.append("_textConstraints=");
                builder.append(_textConstraints);
                builder.append(", ");
            }
            if (_units != null) {
                builder.append("_units=");
                builder.append(_units);
                builder.append(", ");
            }
            if (_valueDecimal != null) {
                builder.append("_valueDecimal=");
                builder.append(_valueDecimal);
                builder.append(", ");
            }
            if (_valueInteger != null) {
                builder.append("_valueInteger=");
                builder.append(_valueInteger);
                builder.append(", ");
            }
            if (_valueString != null) {
                builder.append("_valueString=");
                builder.append(_valueString);
                builder.append(", ");
            }
            if (_valueType != null) {
                builder.append("_valueType=");
                builder.append(_valueType);
                builder.append(", ");
            }
            if (_widgetType != null) {
                builder.append("_widgetType=");
                builder.append(_widgetType);
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
