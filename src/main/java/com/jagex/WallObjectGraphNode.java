package com.jagex;

public class WallObjectGraphNode extends GraphNode_Sub1_Sub5 implements WorldObject {

	static int anInt10526;
	static Class194 aClass194_10527;
	static int[] anIntArray10522 = { 1, 2, 4, 8 };
	static int[] anIntArray10518 = { 16, 32, 64, 128 };
	Shadow aCacheableNode_Sub17_10517;
	Class200 aClass200_10519;
	boolean aBool10524;
	LocationIndexLoader aClass474_10515;
	int anInt10514;
	boolean aBool10525;
	byte aByte10521;
	byte aByte10520;
	boolean aBool10523;
	boolean aBool10516;
	MeshRasterizer aMeshRasterizer_10513;

	public WallObjectGraphNode(SceneObjectManager sceneobjectmanager_1, AbstractRenderer graphicalrenderer_2, LocationIndexLoader objectindexloader_3, ObjectDefinition objectdefinitions_4, int i_5, int i_6, int i_7, int i_8, int i_9, boolean bool_10, int i_11, int i_12, boolean bool_13) {
		super(sceneobjectmanager_1, i_7, i_8, i_9, i_5, i_6, Class235.method3967(i_11, i_12));
		aClass474_10515 = objectindexloader_3;
		anInt10514 = objectdefinitions_4.id;
		aBool10525 = bool_10;
		aByte10521 = (byte) i_11;
		aByte10520 = (byte) i_12;
		aBool10523 = objectdefinitions_4.interactable != 0 && !bool_10;
		aBool10524 = bool_13;
		aBool10516 = graphicalrenderer_2.method8402() && objectdefinitions_4.aBool5703 && !aBool10525 && Class393.preferences.sceneryShadows.method12624() != 0;
		int i_14 = 2048;
		if (aBool10524) {
			i_14 |= 0x10000;
		}

		if (objectdefinitions_4.aBool5711) {
			i_14 |= 0x80000;
		}

		Class452 class452_15 = method16101(graphicalrenderer_2, i_14, aBool10516);
		if (class452_15 != null) {
			aMeshRasterizer_10513 = (MeshRasterizer) class452_15.anObject5443;
			aCacheableNode_Sub17_10517 = (Shadow) class452_15.anObject5444;
			if (aBool10524 || objectdefinitions_4.aBool5711) {
				aMeshRasterizer_10513 = aMeshRasterizer_10513.method11289((byte) 0, i_14, false);
				if (objectdefinitions_4.aBool5711) {
					Class341 class341_16 = IndexLoaders.MAP_REGION_DECODER.method4426();
					aMeshRasterizer_10513.PA(class341_16.anInt3992, class341_16.anInt3993, class341_16.anInt3994, class341_16.anInt3995);
				}
			}
		}

		method13008(1);
	}

	@Override
	public void method88(AbstractRenderer graphicalrenderer_1) {
		Object obj_3 = null;
		Shadow class282_sub50_sub17_4;
		if (aCacheableNode_Sub17_10517 == null && aBool10516) {
			Class452 class452_5 = method16101(graphicalrenderer_1, 262144, true);
			class282_sub50_sub17_4 = (Shadow) (class452_5 != null ? class452_5.anObject5444 : null);
		} else {
			class282_sub50_sub17_4 = aCacheableNode_Sub17_10517;
			aCacheableNode_Sub17_10517 = null;
		}

		Vector3 vector3_6 = method11166().coords;
		if (class282_sub50_sub17_4 != null) {
			aClass206_7970.method3427(class282_sub50_sub17_4, collisionPlane, (int) vector3_6.x, (int) vector3_6.z, null);
		}

	}

	@Override
	boolean method12986() {
		return aMeshRasterizer_10513 == null || !aMeshRasterizer_10513.u();
	}

