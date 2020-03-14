package me.rerere.matrix.utils;

import com.koloboke.collect.impl.hash.LHashParallelKVObjObjMapFactoryImpl;

import java.util.Map;

public class MapUtil {
    public static <K,V> Map<K,V> newMap(){
        return new LHashParallelKVObjObjMapFactoryImpl<K,V>().newMutableMap();
    }
}
