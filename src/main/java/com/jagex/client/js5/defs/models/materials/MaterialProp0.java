package com.jagex.client.js5.defs.models.materials;

import com.jagex.net.io.ByteBuf;
import com.jagex.unknown.Class316;
import com.jagex.unknown.Class503;

public class MaterialProp0 extends MaterialProperty {

	public int anInt9860 = 4096;

	public MaterialProp0() {
		super(0, true);
	}

	@Override
	public int[] method12319(int i_1) {
		int[] ints_3 = aClass320_7667.method5721(i_1);
		if (aClass320_7667.aBool3722) {
			Class503.method8365(ints_3, 0, Class316.anInt3670, anInt9860);
		}
		return ints_3;
	}

	@Override
	public void decode(int i_1, ByteBuf rsbytebuffer_2) {
		switch (i_1) {
			case 0:
				anInt9860 = (rsbytebuffer_2.readUnsignedByte() << 12) / 255;
			default:
		}
	}
}
