package urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715;
import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;

/**
 * A YANG identifier string as defined by the 'identifier'
 *        rule in Section 12 of RFC 6020.  An identifier must
 *        start with an alphabetic character or an underscore
 *        followed by an arbitrary sequence of alphabetic or
 *        numeric characters, underscores, hyphens, or dots.
 * 
 *        A YANG identifier MUST NOT start with any possible
 *        combination of the lowercase or uppercase character
 *        sequence 'xml'.
 *
 */
public class YangIdentifier
 implements Serializable {
    private static final long serialVersionUID = 7734916821492871556L;
    private static final Pattern[] patterns;
    public static final List<String> PATTERN_CONSTANTS = ImmutableList.of("^[a-zA-Z_][a-zA-Z0-9\\-_.]*$", "^.|..|[^xX].*|.[^mM].*|..[^lL].*$");
    
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
        final int length = value.length();
        if (length >= 1) {
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[1..2147483647]].", value));
    }

    @ConstructorProperties("value")
    public YangIdentifier(java.lang.String _value) {
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
    public YangIdentifier(YangIdentifier source) {
        this._value = source._value;
    }

    public static YangIdentifier getDefaultInstance(String defaultValue) {
        return new YangIdentifier(defaultValue);
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
        YangIdentifier other = (YangIdentifier) obj;
        if (!Objects.equals(_value, other._value)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.YangIdentifier.class.getSimpleName()).append(" [");
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