	Class452 method16101(AbstractRenderer graphicalrenderer_1, int i_2, boolean bool_3) {
		ObjectDefinition objectdefinitions_5 = aClass474_10515.getObjectDefs(anInt10514);
		Ground class390_6;
		Ground class390_7;
		if (aBool10525) {
			class390_6 = aClass206_7970.aGroundArray2614[collisionPlane];
			class390_7 = aClass206_7970.aGroundArray2607[0];
		} else {
			class390_6 = aClass206_7970.aGroundArray2607[collisionPlane];
			if (collisionPlane < 3) {
				class390_7 = aClass206_7970.aGroundArray2607[collisionPlane + 1];
			} else {
				class390_7 = null;
			}
		}

		Vector3 vector3_8 = method11166().coords;
		return objectdefinitions_5.method8010(graphicalrenderer_1, i_2, aByte10521, aByte10520, class390_6, class390_7, (int) vector3_8.x, (int) vector3_8.y, (int) vector3_8.z, bool_3, null);
	}

	@Override
	public void method83(AbstractRenderer graphicalrenderer_1) {
		Object obj_2 = null;
		Shadow class282_sub50_sub17_3;
		if (aCacheableNode_Sub17_10517 == null && aBool10516) {
			Class452 class452_4 = method16101(graphicalrenderer_1, 262144, true);
			class282_sub50_sub17_3 = (Shadow) (class452_4 != null ? class452_4.anObject5444 : null);
		} else {
			class282_sub50_sub17_3 = aCacheableNode_Sub17_10517;
			aCacheableNode_Sub17_10517 = null;
		}

		Vector3 vector3_5 = method11166().coords;
		if (class282_sub50_sub17_3 != null) {
			aClass206_7970.method3426(class282_sub50_sub17_3, collisionPlane, (int) vector3_5.x, (int) vector3_5.z, null);
		}

	}

	MeshRasterizer method16102(AbstractRenderer graphicalrenderer_1, int i_2) {
		if (aMeshRasterizer_10513 != null && graphicalrenderer_1.method8452(aMeshRasterizer_10513.m(), i_2) == 0) {
			return aMeshRasterizer_10513;
		} else {
			Class452 class452_4 = method16101(graphicalrenderer_1, i_2, false);
			return class452_4 != null ? (MeshRasterizer) class452_4.anObject5443 : null;
		}
	}

	@Override
	Class285 method12989(AbstractRenderer graphicalrenderer_1) {
		if (aMeshRasterizer_10513 == null) {
			return null;
		} else {
			Matrix44Var matrix44var_2 = method11168();
			Class285 class285_3 = Class470.method7824(aBool10523);
			aMeshRasterizer_10513.method11282(matrix44var_2, boundingBoxPolygons[0], 0);
			return class285_3;
		}
	}

	@Override
	public Class200 method12992(AbstractRenderer graphicalrenderer_1) {
		Vector3 vector3_3 = method11166().coords;
		if (aClass200_10519 == null) {
			aClass200_10519 = EntityNode_Sub2.method12505((int) vector3_3.x, (int) vector3_3.y, (int) vector3_3.z, method16102(graphicalrenderer_1, 0));
		}

		return aClass200_10519;
	}

	@Override
	public void method85() {
		if (aMeshRasterizer_10513 != null) {
			aMeshRasterizer_10513.method11259();
		}

	}

	@Override
	void method12991(AbstractRenderer graphicalrenderer_1) {
	}

	@Override
	void method13016(GraphNode_Sub1 class521_sub1_2, int i_3, int i_4, int i_5, boolean bool_6) {
		if (class521_sub1_2 instanceof WallObjectGraphNode) {
			WallObjectGraphNode class521_sub1_sub5_sub1_7 = (WallObjectGraphNode) class521_sub1_2;
			if (aMeshRasterizer_10513 != null && class521_sub1_sub5_sub1_7.aMeshRasterizer_10513 != null) {
				aMeshRasterizer_10513.method11269(class521_sub1_sub5_sub1_7.aMeshRasterizer_10513, i_3, i_4, i_5, bool_6);
			}
		} else if (class521_sub1_2 instanceof GraphNode_Sub1_Sub1_Sub6) {
			GraphNode_Sub1_Sub1_Sub6 class521_sub1_sub1_sub6_8 = (GraphNode_Sub1_Sub1_Sub6) class521_sub1_2;
			if (aMeshRasterizer_10513 != null && class521_sub1_sub1_sub6_8.aMeshRasterizer_10535 != null) {
				aMeshRasterizer_10513.method11269(class521_sub1_sub1_sub6_8.aMeshRasterizer_10535, i_3, i_4, i_5, bool_6);
			}
		}

	}

