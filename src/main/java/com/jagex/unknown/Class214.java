package com.jagex.unknown;

import com.jagex.ShaderLoader;
import com.jagex.net.io.ByteBuf;

public class Class214 {

	public Class214() throws Throwable {
		throw new Error();
	}

	public static Class351 method3668(ByteBuf rsbytebuffer_0) {
		int i_2 = rsbytebuffer_0.readBigSmart();
		return new Class351(i_2);
	}

	public static void method3669(long[] longs_0, Object[] arr_1) {
		ShaderLoader.method1890(longs_0, arr_1, 0, longs_0.length - 1);
	}
}
