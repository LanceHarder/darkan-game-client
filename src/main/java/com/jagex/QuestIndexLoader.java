package com.jagex;

public class QuestIndexLoader {

    public static int anInt2982;
    static SpriteDefinitions aClass91_2981;
    Index aClass317_2979;

    int size;

    QuestDefinitions[] questDefinitions;

    public QuestIndexLoader(Index index_3) {
        aClass317_2979 = index_3;
        if (aClass317_2979 != null) {
            size = aClass317_2979.filesCount(SharedConfigsType.QUESTS.id);
        } else {
            size = 0;
        }
        questDefinitions = new QuestDefinitions[size];
        for (int i_5 = 0; i_5 < size; i_5++) {
            Index index_7 = aClass317_2979;
            byte[] bytes_6;
            synchronized (aClass317_2979) {
                bytes_6 = aClass317_2979.getFile(SharedConfigsType.QUESTS.id, i_5);
            }
            QuestDefinitions questdefinitions_9 = new QuestDefinitions();
            if (bytes_6 != null) {
                questdefinitions_9.method4119(new ByteBuf(bytes_6));
            }
            questdefinitions_9.method4095();
            questDefinitions[i_5] = questdefinitions_9;
            questDefinitions[i_5].aClass242_2976 = this;
        }
    }

    public static int method4162(int i_0, int i_1) {
        int i_11 = i_1;
        if (i_0 == -2) {
            return 12345678;
        } else if (i_0 == -1) {
            if (i_11 < 2) {
                i_11 = 2;
            } else if (i_11 > 126) {
                i_11 = 126;
            }
            return i_11;
        } else {
            i_11 = (i_0 & 0x7f) * i_11 >> 7;
            if (i_11 < 2) {
                i_11 = 2;
            } else if (i_11 > 126) {
                i_11 = 126;
            }
            return (i_0 & 0xff80) + i_11;
        }
    }

	public static byte getByteForChar(char c) {
		byte i_6_;
		if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
			i_6_ = (byte) c;
		else if (c == '\u20ac')
			i_6_ = (byte) -128;
		else if ('\u201a' == c)
			i_6_ = (byte) -126;
		else if ('\u0192' == c)
			i_6_ = (byte) -125;
		else if (c == '\u201e')
			i_6_ = (byte) -124;
		else if ('\u2026' == c)
			i_6_ = (byte) -123;
		else if (c == '\u2020')
			i_6_ = (byte) -122;
		else if (c == '\u2021')
			i_6_ = (byte) -121;
		else if (c == '\u02c6')
			i_6_ = (byte) -120;
		else if ('\u2030' == c)
			i_6_ = (byte) -119;
		else if ('\u0160' == c)
			i_6_ = (byte) -118;
		else if (c == '\u2039')
			i_6_ = (byte) -117;
		else if ('\u0152' == c)
			i_6_ = (byte) -116;
		else if ('\u017d' == c)
			i_6_ = (byte) -114;
		else if ('\u2018' == c)
			i_6_ = (byte) -111;
		else if (c == '\u2019')
			i_6_ = (byte) -110;
		else if (c == '\u201c')
			i_6_ = (byte) -109;
		else if (c == '\u201d')
			i_6_ = (byte) -108;
		else if (c == '\u2022')
			i_6_ = (byte) -107;
		else if (c == '\u2013')
			i_6_ = (byte) -106;
		else if ('\u2014' == c)
			i_6_ = (byte) -105;
		else if ('\u02dc' == c)
			i_6_ = (byte) -104;
		else if (c == '\u2122')
			i_6_ = (byte) -103;
		else if ('\u0161' == c)
			i_6_ = (byte) -102;
		else if (c == '\u203a')
			i_6_ = (byte) -101;
		else if (c == '\u0153')
			i_6_ = (byte) -100;
		else if (c == '\u017e')
			i_6_ = (byte) -98;
		else if (c == '\u0178')
			i_6_ = (byte) -97;
		else
			i_6_ = (byte) 63;
		return i_6_;
	}

    static void method4164(int i_0, int i_1) {
        if (Class20.anInt167 == 1) {
            CutsceneAction_Sub4.method13789(Class46.aCacheableNode_Sub7_438, i_0, i_1, -549787245);
        } else if (Class20.anInt167 == 2) {
            Static.method4653(i_0, i_1);
        }
        Class20.anInt167 = 0;
        Class46.aCacheableNode_Sub7_438 = null;
    }

    static Class149_Sub3 method4165(ByteBuf rsbytebuffer_0) {
        return new Class149_Sub3(rsbytebuffer_0.readShort(), rsbytebuffer_0.readShort(), rsbytebuffer_0.readShort(), rsbytebuffer_0.readShort(), rsbytebuffer_0.read24BitUnsignedInteger(), rsbytebuffer_0.readUnsignedByte());
    }

    public static void method4166() {
        if (!client.aBool7331) {
            client.aFloat7284 += (12.0F - client.aFloat7284) / 2.0F;
            client.aBool7371 = true;
            client.aBool7331 = true;
        }
    }

    public static void method4167(String string_0) {
        if (client.IS_USE_SELECTED && (Class506.USE_OPTIONS_FLAGS & 0x18) != 0) {
            boolean bool_2 = false;
            int i_3 = Class197.NUM_PLAYER_INDICES;
            int[] ints_4 = Class197.PLAYER_INDICES;
            for (int i_5 = 0; i_5 < i_3; i_5++) {
                PlayerEntity player_6 = client.players[ints_4[i_5]];
                if (player_6.displayName != null && player_6.displayName.equalsIgnoreCase(string_0) && (player_6 == VertexNormal.MY_PLAYER && (Class506.USE_OPTIONS_FLAGS & 0x10) != 0 || (Class506.USE_OPTIONS_FLAGS & 0x8) != 0)) {
                    TCPPacket tcpmessage_7 = TCPPacket.createPacket(ClientProt.IF_ON_PLAYER, client.GAME_CONNECTION_CONTEXT.outKeys);
                    tcpmessage_7.buffer.writeShort(client.anInt7345);
                    tcpmessage_7.buffer.writeShortLE(ints_4[i_5]);
                    tcpmessage_7.buffer.write128Byte(0);
                    tcpmessage_7.buffer.writeIntV2(client.anInt56);
                    tcpmessage_7.buffer.writeShortLE(client.anInt7346);
                    client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_7);
                    int i_8 = player_6.getSize();
                    MapRegion.routeTo(player_6.regionBaseX[0], player_6.regionBaseY[0], true, Class344.method6115(player_6.regionBaseX[0], player_6.regionBaseY[0], i_8, i_8));
                    bool_2 = true;
                    break;
                }
            }
            if (!bool_2) {
                ChatLine.appendGameMessage(LocalizedText.UNABLE_TO_FIND.translate(Class223.CURRENT_LANGUAGE) + string_0);
            }
            if (client.IS_USE_SELECTED) {
                Class60.method1170();
            }
        }
    }

    int method4154(VarProvider interface42_1) {
        int i_3 = 0;
        for (int i_4 = 0; i_4 < size; i_4++) {
            QuestDefinitions questdefinitions_5 = getQuest(i_4);
            if (questdefinitions_5.isComplete(interface42_1)) {
                i_3 += questdefinitions_5.questpointReward;
            }
        }
        return i_3;
    }

    public QuestDefinitions getQuest(int i_1) {
    	if (i_1 >= questDefinitions.length)
    		return null;
        return questDefinitions[i_1];
    }
}
