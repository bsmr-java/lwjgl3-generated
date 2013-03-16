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

/** The core OpenGL 1.2 functionality. */
public final class GL12 {

	/** Aliases for smooth points and lines. */
	public static final int
		GL_ALIASED_POINT_SIZE_RANGE      = 0x846D,
		GL_ALIASED_LINE_WIDTH_RANGE      = 0x846E,
		GL_SMOOTH_POINT_SIZE_RANGE       = 0xB12,
		GL_SMOOTH_POINT_SIZE_GRANULARITY = 0xB13,
		GL_SMOOTH_LINE_WIDTH_RANGE       = 0xB22,
		GL_SMOOTH_LINE_WIDTH_GRANULARITY = 0xB23;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev, and by the {@code pname} parameter of PixelStore. */
	public static final int
		GL_PACK_SKIP_IMAGES    = 0x806B,
		GL_PACK_IMAGE_HEIGHT   = 0x806C,
		GL_UNPACK_SKIP_IMAGES  = 0x806D,
		GL_UNPACK_IMAGE_HEIGHT = 0x806E;

	/**
	 * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
	 * GetDoublev, and by the {@code target} parameter of TexImage3D, GetTexImage, GetTexLevelParameteriv, GetTexLevelParameterfv, GetTexParameteriv, and
	 * GetTexParameterfv.
	 */
	public static final int
		GL_TEXTURE_3D = 0x806F;

	/** Accepted by the {@code target} parameter of TexImage3D, GetTexLevelParameteriv, and GetTexLevelParameterfv. */
	public static final int
		GL_PROXY_TEXTURE_3D = 0x8070;

	/** Accepted by the {@code pname} parameter of GetTexLevelParameteriv and GetTexLevelParameterfv. */
	public static final int
		GL_TEXTURE_DEPTH = 0x8071;

	/** Accepted by the {@code pname} parameter of TexParameteriv, TexParameterfv, GetTexParameteriv, and GetTexParameterfv. */
	public static final int
		GL_TEXTURE_WRAP_R = 0x8072;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_MAX_3D_TEXTURE_SIZE = 0x8073;

	/** Accepted by the {@code format} parameter of DrawPixels, GetTexImage, ReadPixels, TexImage1D, and TexImage2D. */
	public static final int
		GL_BGR  = 0x80E0,
		GL_BGRA = 0x80E1;

	/**
	 * Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, GetTexImage, TexImage3D, TexSubImage1D, TexSubImage2D,
	 * TexSubImage3D, GetHistogram, GetMinmax, ConvolutionFilter1D, ConvolutionFilter2D, ConvolutionFilter3D, GetConvolutionFilter, SeparableFilter2D,
	 * SeparableFilter3D, GetSeparableFilter, ColorTable, GetColorTable, TexImage4D, and TexSubImage4D.
	 */
	public static final int
		GL_UNSIGNED_BYTE_3_3_2         = 0x8032,
		GL_UNSIGNED_BYTE_2_3_3_REV     = 0x8362,
		GL_UNSIGNED_SHORT_5_6_5        = 0x8363,
		GL_UNSIGNED_SHORT_5_6_5_REV    = 0x8364,
		GL_UNSIGNED_SHORT_4_4_4_4      = 0x8033,
		GL_UNSIGNED_SHORT_4_4_4_4_REV  = 0x8365,
		GL_UNSIGNED_SHORT_5_5_5_1      = 0x8034,
		GL_UNSIGNED_SHORT_1_5_5_5_REV  = 0x8366,
		GL_UNSIGNED_INT_8_8_8_8        = 0x8035,
		GL_UNSIGNED_INT_8_8_8_8_REV    = 0x8367,
		GL_UNSIGNED_INT_10_10_10_2     = 0x8036,
		GL_UNSIGNED_INT_2_10_10_10_REV = 0x8368;

	/**
	 * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
	 * GetDoublev.
	 */
	public static final int
		GL_RESCALE_NORMAL = 0x803A;

	/** Accepted by the {@code pname} parameter of LightModel*, and also by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_LIGHT_MODEL_COLOR_CONTROL = 0x81F8;

	/** Accepted by the {@code param} parameter of LightModel* when {@code pname} is  LIGHT_MODEL_COLOR_CONTROL. */
	public static final int
		GL_SINGLE_COLOR            = 0x81F9,
		GL_SEPARATE_SPECULAR_COLOR = 0x81FA;

