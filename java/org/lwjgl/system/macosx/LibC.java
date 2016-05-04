/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.macosx;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/** Native bindings to libc, the Standard C Library. */
public class LibC {

	protected LibC() {
		throw new UnsupportedOperationException();
	}

	/** Contains the function pointers loaded from {@code LibSystem.getLibrary()}. */
	public static final class Functions {

		private Functions() {}

		/** Function address. */
		public static final long
			getpid = apiGetFunctionAddress(LibSystem.getLibrary(), "getpid");

	}

	// --- [ getpid ] ---

	/** Returns the process ID of the calling process. */
	public static long getpid() {
		long __functionAddress = Functions.getpid;
		return invokeP(__functionAddress);
	}

}