/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/egl/extensions/NV/EGL_NV_system_time.txt">NV_system_time</a> extension.
 * 
 * <p>This extension exposes an alternative method of querying the system time from the driver instead of the operating system.</p>
 * 
 * <p>Requires {@link EGL12 EGL L.1}.</p>
 */
public final class NVSystemTime {

	/** Function address. */
	@JavadocExclude
	public final long
		GetSystemTimeFrequencyNV,
		GetSystemTimeNV;

	@JavadocExclude
	public NVSystemTime(FunctionProvider provider) {
		GetSystemTimeFrequencyNV = provider.getFunctionAddress("eglGetSystemTimeFrequencyNV");
		GetSystemTimeNV = provider.getFunctionAddress("eglGetSystemTimeNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link NVSystemTime} instance. */
	public static NVSystemTime getInstance() {
		return checkFunctionality(EGL.getCapabilities().__NVSystemTime);
	}

	static NVSystemTime create(FunctionProvider provider) {
		NVSystemTime funcs = new NVSystemTime(provider);

		boolean supported = checkFunctions(
			funcs.GetSystemTimeFrequencyNV, funcs.GetSystemTimeNV
		);

		return supported ? funcs : null;
	}

	// --- [ eglGetSystemTimeFrequencyNV ] ---

	/** JNI method for {@link #eglGetSystemTimeFrequencyNV GetSystemTimeFrequencyNV} */
	@JavadocExclude
	public static native long neglGetSystemTimeFrequencyNV(long __functionAddress);

	public static long eglGetSystemTimeFrequencyNV() {
		long __functionAddress = getInstance().GetSystemTimeFrequencyNV;
		return neglGetSystemTimeFrequencyNV(__functionAddress);
	}

	// --- [ eglGetSystemTimeNV ] ---

	/** JNI method for {@link #eglGetSystemTimeNV GetSystemTimeNV} */
	@JavadocExclude
	public static native long neglGetSystemTimeNV(long __functionAddress);

	public static long eglGetSystemTimeNV() {
		long __functionAddress = getInstance().GetSystemTimeNV;
		return neglGetSystemTimeNV(__functionAddress);
	}

}