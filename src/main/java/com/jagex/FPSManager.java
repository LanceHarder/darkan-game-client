package com.jagex;

import com.jagex.client.input.KeyHoldInputSubscriber;
import com.jagex.unknown.Class532_Sub3;
import com.jagex.unknown.Class89;

public abstract class FPSManager {

	public static void method4866(int i_0, int i_1, int i_2, int i_3) {
		int i_5 = 0;
		int i_6 = i_2;
		int i_7 = -i_2;
		int i_8 = -1;
		int i_9 = EntityNode.method4890(i_0 + i_2, Class532_Sub3.anInt7071, Class532_Sub3.anInt7069);
		int i_10 = EntityNode.method4890(i_0 - i_2, Class532_Sub3.anInt7071, Class532_Sub3.anInt7069);
		KeyHoldInputSubscriber.method3922(Class532_Sub3.anIntArrayArray7072[i_1], i_10, i_9, i_3);
		while (i_6 > i_5) {
			i_8 += 2;
			i_7 += i_8;
			int i_11;
			int i_12;
			int i_13;
			int i_14;
			if (i_7 > 0) {
				--i_6;
				i_7 -= i_6 << 1;
				i_11 = i_1 - i_6;
				i_12 = i_6 + i_1;
				if (i_12 >= Class532_Sub3.anInt7070 && i_11 <= Class532_Sub3.anInt7068) {
					i_13 = EntityNode.method4890(i_0 + i_5, Class532_Sub3.anInt7071, Class532_Sub3.anInt7069);
					i_14 = EntityNode.method4890(i_0 - i_5, Class532_Sub3.anInt7071, Class532_Sub3.anInt7069);
					if (i_12 <= Class532_Sub3.anInt7068) {
						KeyHoldInputSubscriber.method3922(Class532_Sub3.anIntArrayArray7072[i_12], i_14, i_13, i_3);
					}
					if (i_11 >= Class532_Sub3.anInt7070) {
						KeyHoldInputSubscriber.method3922(Class532_Sub3.anIntArrayArray7072[i_11], i_14, i_13, i_3);
					}
				}
			}
			++i_5;
			i_11 = i_1 - i_5;
			i_12 = i_5 + i_1;
			if (i_12 >= Class532_Sub3.anInt7070 && i_11 <= Class532_Sub3.anInt7068) {
				i_13 = EntityNode.method4890(i_0 + i_6, Class532_Sub3.anInt7071, Class532_Sub3.anInt7069);
				i_14 = EntityNode.method4890(i_0 - i_6, Class532_Sub3.anInt7071, Class532_Sub3.anInt7069);
				if (i_12 <= Class532_Sub3.anInt7068) {
					KeyHoldInputSubscriber.method3922(Class532_Sub3.anIntArrayArray7072[i_12], i_14, i_13, i_3);
				}
				if (i_11 >= Class532_Sub3.anInt7070) {
					KeyHoldInputSubscriber.method3922(Class532_Sub3.anIntArrayArray7072[i_11], i_14, i_13, i_3);
				}
			}
		}
	}

	public int lockTime(long time) {
		long sleepTime = method4844();
		if (sleepTime > 0L) {
			Class89.sleep(sleepTime);
		}
		return method4845(time);
	}

	public abstract long method4844();

	public abstract int method4845(long var1);

	public abstract long method4852();

	public abstract void method4853();

	public static FPSManager createFPSManager() {
		try {
			return new NativeNanoTimeFPSManager();
		} catch (Throwable t) {
			return new JavaNanoTimeFPSManager();
		}
	}
}
