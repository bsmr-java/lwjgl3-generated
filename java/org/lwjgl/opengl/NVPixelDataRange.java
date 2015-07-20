/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/pixel_data_range.txt">NV_pixel_data_range</a> extension.
 * 
 * <p>The vertex array range extension is intended to improve the efficiency of OpenGL vertex arrays. OpenGL vertex arrays' coherency model and ability to
 * access memory from arbitrary locations in memory prevented implementations from using DMA (Direct Memory Access) operations.</p>
 * 
 * <p>Many image-intensive applications, such as those that use dynamically generated textures, face similar problems. These applications would like to be
 * able to sustain throughputs of hundreds of millions of pixels per second through DrawPixels and hundreds of millions of texels per second through
 * TexSubImage.</p>
 * 
 * <p>However, the same restrictions that limited vertex throughput also limit pixel throughput.</p>
 * 
 * <p>By the time that any pixel operation that reads data from user memory returns, OpenGL requires that it must be safe for the application to start using
 * that memory for a different purpose. This coherency model prevents asynchronous DMA transfers directly out of the user's buffer.</p>
 * 
 * <p>There are also no restrictions on the pointer provided to pixel operations or on the size of the data. To facilitate DMA implementations, the driver
 * needs to know in advance what region of the address space to lock down.</p>
 * 
 * <p>Vertex arrays faced both of these restrictions already, but pixel operations have one additional complicating factor -- they are bidirectional. Vertex
 * array data is always being transfered from the application to the driver and the HW, whereas pixel operations sometimes transfer data to the
 * application from the driver and HW. Note that the types of memory that are suitable for DMA for reading and writing purposes are often different. For
 * example, on many PC platforms, DMA pulling is best accomplished with write-combined (uncached) AGP memory, while pushing data should use cached memory
 * so that the application can read the data efficiently once it has been read back over the AGP bus.</p>
 * 
 * <p>This extension defines an API where an application can specify two pixel data ranges, which are analogous to vertex array ranges, except that one is
 * for operations where the application is reading data (e.g. glReadPixels) and one is for operations where the application is writing data (e.g.
 * glDrawPixels, glTexSubImage2D, etc.). Each pixel data range has a pointer to its start and a length in bytes.</p>
 * 
 * <p>When the pixel data range is enabled, and if the pointer specified as the argument to a pixel operation is inside the corresponding pixel data range,
 * the implementation may choose to asynchronously pull data from the pixel data range or push data to the pixel data range. Data pulled from outside the
 * pixel data range is undefined, while pushing data to outside the pixel data range produces undefined results.</p>
 * 
 * <p>The application may synchronize with the hardware in one of two ways: by flushing the pixel data range (or causing an implicit flush) or by using the
 * NV_fence extension to insert fences in the command stream.</p>
 */
public final class NVPixelDataRange {

	/**
	 * Accepted by the {@code target} parameter of PixelDataRangeNV and FlushPixelDataRangeNV, and by the {@code cap} parameter of EnableClientState,
	 * DisableClientState, and IsEnabled.
	 */
	public static final int
		GL_WRITE_PIXEL_DATA_RANGE_NV = 0x8878,
		GL_READ_PIXEL_DATA_RANGE_NV  = 0x8879;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_WRITE_PIXEL_DATA_RANGE_LENGTH_NV = 0x887A,
		GL_READ_PIXEL_DATA_RANGE_LENGTH_NV  = 0x887B;

	/** Accepted by the {@code pname} parameter of GetPointerv. */
	public static final int
		GL_WRITE_PIXEL_DATA_RANGE_POINTER_NV = 0x887C,
		GL_READ_PIXEL_DATA_RANGE_POINTER_NV  = 0x887D;

	/** Function address. */
	@JavadocExclude
	public final long
		PixelDataRangeNV,
		FlushPixelDataRangeNV;

	@JavadocExclude
	public NVPixelDataRange(FunctionProvider provider) {
		PixelDataRangeNV = provider.getFunctionAddress("glPixelDataRangeNV");
		FlushPixelDataRangeNV = provider.getFunctionAddress("glFlushPixelDataRangeNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link NVPixelDataRange} instance for the current context. */
	public static NVPixelDataRange getInstance() {
		return checkFunctionality(GL.getCapabilities().__NVPixelDataRange);
	}

	static NVPixelDataRange create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_NV_pixel_data_range") ) return null;

		NVPixelDataRange funcs = new NVPixelDataRange(provider);

		boolean supported = checkFunctions(
			funcs.PixelDataRangeNV, funcs.FlushPixelDataRangeNV
		);

		return GL.checkExtension("GL_NV_pixel_data_range", funcs, supported);
	}

	// --- [ glPixelDataRangeNV ] ---

	/** JNI method for {@link #glPixelDataRangeNV PixelDataRangeNV} */
	@JavadocExclude
	public static native void nglPixelDataRangeNV(int target, int length, long pointer, long __functionAddress);

	/** Unsafe version of {@link #glPixelDataRangeNV PixelDataRangeNV} */
	@JavadocExclude
	public static void nglPixelDataRangeNV(int target, int length, long pointer) {
		long __functionAddress = getInstance().PixelDataRangeNV;
		nglPixelDataRangeNV(target, length, pointer, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param target  
	 * @param length  
	 * @param pointer 
	 */
	public static void glPixelDataRangeNV(int target, int length, ByteBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(pointer, length);
		nglPixelDataRangeNV(target, length, memAddress(pointer));
	}

	/** Alternative version of: {@link #glPixelDataRangeNV PixelDataRangeNV} */
	public static void glPixelDataRangeNV(int target, ByteBuffer pointer) {
		nglPixelDataRangeNV(target, pointer.remaining(), memAddress(pointer));
	}

	// --- [ glFlushPixelDataRangeNV ] ---

	/** JNI method for {@link #glFlushPixelDataRangeNV FlushPixelDataRangeNV} */
	@JavadocExclude
	public static native void nglFlushPixelDataRangeNV(int target, long __functionAddress);

	/**
	 * 
	 *
	 * @param target 
	 */
	public static void glFlushPixelDataRangeNV(int target) {
		long __functionAddress = getInstance().FlushPixelDataRangeNV;
		nglFlushPixelDataRangeNV(target, __functionAddress);
	}

}