	@Override
	boolean method12985() {
		return aBool10524;
	}

	@Override
	public void method93(AbstractRenderer graphicalrenderer_1) {
		Object obj_2 = null;
		Shadow class282_sub50_sub17_3;
		if (aCacheableNode_Sub17_10517 == null && aBool10516) {
			Class452 class452_4 = method16101(graphicalrenderer_1, 262144, true);
			class282_sub50_sub17_3 = (Shadow) (class452_4 != null ? class452_4.anObject5444 : null);
		} else {
			class282_sub50_sub17_3 = aCacheableNode_Sub17_10517;
			aCacheableNode_Sub17_10517 = null;
		}

		Vector3 vector3_5 = method11166().coords;
		if (class282_sub50_sub17_3 != null) {
			aClass206_7970.method3426(class282_sub50_sub17_3, collisionPlane, (int) vector3_5.x, (int) vector3_5.z, null);
		}

	}

	@Override
	void method12984() {
		aBool10524 = false;
		if (aMeshRasterizer_10513 != null) {
			aMeshRasterizer_10513.KA(aMeshRasterizer_10513.m() & -65537);
		}

	}

	@Override
	public int getId() {
		return anInt10514;
	}

	@Override
	public int method89() {
		return aByte10521;
	}

	@Override
	public int method92() {
		return aByte10520;
	}

	@Override
	public int method13006() {
		return aMeshRasterizer_10513 != null ? aMeshRasterizer_10513.YA() : 0;
	}

	@Override
	public boolean method86() {
		return aBool10516;
	}

	@Override
	public void method87(AbstractRenderer graphicalrenderer_1) {
		Object obj_3 = null;
		Shadow class282_sub50_sub17_4;
		if (aCacheableNode_Sub17_10517 == null && aBool10516) {
			Class452 class452_5 = method16101(graphicalrenderer_1, 262144, true);
			class282_sub50_sub17_4 = (Shadow) (class452_5 != null ? class452_5.anObject5444 : null);
		} else {
			class282_sub50_sub17_4 = aCacheableNode_Sub17_10517;
			aCacheableNode_Sub17_10517 = null;
		}

		Vector3 vector3_6 = method11166().coords;
		if (class282_sub50_sub17_4 != null) {
			aClass206_7970.method3426(class282_sub50_sub17_4, collisionPlane, (int) vector3_6.x, (int) vector3_6.z, null);
		}

	}

	@Override
	boolean method12999() {
		return aMeshRasterizer_10513 == null || !aMeshRasterizer_10513.u();
	}

	@Override
	public int method76() {
		return anInt10514 * 1466066887 * -585553417;
	}

	@Override
	public int method39() {
		return anInt10514 * 1466066887 * -585553417;
	}

	@Override
	public int method73() {
		return aByte10521;
	}

	@Override
	public int method77() {
		return aByte10521;
	}

	@Override
	void method13023(AbstractRenderer graphicalrenderer_1) {
	}

	@Override
	public void method38() {
		if (aMeshRasterizer_10513 != null) {
			aMeshRasterizer_10513.method11259();
		}

	}

	@Override
	public void method96() {
		if (aMeshRasterizer_10513 != null) {
			aMeshRasterizer_10513.method11259();
		}

	}

	@Override
	public void method90() {
		if (aMeshRasterizer_10513 != null) {
			aMeshRasterizer_10513.method11259();
		}

	}

	@Override
	public boolean method94() {
		return aBool10516;
	}

	@Override
	public boolean method95() {
		return aBool10516;
	}

	@Override
	boolean method13000() {
		return aMeshRasterizer_10513 != null && aMeshRasterizer_10513.i();
	}

