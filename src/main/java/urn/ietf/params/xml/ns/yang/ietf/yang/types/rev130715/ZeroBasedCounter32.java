package urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715;
import java.beans.ConstructorProperties;
import java.io.Serializable;

import com.google.common.base.Preconditions;

/**
 * The zero-based-counter32 type represents a counter32
 *       that has the defined 'initial' value zero.
 * 
 *       A schema node of this type will be set to zero (0) on creation
 *       and will thereafter increase monotonically until it reaches
 *       a maximum value of 2^32-1 (4294967295 decimal), when it
 *       wraps around and starts increasing again from zero.
 * 
 *       Provided that an application discovers a new schema node
 *       of this type within the minimum time to wrap, it can use the
 *       'initial' value as a delta.  It is important for a management
 *       station to be aware of this minimum time and the actual time
 *       between polls, and to discard data if the actual time is too
 *       long or there is no defined minimum time.
 * 
 *       In the value set and its semantics, this type is equivalent
 *       to the ZeroBasedCounter32 textual convention of the SMIv2.
 *
 */
public class ZeroBasedCounter32 extends Counter32
 implements Serializable {
    private static final long serialVersionUID = 7512027574588325721L;


    @ConstructorProperties("value")
    public ZeroBasedCounter32(java.lang.Long _value) {
        super(_value);
    
    
        Preconditions.checkNotNull(_value, "Supplied value may not be null");
    
    
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public ZeroBasedCounter32(ZeroBasedCounter32 source) {
        super(source);
    }
    /**
     * Creates a new instance from Counter32
     *
     * @param source Source object
     */
    public ZeroBasedCounter32(Counter32 source) {
            super(source);
    }

    public static ZeroBasedCounter32 getDefaultInstance(String defaultValue) {
        return new ZeroBasedCounter32(java.lang.Long.valueOf(defaultValue));
    }





}

