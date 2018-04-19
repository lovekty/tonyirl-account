package me.tony.tonyirl.acount.jpa.converter.base;

import lombok.val;

import javax.persistence.AttributeConverter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static java.util.Collections.unmodifiableMap;

/**
 * @author tony
 * @since 18-4-19
 */
public abstract class BaseEnumNameAndStringConverter<E extends Enum<E>> implements AttributeConverter<E, String> {

    private final Map<String, E> map;

    protected BaseEnumNameAndStringConverter(Class<E> clazz) {
        val map = new HashMap<String, E>();
        Arrays.stream(clazz.getEnumConstants()).forEach(it -> map.put(it.name(), it));
        this.map = unmodifiableMap(map);
    }

    @Override
    public String convertToDatabaseColumn(E attribute) {
        return attribute == null ? null : attribute.name();
    }

    @Override
    public E convertToEntityAttribute(String dbData) {
        return dbData == null ? null : map.get(dbData);
    }
}