	@Override
	public int method91() {
		return aByte10520;
	}

	@Override
	public void method97(AbstractRenderer graphicalrenderer_1) {
		Object obj_2 = null;
		Shadow class282_sub50_sub17_3;
		if (aCacheableNode_Sub17_10517 == null && aBool10516) {
			Class452 class452_4 = method16101(graphicalrenderer_1, 262144, true);
			class282_sub50_sub17_3 = (Shadow) (class452_4 != null ? class452_4.anObject5444 : null);
		} else {
			class282_sub50_sub17_3 = aCacheableNode_Sub17_10517;
			aCacheableNode_Sub17_10517 = null;
		}

		Vector3 vector3_5 = method11166().coords;
		if (class282_sub50_sub17_3 != null) {
			aClass206_7970.method3427(class282_sub50_sub17_3, collisionPlane, (int) vector3_5.x, (int) vector3_5.z, null);
		}

	}

	@Override
	public void method98(AbstractRenderer graphicalrenderer_1) {
		Object obj_2 = null;
		Shadow class282_sub50_sub17_3;
		if (aCacheableNode_Sub17_10517 == null && aBool10516) {
			Class452 class452_4 = method16101(graphicalrenderer_1, 262144, true);
			class282_sub50_sub17_3 = (Shadow) (class452_4 != null ? class452_4.anObject5444 : null);
		} else {
			class282_sub50_sub17_3 = aCacheableNode_Sub17_10517;
			aCacheableNode_Sub17_10517 = null;
		}

		Vector3 vector3_5 = method11166().coords;
		if (class282_sub50_sub17_3 != null) {
			aClass206_7970.method3427(class282_sub50_sub17_3, collisionPlane, (int) vector3_5.x, (int) vector3_5.z, null);
		}

	}

	@Override
	Class285 method12990(AbstractRenderer graphicalrenderer_1) {
		if (aMeshRasterizer_10513 == null) {
			return null;
		} else {
			Matrix44Var matrix44var_3 = method11168();
			Class285 class285_4 = Class470.method7824(aBool10523);
			aMeshRasterizer_10513.method11282(matrix44var_3, boundingBoxPolygons[0], 0);
			return class285_4;
		}
	}

	@Override
	boolean method13001() {
		return aMeshRasterizer_10513 != null && aMeshRasterizer_10513.i();
	}

	@Override
	boolean method13002() {
		return aMeshRasterizer_10513 != null && aMeshRasterizer_10513.i();
	}

	@Override
	public int method13017() {
		return aMeshRasterizer_10513 != null ? aMeshRasterizer_10513.YA() : 0;
	}

	@Override
	public int method13005() {
		return aMeshRasterizer_10513 != null ? aMeshRasterizer_10513.YA() : 0;
	}

	@Override
	void method13013(GraphNode_Sub1 class521_sub1_2, int i_3, int i_4, int i_5, boolean bool_6) {
		if (class521_sub1_2 instanceof WallObjectGraphNode) {
			WallObjectGraphNode class521_sub1_sub5_sub1_8 = (WallObjectGraphNode) class521_sub1_2;
			if (aMeshRasterizer_10513 != null && class521_sub1_sub5_sub1_8.aMeshRasterizer_10513 != null) {
				aMeshRasterizer_10513.method11269(class521_sub1_sub5_sub1_8.aMeshRasterizer_10513, i_3, i_4, i_5, bool_6);
			}
		} else if (class521_sub1_2 instanceof GraphNode_Sub1_Sub1_Sub6) {
			GraphNode_Sub1_Sub1_Sub6 class521_sub1_sub1_sub6_9 = (GraphNode_Sub1_Sub1_Sub6) class521_sub1_2;
			if (aMeshRasterizer_10513 != null && class521_sub1_sub1_sub6_9.aMeshRasterizer_10535 != null) {
				aMeshRasterizer_10513.method11269(class521_sub1_sub1_sub6_9.aMeshRasterizer_10535, i_3, i_4, i_5, bool_6);
			}
		}

	}

