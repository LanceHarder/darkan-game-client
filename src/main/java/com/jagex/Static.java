package com.jagex;

import java.util.Calendar;

import com.jagex.clans.settings.ChangeClanSetting;

public class Static {

    public static int COUNTRY;
    static Class194 aClass194_5794;
    static int UPDATE_ZONE_X;
	public static String LOBBY_AUTH_TOKEN;

    public static boolean method2084(Index index_0, Index index_1, Index index_2, Node_Sub15_Sub2 class282_sub15_sub2_3, Class253 class253_4) {
        Class148.aClass317_1737 = index_0;
        Class148.aClass317_1731 = index_1;
        Class148.aClass317_1732 = index_2;
        Class148.aNode_Sub15_Sub2_1735 = class282_sub15_sub2_3;
        Class502.aClass253_5830 = class253_4;
        HashTable.anIntArray5449 = new int[16];
        for (int i_6 = 0; i_6 < 16; i_6++) {
            HashTable.anIntArray5449[i_6] = 255;
        }
        return true;
    }

    public static void method2094(int i_0) {
        Class291_Sub1.anInt8018 = -1;
        Class291_Sub1.anInt8026 = i_0;
        Class361.anInt4185 = 3;
        CutsceneAction_Sub9.anInt9282 = 100;
    }

    static void method2095(CacheableNode_Sub7 class282_sub50_sub7_0) {
        if (!Class20.aBool161) {
            class282_sub50_sub7_0.unlink();
            --Class20.anInt169;
            if (!class282_sub50_sub7_0.aBool9586) {
                long long_2 = class282_sub50_sub7_0.aLong9580;
                CacheableNode_Sub15 class282_sub50_sub15_4;
                for (class282_sub50_sub15_4 = (CacheableNode_Sub15) Class20.aClass465_172.get(long_2); class282_sub50_sub15_4 != null && !class282_sub50_sub15_4.aString9771.equals(class282_sub50_sub7_0.aString9588); class282_sub50_sub15_4 = (CacheableNode_Sub15) Class20.aClass465_172.method7747()) {
                }
                if (class282_sub50_sub15_4 != null && class282_sub50_sub15_4.method15249(class282_sub50_sub7_0)) {
                    Class13.method503(class282_sub50_sub15_4);
                }
            } else {
                for (CacheableNode_Sub15 class282_sub50_sub15_5 = (CacheableNode_Sub15) Class20.aClass477_182.method7941(); class282_sub50_sub15_5 != null; class282_sub50_sub15_5 = (CacheableNode_Sub15) Class20.aClass477_182.method7955()) {
                    if (class282_sub50_sub15_5.aString9771.equals(class282_sub50_sub7_0.aString9588)) {
                        boolean bool_3 = false;
                        for (CacheableNode_Sub7 class282_sub50_sub7_6 = (CacheableNode_Sub7) class282_sub50_sub15_5.aClass477_9770.method7941(); class282_sub50_sub7_6 != null; class282_sub50_sub7_6 = (CacheableNode_Sub7) class282_sub50_sub15_5.aClass477_9770.method7955()) {
                            if (class282_sub50_sub7_6 == class282_sub50_sub7_0) {
                                if (class282_sub50_sub15_5.method15249(class282_sub50_sub7_0)) {
                                    Class13.method503(class282_sub50_sub15_5);
                                }
                                bool_3 = true;
                                break;
                            }
                        }
                        if (bool_3) {
                            break;
                        }
                    }
                }
            }
        }
    }

