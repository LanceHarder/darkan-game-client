package com.jagex;

public abstract class MouseRecord extends Node {

    public abstract int getY();

    public abstract int getClickType();

    public abstract long getTime();

    public abstract int getMeta();

    public abstract void cache();

    public abstract int getX();
}
