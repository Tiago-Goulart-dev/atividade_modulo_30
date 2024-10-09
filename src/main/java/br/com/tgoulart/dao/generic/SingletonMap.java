package br.com.tgoulart.dao.generic;

import java.util.HashMap;
import java.util.Map;

public class SingletonMap {

    private static SingletonMap singletonMap;

    @SuppressWarnings("rawtypes")
	protected Map<Class, Map<?, ?>> map;

    private SingletonMap() {
        map = new HashMap<>();
    }

    public static SingletonMap getInstance() {
        if (singletonMap == null) {
            singletonMap = new SingletonMap();
        }
        return singletonMap;
    }

    @SuppressWarnings("rawtypes")
	public Map<Class, Map<?, ?>> getMap() {
        return this.map;
    }
}
