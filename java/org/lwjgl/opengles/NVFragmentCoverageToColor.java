/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/NV/fragment_coverage_to_color.txt">NV_fragment_coverage_to_color</a> extension.
 * 
 * <p>This extension allows the fragment coverage value, represented as an integer bitfield, to be substituted for a color output being written to a
 * single-component color buffer with integer components (e.g., R8UI). The capability provided by this extension is different from simply writing the
 * gl_SampleMask fragment shader output in that the coverage value written to the framebuffer is taken after alpha test, stencil test, and depth test, as
 * well as after the multisample fragment operations such as alpha-to-coverage.</p>
 * 
 * <p>This functionality may be useful for deferred rendering algorithms, where the second pass needs to know which samples belong to which original
 * fragments.</p>
 */
public class NVFragmentCoverageToColor {

	/** Accepted by the {@code cap} parameter of Enable, Disable, IsEnabled. */
	public static final int GL_FRAGMENT_COVERAGE_TO_COLOR_NV = 0x92DD;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv. */
	public static final int GL_FRAGMENT_COVERAGE_COLOR_NV = 0x92DE;

	protected NVFragmentCoverageToColor() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLESCapabilities caps) {
		return checkFunctions(
			caps.glFragmentCoverageColorNV
		);
	}

	// --- [ glFragmentCoverageColorNV ] ---

	public static void glFragmentCoverageColorNV(int color) {
		long __functionAddress = GLES.getCapabilities().glFragmentCoverageColorNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, color);
	}

}