    static int method6375(String string_0, byte[] bytes_1, int i_2) {
        int i_4 = i_2;
        int i_5 = string_0.length();
        for (int i_6 = 0; i_6 < i_5; i_6 += 4) {
            int i_7 = Class514.method8840(string_0.charAt(i_6));
            int i_8 = i_6 + 1 < i_5 ? Class514.method8840(string_0.charAt(i_6 + 1)) : -1;
            int i_9 = i_6 + 2 < i_5 ? Class514.method8840(string_0.charAt(i_6 + 2)) : -1;
            int i_10 = i_6 + 3 < i_5 ? Class514.method8840(string_0.charAt(i_6 + 3)) : -1;
            bytes_1[i_2++] = (byte) (i_7 << 2 | i_8 >>> 4);
            if (i_9 == -1) {
                break;
            }
            bytes_1[i_2++] = (byte) ((i_8 & 0xf) << 4 | i_9 >>> 2);
            if (i_10 == -1) {
                break;
            }
            bytes_1[i_2++] = (byte) ((i_9 & 0x3) << 6 | i_10);
        }
        return i_2 - i_4;
    }

    public static Game method6376(int i_0) {
        Game[] arr_2 = Node_Sub15_Sub1.method14817();
        for (int i_3 = 0; i_3 < arr_2.length; i_3++) {
            Game game_4 = arr_2[i_3];
            if (i_0 == game_4.id) {
                return game_4;
            }
        }
        return null;
    }

    static void method6377() {
        Class186.method3083();
    }

    public static void method6378() {
        for (int i_1 = 0; i_1 < 107; i_1++) {
            client.IF_COMPONENTS_TO_RENDER[i_1] = true;
        }
    }

    public static void method6379(PlayerEntity player_0) {
        Node_Sub48 class282_sub48_2 = (Node_Sub48) Node_Sub48.aClass465_8075.get(player_0.index);
        if (class282_sub48_2 == null) {
            Static.method6775(player_0.plane, player_0.regionBaseX[0], player_0.regionBaseY[0], 0, null, null, player_0);
        } else {
            class282_sub48_2.method13426();
        }
    }

    static String method6380(CacheableNode_Sub7 class282_sub50_sub7_0) {
        return class282_sub50_sub7_0.aString9585 != null && !class282_sub50_sub7_0.aString9585.isEmpty() ? (class282_sub50_sub7_0.aString9588 != null && !class282_sub50_sub7_0.aString9588.isEmpty() ? class282_sub50_sub7_0.aString9576 + LocalizedText.aClass433_5315.translate(Class223.CURRENT_LANGUAGE) + class282_sub50_sub7_0.aString9588 + LocalizedText.aClass433_5315.translate(Class223.CURRENT_LANGUAGE) + class282_sub50_sub7_0.aString9585 : class282_sub50_sub7_0.aString9576 + LocalizedText.aClass433_5315.translate(Class223.CURRENT_LANGUAGE) + class282_sub50_sub7_0.aString9585) : (class282_sub50_sub7_0.aString9588 != null && !class282_sub50_sub7_0.aString9588.isEmpty() ? class282_sub50_sub7_0.aString9576 + LocalizedText.aClass433_5315.translate(Class223.CURRENT_LANGUAGE) + class282_sub50_sub7_0.aString9588 : class282_sub50_sub7_0.aString9576);
    }

    static void method4281(PathingEntity animable_0) {
        int i_2 = animable_0.forceMovementT1Delay - client.FRAME_COUNT;
        int i_3 = animable_0.forceMovementT1XOff * 512 + animable_0.getSize() * 256;
        int i_4 = animable_0.forceMovementT1YOff * 512 + animable_0.getSize() * 256;
        Vector3 vector3_5 = animable_0.method11166().coords;
        animable_0.method11172(((int) vector3_5.x + (i_3 - (int) vector3_5.x) / i_2), ((int) vector3_5.y), ((int) vector3_5.z + (i_4 - (int) vector3_5.z) / i_2));
        animable_0.anInt10366 = 0;
        animable_0.method15863(animable_0.forceMovementDir);
    }

    public static boolean isFriend(String string_0) {
        if (string_0 == null) {
            return false;
        } else {
            for (int i_2 = 0; i_2 < client.FRIEND_COUNT; i_2++) {
                if (string_0.equalsIgnoreCase(client.FRIENDS[i_2].displayName)) {
                    return true;
                }
            }
            return string_0.equalsIgnoreCase(VertexNormal.MY_PLAYER.displayName);
        }
    }