	@Override
	Class285 method13009(AbstractRenderer graphicalrenderer_1) {
		if (aMeshRasterizer_10513 == null) {
			return null;
		} else {
			Matrix44Var matrix44var_2 = method11168();
			Class285 class285_3 = Class470.method7824(aBool10523);
			aMeshRasterizer_10513.method11282(matrix44var_2, boundingBoxPolygons[0], 0);
			return class285_3;
		}
	}

	@Override
	Class285 method13010(AbstractRenderer graphicalrenderer_1) {
		if (aMeshRasterizer_10513 == null) {
			return null;
		} else {
			Matrix44Var matrix44var_2 = method11168();
			Class285 class285_3 = Class470.method7824(aBool10523);
			aMeshRasterizer_10513.method11282(matrix44var_2, boundingBoxPolygons[0], 0);
			return class285_3;
		}
	}

	@Override
	public int method13003() {
		return aMeshRasterizer_10513 != null ? aMeshRasterizer_10513.YA() : 0;
	}

	@Override
	void method13012(AbstractRenderer graphicalrenderer_1) {
	}

	@Override
	boolean method13026() {
		return aBool10524;
	}

	@Override
	boolean method13011() {
		return aBool10524;
	}

	@Override
	public Class200 method13019(AbstractRenderer graphicalrenderer_1) {
		Vector3 vector3_2 = method11166().coords;
		if (aClass200_10519 == null) {
			aClass200_10519 = EntityNode_Sub2.method12505((int) vector3_2.x, (int) vector3_2.y, (int) vector3_2.z, method16102(graphicalrenderer_1, 0));
		}

		return aClass200_10519;
	}

	@Override
	public Class200 method13018(AbstractRenderer graphicalrenderer_1) {
		Vector3 vector3_2 = method11166().coords;
		if (aClass200_10519 == null) {
			aClass200_10519 = EntityNode_Sub2.method12505((int) vector3_2.x, (int) vector3_2.y, (int) vector3_2.z, method16102(graphicalrenderer_1, 0));
		}

		return aClass200_10519;
	}

	@Override
	public Class200 method12993(AbstractRenderer graphicalrenderer_1) {
		Vector3 vector3_2 = method11166().coords;
		if (aClass200_10519 == null) {
			aClass200_10519 = EntityNode_Sub2.method12505((int) vector3_2.x, (int) vector3_2.y, (int) vector3_2.z, method16102(graphicalrenderer_1, 0));
		}

		return aClass200_10519;
	}

	@Override
	boolean method13020(AbstractRenderer graphicalrenderer_1, int i_2, int i_3) {
		MeshRasterizer meshrasterizer_4 = method16102(graphicalrenderer_1, 131072);
		if (meshrasterizer_4 != null) {
			Matrix44Var matrix44var_5 = method11168();
			return meshrasterizer_4.method11270(i_2, i_3, matrix44var_5, false, 0);
		} else {
			return false;
		}
	}

	@Override
	void method13021() {
		aBool10524 = false;
		if (aMeshRasterizer_10513 != null) {
			aMeshRasterizer_10513.KA(aMeshRasterizer_10513.m() & -65537);
		}

	}

	@Override
	boolean method12987() {
		return aMeshRasterizer_10513 != null && aMeshRasterizer_10513.i();
	}

	@Override
	public int method12995() {
		return aMeshRasterizer_10513 != null ? aMeshRasterizer_10513.YA() : 0;
	}

	@Override
	void method13015() {
		aBool10524 = false;
		if (aMeshRasterizer_10513 != null) {
			aMeshRasterizer_10513.KA(aMeshRasterizer_10513.m() & -65537);
		}

	}

	@Override
	boolean method12983(AbstractRenderer graphicalrenderer_1, int i_2, int i_3) {
		MeshRasterizer meshrasterizer_5 = method16102(graphicalrenderer_1, 131072);
		if (meshrasterizer_5 != null) {
			Matrix44Var matrix44var_6 = method11168();
			return meshrasterizer_5.method11270(i_2, i_3, matrix44var_6, false, 0);
		} else {
			return false;
		}
	}
}
