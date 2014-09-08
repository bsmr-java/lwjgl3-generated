/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/EXT/packed_float.txt">WGL_EXT_pixel_format_packed_float</a> extension.
 * 
 * <p>This extension provides support for rendering into an unsigned floating-point rendering format with the assumption that the texture format described in
 * {@link EXTPackedFloat} could also be advertised as an unsigned floating-point format for rendering.</p>
 * 
 * <p>Requires {@link WGLARBPixelFormat WGL_ARB_pixel_format}.</p>
 */
public final class WGLEXTPixelFormatPackedFloat {

	/**
	 * Accepted as a value in the {@code attribIList} parameter array of {@link WGLARBPixelFormat#wglChoosePixelFormatARB ChoosePixelFormatARB}, and returned in the {@code values}
	 * parameter array of {@link WGLARBPixelFormat#wglGetPixelFormatAttribiARB GetPixelFormatAttribiARB}.
	 */
	public static final int
		WGL_TYPE_RGBA_UNSIGNED_FLOAT_EXT = 0x20A8;

	private WGLEXTPixelFormatPackedFloat() {}

}