	/**
	 * Accepted by the {@code param} parameter of TexParameteri and TexParameterf, and by the {@code params} parameter of TexParameteriv and TexParameterfv,
	 * when their {@code pname} parameter is TEXTURE_WRAP_S, TEXTURE_WRAP_T, or TEXTURE_WRAP_R.
	 */
	public static final int
		GL_CLAMP_TO_EDGE = 0x812F;

	/** Accepted by the {@code pname} parameter of TexParameteri, TexParameterf, TexParameteriv, TexParameterfv, GetTexParameteriv, and GetTexParameterfv. */
	public static final int
		GL_TEXTURE_MIN_LOD    = 0x813A,
		GL_TEXTURE_MAX_LOD    = 0x813B,
		GL_TEXTURE_BASE_LEVEL = 0x813C,
		GL_TEXTURE_MAX_LEVEL  = 0x813D;

	/** Recommended maximum amounts of vertex and index data. */
	public static final int
		GL_MAX_ELEMENTS_VERTICES = 0x80E8,
		GL_MAX_ELEMENTS_INDICES  = 0x80E9;

	private GL12() {}

	// --- [ glTexImage3D ] ---

	/** JNI method for {@link #glTexImage3D(int, int, int, int, int, int, int, int, int, ByteBuffer)} */
	public static native void nglTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, long pixels, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glTexImage3D.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies a three-dimensional texture image.
	 *
	 * @param target         the texture target. One of:<p/>{@link GL12#GL_TEXTURE_3D}, {@link GL30#GL_TEXTURE_2D_ARRAY}, {@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY}, {@link GL12#GL_PROXY_TEXTURE_3D}, {@link GL30#GL_PROXY_TEXTURE_2D_ARRAY}, {@link GL40#GL_PROXY_TEXTURE_CUBE_MAP_ARRAY}
	 * @param level          the level-of-detail number
	 * @param internalformat the texture internal format. One of:<p/>{@link GL11#GL_RED}, {@link GL30#GL_RG}, {@link GL11#GL_RGB}, {@link GL11#GL_RGBA}, {@link GL11#GL_DEPTH_COMPONENT}, {@link GL30#GL_DEPTH_STENCIL}, {@link GL30#GL_R8}, {@link GL31#GL_R8_SNORM}, {@link GL30#GL_R16}, {@link GL31#GL_R16_SNORM}, {@link GL30#GL_RG8}, {@link GL31#GL_RG8_SNORM}, {@link GL30#GL_RG16}, {@link GL31#GL_RG16_SNORM}, {@link GL11#GL_R3_G3_B2}, {@link GL11#GL_RGB4}, {@link GL11#GL_RGB5}, {@link GL41#GL_RGB565}, {@link GL11#GL_RGB8}, {@link GL31#GL_RGB8_SNORM}, {@link GL11#GL_RGB10}, {@link GL11#GL_RGB12}, {@link GL11#GL_RGB16}, {@link GL31#GL_RGB16_SNORM}, {@link GL11#GL_RGBA2}, {@link GL11#GL_RGBA4}, {@link GL11#GL_RGB5_A1}, {@link GL11#GL_RGBA8}, {@link GL31#GL_RGBA8_SNORM}, {@link GL11#GL_RGB10_A2}, {@link GL33#GL_RGB10_A2UI}, {@link GL11#GL_RGBA12}, {@link GL11#GL_RGBA16}, {@link GL31#GL_RGBA16_SNORM}, {@link GL21#GL_SRGB8}, {@link GL21#GL_SRGB8_ALPHA8}, {@link GL30#GL_R16F}, {@link GL30#GL_RG16F}, {@link GL30#GL_RGB16F}, {@link GL30#GL_RGBA16F}, {@link GL30#GL_R32F}, {@link GL30#GL_RG32F}, {@link GL30#GL_RGB32F}, {@link GL30#GL_RGBA32F}, {@link GL30#GL_R11F_G11F_B10F}, {@link GL30#GL_RGB9_E5}, {@link GL30#GL_R8I}, {@link GL30#GL_R8UI}, {@link GL30#GL_R16I}, {@link GL30#GL_R16UI}, {@link GL30#GL_R32I}, {@link GL30#GL_R32UI}, {@link GL30#GL_RG8I}, {@link GL30#GL_RG8UI}, {@link GL30#GL_RG16I}, {@link GL30#GL_RG16UI}, {@link GL30#GL_RG32I}, {@link GL30#GL_RG32UI}, {@link GL30#GL_RGB8I}, {@link GL30#GL_RGB8UI}, {@link GL30#GL_RGB16I}, {@link GL30#GL_RGB16UI}, {@link GL30#GL_RGB32I}, {@link GL30#GL_RGB32UI}, {@link GL30#GL_RGBA8I}, {@link GL30#GL_RGBA8UI}, {@link GL30#GL_RGBA16I}, {@link GL30#GL_RGBA16UI}, {@link GL30#GL_RGBA32I}, {@link GL30#GL_RGBA32UI}, {@link GL14#GL_DEPTH_COMPONENT16}, {@link GL14#GL_DEPTH_COMPONENT24}, {@link GL14#GL_DEPTH_COMPONENT32}, {@link GL30#GL_DEPTH24_STENCIL8}, {@link GL30#GL_DEPTH_COMPONENT32F}, {@link GL30#GL_DEPTH32F_STENCIL8}, {@link GL30#GL_COMPRESSED_RED}, {@link GL30#GL_COMPRESSED_RG}, {@link GL13#GL_COMPRESSED_RGB}, {@link GL13#GL_COMPRESSED_RGBA}, {@link GL21#GL_COMPRESSED_SRGB}, {@link GL21#GL_COMPRESSED_SRGB_ALPHA}, {@link GL30#GL_COMPRESSED_RED_RGTC1}, {@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1}, {@link GL30#GL_COMPRESSED_RG_RGTC2}, {@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2}, {@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM}, {@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM}, {@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT}, {@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}, {@link GL43#GL_COMPRESSED_RGB8_ETC2}, {@link GL43#GL_COMPRESSED_SRGB8_ETC2}, {@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}, {@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}, {@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC}, {@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}, {@link GL43#GL_COMPRESSED_R11_EAC}, {@link GL43#GL_COMPRESSED_SIGNED_R11_EAC}, {@link GL43#GL_COMPRESSED_RG11_EAC}, {@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC}, see {@link EXTTextureCompressionS3TC}, see {@link EXTTextureCompressionLATC}, see {@link ATITextureCompression3DC}
	 * @param width          the texture width
	 * @param height         the texture height
	 * @param depth          the texture depth
	 * @param border         the texture border width
	 * @param format         the texel data format. One of:<p/>{@link GL11#GL_STENCIL_INDEX}, {@link GL11#GL_DEPTH_COMPONENT}, {@link GL30#GL_DEPTH_STENCIL}, {@link GL11#GL_RED}, {@link GL11#GL_GREEN}, {@link GL11#GL_BLUE}, {@link GL11#GL_ALPHA}, {@link GL30#GL_RG}, {@link GL11#GL_RGB}, {@link GL11#GL_RGBA}, {@link GL12#GL_BGR}, {@link GL12#GL_BGRA}, {@link GL11#GL_LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA}, {@link GL30#GL_RED_INTEGER}, {@link GL30#GL_GREEN_INTEGER}, {@link GL30#GL_BLUE_INTEGER}, {@link GL30#GL_ALPHA_INTEGER}, {@link GL30#GL_RG_INTEGER}, {@link GL30#GL_RGB_INTEGER}, {@link GL30#GL_RGBA_INTEGER}, {@link GL30#GL_BGR_INTEGER}, {@link GL30#GL_BGRA_INTEGER}
	 * @param type           the texel data type. One of:<p/>{@link GL11#GL_UNSIGNED_BYTE}, {@link GL11#GL_BYTE}, {@link GL11#GL_UNSIGNED_SHORT}, {@link GL11#GL_SHORT}, {@link GL11#GL_UNSIGNED_INT}, {@link GL11#GL_INT}, {@link GL30#GL_HALF_FLOAT}, {@link GL11#GL_FLOAT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}, {@link GL30#GL_UNSIGNED_INT_24_8}, {@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV}, {@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV}, {@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV}, {@link GL11#GL_BITMAP}
	 * @param pixels         the texel data
	 */
	public static void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, ByteBuffer pixels) {
		long __functionAddress = getInstance().glTexImage3D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pixels, width * height * depth * GLChecks.getPixelBytes(format, type));
			GLChecks.ensureBufferObject(0x88EF, false);
		}
		nglTexImage3D(target, level, internalformat, width, height, depth, border, format, type, memAddress(pixels), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glTexImage3D(int, int, int, int, int, int, int, int, int, ByteBuffer)} */
	public static void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, long pixelsOffset) {
		long __functionAddress = getInstance().glTexImage3D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x88EF, true);
		}
		nglTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixelsOffset, __functionAddress);
	}

	/** ShortBuffer version of: {@link #glTexImage3D(int, int, int, int, int, int, int, int, int, ByteBuffer)} */
	public static void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, ShortBuffer pixels) {
		long __functionAddress = getInstance().glTexImage3D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pixels, (width * height * depth * GLChecks.getPixelBytes(format, type)) >> 1);
			GLChecks.ensureBufferObject(0x88EF, false);
		}
		nglTexImage3D(target, level, internalformat, width, height, depth, border, format, type, memAddress(pixels), __functionAddress);
	}

	/** IntBuffer version of: {@link #glTexImage3D(int, int, int, int, int, int, int, int, int, ByteBuffer)} */
	public static void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, IntBuffer pixels) {
		long __functionAddress = getInstance().glTexImage3D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pixels, (width * height * depth * GLChecks.getPixelBytes(format, type)) >> 2);
			GLChecks.ensureBufferObject(0x88EF, false);
		}
		nglTexImage3D(target, level, internalformat, width, height, depth, border, format, type, memAddress(pixels), __functionAddress);
	}

	/** FloatBuffer version of: {@link #glTexImage3D(int, int, int, int, int, int, int, int, int, ByteBuffer)} */
	public static void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, FloatBuffer pixels) {
		long __functionAddress = getInstance().glTexImage3D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pixels, (width * height * depth * GLChecks.getPixelBytes(format, type)) >> 2);
			GLChecks.ensureBufferObject(0x88EF, false);
		}
		nglTexImage3D(target, level, internalformat, width, height, depth, border, format, type, memAddress(pixels), __functionAddress);
	}

	/** DoubleBuffer version of: {@link #glTexImage3D(int, int, int, int, int, int, int, int, int, ByteBuffer)} */
	public static void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, DoubleBuffer pixels) {
		long __functionAddress = getInstance().glTexImage3D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pixels, (width * height * depth * GLChecks.getPixelBytes(format, type)) >> 3);
			GLChecks.ensureBufferObject(0x88EF, false);
		}
		nglTexImage3D(target, level, internalformat, width, height, depth, border, format, type, memAddress(pixels), __functionAddress);
	}

	// --- [ glTexSubImage3D ] ---

	/** JNI method for {@link #glTexSubImage3D(int, int, int, int, int, int, int, int, int, int, ByteBuffer)} */
	public static native void nglTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glTexSubImage3D.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Respecifies a cubic subregion of an existing 3D texel array. No change is made to the internalformat, width, height, depth, or border parameters of
	 * the specified texel array, nor is any change made to texel values outside the specified subregion.
	 *
	 * @param target  the texture target. One of:<p/>{@link GL12#GL_TEXTURE_3D}, {@link GL30#GL_TEXTURE_2D_ARRAY}, {@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY}
	 * @param level   the level-of-detail-number
	 * @param xoffset the x coordinate of the texel subregion
	 * @param yoffset the y coordinate of the texel subregion
	 * @param zoffset the z coordinate of the texel subregion
	 * @param width   the subregion width
	 * @param height  the subregion height
	 * @param depth   the subregion depth
	 * @param format  the pixel data format. One of:<p/>{@link GL11#GL_STENCIL_INDEX}, {@link GL11#GL_DEPTH_COMPONENT}, {@link GL30#GL_DEPTH_STENCIL}, {@link GL11#GL_RED}, {@link GL11#GL_GREEN}, {@link GL11#GL_BLUE}, {@link GL11#GL_ALPHA}, {@link GL30#GL_RG}, {@link GL11#GL_RGB}, {@link GL11#GL_RGBA}, {@link GL12#GL_BGR}, {@link GL12#GL_BGRA}, {@link GL11#GL_LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA}, {@link GL30#GL_RED_INTEGER}, {@link GL30#GL_GREEN_INTEGER}, {@link GL30#GL_BLUE_INTEGER}, {@link GL30#GL_ALPHA_INTEGER}, {@link GL30#GL_RG_INTEGER}, {@link GL30#GL_RGB_INTEGER}, {@link GL30#GL_RGBA_INTEGER}, {@link GL30#GL_BGR_INTEGER}, {@link GL30#GL_BGRA_INTEGER}
	 * @param type    the pixel data type. One of:<p/>{@link GL11#GL_UNSIGNED_BYTE}, {@link GL11#GL_BYTE}, {@link GL11#GL_UNSIGNED_SHORT}, {@link GL11#GL_SHORT}, {@link GL11#GL_UNSIGNED_INT}, {@link GL11#GL_INT}, {@link GL30#GL_HALF_FLOAT}, {@link GL11#GL_FLOAT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}, {@link GL30#GL_UNSIGNED_INT_24_8}, {@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV}, {@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV}, {@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV}, {@link GL11#GL_BITMAP}
	 * @param pixels  the pixel data
	 */
	public static void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ByteBuffer pixels) {
		long __functionAddress = getInstance().glTexSubImage3D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pixels, width * height * GLChecks.getPixelBytes(format, type));
			GLChecks.ensureBufferObject(0x88EF, false);
		}
		nglTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glTexSubImage3D(int, int, int, int, int, int, int, int, int, int, ByteBuffer)} */
	public static void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixelsOffset) {
		long __functionAddress = getInstance().glTexSubImage3D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x88EF, true);
		}
		nglTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixelsOffset, __functionAddress);
	}

	/** ShortBuffer version of: {@link #glTexSubImage3D(int, int, int, int, int, int, int, int, int, int, ByteBuffer)} */
	public static void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ShortBuffer pixels) {
		long __functionAddress = getInstance().glTexSubImage3D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pixels, (width * height * GLChecks.getPixelBytes(format, type)) >> 1);
			GLChecks.ensureBufferObject(0x88EF, false);
		}
		nglTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels), __functionAddress);
	}

	/** IntBuffer version of: {@link #glTexSubImage3D(int, int, int, int, int, int, int, int, int, int, ByteBuffer)} */
	public static void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, IntBuffer pixels) {
		long __functionAddress = getInstance().glTexSubImage3D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pixels, (width * height * GLChecks.getPixelBytes(format, type)) >> 2);
			GLChecks.ensureBufferObject(0x88EF, false);
		}
		nglTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels), __functionAddress);
	}

	/** FloatBuffer version of: {@link #glTexSubImage3D(int, int, int, int, int, int, int, int, int, int, ByteBuffer)} */
	public static void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, FloatBuffer pixels) {
		long __functionAddress = getInstance().glTexSubImage3D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pixels, (width * height * GLChecks.getPixelBytes(format, type)) >> 2);
			GLChecks.ensureBufferObject(0x88EF, false);
		}
		nglTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels), __functionAddress);
	}

	/** DoubleBuffer version of: {@link #glTexSubImage3D(int, int, int, int, int, int, int, int, int, int, ByteBuffer)} */
	public static void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, DoubleBuffer pixels) {
		long __functionAddress = getInstance().glTexSubImage3D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pixels, (width * height * GLChecks.getPixelBytes(format, type)) >> 3);
			GLChecks.ensureBufferObject(0x88EF, false);
		}
		nglTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels), __functionAddress);
	}

	// --- [ glCopyTexSubImage3D ] ---

	/** JNI method for {@link #glCopyTexSubImage3D(int, int, int, int, int, int, int, int, int)} */
	public static native void nglCopyTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glCopyTexSubImage3D.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Respecifies a rectangular subregion of a slice of an existing 3D texel array. No change is made to the {@code internalformat}, {@code width},
	 * {@code height}, or {@code border} parameters of the specified texel array, nor is any change made to texel values outside the specified subregion. See
	 * {@link GL11#glCopyTexImage2D} for more details.
	 *
	 * @param target  the texture target. One of:<p/>{@link GL12#GL_TEXTURE_3D}, {@link GL30#GL_TEXTURE_2D_ARRAY}, {@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY}
	 * @param level   the level-of-detail number
	 * @param xoffset the x coordinate of the texture subregion to update
	 * @param yoffset the y coordinate of the texture subregion to update
	 * @param zoffset the z coordinate of the texture subregion to update
	 * @param x       the left framebuffer pixel coordinate
	 * @param y       the lower framebuffer pixel coordinate
	 * @param width   the texture subregion width
	 * @param height  the texture subregion height
	 */
	public static void glCopyTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height) {
		long __functionAddress = getInstance().glCopyTexSubImage3D;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglCopyTexSubImage3D(target, level, xoffset, yoffset, zoffset, x, y, width, height, __functionAddress);
	}

	// --- [ glDrawRangeElements ] ---

	/** JNI method for {@link #glDrawRangeElements(int, int, int, int, int, ByteBuffer)} */
	public static native void nglDrawRangeElements(int mode, int start, int end, int count, int type, long indices, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glDrawRangeElements.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * A restricted form of {@link GL11#glDrawElements}. mode, start, end, and count match the corresponding arguments to glDrawElements, with the additional
	 * constraint that all values in the arrays count must lie between start and end, inclusive.
	 * <p/>
	 * Implementations denote recommended maximum amounts of vertex and index data, which may be queried by calling glGet with argument
	 * {@link #GL_MAX_ELEMENTS_VERTICES} and {@link #GL_MAX_ELEMENTS_INDICES}. If end - start + 1 is greater than the value of GL_MAX_ELEMENTS_VERTICES, or if
	 * count is greater than the value of GL_MAX_ELEMENTS_INDICES, then the call may operate at reduced performance. There is no requirement that all vertices
	 * in the range start end be referenced. However, the implementation may partially process unused vertices, reducing performance from what could be
	 * achieved with an optimal index set.
	 * <p/>
	 * When glDrawRangeElements is called, it uses count sequential elements from an enabled array, starting at start to construct a sequence of geometric
	 * primitives. mode specifies what kind of primitives are constructed, and how the array elements construct these primitives. If more than one array is
	 * enabled, each is used.
	 * <p/>
	 * Vertex attributes that are modified by glDrawRangeElements have an unspecified value after glDrawRangeElements returns. Attributes that aren't modified
	 * maintain their previous values.
	 * <h3>Errors</h3>
	 * It is an error for indices to lie outside the range start end, but implementations may not check for this situation. Such indices cause
	 * implementation-dependent behavior.
	 * <ul>
	 * 	<li>GL_INVALID_ENUM is generated if mode is not an accepted value.</li>
	 * 	<li>GL_INVALID_VALUE is generated if count is negative.</li>
	 * 	<li>GL_INVALID_VALUE is generated if end &lt; start.</li>
	 * 	<li>GL_INVALID_OPERATION is generated if a geometry shader is active and mode is incompatible with the input primitive type of the geometry shader in the
	 * currently installed program object.</li>
	 * 	<li>GL_INVALID_OPERATION is generated if a non-zero buffer object name is bound to an enabled array or the element array and the buffer object's data
	 * store is currently mapped.</li>
	 * </ul>
	 *
	 * @param mode    the kind of primitives to render. One of:<p/>{@link GL11#GL_POINTS}, {@link GL11#GL_LINE_STRIP}, {@link GL11#GL_LINE_LOOP}, {@link GL11#GL_LINES}, {@link GL11#GL_POLYGON}, {@link GL11#GL_TRIANGLE_STRIP}, {@link GL11#GL_TRIANGLE_FAN}, {@link GL11#GL_TRIANGLES}, {@link GL11#GL_QUAD_STRIP}, {@link GL11#GL_QUADS}, {@link GL32#GL_LINES_ADJACENCY}, {@link GL32#GL_LINE_STRIP_ADJACENCY}, {@link GL32#GL_TRIANGLES_ADJACENCY}, {@link GL32#GL_TRIANGLE_STRIP_ADJACENCY}, {@link GL40#GL_PATCHES}
	 * @param start   the minimum array index contained in {@code indices}
	 * @param end     the maximum array index contained in {@code indices}
	 * @param count   the number of elements to be rendered
	 * @param type    the type of the values in {@code indices}. One of:<p/>{@link GL11#GL_UNSIGNED_BYTE}, {@link GL11#GL_UNSIGNED_SHORT}, {@link GL11#GL_UNSIGNED_INT}
	 * @param indices a pointer to the location where the indices are stored
	 */
	public static void glDrawRangeElements(int mode, int start, int end, int count, int type, ByteBuffer indices) {
		long __functionAddress = getInstance().glDrawRangeElements;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(indices, count * GLChecks.translateTypeToBytes(type));
			GLChecks.ensureBufferObject(0x8895, false);
		}
		nglDrawRangeElements(mode, start, end, count, type, memAddress(indices), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glDrawRangeElements(int, int, int, int, int, ByteBuffer)} */
	public static void glDrawRangeElements(int mode, int start, int end, int count, int type, long indicesOffset) {
		long __functionAddress = getInstance().glDrawRangeElements;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x8895, true);
		}
		nglDrawRangeElements(mode, start, end, count, type, indicesOffset, __functionAddress);
	}

	/** Alternative version of: {@link #glDrawRangeElements(int, int, int, int, int, ByteBuffer)} */
	public static void glDrawRangeElements(int mode, int start, int end, int type, ByteBuffer indices) {
		long __functionAddress = getInstance().glDrawRangeElements;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x8895, true);
		}
		nglDrawRangeElements(mode, start, end, indices.remaining(), type, memAddress(indices), __functionAddress);
	}

	/** GL_UNSIGNED_BYTE version of: {@link #glDrawRangeElements(int, int, int, int, int, ByteBuffer)} */
	public static void glDrawRangeElements(int mode, int start, int end, ByteBuffer indices) {
		long __functionAddress = getInstance().glDrawRangeElements;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x8895, false);
		}
		nglDrawRangeElements(mode, start, end, indices.remaining(), GL11.GL_UNSIGNED_BYTE, memAddress(indices), __functionAddress);
	}

	/** GL_UNSIGNED_SHORT version of: {@link #glDrawRangeElements(int, int, int, int, int, ByteBuffer)} */
	public static void glDrawRangeElements(int mode, int start, int end, ShortBuffer indices) {
		long __functionAddress = getInstance().glDrawRangeElements;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x8895, false);
		}
		nglDrawRangeElements(mode, start, end, indices.remaining(), GL11.GL_UNSIGNED_SHORT, memAddress(indices), __functionAddress);
	}

	/** GL_UNSIGNED_INT version of: {@link #glDrawRangeElements(int, int, int, int, int, ByteBuffer)} */
	public static void glDrawRangeElements(int mode, int start, int end, IntBuffer indices) {
		long __functionAddress = getInstance().glDrawRangeElements;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x8895, false);
		}
		nglDrawRangeElements(mode, start, end, indices.remaining(), GL11.GL_UNSIGNED_INT, memAddress(indices), __functionAddress);
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link Functions} instance for the current context. */
	public static Functions getInstance() {
		return GL.getCapabilities().__GL12;
	}

	static Functions create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("OpenGL12") ) return null;

		Functions funcs = new Functions(provider);

		boolean supported = 
			GL.isFunctionSupported(funcs.glTexImage3D) &&
			GL.isFunctionSupported(funcs.glTexSubImage3D) &&
			GL.isFunctionSupported(funcs.glCopyTexSubImage3D) &&
			GL.isFunctionSupported(funcs.glDrawRangeElements);

		return GL.checkExtension("OpenGL12", funcs, supported);
	}

	/** The {@link FunctionMap} class for {@code GL12}. */
	public static final class Functions implements FunctionMap {

		public final long
			glTexImage3D,
			glTexSubImage3D,
			glCopyTexSubImage3D,
			glDrawRangeElements;

		public Functions(FunctionProvider provider) {
			glTexImage3D = provider.getFunctionAddress("glTexImage3D");
			glTexSubImage3D = provider.getFunctionAddress("glTexSubImage3D");
			glCopyTexSubImage3D = provider.getFunctionAddress("glCopyTexSubImage3D");
			glDrawRangeElements = provider.getFunctionAddress("glDrawRangeElements");
		}

	}

}