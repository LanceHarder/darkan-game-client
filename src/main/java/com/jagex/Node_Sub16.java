package com.jagex;

import com.jagex.client.js5.defs.MapAreaDefinitions;
import com.jagex.unknown.Class291_Sub1;

public class Node_Sub16 extends Node {

	public int anInt7603;
	public int anInt7602;

	public Node_Sub16(int i_1, int i_2) {
		anInt7603 = i_1;
		anInt7602 = i_2;
	}

	public static boolean method12248(MapAreaDefinitions worldmapareadefs_0) {
		return worldmapareadefs_0 != null && (worldmapareadefs_0.aBool2728 && (worldmapareadefs_0.shouldDraw(Class291_Sub1.PLAYER_VAR_PROVIDER) && (Class291_Sub1.aClass465_8025.get(worldmapareadefs_0.anInt2753) == null && Class291_Sub1.aClass465_8029.get(worldmapareadefs_0.anInt2718) == null)));
	}

}
