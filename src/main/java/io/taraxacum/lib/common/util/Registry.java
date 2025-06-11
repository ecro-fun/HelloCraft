package io.taraxacum.lib.common.util;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

public class Registry {

    private final Map<Class<?>, Object> beanMap;

    public Registry() {
        this.beanMap = new HashMap<>();
    }

    public <T> void put(@Nonnull Class<T> clazz, @Nonnull T object) {
        this.beanMap.put(clazz, object);
    }

    @Nullable
    @SuppressWarnings("unchecked")
    public <T> T get(@Nonnull Class<T> clazz) {
        Object o = this.beanMap.get(clazz);
        if (clazz.isInstance(o)) {
            return (T) o;
        } else {
            this.beanMap.put(clazz, null);
        }
        return null;
    }
}