    public static void method6775(int i_0, int i_1, int i_2, int i_3, ObjectDefinition objectdefinitions_4, NPCEntity npc_5, PlayerEntity player_6) {
        Node_Sub48 class282_sub48_8 = new Node_Sub48();
        class282_sub48_8.anInt8076 = i_0;
        class282_sub48_8.anInt8107 = i_1 << 9;
        class282_sub48_8.anInt8078 = i_2 << 9;
        if (objectdefinitions_4 != null) {
            class282_sub48_8.aClass478_8104 = objectdefinitions_4;
            int i_9 = objectdefinitions_4.sizeX;
            int i_10 = objectdefinitions_4.sizeY;
            if (i_3 == 1 || i_3 == 3) {
                i_9 = objectdefinitions_4.sizeY;
                i_10 = objectdefinitions_4.sizeX;
            }
            class282_sub48_8.anInt8079 = i_9 + i_1 << 9;
            class282_sub48_8.anInt8077 = i_10 + i_2 << 9;
            class282_sub48_8.soundEffectId = objectdefinitions_4.ambientSoundId;
            class282_sub48_8.midiSound = objectdefinitions_4.midiSound;
            class282_sub48_8.anInt8105 = objectdefinitions_4.ambientSoundHearDistance << 9;
            class282_sub48_8.anInt8089 = objectdefinitions_4.ambientSoundVolume;
            class282_sub48_8.anInt8072 = objectdefinitions_4.anInt5667;
            class282_sub48_8.anInt8101 = objectdefinitions_4.anInt5698;
            class282_sub48_8.timedEffects = objectdefinitions_4.soundEffectsTimed;
            class282_sub48_8.midiTimedEffects = objectdefinitions_4.midiSoundEffectsTimed;
            class282_sub48_8.anInt8094 = objectdefinitions_4.anInt5709;
            class282_sub48_8.anInt8093 = objectdefinitions_4.anInt5708;
            class282_sub48_8.anInt8081 = objectdefinitions_4.anInt5694 << 9;
            if (objectdefinitions_4.transformTo != null) {
                class282_sub48_8.aBool8092 = true;
                class282_sub48_8.method13426();
            }
            if (class282_sub48_8.timedEffects != null) {
                class282_sub48_8.anInt8080 = class282_sub48_8.anInt8072 + (int) (Math.random() * (class282_sub48_8.anInt8101 - class282_sub48_8.anInt8072));
            }
            Node_Sub48.aClass482_8073.append(class282_sub48_8);
        } else if (npc_5 != null) {
            class282_sub48_8.aTransform_Sub1_Sub1_Sub2_Sub2_8085 = npc_5;
            NPCDefinitions npcdefinitions_11 = npc_5.definitions;
            if (npcdefinitions_11.transformTo != null) {
                class282_sub48_8.aBool8092 = true;
                npcdefinitions_11 = npcdefinitions_11.getMultiNPC(Class158_Sub1.PLAYER_VAR_PROVIDER);
            }
            if (npcdefinitions_11 != null) {
                class282_sub48_8.anInt8079 = npcdefinitions_11.size + i_1 << 9;
                class282_sub48_8.anInt8077 = i_2 + npcdefinitions_11.size << 9;
                class282_sub48_8.soundEffectId = RankSetting.method15433(npc_5);
                class282_sub48_8.midiSound = npcdefinitions_11.aBool4872;
                class282_sub48_8.anInt8105 = npcdefinitions_11.specialByte << 9;
                class282_sub48_8.anInt8089 = npcdefinitions_11.anInt4909;
                class282_sub48_8.anInt8094 = npcdefinitions_11.anInt4919;
                class282_sub48_8.anInt8093 = npcdefinitions_11.anInt4911;
                class282_sub48_8.anInt8081 = npcdefinitions_11.anInt4908 << 9;
            }
            Node_Sub48.aClass482_8074.append(class282_sub48_8);
        } else if (player_6 != null) {
            class282_sub48_8.aTransform_Sub1_Sub1_Sub2_Sub1_8086 = player_6;
            class282_sub48_8.anInt8079 = i_1 + player_6.getSize() << 9;
            class282_sub48_8.anInt8077 = i_2 + player_6.getSize() << 9;
            class282_sub48_8.soundEffectId = Class149_Sub2.method14610(player_6);
            class282_sub48_8.midiSound = player_6.isTransformedNPC;
            class282_sub48_8.anInt8105 = player_6.isNpc << 9;
            class282_sub48_8.anInt8089 = player_6.specialByte;
            class282_sub48_8.anInt8094 = 256;
            class282_sub48_8.anInt8093 = 256;
            class282_sub48_8.anInt8081 = 0;
            Node_Sub48.aClass465_8075.put(class282_sub48_8, player_6.index);
        }
    }

