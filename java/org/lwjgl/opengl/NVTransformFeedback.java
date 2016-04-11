/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/transform_feedback.txt">NV_transform_feedback</a> extension.
 * 
 * <p>This extension provides a new mode to the GL, called transform feedback, which records vertex attributes of the primitives processed by the GL. The
 * selected attributes are written into buffer objects, and can be written with each attribute in a separate buffer object or with all attributes
 * interleaved into a single buffer object. If a geometry program or shader is active, the primitives recorded are those emitted by the geometry program.
 * Otherwise, transform feedback captures primitives whose vertex are transformed by a vertex program or shader, or by fixed-function vertex processing.
 * In either case, the primitives captured are those generated prior to clipping. Transform feedback mode is capable of capturing transformed vertex data
 * generated by fixed-function vertex processing, outputs from assembly vertex or geometry programs, or varying variables emitted from GLSL vertex or
 * geometry shaders.</p>
 * 
 * <p>The vertex data recorded in transform feedback mode is stored into buffer objects as an array of vertex attributes. The regular representation and the
 * use of buffer objects allows the recorded data to be processed directly by the GL without requiring CPU intervention to copy data. In particular,
 * transform feedback data can be used for vertex arrays (via vertex buffer objects), as the source for pixel data (via pixel buffer objects), as program
 * constant data (via the NV_parameter_buffer_object or EXT_bindable_uniform extension), or via any other extension that makes use of buffer objects.</p>
 * 
 * <p>This extension introduces new query object support to allow transform feedback mode to operate asynchronously. Query objects allow applications to
 * determine when transform feedback results are complete, as well as the number of primitives processed and written back to buffer objects while in
 * transform feedback mode. This extension also provides a new rasterizer discard enable, which allows applications to use transform feedback to capture
 * vertex attributes without rendering anything.</p>
 * 
 * <p>Requires {@link GL15 OpenGL 1.5}.</p>
 */
public class NVTransformFeedback {

	/**
	 * Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, GetBufferPointerv,
	 * BindBufferRangeNV, BindBufferOffsetNV and BindBufferBaseNV.
	 */
	public static final int GL_TRANSFORM_FEEDBACK_BUFFER_NV = 0x8C8E;

	/** Accepted by the {@code param} parameter of GetIntegerIndexedvEXT and GetBooleanIndexedvEXT. */
	public static final int
		GL_TRANSFORM_FEEDBACK_BUFFER_START_NV = 0x8C84,
		GL_TRANSFORM_FEEDBACK_BUFFER_SIZE_NV  = 0x8C85,
		GL_TRANSFORM_FEEDBACK_RECORD_NV       = 0x8C86;

	/**
	 * Accepted by the {@code param} parameter of GetIntegerIndexedvEXT and GetBooleanIndexedvEXT, and by the {@code pname} parameter of GetBooleanv,
	 * GetDoublev, GetIntegerv, and GetFloatv.
	 */
	public static final int GL_TRANSFORM_FEEDBACK_BUFFER_BINDING_NV = 0x8C8F;

	/** Accepted by the {@code bufferMode} parameter of TransformFeedbackAttribsNV and TransformFeedbackVaryingsNV. */
	public static final int
		GL_INTERLEAVED_ATTRIBS_NV = 0x8C8C,
		GL_SEPARATE_ATTRIBS_NV    = 0x8C8D;

	/** Accepted by the {@code target} parameter of BeginQuery, EndQuery, and GetQueryiv. */
	public static final int
		GL_PRIMITIVES_GENERATED_NV                  = 0x8C87,
		GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN_NV = 0x8C88;

	/**
	 * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
	 * GetDoublev.
	 */
	public static final int GL_RASTERIZER_DISCARD_NV = 0x8C89;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv. */
	public static final int
		GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS_NV = 0x8C8A,
		GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS_NV       = 0x8C8B,
		GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS_NV    = 0x8C80,
		GL_TRANSFORM_FEEDBACK_ATTRIBS_NV                    = 0x8C7E;

