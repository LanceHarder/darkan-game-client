package com.jagex;

import com.jagex.unknown.Class149_Sub2;
import com.jagex.unknown.Class86;

public class VertexNormal {

	public static PlayerEntity MY_PLAYER;
	public int anInt812;
	public int anInt809;
	public int anInt811;
	public int anInt810;

	public VertexNormal(int i_1, int i_2, int i_3, int i_4) {
		anInt812 = i_1;
		anInt809 = i_2;
		anInt811 = i_3;
		anInt810 = i_4;
	}

	public static boolean method1465() {
		return Class86.method1481(Class149_Sub2.DEFAULTS_LOADER_7.aClass232_5873);
	}

	public VertexNormal method1459(int i_1) {
		return new VertexNormal(anInt812, i_1, anInt811, anInt810);
	}
}
