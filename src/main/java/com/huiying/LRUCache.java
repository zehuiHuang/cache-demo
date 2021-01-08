package com.huiying;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache <K, V> extends LinkedHashMap<K,V> {
    private int cacheSize;

    public LRUCache(int i){
        super(16, (float) 0.75,true);
        this.cacheSize = i;
    }

    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > cacheSize;
    }
}