	/** Accepted by the {@code pname} parameter of GetProgramiv. */
	public static final int
		GL_ACTIVE_VARYINGS_NV             = 0x8C81,
		GL_ACTIVE_VARYING_MAX_LENGTH_NV   = 0x8C82,
		GL_TRANSFORM_FEEDBACK_VARYINGS_NV = 0x8C83;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, GetFloatv, and GetProgramiv. */
	public static final int GL_TRANSFORM_FEEDBACK_BUFFER_MODE_NV = 0x8C7F;

	/** Accepted by the {@code attribs} parameter of TransformFeedbackAttribsNV. */
	public static final int
		GL_BACK_PRIMARY_COLOR_NV   = 0x8C77,
		GL_BACK_SECONDARY_COLOR_NV = 0x8C78,
		GL_TEXTURE_COORD_NV        = 0x8C79,
		GL_CLIP_DISTANCE_NV        = 0x8C7A,
		GL_VERTEX_ID_NV            = 0x8C7B,
		GL_PRIMITIVE_ID_NV         = 0x8C7C,
		GL_GENERIC_ATTRIB_NV       = 0x8C7D,
		GL_SECONDARY_COLOR_NV      = 0x852D,
		GL_LAYER_NV                = 0x8DAA;

	protected NVTransformFeedback() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glBeginTransformFeedbackNV, caps.glEndTransformFeedbackNV, caps.glTransformFeedbackAttribsNV, caps.glBindBufferRangeNV, 
			caps.glBindBufferOffsetNV, caps.glBindBufferBaseNV, caps.glTransformFeedbackVaryingsNV, caps.glActiveVaryingNV, caps.glGetVaryingLocationNV, 
			caps.glGetActiveVaryingNV, caps.glGetTransformFeedbackVaryingNV, caps.glTransformFeedbackStreamAttribsNV
		);
	}

	// --- [ glBeginTransformFeedbackNV ] ---

	public static void glBeginTransformFeedbackNV(int primitiveMode) {
		long __functionAddress = GL.getCapabilities().glBeginTransformFeedbackNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIV(__functionAddress, primitiveMode);
	}

	// --- [ glEndTransformFeedbackNV ] ---

	public static void glEndTransformFeedbackNV() {
		long __functionAddress = GL.getCapabilities().glEndTransformFeedbackNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress);
	}

	// --- [ glTransformFeedbackAttribsNV ] ---

	public static void nglTransformFeedbackAttribsNV(int count, long attribs, int bufferMode) {
		long __functionAddress = GL.getCapabilities().glTransformFeedbackAttribsNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIPIV(__functionAddress, count, attribs, bufferMode);
	}

	public static void glTransformFeedbackAttribsNV(IntBuffer attribs, int bufferMode) {
		nglTransformFeedbackAttribsNV(attribs.remaining(), memAddress(attribs), bufferMode);
	}

	// --- [ glBindBufferRangeNV ] ---

	public static void glBindBufferRangeNV(int target, int index, int buffer, long offset, long size) {
		long __functionAddress = GL.getCapabilities().glBindBufferRangeNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPPV(__functionAddress, target, index, buffer, offset, size);
	}

	// --- [ glBindBufferOffsetNV ] ---

	public static void glBindBufferOffsetNV(int target, int index, int buffer, long offset) {
		long __functionAddress = GL.getCapabilities().glBindBufferOffsetNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPV(__functionAddress, target, index, buffer, offset);
	}

	// --- [ glBindBufferBaseNV ] ---

	public static void glBindBufferBaseNV(int target, int index, int buffer) {
		long __functionAddress = GL.getCapabilities().glBindBufferBaseNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIV(__functionAddress, target, index, buffer);
	}

	// --- [ glTransformFeedbackVaryingsNV ] ---

	public static void nglTransformFeedbackVaryingsNV(int program, int count, long locations, int bufferMode) {
		long __functionAddress = GL.getCapabilities().glTransformFeedbackVaryingsNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIPIV(__functionAddress, program, count, locations, bufferMode);
	}

	public static void glTransformFeedbackVaryingsNV(int program, IntBuffer locations, int bufferMode) {
		nglTransformFeedbackVaryingsNV(program, locations.remaining(), memAddress(locations), bufferMode);
	}

	// --- [ glActiveVaryingNV ] ---

	public static void nglActiveVaryingNV(int program, long name) {
		long __functionAddress = GL.getCapabilities().glActiveVaryingNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIPV(__functionAddress, program, name);
	}

	public static void glActiveVaryingNV(int program, ByteBuffer name) {
		if ( CHECKS )
			checkNT1(name);
		nglActiveVaryingNV(program, memAddress(name));
	}

	public static void glActiveVaryingNV(int program, CharSequence name) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer nameEncoded = stack.ASCII(name);
			nglActiveVaryingNV(program, memAddress(nameEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetVaryingLocationNV ] ---

	public static int nglGetVaryingLocationNV(int program, long name) {
		long __functionAddress = GL.getCapabilities().glGetVaryingLocationNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callIPI(__functionAddress, program, name);
	}

	public static int glGetVaryingLocationNV(int program, ByteBuffer name) {
		if ( CHECKS )
			checkNT1(name);
		return nglGetVaryingLocationNV(program, memAddress(name));
	}

	public static int glGetVaryingLocationNV(int program, CharSequence name) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer nameEncoded = stack.ASCII(name);
			return nglGetVaryingLocationNV(program, memAddress(nameEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetActiveVaryingNV ] ---

	public static void nglGetActiveVaryingNV(int program, int index, int bufSize, long length, long size, long type, long name) {
		long __functionAddress = GL.getCapabilities().glGetActiveVaryingNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIIPPPPV(__functionAddress, program, index, bufSize, length, size, type, name);
	}

	public static void glGetActiveVaryingNV(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
		if ( CHECKS ) {
			if ( length != null ) checkBuffer(length, 1);
			checkBuffer(size, 1);
			checkBuffer(type, 1);
		}
		nglGetActiveVaryingNV(program, index, name.remaining(), memAddressSafe(length), memAddress(size), memAddress(type), memAddress(name));
	}

	// --- [ glGetTransformFeedbackVaryingNV ] ---

	public static void nglGetTransformFeedbackVaryingNV(int program, int index, long location) {
		long __functionAddress = GL.getCapabilities().glGetTransformFeedbackVaryingNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIIPV(__functionAddress, program, index, location);
	}

	public static void glGetTransformFeedbackVaryingNV(int program, int index, IntBuffer location) {
		if ( CHECKS )
			checkBuffer(location, 1);
		nglGetTransformFeedbackVaryingNV(program, index, memAddress(location));
	}

	public static int glGetTransformFeedbackVaryingNV(int program, int index) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer location = stack.callocInt(1);
			nglGetTransformFeedbackVaryingNV(program, index, memAddress(location));
			return location.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glTransformFeedbackStreamAttribsNV ] ---

	public static void nglTransformFeedbackStreamAttribsNV(int count, long attribs, int nbuffers, long bufstreams, int bufferMode) {
		long __functionAddress = GL.getCapabilities().glTransformFeedbackStreamAttribsNV;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callIPIPIV(__functionAddress, count, attribs, nbuffers, bufstreams, bufferMode);
	}

	public static void glTransformFeedbackStreamAttribsNV(IntBuffer attribs, IntBuffer bufstreams, int bufferMode) {
		nglTransformFeedbackStreamAttribsNV(attribs.remaining(), memAddress(attribs), bufstreams.remaining(), memAddress(bufstreams), bufferMode);
	}

}