	static void method13042(AbstractRenderer graphicalrenderer_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
	    SceneObjectManager sceneobjectmanager_9 = IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager();
	    WorldObject sceneobject_10 = (WorldObject) sceneobjectmanager_9.getWall(i_1, i_2, i_3);
	    ObjectDefinition objectdefinitions_11;
	    int i_12;
	    int i_13;
	    int i_14;
	    if (sceneobject_10 != null) {
	        objectdefinitions_11 = IndexLoaders.MAP_REGION_DECODER.method4436().getObjectDefs(sceneobject_10.getId());
	        i_12 = sceneobject_10.method92() & 0x3;
	        i_13 = sceneobject_10.method89();
	        if (objectdefinitions_11.mapSpriteId != -1) {
	            VarcDefinitions.method6997(graphicalrenderer_0, objectdefinitions_11, i_12, i_4, i_5);
	        } else {
	            i_14 = i_6;
	            if (objectdefinitions_11.interactable > 0) {
	                i_14 = i_7;
	            }
	            if (i_13 == ObjectType.WALL_STRAIGHT.id || i_13 == ObjectType.WALL_WHOLE_CORNER.id) {
	                if (i_12 == 0) {
	                    graphicalrenderer_0.method8428(i_4, i_5, 4, i_14);
	                } else if (i_12 == 1) {
	                    graphicalrenderer_0.method8659(i_4, i_5, 4, i_14);
	                } else if (i_12 == 2) {
	                    graphicalrenderer_0.method8428(i_4 + 3, i_5, 4, i_14);
	                } else if (i_12 == 3) {
	                    graphicalrenderer_0.method8659(i_4, i_5 + 3, 4, i_14);
	                }
	            }
	            if (i_13 == ObjectType.WALL_STRAIGHT_CORNER.id) {
	                if (i_12 == 0) {
	                    graphicalrenderer_0.method8425(i_4, i_5, 1, 1, i_14);
	                } else if (i_12 == 1) {
	                    graphicalrenderer_0.method8425(i_4 + 3, i_5, 1, 1, i_14);
	                } else if (i_12 == 2) {
	                    graphicalrenderer_0.method8425(i_4 + 3, i_5 + 3, 1, 1, i_14);
	                } else if (i_12 == 3) {
	                    graphicalrenderer_0.method8425(i_4, i_5 + 3, 1, 1, i_14);
	                }
	            }
	            if (i_13 == ObjectType.WALL_WHOLE_CORNER.id) {
	                if (i_12 == 0) {
	                    graphicalrenderer_0.method8659(i_4, i_5, 4, i_14);
	                } else if (i_12 == 1) {
	                    graphicalrenderer_0.method8428(i_4 + 3, i_5, 4, i_14);
	                } else if (i_12 == 2) {
	                    graphicalrenderer_0.method8659(i_4, i_5 + 3, 4, i_14);
	                } else if (i_12 == 3) {
	                    graphicalrenderer_0.method8428(i_4, i_5, 4, i_14);
	                }
	            }
	        }
	    }
	    sceneobject_10 = (WorldObject) sceneobjectmanager_9.getInteractableObject(i_1, i_2, i_3, client.anInterface25_7446);
	    if (sceneobject_10 != null) {
	        objectdefinitions_11 = IndexLoaders.MAP_REGION_DECODER.method4436().getObjectDefs(sceneobject_10.getId());
	        i_12 = sceneobject_10.method92() & 0x3;
	        i_13 = sceneobject_10.method89();
	        if (objectdefinitions_11.mapSpriteId != -1) {
	            VarcDefinitions.method6997(graphicalrenderer_0, objectdefinitions_11, i_12, i_4, i_5);
	        } else if (i_13 == ObjectType.WALL_INTERACT.id) {
	            i_14 = -1118482;
	            if (objectdefinitions_11.interactable > 0) {
	                i_14 = -1179648;
	            }
	            if (i_12 != 0 && i_12 != 2) {
	                graphicalrenderer_0.method8429(i_4, i_5, i_4 + 3, i_5 + 3, i_14);
	            } else {
	                graphicalrenderer_0.method8429(i_4, i_5 + 3, i_4 + 3, i_5, i_14);
	            }
	        }
	    }
	    sceneobject_10 = (WorldObject) sceneobjectmanager_9.getGroundDecoration(i_1, i_2, i_3);
	    if (sceneobject_10 != null) {
	        objectdefinitions_11 = IndexLoaders.MAP_REGION_DECODER.method4436().getObjectDefs(sceneobject_10.getId());
	        i_12 = sceneobject_10.method92() & 0x3;
	        if (objectdefinitions_11.mapSpriteId != -1) {
	            VarcDefinitions.method6997(graphicalrenderer_0, objectdefinitions_11, i_12, i_4, i_5);
	        }
	    }
	}

