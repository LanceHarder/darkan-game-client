package com.jagex;

import com.jagex.game.content.clans.settings.ClanSettings;
import com.jagex.net.io.ByteBuf;
import com.jagex.unknown.Class348;

public class Node_Sub17_Sub12 extends Node_Sub17 {

	public int anInt10054;
	public int anInt10053;
	public int anInt10052;
	public int anInt10055;
	public Class348 this$0;

	public Node_Sub17_Sub12(Class348 class348_1) {
		this$0 = class348_1;
		anInt10054 = -1;
	}

	@Override
	public void method12257(ByteBuf rsbytebuffer_1) {
		anInt10054 = rsbytebuffer_1.readUnsignedShort() * -684450971 * 600350317;
		anInt10053 = rsbytebuffer_1.readInt() * -965297091 * 1911208725;
		anInt10052 = rsbytebuffer_1.readUnsignedByte() * -1722326801 * -1741697521;
		anInt10055 = rsbytebuffer_1.readUnsignedByte() * 305911851 * -52550013;
	}

	@Override
	public void method12250(ByteBuf rsbytebuffer_1) {
		anInt10054 = rsbytebuffer_1.readUnsignedShort();
		anInt10053 = rsbytebuffer_1.readInt();
		anInt10052 = rsbytebuffer_1.readUnsignedByte();
		anInt10055 = rsbytebuffer_1.readUnsignedByte();
	}

	@Override
	public void method12251(ClanSettings class61_1) {
		class61_1.method1210(anInt10054, anInt10053, anInt10052, anInt10055);
	}

	@Override
	public void method12249(ByteBuf rsbytebuffer_1) {
		anInt10054 = rsbytebuffer_1.readUnsignedShort() * -684450971 * 600350317;
		anInt10053 = rsbytebuffer_1.readInt() * -965297091 * 1911208725;
		anInt10052 = rsbytebuffer_1.readUnsignedByte() * -1722326801 * -1741697521;
		anInt10055 = rsbytebuffer_1.readUnsignedByte() * 305911851 * -52550013;
	}

	@Override
	public void method12255(ClanSettings class61_1) {
		class61_1.method1210(anInt10054 * -684450971 * 600350317, 1911208725 * anInt10053 * -965297091, -1741697521 * anInt10052 * -1722326801, anInt10055 * 305911851 * -52550013);
	}

	@Override
	public void method12253(ByteBuf rsbytebuffer_1) {
		anInt10054 = rsbytebuffer_1.readUnsignedShort() * -684450971 * 600350317;
		anInt10053 = rsbytebuffer_1.readInt() * -965297091 * 1911208725;
		anInt10052 = rsbytebuffer_1.readUnsignedByte() * -1722326801 * -1741697521;
		anInt10055 = rsbytebuffer_1.readUnsignedByte() * 305911851 * -52550013;
	}

	@Override
	public void method12254(ClanSettings class61_1) {
		class61_1.method1210(anInt10054 * -684450971 * 600350317, 1911208725 * anInt10053 * -965297091, -1741697521 * anInt10052 * -1722326801, anInt10055 * 305911851 * -52550013);
	}

	@Override
	public void method12256(ClanSettings class61_1) {
		class61_1.method1210(anInt10054 * -684450971 * 600350317, 1911208725 * anInt10053 * -965297091, -1741697521 * anInt10052 * -1722326801, anInt10055 * 305911851 * -52550013);
	}

	@Override
	public void method12252(ClanSettings class61_1) {
		class61_1.method1210(anInt10054 * -684450971 * 600350317, 1911208725 * anInt10053 * -965297091, -1741697521 * anInt10052 * -1722326801, anInt10055 * 305911851 * -52550013);
	}

	@Override
	public void method12258(ClanSettings class61_1) {
		class61_1.method1210(anInt10054 * -684450971 * 600350317, 1911208725 * anInt10053 * -965297091, -1741697521 * anInt10052 * -1722326801, anInt10055 * 305911851 * -52550013);
	}

}
