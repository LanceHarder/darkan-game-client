package com.jagex.unknown;

import com.jagex.Identifiable;
import com.jagex.client.Engine;

public enum Class204 implements Identifiable {

	aClass204_2579(0),
	aClass204_2578(1);

	final int anInt2580;

	Class204(int i_1) {
		anInt2580 = i_1;
	}

	public static int getFpsCap() {
		return (int) (1000000000L / Engine.NANOSECONDS_PER_FRAME);
	}

	public static void method3367() {
		Class291_Sub1.aClass465_8025.method7749();
		Class291_Sub1.aClass465_8029.method7749();
	}

	@Override
	public int getValue() {
		return anInt2580;
	}
}
