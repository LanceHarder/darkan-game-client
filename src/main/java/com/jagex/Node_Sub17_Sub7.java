package com.jagex;

import com.jagex.clans.settings.ClanSettings;

public class Node_Sub17_Sub7 extends ClanSettingDeltaUpdate {

    ClanSettingsDelta this$0;
    int anInt10019;
    byte aByte10020;

    Node_Sub17_Sub7(ClanSettingsDelta class348_1) {
        this$0 = class348_1;
        anInt10019 = -1;
    }

    public static String method15439(byte[] bytes_0) {
        return Utils.readString(bytes_0, 0, bytes_0.length);
    }

    @Override
    void applyUpdate(ClanSettings class61_1) {
        class61_1.method1209(anInt10019, aByte10020);
    }

    @Override
    void decode(ByteBuf rsbytebuffer_1) {
        anInt10019 = rsbytebuffer_1.readUnsignedShort();
        aByte10020 = rsbytebuffer_1.readByte();
    }
}
