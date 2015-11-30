/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://kcat.strangesoft.net/openal-extensions/SOFT_HRTF.txt">SOFT_HRTF</a> extension.
 * 
 * <p>This extension allows an application to request and determine the status of HRTF mixing. HRTF, or Head-Related Transfer Function, is a method of mixing
 * 3D audio for "true" 3D panning, typically using filters designed to simulate how sound is affected by a listener's head as the sound waves travel
 * between the ears.</p>
 * 
 * <p>As a 3D sound API, OpenAL's design allows implementations to transparently render audio using HRTF. However, the OpenAL API currently has no concept of
 * HRTF so there's no way to query if it's being used, and no way for an application to request it on behalf of the user. This aims to fix that.</p>
 */
public class SOFTHRTF {

	/**
	 * Accepted as part of the {@code attrList} parameter of {@link ALC10#alcCreateContext CreateContext} and {@link #alcDeviceResetSOFT DeviceResetSOFT}, and as the {@code paramName} parameter of
	 * {@link ALC10#alcGetIntegerv GetIntegerv}.
	 */
	public static final int ALC_HRTF_SOFT = 0x1992;

	/** Accepted as part of the {@code attrList} parameter of {@link ALC10#alcCreateContext CreateContext} and {@link #alcDeviceResetSOFT DeviceResetSOFT}. */
	public static final int ALC_HRTF_ID_SOFT = 0x1996;

	/** Accepted as part of the {@code attrList} parameter of {@link ALC10#alcCreateContext CreateContext} and {@link #alcDeviceResetSOFT DeviceResetSOFT}, for the {@link #ALC_HRTF_SOFT HRTF_SOFT} attribute. */
	public static final int ALC_DONT_CARE_SOFT = 0x2;

	/** Accepted as the {@code paramName} parameter of {@link ALC10#alcGetIntegerv GetIntegerv}. */
	public static final int
		ALC_HRTF_STATUS_SOFT         = 0x1993,
		ALC_NUM_HRTF_SPECIFIERS_SOFT = 0x1994;

	/** Accepted as the {@code paramName} parameter of {@link ALC10#alcGetString GetString} and {@link #alcGetStringiSOFT GetStringiSOFT}. */
	public static final int ALC_HRTF_SPECIFIER_SOFT = 0x1995;

	/** Possible results from a {@link #ALC_HRTF_STATUS_SOFT HRTF_STATUS_SOFT} query. */
	public static final int
		ALC_HRTF_DISABLED_SOFT            = 0x0,
		ALC_HRTF_ENABLED_SOFT             = 0x1,
		ALC_HRTF_DENIED_SOFT              = 0x2,
		ALC_HRTF_REQUIRED_SOFT            = 0x3,
		ALC_HRTF_HEADPHONES_DETECTED_SOFT = 0x4,
		ALC_HRTF_UNSUPPORTED_FORMAT_SOFT  = 0x5;

	/** Function address. */
	@JavadocExclude
	public final long
		GetStringiSOFT,
		ResetDeviceSOFT;

	@JavadocExclude
	protected SOFTHRTF() {
		throw new UnsupportedOperationException();
	}

	@JavadocExclude
	public SOFTHRTF(FunctionProviderLocal provider, long device) {
		GetStringiSOFT = provider.getFunctionAddress(device, "alcGetStringiSOFT");
		ResetDeviceSOFT = provider.getFunctionAddress(device, "alcResetDeviceSOFT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link SOFTHRTF} instance of the current context. */
	public static SOFTHRTF getInstance() {
		return getInstance(ALC.getCapabilities());
	}

	/** Returns the {@link SOFTHRTF} instance of the specified {@link ALCCapabilities}. */
	public static SOFTHRTF getInstance(ALCCapabilities caps) {
		return checkFunctionality(caps.__SOFTHRTF);
	}

	static SOFTHRTF create(java.util.Set<String> ext, FunctionProviderLocal provider, long device) {
		if ( device != 0L && !ext.contains("ALC_SOFT_HRTF") ) return null;

		SOFTHRTF funcs = new SOFTHRTF(provider, device);

		boolean supported = checkFunctions(
			funcs.GetStringiSOFT, funcs.ResetDeviceSOFT
		);

		return device == 0L && !supported ? null : ALC.checkExtension("ALC_SOFT_HRTF", funcs, supported);
	}

	// --- [ alcGetStringiSOFT ] ---

	/** Unsafe version of {@link #alcGetStringiSOFT GetStringiSOFT} */
	@JavadocExclude
	public static long nalcGetStringiSOFT(long device, int paramName, int index) {
		long __functionAddress = getInstance().GetStringiSOFT;
		if ( CHECKS )
			checkPointer(device);
		return invokePIIP(__functionAddress, device, paramName, index);
	}

	/**
	 * Returns a human-readable string for an HRTF.
	 * 
	 * <p>The returned string will be an implementation-defined UTF-8 encoded specifier for the given HRTF index, designed for display to the user. The returned
	 * strings are valid until the next enumeration point or the device is closed.</p>
	 *
	 * @param device    he same one that previously queried the number of HRTF specifiers
	 * @param paramName the parameter to query. Must be:<br>{@link #ALC_HRTF_SPECIFIER_SOFT HRTF_SPECIFIER_SOFT}
	 * @param index     an index between 0 (inclusive) and the previously-queried HRTF count (exclusive)
	 */
	public static String alcGetStringiSOFT(long device, int paramName, int index) {
		long __result = nalcGetStringiSOFT(device, paramName, index);
		return memDecodeUTF8(__result);
	}

	// --- [ alcResetDeviceSOFT ] ---

	/** Unsafe version of {@link #alcResetDeviceSOFT ResetDeviceSOFT} */
	@JavadocExclude
	public static boolean nalcResetDeviceSOFT(long device, long attrList) {
		long __functionAddress = getInstance().ResetDeviceSOFT;
		if ( CHECKS )
			checkPointer(device);
		return invokePPZ(__functionAddress, device, attrList);
	}

	/**
	 * Resets a device after it is opened for playback, to attempt changing the playback properties.
	 *
	 * @param device   a handle to a valid playback device as returned by {@link ALC10#alcOpenDevice OpenDevice}, otherwise the call fails and an {@link ALC10#ALC_INVALID_DEVICE INVALID_DEVICE} error is generated
	 * @param attrList the same as what could be passed to {@link ALC10#alcCreateContext CreateContext}. The AL is allowed to ignore attributes and attribute value combinations the device
	 *                 cannot support, for example if the device doesn't support the requested {@link ALC10#ALC_FREQUENCY FREQUENCY} value, another value it does support may be set.
	 *
	 * @return on success the function returns {@link ALC10#ALC_TRUE TRUE}, and on failure the function returns {@link ALC10#ALC_FALSE FALSE}. Note that a return of {@link ALC10#ALC_TRUE TRUE} does not indicate any
	 *         attributes were honored, just that the device was successfully reset. If you need to know what the attributes are after a reset, query the device using
	 *         {@link ALC10#alcGetIntegerv GetIntegerv} with the relevant attributes.
	 */
	public static boolean alcResetDeviceSOFT(long device, ByteBuffer attrList) {
		return nalcResetDeviceSOFT(device, memAddress(attrList));
	}

	/** Alternative version of: {@link #alcResetDeviceSOFT ResetDeviceSOFT} */
	public static boolean alcResetDeviceSOFT(long device, IntBuffer attrList) {
		return nalcResetDeviceSOFT(device, memAddress(attrList));
	}

}