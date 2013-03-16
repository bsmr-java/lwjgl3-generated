/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** bindings to ALC_SOFT_loopback extension. */
public final class SOFTLoopback {

	/** Accepted by the @{code type} parameter of alcIsRenderFormatSupportedSOFT. */
	public static final int
		ALC_BYTE_SOFT           = 0x1400,
		ALC_UNSIGNED_BYTE_SOFT  = 0x1401,
		ALC_SHORT_SOFT          = 0x1402,
		ALC_UNSIGNED_SHORT_SOFT = 0x1403,
		ALC_INT_SOFT            = 0x1404,
		ALC_UNSIGNED_INT_SOFT   = 0x1405,
		ALC_FLOAT_SOFT          = 0x1406;

	/** Accepted by the @{code channels} parameter of alcIsRenderFormatSupportedSOFT. */
	public static final int
		ALC_MONO_SOFT    = 0x1500,
		ALC_STEREO_SOFT  = 0x1501,
		ALC_QUAD_SOFT    = 0x1503,
		ALC_5POINT1_SOFT = 0x1504,
		ALC_6POINT1_SOFT = 0x1505,
		ALC_7POINT1_SOFT = 0x1506;

	/** Accepted as part of the @{code attrList} parameter of alcCreateContext. */
	public static final int
		ALC_FORMAT_CHANNELS_SOFT = 0x1990,
		ALC_FORMAT_TYPE_SOFT     = 0x1991;

	private SOFTLoopback() {}

	// --- [ alcLoopbackOpenDeviceSOFT ] ---

	/** JNI method for {@link #alcLoopbackOpenDeviceSOFT(ByteBuffer)} */
	public static native long nalcLoopbackOpenDeviceSOFT(long deviceName, long __functionAddress);

	/**
	 * Loopback devices provide a way for applications to "read back" rendered
	 * audio without it being sent to an actual audio device. It allows
	 * applications to render audio as fast or slow as it needs, making it
	 * suitable for non-real-time rendering, and so it can be passed to an audio
	 * codec or something for further processing.
	 * <p/>
	 * The deviceName parameter is used to tell the AL which device or device
	 * driver to use for subsequent rendering. This may be NULL for an
	 * implementation-defined default, otherwise it must be a valid name returned
	 * by enumeration (and further must be a device capable of loopback
	 * rendering).
	 * <p/>
	 * A loopback device behaves largely the same as a playback device. You may
	 * query playback state and error codes, and create contexts, which can then
	 * be set as current to generate sources and buffers like normal.
	 * <p/>
	 * Note that loopback devices do not have either the ALC_SYNC or ALC_REFRESH
	 * attributes. Attempting to query them will result in an ALC_INVALID_ENUM
	 * error.
	 *
	 * @param deviceName name of the device to open
	 */
	public static long alcLoopbackOpenDeviceSOFT(ByteBuffer deviceName) {
		long __functionAddress = getInstance().alcLoopbackOpenDeviceSOFT;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkNT1(deviceName);
		}
		return nalcLoopbackOpenDeviceSOFT(memAddress(deviceName), __functionAddress);
	}

	/** CharSequence version of: {@link #alcLoopbackOpenDeviceSOFT(ByteBuffer)} */
	public static long alcLoopbackOpenDeviceSOFT(CharSequence deviceName) {
		long __functionAddress = getInstance().alcLoopbackOpenDeviceSOFT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nalcLoopbackOpenDeviceSOFT(memAddress(memEncodeUTF8(deviceName)), __functionAddress);
	}

	// --- [ alcIsRenderFormatSupportedSOFT ] ---

	/** JNI method for {@link #alcIsRenderFormatSupportedSOFT(long, int, int, int)} */
	public static native boolean nalcIsRenderFormatSupportedSOFT(long device, int frequency, int channels, int type, long __functionAddress);

	/**
	 * When creating contexts, the attribute list must specify the format used
	 * for rendering. This is done with the ALC_FORMAT_CHANNELS_SOFT,
	 * ALC_FORMAT_TYPE_SOFT, and ALC_FREQUENCY attributes. This controls the
	 * format of the audio subsequently rendered by the device.
	 *
	 * @param device    the loopback device to query
	 * @param frequency positive sample rate of the rendered audio
	 * @param channels  channel configuration used for rendering. One of:<p/>{@link #ALC_MONO_SOFT}, {@link #ALC_STEREO_SOFT}, {@link #ALC_QUAD_SOFT}, {@link #ALC_5POINT1_SOFT}, {@link #ALC_6POINT1_SOFT}, {@link #ALC_7POINT1_SOFT}
	 * @param type      sample type of the written audio. One of:<p/>{@link #ALC_BYTE_SOFT}, {@link #ALC_UNSIGNED_BYTE_SOFT}, {@link #ALC_SHORT_SOFT}, {@link #ALC_UNSIGNED_SHORT_SOFT}, {@link #ALC_INT_SOFT}, {@link #ALC_UNSIGNED_INT_SOFT}, {@link #ALC_FLOAT_SOFT}
	 */
	public static boolean alcIsRenderFormatSupportedSOFT(long device, int frequency, int channels, int type) {
		long __functionAddress = getInstance().alcIsRenderFormatSupportedSOFT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nalcIsRenderFormatSupportedSOFT(device, frequency, channels, type, __functionAddress);
	}

	// --- [ alcRenderSamplesSOFT ] ---

	/** JNI method for {@link #alcRenderSamplesSOFT(long, ByteBuffer, int)} */
	public static native void nalcRenderSamplesSOFT(long device, long buffer, int samples, long __functionAddress);

	/**
	 * The state of various objects on loopback devices (including processed
	 * buffers and source offsets) is processed only when new samples are
	 * rendered. To render samples, use the function
	 *
	 * @param device  loopback device which samples are rendered from
	 * @param buffer  buffer to write to
	 * @param samples number of sample frames to render
	 */
	public static void alcRenderSamplesSOFT(long device, ByteBuffer buffer, int samples) {
		long __functionAddress = getInstance().alcRenderSamplesSOFT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalcRenderSamplesSOFT(device, memAddress(buffer), samples, __functionAddress);
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link Functions} instance for the current context. */
	public static Functions getInstance() {
		return ALC.getCapabilities().__SOFTLoopback;
	}

	static Functions create(java.util.Set<String> ext, FunctionProviderLocal provider, long device) {		if ( !ext.contains("ALC_SOFT_loopback") ) return null;

		Functions funcs = new Functions(provider, device);

		boolean supported = 
			funcs.alcLoopbackOpenDeviceSOFT != 0L &&
			funcs.alcIsRenderFormatSupportedSOFT != 0L &&
			funcs.alcRenderSamplesSOFT != 0L;

		return ALC.checkExtension("ALC_SOFT_loopback", funcs, supported);
	}

	/** The {@link FunctionMap} class for {@code SOFTLoopback}. */
	public static final class Functions implements FunctionMap {

		public final long
			alcLoopbackOpenDeviceSOFT,
			alcIsRenderFormatSupportedSOFT,
			alcRenderSamplesSOFT;

		public Functions(FunctionProviderLocal provider, long device) {
			alcLoopbackOpenDeviceSOFT = provider.getFunctionAddress(device, "alcLoopbackOpenDeviceSOFT");
			alcIsRenderFormatSupportedSOFT = provider.getFunctionAddress(device, "alcIsRenderFormatSupportedSOFT");
			alcRenderSamplesSOFT = provider.getFunctionAddress(device, "alcRenderSamplesSOFT");
		}

	}

}