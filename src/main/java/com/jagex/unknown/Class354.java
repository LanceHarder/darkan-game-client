package com.jagex.unknown;

import com.jagex.LRUCache;
import com.jagex.World;
import com.jagex.client.js5.defs.SunDefinitions;
import com.jagex.client.render.AbstractRenderer;
import com.jagex.client.render.NativeSprite;

public class Class354 {

	public static NativeSprite aNativeSprite_4110;
	public static int JCOINS;
	public static World[] WORLDS;
	public Object anObject4109;

	public int anInt4108;

	public Class354(Object object_1, int i_2) {
		anObject4109 = object_1;
		anInt4108 = i_2;
	}

	public static int method6214(int i_0, int i_1, int i_2) {
		i_2 &= 0x3;
		return i_2 == 0 ? i_1 : (i_2 == 1 ? 4095 - i_0 : (i_2 == 2 ? 4095 - i_1 : i_0));
	}

	public static void method6215() {
		LRUCache softcache_1 = Class13.aClass229_127;
		synchronized (Class13.aClass229_127) {
			Class13.aClass229_127.method3863();
		}
	}

	public static void method6216(AbstractRenderer graphicalrenderer_0) {
		if (!Class20.aBool187) {
			Class277.method4908(graphicalrenderer_0);
		} else {
			SunDefinitions.method857(graphicalrenderer_0);
		}
	}
}
