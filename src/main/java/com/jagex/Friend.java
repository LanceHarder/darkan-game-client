package com.jagex;

import com.jagex.client.client;
import com.jagex.client.input.InputSubscriber;
import com.jagex.client.input.MouseRecord;
import com.jagex.game.content.cutscenes.actions.PlaySoundJingleCutsceneAction;
import com.jagex.unknown.Class291_Sub1;

public class Friend {
	public static int anInt46;
	public String displayName;
	public boolean referrer;
	public int worldId;
	public String worldName;
	public int fcRank;
	public int platform;
	public String username;
	public int worldFlags;

	public static boolean method302(InputSubscriber interface17_0, MouseRecord class282_sub53_1) {
		return interface17_0 != null && interface17_0.valid(class282_sub53_1, client.keyRecords, client.maximumHeldKeys, PlaySoundJingleCutsceneAction.keyRecorder);
	}

	public static void method303(int i_0, int i_1, int i_2) {
		if (i_0 == 1008) {
			HitsplatIndexLoader.executeTrigger(ClientTriggerType.ON_OP_1008, i_1, i_2);
		} else if (i_0 == 1009) {
			HitsplatIndexLoader.executeTrigger(ClientTriggerType.ON_OP_1009, i_1, i_2);
		} else if (i_0 == 1010) {
			HitsplatIndexLoader.executeTrigger(ClientTriggerType.ON_OP_1010, i_1, i_2);
		} else if (i_0 == 1011) {
			HitsplatIndexLoader.executeTrigger(ClientTriggerType.ON_OP_1011, i_1, i_2);
		} else if (i_0 == 1012) {
			HitsplatIndexLoader.executeTrigger(ClientTriggerType.ON_OP_1012, i_1, i_2);
		}
	}

	public static int method304() {
		return Class291_Sub1.aFloat3462 == 3.0D ? 37 : (Class291_Sub1.aFloat3462 == 4.0D ? 50 : (Class291_Sub1.aFloat3462 == 6.0D ? 75 : (Class291_Sub1.aFloat3462 == 8.0D ? 100 : 200)));
	}
}
