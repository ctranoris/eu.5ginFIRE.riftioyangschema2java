package urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715;
import java.beans.ConstructorProperties;
import java.io.Serializable;

import com.google.common.base.Preconditions;

/**
 * This type represents object-identifiers restricted to 128
 *       sub-identifiers.
 * 
 *       In the value set and its semantics, this type is equivalent
 *       to the OBJECT IDENTIFIER type of the SMIv2.
 *
 */
public class ObjectIdentifier128 extends ObjectIdentifier
 implements Serializable {
    private static final long serialVersionUID = 1412134080859977896L;


    @ConstructorProperties("value")
    public ObjectIdentifier128(java.lang.String _value) {
        super(_value);
    
    
        Preconditions.checkNotNull(_value, "Supplied value may not be null");
    
    
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public ObjectIdentifier128(ObjectIdentifier128 source) {
        super(source);
    }
    /**
     * Creates a new instance from ObjectIdentifier
     *
     * @param source Source object
     */
    public ObjectIdentifier128(ObjectIdentifier source) {
            super(source);
    }

    public static ObjectIdentifier128 getDefaultInstance(String defaultValue) {
        return new ObjectIdentifier128(defaultValue);
    }





}

