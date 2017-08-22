package urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715;
import java.io.Serializable;
import java.beans.ConstructorProperties;
import com.google.common.base.Preconditions;

/**
 * The timestamp type represents the value of an associated
 *       timeticks schema node at which a specific occurrence
 *       happened.  The specific occurrence must be defined in the
 *       description of any schema node defined using this type.  When
 *       the specific occurrence occurred prior to the last time the
 *       associated timeticks attribute was zero, then the timestamp
 *       value is zero.  Note that this requires all timestamp values
 *       to be reset to zero when the value of the associated timeticks
 *       attribute reaches 497+ days and wraps around to zero.
 * 
 *       The associated timeticks schema node must be specified
 *       in the description of any schema node using this type.
 * 
 *       In the value set and its semantics, this type is equivalent
 *       to the TimeStamp textual convention of the SMIv2.
 *
 */
public class Timestamp extends Timeticks
 implements Serializable {
    private static final long serialVersionUID = -1618618198504997448L;


    @ConstructorProperties("value")
    public Timestamp(java.lang.Long _value) {
        super(_value);
    
    
        Preconditions.checkNotNull(_value, "Supplied value may not be null");
    
    
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public Timestamp(Timestamp source) {
        super(source);
    }
    /**
     * Creates a new instance from Timeticks
     *
     * @param source Source object
     */
    public Timestamp(Timeticks source) {
            super(source);
    }

    public static Timestamp getDefaultInstance(String defaultValue) {
        return new Timestamp(java.lang.Long.valueOf(defaultValue));
    }





}

