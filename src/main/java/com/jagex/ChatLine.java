package com.jagex;

public class ChatLine {

    public static String aString1093;
    static int NUM_CHAT_LINES;
    static ChatLine[] CHAT_LINES = new ChatLine[100];
    public int anInt1085 = MaterialProp25.method15396();
    public int time;
    public MessageType type;
    public int effectFlags;
    public String crownedName;
    public String name;
    public String nameSimple;
    public String clan;
    public int quickchatMessageId;
    public String message;

    ChatLine(MessageType type, int effectFlags, String crownedName, String name, String nameSimple, String clan, int i_7, String message) {
        time = client.FRAME_COUNT;
        this.type = type;
        this.effectFlags = effectFlags;
        this.crownedName = crownedName;
        this.name = name;
        this.nameSimple = nameSimple;
        this.clan = clan;
        quickchatMessageId = i_7;
        this.message = message;
    }

    public static void appendGameMessage(String message) {
        appendChatMessage(MessageType.GAME, 0, "", "", "", message);
    }

    public static void appendChatMessage(String message) {
        appendChatMessage(MessageType.UNFILTERABLE, 0, "", "", "", message);
    }

    public static void appendChatMessage(MessageType type, int effectFlags, String crownedName, String name, String nameSimple, String message) {
        appendChatMessage(type, effectFlags, crownedName, name, nameSimple, message, null, -1);
    }

    public static void appendChatMessage(MessageType type, int effectFlags, String crownedName, String name, String nameSimple, String message, String clan, int quickChatMessageId) {
        ChatLine line = CHAT_LINES[99];
        System.arraycopy(CHAT_LINES, 0, CHAT_LINES, 1, 99);
        if (line == null) {
            line = new ChatLine(type, effectFlags, crownedName, name, nameSimple, clan, quickChatMessageId, message);
        } else {
            line.set(type, effectFlags, crownedName, name, nameSimple, clan, quickChatMessageId, message);
        }
        CHAT_LINES[0] = line;
        ++NUM_CHAT_LINES;
        client.anInt7391 = client.CS2_TIMER_COUNT;
    }

    public static int getLength(String string_0) {
        return string_0.length() + 1;
    }

    static ByteBuf getLoginMod(boolean password) {
        ByteBuf rsbytebuffer_0 = Class94.method1587();
        rsbytebuffer_0.writeLong(0L);
        rsbytebuffer_0.writeString(password ? Class9.aString102 : Static.LOBBY_AUTH_TOKEN);
        rsbytebuffer_0.writeLong(Class9.aLong86);
        rsbytebuffer_0.writeLong(client.aLong7409);
        rsbytebuffer_0.applyRSA();
        return rsbytebuffer_0;
    }

    public static void method1848(SceneObjectManager sceneobjectmanager_0, AbstractRenderer graphicalrenderer_1) {
        for (ParticleSystem class539_4 : Class235.aList2896) {
            if (class539_4.aBool7130) {
                class539_4.method11516(sceneobjectmanager_0, graphicalrenderer_1);
            }
        }
    }

    public static ChatLine getChatLine(int index) {
        return index >= 0 && index < 100 ? CHAT_LINES[index] : null;
    }

    void set(MessageType type, int i_2, String string_3, String string_4, String string_5, String string_6, int i_7, String string_8) {
        anInt1085 = MaterialProp25.method15396();
        time = client.FRAME_COUNT;
        this.type = type;
        effectFlags = i_2;
        crownedName = string_3;
        name = string_4;
        nameSimple = string_5;
        clan = string_6;
        quickchatMessageId = i_7;
        message = string_8;
    }
}
