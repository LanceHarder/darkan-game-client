package com.jagex.unknown;

import com.jagex.ImageLoader;
import com.jagex.LRUCache;
import com.jagex.Node_Sub41;
import com.jagex.TextureDetails;
import com.jagex.client.render.opengl.OpenGLRenderer;

public class Class167 {

	public LRUCache aClass229_2044 = new LRUCache(256);
	public OpenGLRenderer aGraphicalRenderer_Sub1_2042;
	public ImageLoader anInterface22_2043;

	public Class167(OpenGLRenderer class505_sub1_1, ImageLoader interface22_2) {
		aGraphicalRenderer_Sub1_2042 = class505_sub1_1;
		anInterface22_2043 = interface22_2;
	}

	public Class137_Sub1 method2857(int i_1, int i_2) {
		int i_21 = i_2;
		Object object_3 = aClass229_2044.get(i_1);
		if (object_3 != null) {
			return (Class137_Sub1) object_3;
		} else if (!anInterface22_2043.loadTexture(i_1)) {
			return null;
		} else {
			TextureDetails class169_4 = anInterface22_2043.getTextureDetails(i_1);
			if (i_21 == -1) {
				i_21 = class169_4.isHalfSize ? 64 : aGraphicalRenderer_Sub1_2042.anInt8349;
			}

			Class137_Sub1 class137_sub1_5;
			if (class169_4.hdr && aGraphicalRenderer_Sub1_2042.method8471()) {
				float[] floats_7 = anInterface22_2043.renderMaterialPixelsF(i_1, i_21, i_21);
				class137_sub1_5 = new Class137_Sub1(aGraphicalRenderer_Sub1_2042, Class150.aClass150_1949, Class76.aClass76_755, i_21, i_21, class169_4.useMipmaps != 0, floats_7, Class150.aClass150_1949);
			} else {
				int[] ints_6;
				if (class169_4.blendType != 2 && Node_Sub41.method13367(class169_4.effectId)) {
					ints_6 = anInterface22_2043.renderTexturePixels(i_1, 0.7F, i_21, i_21, true);
				} else {
					ints_6 = anInterface22_2043.renderMaterialPixelsI(i_1, i_21, i_21);
				}

				class137_sub1_5 = new Class137_Sub1(aGraphicalRenderer_Sub1_2042, 3553, i_21, i_21, class169_4.useMipmaps != 0, ints_6, 0, 0, false);
			}

			class137_sub1_5.method14445(class169_4.repeatS, class169_4.repeatT);
			aClass229_2044.put(class137_sub1_5, i_1);
			return class137_sub1_5;
		}
	}

	public Class137_Sub1 method2858(int i_1) {
		return method2857(i_1, -1);
	}

	public void method2860() {
		aClass229_2044.method3858(5);
	}

	public void method2861() {
		aClass229_2044.method3859();
	}

}
