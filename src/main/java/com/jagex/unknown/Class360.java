package com.jagex.unknown;

import com.jagex.DirectXRenderer;
import com.jagex.Interface7;
import jagdx.IUnknown;

public abstract class Class360 implements Interface7 {

	public long aLong4168;
	public DirectXRenderer aGraphicalRenderer_Sub2_Sub2_4165;
	public Class150 aClass150_4167;
	public Class76 aClass76_4164;
	public boolean aBool4166;

	public Class360(DirectXRenderer class505_sub2_sub2_1, Class150 class150_2, Class76 class76_3, boolean bool_4) {
		aGraphicalRenderer_Sub2_Sub2_4165 = class505_sub2_sub2_1;
		aClass150_4167 = class150_2;
		aClass76_4164 = class76_3;
		aBool4166 = bool_4;
		aGraphicalRenderer_Sub2_Sub2_4165.method13901(this);
	}

	public long method6245() {
		return aLong4168;
	}

	public void method205(Class35 class35_1) {
	}

	@Override
	public void method26() {
		if (aLong4168 != 0L) {
			IUnknown.Release(aLong4168);
			aLong4168 = 0L;
		}

		aGraphicalRenderer_Sub2_Sub2_4165.method13885(this);
	}

	public void method6246() {
		if (aLong4168 != 0L) {
			aGraphicalRenderer_Sub2_Sub2_4165.method15650(aLong4168);
			aLong4168 = 0L;
		}

	}

	@Override
	public void method32() {
		if (aLong4168 != 0L) {
			IUnknown.Release(aLong4168);
			aLong4168 = 0L;
		}

		aGraphicalRenderer_Sub2_Sub2_4165.method13885(this);
	}

	@Override
	protected void finalize() {
		method6246();
	}

}
