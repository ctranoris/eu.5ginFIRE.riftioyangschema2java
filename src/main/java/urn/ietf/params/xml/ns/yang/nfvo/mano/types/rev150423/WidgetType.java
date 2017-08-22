package urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev150423;

public enum WidgetType {
    HISTOGRAM(0, "HISTOGRAM"),
    
    BAR(1, "BAR"),
    
    GAUGE(2, "GAUGE"),
    
    SLIDER(3, "SLIDER"),
    
    COUNTER(4, "COUNTER"),
    
    TEXTBOX(5, "TEXTBOX")
    ;

    private static final java.util.Map<java.lang.Integer, WidgetType> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, WidgetType> b = com.google.common.collect.ImmutableMap.builder();
        for (WidgetType enumItem : WidgetType.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private WidgetType(int value, java.lang.String name) {
        this.value = value;
        this.name = name;
    }

    /**
     * Returns the name of the enumeration item as it is specified in the input yang.
     *
     * @return the name of the enumeration item as it is specified in the input yang
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * @return integer value
     */
    public int getIntValue() {
        return value;
    }

    /**
     * @param valueArg integer value
     * @return corresponding WidgetType item
     */
    public static WidgetType forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
