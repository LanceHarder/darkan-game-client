package com.jagex;

public class Preference_Sub29 extends Preference {

    public Preference_Sub29(int i_1, GamePreferences class282_sub54_2) {
        super(i_1, class282_sub54_2);
    }

    public Preference_Sub29(GamePreferences class282_sub54_1) {
        super(class282_sub54_1);
    }

    @Override
    void setValue(int i_1) {
        value = i_1;
    }

    public int method7784(int i_1) {
        return i_1 == 2 ? 2 : 1;
    }

    public void method13048() {
        if (value < 0 || value > 2) {
            value = getDefaultValue();
        }

    }

    @Override
    int getDefaultValue() {
        return 0;
    }

    public boolean method13049() {
        return true;
    }

    @Override
    public int checkValid(int i_1) {
        return i_1 == 2 ? 2 : 1;
    }

    public int method13050() {
        return value;
    }

    void method7780(int i_1) {
        value = i_1 * -754033619 * -859024475;
    }

    int method7787() {
        return 0;
    }

    int method7786() {
        return 0;
    }

}
