package com.jagex.unknown;

import com.jagex.client.render.opengl.OpenGLRenderer;
import jaggl.OpenGL;

public class Class141_Sub2 extends Class141 {

	public boolean aBool9040;
	public boolean aBool9037;
	public Class136 aClass136_9042;
	public Class128 aClass128_9041;

	public Class141_Sub2(OpenGLRenderer class505_sub1_1, Class136 class136_2) {
		super(class505_sub1_1);
		aClass136_9042 = class136_2;
		if (aClass136_9042.aClass137_Sub4_1638 != null && aGraphicalRenderer_Sub1_1664.aBool8485 && aGraphicalRenderer_Sub1_1664.aBool8365) {
			Class140 class140_3 = Class140.method2393(aGraphicalRenderer_Sub1_1664, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			Class140 class140_4 = Class140.method2393(aGraphicalRenderer_Sub1_1664, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
			aClass128_9041 = Class128.method2174(aGraphicalRenderer_Sub1_1664, new Class140[]{class140_3, class140_4});
			aBool9037 = aClass128_9041 != null;
		}

	}

	@Override
	public void method2397(boolean bool_1) {
		Class137_Sub2 class137_sub2_2 = aGraphicalRenderer_Sub1_1664.method13596();
		if (aBool9037 && class137_sub2_2 != null) {
			aGraphicalRenderer_Sub1_1664.method13610(1);
			aGraphicalRenderer_Sub1_1664.method13654(class137_sub2_2);
			aGraphicalRenderer_Sub1_1664.method13610(0);
			aGraphicalRenderer_Sub1_1664.method13654(aClass136_9042.aClass137_Sub4_1638);
			int i_3 = aClass128_9041.anInt1583;
			OpenGL.glUseProgram(i_3);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_3, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_3, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_3, "sunDir"), -aGraphicalRenderer_Sub1_1664.aFloatArray8426[0], -aGraphicalRenderer_Sub1_1664.aFloatArray8426[1], -aGraphicalRenderer_Sub1_1664.aFloatArray8426[2]);
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_3, "sunColour"), aGraphicalRenderer_Sub1_1664.aFloat8429, aGraphicalRenderer_Sub1_1664.aFloat8430, aGraphicalRenderer_Sub1_1664.aFloat8431, 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_3, "sunExponent"), 96.0F + Math.abs(aGraphicalRenderer_Sub1_1664.aFloatArray8426[1]) * 928.0F);
			aBool9040 = true;
		}

	}

	@Override
	public boolean method2395() {
		return aBool9037;
	}

	@Override
	public void method2398() {
		if (aBool9040) {
			aGraphicalRenderer_Sub1_1664.method13610(1);
			aGraphicalRenderer_Sub1_1664.method13654(null);
			aGraphicalRenderer_Sub1_1664.method13610(0);
			aGraphicalRenderer_Sub1_1664.method13654(null);
			OpenGL.glUseProgram(0);
			aBool9040 = false;
		}

	}

	@Override
	public void method2408() {
	}

	@Override
	public void method2404() {
	}

	@Override
	public void method2405() {
	}

	@Override
	public void method2400(Class137 class137_1, int i_2) {
		if (!aBool9040) {
			aGraphicalRenderer_Sub1_1664.method13654(class137_1);
			aGraphicalRenderer_Sub1_1664.method13612(i_2);
		}

	}

	@Override
	public boolean method2401() {
		return aBool9037;
	}

	@Override
	public void method2402(boolean bool_1) {
		Class137_Sub2 class137_sub2_2 = aGraphicalRenderer_Sub1_1664.method13596();
		if (aBool9037 && class137_sub2_2 != null) {
			aGraphicalRenderer_Sub1_1664.method13610(1);
			aGraphicalRenderer_Sub1_1664.method13654(class137_sub2_2);
			aGraphicalRenderer_Sub1_1664.method13610(0);
			aGraphicalRenderer_Sub1_1664.method13654(aClass136_9042.aClass137_Sub4_1638);
			int i_3 = aClass128_9041.anInt1583;
			OpenGL.glUseProgram(i_3);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_3, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_3, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_3, "sunDir"), -aGraphicalRenderer_Sub1_1664.aFloatArray8426[0], -aGraphicalRenderer_Sub1_1664.aFloatArray8426[1], -aGraphicalRenderer_Sub1_1664.aFloatArray8426[2]);
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_3, "sunColour"), aGraphicalRenderer_Sub1_1664.aFloat8429, aGraphicalRenderer_Sub1_1664.aFloat8430, aGraphicalRenderer_Sub1_1664.aFloat8431, 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_3, "sunExponent"), 96.0F + Math.abs(aGraphicalRenderer_Sub1_1664.aFloatArray8426[1]) * 928.0F);
			aBool9040 = true;
		}

	}

	@Override
	public void method2403(boolean bool_1) {
		Class137_Sub2 class137_sub2_2 = aGraphicalRenderer_Sub1_1664.method13596();
		if (aBool9037 && class137_sub2_2 != null) {
			aGraphicalRenderer_Sub1_1664.method13610(1);
			aGraphicalRenderer_Sub1_1664.method13654(class137_sub2_2);
			aGraphicalRenderer_Sub1_1664.method13610(0);
			aGraphicalRenderer_Sub1_1664.method13654(aClass136_9042.aClass137_Sub4_1638);
			int i_3 = aClass128_9041.anInt1583;
			OpenGL.glUseProgram(i_3);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_3, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_3, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_3, "sunDir"), -aGraphicalRenderer_Sub1_1664.aFloatArray8426[0], -aGraphicalRenderer_Sub1_1664.aFloatArray8426[1], -aGraphicalRenderer_Sub1_1664.aFloatArray8426[2]);
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_3, "sunColour"), aGraphicalRenderer_Sub1_1664.aFloat8429, aGraphicalRenderer_Sub1_1664.aFloat8430, aGraphicalRenderer_Sub1_1664.aFloat8431, 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_3, "sunExponent"), 96.0F + Math.abs(aGraphicalRenderer_Sub1_1664.aFloatArray8426[1]) * 928.0F);
			aBool9040 = true;
		}

	}

	@Override
	public void method2399(int i_1, int i_2) {
		if (aBool9040) {
			int i_3 = 1 << (i_1 & 0x3);
			float f_4 = (1 << (i_1 >> 3 & 0x7)) / 32.0F;
			int i_5 = i_2 & 0xffff;
			float f_6 = (i_2 >> 16 & 0x3) / 8.0F;
			int i_7 = aClass128_9041.anInt1583;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7, "time"), (aGraphicalRenderer_Sub1_1664.anInt8368 * i_3 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7, "scale"), f_4);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7, "breakWaterDepth"), i_5);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7, "breakWaterOffset"), f_6);
		}

	}

	@Override
	public void method2406() {
	}

	@Override
	public void method2407() {
	}

	@Override
	public void method2411() {
		if (aBool9040) {
			aGraphicalRenderer_Sub1_1664.method13610(1);
			aGraphicalRenderer_Sub1_1664.method13654(null);
			aGraphicalRenderer_Sub1_1664.method13610(0);
			aGraphicalRenderer_Sub1_1664.method13654(null);
			OpenGL.glUseProgram(0);
			aBool9040 = false;
		}

	}

	@Override
	public void method2409(int i_1, int i_2) {
		if (aBool9040) {
			int i_3 = 1 << (i_1 & 0x3);
			float f_4 = (1 << (i_1 >> 3 & 0x7)) / 32.0F;
			int i_5 = i_2 & 0xffff;
			float f_6 = (i_2 >> 16 & 0x3) / 8.0F;
			int i_7 = aClass128_9041.anInt1583;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7, "time"), (i_3 * aGraphicalRenderer_Sub1_1664.anInt8368 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7, "scale"), f_4);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7, "breakWaterDepth"), i_5);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7, "breakWaterOffset"), f_6);
		}

	}

	@Override
	public void method2396(int i_1, int i_2) {
		if (aBool9040) {
			int i_3 = 1 << (i_1 & 0x3);
			float f_4 = (1 << (i_1 >> 3 & 0x7)) / 32.0F;
			int i_5 = i_2 & 0xffff;
			float f_6 = (i_2 >> 16 & 0x3) / 8.0F;
			int i_7 = aClass128_9041.anInt1583;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7, "time"), (i_3 * aGraphicalRenderer_Sub1_1664.anInt8368 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7, "scale"), f_4);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7, "breakWaterDepth"), i_5);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7, "breakWaterOffset"), f_6);
		}

	}

	@Override
	public void method2410(int i_1, int i_2) {
		if (aBool9040) {
			int i_3 = 1 << (i_1 & 0x3);
			float f_4 = (1 << (i_1 >> 3 & 0x7)) / 32.0F;
			int i_5 = i_2 & 0xffff;
			float f_6 = (i_2 >> 16 & 0x3) / 8.0F;
			int i_7 = aClass128_9041.anInt1583;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7, "time"), (i_3 * aGraphicalRenderer_Sub1_1664.anInt8368 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7, "scale"), f_4);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7, "breakWaterDepth"), i_5);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7, "breakWaterOffset"), f_6);
		}

	}

	@Override
	public void method2394(Class137 class137_1, int i_2) {
		if (!aBool9040) {
			aGraphicalRenderer_Sub1_1664.method13654(class137_1);
			aGraphicalRenderer_Sub1_1664.method13612(i_2);
		}

	}

	@Override
	public void method2412(Class137 class137_1, int i_2) {
		if (!aBool9040) {
			aGraphicalRenderer_Sub1_1664.method13654(class137_1);
			aGraphicalRenderer_Sub1_1664.method13612(i_2);
		}

	}

	@Override
	public void method2413(Class137 class137_1, int i_2) {
		if (!aBool9040) {
			aGraphicalRenderer_Sub1_1664.method13654(class137_1);
			aGraphicalRenderer_Sub1_1664.method13612(i_2);
		}

	}

	@Override
	public void method2414(Class137 class137_1, int i_2) {
		if (!aBool9040) {
			aGraphicalRenderer_Sub1_1664.method13654(class137_1);
			aGraphicalRenderer_Sub1_1664.method13612(i_2);
		}

	}

}
