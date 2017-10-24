package urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715;
import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;

/**
 * The date-and-time type is a profile of the ISO 8601
 *       standard for representation of dates and times using the
 *       Gregorian calendar.  The profile is defined by the
 *       date-time production in Section 5.6 of RFC 3339.
 * 
 *       The date-and-time type is compatible with the dateTime XML
 *       schema type with the following notable exceptions:
 * 
 *       (a) The date-and-time type does not allow negative years.
 * 
 *       (b) The date-and-time time-offset -00:00 indicates an unknown
 *           time zone (see RFC 3339) while -00:00 and +00:00 and Z
 *           all represent the same time zone in dateTime.
 * 
 *       (c) The canonical format (see below) of data-and-time values
 *           differs from the canonical format used by the dateTime XML
 *           schema type, which requires all times to be in UTC using
 *           the time-offset 'Z'.
 * 
 *       This type is not equivalent to the DateAndTime textual
 *       convention of the SMIv2 since RFC 3339 uses a different
 *       separator between full-date and full-time and provides
 *       higher resolution of time-secfrac.
 * 
 *       The canonical format for date-and-time values with a known time
 *       zone uses a numeric time zone offset that is calculated using
 *       the device's configured known offset to UTC time.  A change of
 *       the device's offset to UTC time will cause date-and-time values
 *       to change accordingly.  Such changes might happen periodically
 *       in case a server follows automatically daylight saving time
 *       (DST) time zone offset changes.  The canonical format for
 *       date-and-time values with an unknown time zone (usually
 *       referring to the notion of local time) uses the time-offset
 *       -00:00.
 *
 */
public class DateAndTime
 implements Serializable {
    private static final long serialVersionUID = -6173075664144179453L;
    private static final Pattern[] patterns;
    public static final List<String> PATTERN_CONSTANTS = ImmutableList.of("^\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}(\\.\\d+)?(Z|[\\+\\-]\\d{2}:\\d{2})$");
    
    static {
        final Pattern a[] = new Pattern[PATTERN_CONSTANTS.size()];
        int i = 0;
        for (String regEx : PATTERN_CONSTANTS) {
            a[i++] = Pattern.compile(regEx);
        }
    
        patterns = a;
    }
    private final java.lang.String _value;

    private static void check_valueLength(final String value) {
    }

    @ConstructorProperties("value")
    public DateAndTime(java.lang.String _value) {
        if (_value != null) {
            check_valueLength(_value);
            }
    
    
        Preconditions.checkNotNull(_value, "Supplied value may not be null");
    
            for (Pattern p : patterns) {
                Preconditions.checkArgument(p.matcher(_value).matches(), "Supplied value \"%s\" does not match required pattern \"%s\"", _value, p);
            }
    
        this._value = _value;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public DateAndTime(DateAndTime source) {
        this._value = source._value;
    }

    public static DateAndTime getDefaultInstance(String defaultValue) {
        return new DateAndTime(defaultValue);
    }

    public java.lang.String getValue() {
        return _value;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_value);
        return result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        DateAndTime other = (DateAndTime) obj;
        if (!Objects.equals(_value, other._value)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.DateAndTime.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_value != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_value=");
            builder.append(_value);
        }
        return builder.append(']').toString();
    }
}

