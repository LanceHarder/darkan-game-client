package com.jagex.client.prefs.impl;

import com.jagex.client.prefs.ClientPreferences;

public class WaterPreference extends Preference {

	public WaterPreference(int i_1, ClientPreferences class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	public WaterPreference(ClientPreferences class282_sub54_1) {
		super(class282_sub54_1);
	}

	public void method12918() {
		if (anInt5578 < 0 && anInt5578 > 2) {
			anInt5578 = getDefaultValue();
		}
	}

	@Override
	public int getDefaultValue() {
		return 1;
	}

	public int getValue() {
		return anInt5578;
	}

	@Override
	public void setValue(int i_1) {
		anInt5578 = i_1;
	}

	public int method7784(int i_1) {
		return i_1 != 0 && manager.groundBlending.method12762() != 1 ? 2 : 1;
	}

	@Override
	public int checkValid(int i_1) {
		return i_1 != 0 && manager.groundBlending.method12762() != 1 ? 2 : 1;
	}

	public boolean method12923() {
		return true;
	}
}