	static void resetContainer(int key, boolean negativeKey) {
	    ItemContainer container = ItemContainer.getContainer(key, negativeKey);
	    if (container != null) {
	        for (int i_4 = 0; i_4 < container.itemIds.length; i_4++) {
	            container.itemIds[i_4] = -1;
	            container.amounts[i_4] = 0;
	        }
	    }
	}

	public static String method13045(long long_0, int i_2) {
	    Class155.method2634(long_0);
	    int i_4 = Class407.aCalendar4848.get(Calendar.DATE);
	    int i_5 = Class407.aCalendar4848.get(Calendar.MONTH);
	    int i_6 = Class407.aCalendar4848.get(Calendar.YEAR);
	    return i_2 == 3 ? CutsceneEntityMovement.method1578(long_0) : Integer.toString(i_4 / 10) + i_4 % 10 + "-" + Class407.aStringArrayArray4849[i_2][i_5] + "-" + i_6;
	}

	public static void method13047(int[] ints_0, int[] ints_1, int i_2, int i_3) {
	    if (i_2 < i_3) {
	        int i_5 = (i_3 + i_2) / 2;
	        int i_6 = i_2;
	        int i_7 = ints_0[i_5];
	        ints_0[i_5] = ints_0[i_3];
	        ints_0[i_3] = i_7;
	        int i_8 = ints_1[i_5];
	        ints_1[i_5] = ints_1[i_3];
	        ints_1[i_3] = i_8;
	        int i_9 = i_7 == Integer.MAX_VALUE ? 0 : 1;
	        for (int i_10 = i_2; i_10 < i_3; i_10++) {
	            if (ints_0[i_10] < (i_10 & i_9) + i_7) {
	                int i_11 = ints_0[i_10];
	                ints_0[i_10] = ints_0[i_6];
	                ints_0[i_6] = i_11;
	                int i_12 = ints_1[i_10];
	                ints_1[i_10] = ints_1[i_6];
	                ints_1[i_6++] = i_12;
	            }
	        }
	        ints_0[i_3] = ints_0[i_6];
	        ints_0[i_6] = i_7;
	        ints_1[i_3] = ints_1[i_6];
	        ints_1[i_6] = i_8;
	        method13047(ints_0, ints_1, i_2, i_6 - 1);
	        method13047(ints_0, ints_1, i_6 + 1, i_3);
	    }
	}

