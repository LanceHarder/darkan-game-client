package com.jagex;

import com.jagex.net.io.ByteBuf;
import jaclib.memory.Stream;

public class Node_Sub35_Sub1 extends ByteBuf {

	public Node_Sub35_Sub1(int i_1) {
		super(i_1);
	}

	public void method14685(float f_1) {
		int i_2 = Stream.floatToRawIntBits(f_1);
		buffer[++index - 1] = (byte) i_2;
		buffer[++index - 1] = (byte) (i_2 >> 8);
		buffer[++index - 1] = (byte) (i_2 >> 16);
		buffer[++index - 1] = (byte) (i_2 >> 24);
	}

	public void method14688(float f_1) {
		int i_2 = Stream.floatToRawIntBits(f_1);
		buffer[++index - 1] = (byte) (i_2 >> 24);
		buffer[++index - 1] = (byte) (i_2 >> 16);
		buffer[++index - 1] = (byte) (i_2 >> 8);
		buffer[++index - 1] = (byte) i_2;
	}

}
