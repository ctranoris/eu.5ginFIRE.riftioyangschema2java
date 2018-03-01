package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.config.file;
import java.util.Objects;

import org.opendaylight.yangtools.yang.binding.Identifier;

public class ConfigFileKey
 implements Identifier<ConfigFile> {
    private static final long serialVersionUID = 238596725262371840L;
    private final java.lang.String _source;


    public ConfigFileKey(java.lang.String _source) {
    
    
        this._source = _source;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public ConfigFileKey(ConfigFileKey source) {
        this._source = source._source;
    }


    public java.lang.String getSource() {
        return _source;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_source);
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
        ConfigFileKey other = (ConfigFileKey) obj;
        if (!Objects.equals(_source, other._source)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423.config.file.ConfigFileKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_source != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_source=");
            builder.append(_source);
        }
        return builder.append(']').toString();
    }
}