	static void method1495(String[] arr_0, short[] shorts_1, int i_2, int i_3) {
	    if (i_2 < i_3) {
	        int i_5 = (i_3 + i_2) / 2;
	        int i_6 = i_2;
	        String string_7 = arr_0[i_5];
	        arr_0[i_5] = arr_0[i_3];
	        arr_0[i_3] = string_7;
	        short s_8 = shorts_1[i_5];
	        shorts_1[i_5] = shorts_1[i_3];
	        shorts_1[i_3] = s_8;
	        for (int i_9 = i_2; i_9 < i_3; i_9++) {
	            if (string_7 == null || arr_0[i_9] != null && arr_0[i_9].compareTo(string_7) < (i_9 & 0x1)) {
	                String string_10 = arr_0[i_9];
	                arr_0[i_9] = arr_0[i_6];
	                arr_0[i_6] = string_10;
	                short s_11 = shorts_1[i_9];
	                shorts_1[i_9] = shorts_1[i_6];
	                shorts_1[i_6++] = s_11;
	            }
	        }
	        arr_0[i_3] = arr_0[i_6];
	        arr_0[i_6] = string_7;
	        shorts_1[i_3] = shorts_1[i_6];
	        shorts_1[i_6] = s_8;
	        method1495(arr_0, shorts_1, i_2, i_6 - 1);
	        method1495(arr_0, shorts_1, i_6 + 1, i_3);
	    }
	}

	static void method4653(int i_0, int i_1) {
	    if (QuickchatFiller.ENTITY_DEFAULTS.aBool7044 || Class20.anInt169 != 1 && (!CutsceneAction_Sub6.SHOW_FACE_HERE || Class20.anInt169 != 2 || !AccountCreationStage.aCacheableNode_Sub7_12.aString9576.equals(LocalizedText.FACE_HERE.translate(Class223.CURRENT_LANGUAGE)))) {
	        FontMetrics fontmetrics_3 = ShaderLoader.method1887();
	        int i_4 = fontmetrics_3.getWidthNoSprites(LocalizedText.CHOOSE_OPTION.translate(Class223.CURRENT_LANGUAGE));
	        int i_5;
	        int i_7;
	        if (!Class20.aBool162) {
	            for (CacheableNode_Sub7 class282_sub50_sub7_9 = (CacheableNode_Sub7) Class20.aClass482_171.head(); class282_sub50_sub7_9 != null; class282_sub50_sub7_9 = (CacheableNode_Sub7) Class20.aClass482_171.next()) {
	                i_7 = Shadow.method15507(class282_sub50_sub7_9, fontmetrics_3);
	                if (i_7 > i_4) {
	                    i_4 = i_7;
	                }
	            }
	            i_4 += 8;
	            i_5 = Class20.anInt169 * Class20.anInt178 + 21;
	            Class110.anInt1104 = (Class20.aBool187 ? 26 : 22) + Class20.anInt169 * Class20.anInt178;
	        } else {
	            for (CacheableNode_Sub15 class282_sub50_sub15_6 = (CacheableNode_Sub15) Class20.aClass477_182.method7941(); class282_sub50_sub15_6 != null; class282_sub50_sub15_6 = (CacheableNode_Sub15) Class20.aClass477_182.method7955()) {
	                if (class282_sub50_sub15_6.anInt9769 == 1) {
	                    i_7 = Shadow.method15507((CacheableNode_Sub7) class282_sub50_sub15_6.aClass477_9770.aCacheableNode_5629.aCacheableNode_8119, fontmetrics_3);
	                } else {
	                    i_7 = Class163.method2840(class282_sub50_sub15_6, fontmetrics_3);
	                }
	                if (i_7 > i_4) {
	                    i_4 = i_7;
	                }
	            }
	            i_4 += 8;
	            i_5 = Class20.anInt178 * Class20.anInt170 + 21;
	            Class110.anInt1104 = Class20.anInt178 * Class20.anInt170 + (Class20.aBool187 ? 26 : 22);
	        }
	        i_4 += 10;
	        int i_8 = i_0 - i_4 / 2;
	        if (i_8 + i_4 > ChangeClanSetting.BASE_WINDOW_WIDTH) {
	            i_8 = ChangeClanSetting.BASE_WINDOW_WIDTH - i_4;
	        }
	        if (i_8 < 0) {
	            i_8 = 0;
	        }
	        i_7 = i_1;
	        if (i_1 + i_5 > Engine.BASE_WINDOW_HEIGHT * -969250379) {
	            i_7 = Engine.BASE_WINDOW_HEIGHT * -969250379 - i_5;
	        }
	        if (i_7 < 0) {
	            i_7 = 0;
	        }
	        Class301.anInt3555 = i_8;
	        BufferedConnectionContext.anInt2300 = i_7;
	        Class158_Sub2.anInt8975 = i_4;
	        Class20.anInt156 = (int) (Math.random() * 24.0D);
	        Class20.aBool161 = true;
	    }
	}

