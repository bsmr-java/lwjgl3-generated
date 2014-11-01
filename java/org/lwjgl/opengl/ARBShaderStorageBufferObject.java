/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/shader_storage_buffer_object.txt">ARB_shader_storage_buffer_object</a> extension.
 * 
 * <p>This extension provides the ability for OpenGL shaders to perform random access reads, writes, and atomic memory operations on variables stored in a
 * buffer object. Application shader code can declare sets of variables (referred to as "buffer variables") arranged into interface blocks in a manner
 * similar to that done with uniform blocks in OpenGL 3.1. In both cases, the values of the variables declared in a given interface block are taken from a
 * buffer object bound to a binding point associated with the block. Buffer objects used in this extension are referred to as "shader storage buffers".</p>
 * 
 * <p>While the capability provided by this extension is similar to that provided by OpenGL 3.1 and {@link ARBUniformBufferObject ARB_uniform_buffer_object}, there are several
 * significant differences. Most importantly, shader code is allowed to write to shader storage buffers, while uniform buffers are always read-only. Shader
 * storage buffers have a separate set of binding points, with different counts and size limits. The maximum usable size for shader storage buffers is
 * implementation-dependent, but its minimum value is substantially larger than the minimum for uniform buffers.</p>
 * 
 * <p>The ability to write to buffer objects creates the potential for multiple independent shader invocations to read and write the same underlying memory.
 * The same issue exists with the {@link ARBShaderImageLoadStore ARB_shader_image_load_store} extension provided in OpenGL 4.2, which can write to texture objects and buffers. In
 * both cases, the specification makes few guarantees related to the relative order of memory reads and writes performed by the shader invocations. For
 * ARB_shader_image_load_store, the OpenGL API and shading language do provide some control over memory transactions; those mechanisms also affect reads
 * and writes of shader storage buffers. In the OpenGL API, the {@link GL42#glMemoryBarrier MemoryBarrier} call can be used to ensure that certain memory operations related to
 * commands issued prior the barrier complete before other operations related to commands issued after the barrier. Additionally, the shading language
 * provides the <pre><code style="font-family: monospace">
 * memoryBarrier()</code></pre> function to control the relative order of memory accesses within individual shader invocations and provides
 * various memory qualifiers controlling how the memory corresponding to individual variables is accessed.</p>
 * 
 * <p>Requires {@link GL40 OpenGL 4.0} and {@link GL43 OpenGL 4.3} or {@link ARBProgramInterfaceQuery ARB_program_interface_query}. Promoted to core in {@link GL43 OpenGL 4.3}.</p>
 */
public final class ARBShaderStorageBufferObject {

	/** Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, and GetBufferPointerv. */
	public static final int
		GL_SHADER_STORAGE_BUFFER = 0x90D2;

	/**
	 * Accepted by the {@code pname} parameter of GetIntegerv, GetIntegeri_v, GetBooleanv, GetInteger64v, GetFloatv, GetDoublev, GetBooleani_v, GetIntegeri_v,
	 * GetFloati_v, GetDoublei_v, and GetInteger64i_v.
	 */
	public static final int
		GL_SHADER_STORAGE_BUFFER_BINDING = 0x90D3;

	/** Accepted by the {@code pname} parameter of GetIntegeri_v, GetBooleani_v, GetIntegeri_v, GetFloati_v, GetDoublei_v, and GetInteger64i_v. */
	public static final int
		GL_SHADER_STORAGE_BUFFER_START = 0x90D4,
		GL_SHADER_STORAGE_BUFFER_SIZE  = 0x90D5;

	/** Accepted by the {@code pname} parameter of GetIntegerv, GetBooleanv, GetInteger64v, GetFloatv, and GetDoublev. */
	public static final int
		GL_MAX_VERTEX_SHADER_STORAGE_BLOCKS          = 0x90D6,
		GL_MAX_GEOMETRY_SHADER_STORAGE_BLOCKS        = 0x90D7,
		GL_MAX_TESS_CONTROL_SHADER_STORAGE_BLOCKS    = 0x90D8,
		GL_MAX_TESS_EVALUATION_SHADER_STORAGE_BLOCKS = 0x90D9,
		GL_MAX_FRAGMENT_SHADER_STORAGE_BLOCKS        = 0x90DA,
		GL_MAX_COMPUTE_SHADER_STORAGE_BLOCKS         = 0x90DB,
		GL_MAX_COMBINED_SHADER_STORAGE_BLOCKS        = 0x90DC,
		GL_MAX_SHADER_STORAGE_BUFFER_BINDINGS        = 0x90DD,
		GL_MAX_SHADER_STORAGE_BLOCK_SIZE             = 0x90DE,
		GL_SHADER_STORAGE_BUFFER_OFFSET_ALIGNMENT    = 0x90DF;

	/** Accepted in the {@code barriers} bitfield in glMemoryBarrier. */
	public static final int
		GL_SHADER_STORAGE_BARRIER_BIT = 0x2000;

	/** Also, add a new alias for the existing token MAX_COMBINED_IMAGE_UNITS_AND_FRAGMENT_OUTPUTS. */
	public static final int
		GL_MAX_COMBINED_SHADER_OUTPUT_RESOURCES = 0x8F39;

	/** Function address. */
	@JavadocExclude
	public final long ShaderStorageBlockBinding;

	@JavadocExclude
	public ARBShaderStorageBufferObject(FunctionProvider provider) {
		ShaderStorageBlockBinding = provider.getFunctionAddress("glShaderStorageBlockBinding");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBShaderStorageBufferObject} instance for the current context. */
	public static ARBShaderStorageBufferObject getInstance() {
		return GL.getCapabilities().__ARBShaderStorageBufferObject;
	}

	static ARBShaderStorageBufferObject create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_shader_storage_buffer_object") ) return null;

		ARBShaderStorageBufferObject funcs = new ARBShaderStorageBufferObject(provider);

		boolean supported = checkFunctions(
			funcs.ShaderStorageBlockBinding
		);

		return GL.checkExtension("GL_ARB_shader_storage_buffer_object", funcs, supported);
	}

	// --- [ glShaderStorageBlockBinding ] ---

	/**
	 * Changes an active shader storage block binding.
	 *
	 * @param program             the name of the program containing the block whose binding to change
	 * @param storageBlockIndex   the index storage block within the program
	 * @param storageBlockBinding the index storage block binding to associate with the specified storage block
	 */
	public static void glShaderStorageBlockBinding(int program, int storageBlockIndex, int storageBlockBinding) {
		long __functionAddress = getInstance().ShaderStorageBlockBinding;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		GL43.nglShaderStorageBlockBinding(program, storageBlockIndex, storageBlockBinding, __functionAddress);
	}

}