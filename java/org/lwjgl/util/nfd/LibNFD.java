/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.nfd;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Initializes the nfd shared library. */
final class LibNFD {

	static {
		String libName = Platform.mapLibraryNameBundled("lwjgl_nfd");
		Library.loadSystem(libName);

		MemoryAllocator allocator = getAllocator();
		setupMalloc(
			allocator.getMalloc(),
			allocator.getCalloc(),
			allocator.getRealloc(),
			allocator.getFree(),
			allocator.getAlignedAlloc(),
			allocator.getAlignedFree()
		);
	}

	private LibNFD() {
	}

	static void initialize() {
		// intentionally empty to trigger static initializer
	}

	private static native void setupMalloc(
		long malloc,
		long calloc,
		long realloc,
		long free,
		long aligned_alloc,
		long aligned_free
	);

}