	static void processCamera() {
	    if (client.camAngleX < 1081.0F) {
	        client.camAngleX = 1081.0F;
	    }
	    if (client.camAngleX > 2980.0F) {
	        client.camAngleX = 2980.0F;
	    }
	    while (client.camAngleY >= 16384.0F) {
	        client.camAngleY -= 16384.0F;
	    }
	    while (client.camAngleY < 0.0F) {
	        client.camAngleY += 16384.0F;
	    }
	    RenderFlagMap regionmap_1 = IndexLoaders.MAP_REGION_DECODER.getRenderFlags();
	    SceneObjectManager sceneobjectmanager_2 = IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager();
	    int i_3 = Class11.anInt122 >> 9;
	    int i_4 = LibraryBase.anInt3289 >> 9;
	    int i_5 = Class504.getTerrainHeightAtPos(Class11.anInt122, LibraryBase.anInt3289, Class4.MY_PLAYER_PLANE);
	    int i_6 = 0;
	    if (i_3 > 3 && i_4 > 3 && i_3 < IndexLoaders.MAP_REGION_DECODER.getSizeX() - 4 && i_4 < IndexLoaders.MAP_REGION_DECODER.getSizeY() - 4) {
	        for (int x = i_3 - 4; x <= i_3 + 4; x++) {
	            for (int y = i_4 - 4; y <= i_4 + 4; y++) {
	                int i_9 = Class4.MY_PLAYER_PLANE;
	                if (i_9 < 3 && regionmap_1.isLowerObjectsToOverrideClipping(x, y)) {
	                    ++i_9;
	                }
	                int i_10 = 0;
	                byte[][] bytes_11 = IndexLoaders.MAP_REGION_DECODER.method4507(i_9);
	                if (bytes_11 != null) {
	                    i_10 = (bytes_11[x][y] & 0xff) * 8 << 2;
	                }
	                if (sceneobjectmanager_2.aGroundArray2591 != null && sceneobjectmanager_2.aGroundArray2591[i_9] != null) {
	                    int i_12 = i_5 - (sceneobjectmanager_2.aGroundArray2591[i_9].getHeight(x, y) - i_10);
	                    if (i_12 > i_6) {
	                        i_6 = i_12;
	                    }
	                }
	            }
	        }
	    }
	    int i_7 = (i_6 >> 2) * 1536;
	    if (i_7 > 786432) {
	        i_7 = 786432;
	    }
	    if (i_7 < 262144) {
	        i_7 = 262144;
	    }
	    if (i_7 > client.anInt7273) {
	        client.anInt7273 += (i_7 - client.anInt7273) / 24;
	    } else if (i_7 < client.anInt7273) {
	        client.anInt7273 += (i_7 - client.anInt7273) / 80;
	    }
	}

}
