package com.jagex.unknown;

import com.jagex.OutputStream_Sub1;
import com.jagex.client.js5.loaders.SpotAnimIndexLoader;

public class Class362 {

	public Class362() throws Throwable {
		throw new Error();
	}

	public static void method6276() {
		OutputStream_Sub1.anImage7953 = null;
		SpotAnimIndexLoader.aFont5893 = null;
	}

	public static String[] method6277(String[] arr_0) {
		String[] arr_2 = new String[5];
		for (int i_3 = 0; i_3 < 5; i_3++) {
			arr_2[i_3] = i_3 + " ";
			if (arr_0 != null && arr_0[i_3] != null) {
				arr_2[i_3] += arr_0[i_3];
			}
		}
		return arr_2;
	}
}
