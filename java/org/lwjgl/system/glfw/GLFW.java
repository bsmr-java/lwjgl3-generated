/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.glfw;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

import org.lwjgl.opengl.GL11;

/**
 * Native bindings to the GLFW library.
 * <p/>
 * <b>Note</b>: All OpenGL related functionality has been stripped away.
 */
public final class GLFW {

	/** This is incremented when the API is changed in non-compatible ways. */
	public static final int
		GLFW_VERSION_MAJOR = 0x3;

	/** This is incremented when features are added to the API but it remains backward-compatible. */
	public static final int
		GLFW_VERSION_MINOR = 0x0;

	/** This is incremented when a bug fix release is made that does not contain any API changes. */
	public static final int
		GLFW_VERSION_REVISION = 0x0;

	/** The key or button was released. */
	public static final int
		GLFW_RELEASE = 0x0;

	/** The key or button was pressed. */
	public static final int
		GLFW_PRESS = 0x1;

	/** The key was held down until it repeated. */
	public static final int
		GLFW_REPEAT = 0x2;

	/** Printable keys. */
	public static final int
		GLFW_KEY_SPACE         = 0x20,
		GLFW_KEY_APOSTROPHE    = 0x27,
		GLFW_KEY_COMMA         = 0x2C,
		GLFW_KEY_MINUS         = 0x2D,
		GLFW_KEY_PERIOD        = 0x2E,
		GLFW_KEY_SLASH         = 0x2F,
		GLFW_KEY_0             = 0x30,
		GLFW_KEY_1             = 0x31,
		GLFW_KEY_2             = 0x32,
		GLFW_KEY_3             = 0x33,
		GLFW_KEY_4             = 0x34,
		GLFW_KEY_5             = 0x35,
		GLFW_KEY_6             = 0x36,
		GLFW_KEY_7             = 0x37,
		GLFW_KEY_8             = 0x38,
		GLFW_KEY_9             = 0x39,
		GLFW_KEY_SEMICOLON     = 0x3B,
		GLFW_KEY_EQUAL         = 0x3D,
		GLFW_KEY_A             = 0x41,
		GLFW_KEY_B             = 0x42,
		GLFW_KEY_C             = 0x43,
		GLFW_KEY_D             = 0x44,
		GLFW_KEY_E             = 0x45,
		GLFW_KEY_F             = 0x46,
		GLFW_KEY_G             = 0x47,
		GLFW_KEY_H             = 0x48,
		GLFW_KEY_I             = 0x49,
		GLFW_KEY_J             = 0x4A,
		GLFW_KEY_K             = 0x4B,
		GLFW_KEY_L             = 0x4C,
		GLFW_KEY_M             = 0x4D,
		GLFW_KEY_N             = 0x4E,
		GLFW_KEY_O             = 0x4F,
		GLFW_KEY_P             = 0x50,
		GLFW_KEY_Q             = 0x51,
		GLFW_KEY_R             = 0x52,
		GLFW_KEY_S             = 0x53,
		GLFW_KEY_T             = 0x54,
		GLFW_KEY_U             = 0x55,
		GLFW_KEY_V             = 0x56,
		GLFW_KEY_W             = 0x57,
		GLFW_KEY_X             = 0x58,
		GLFW_KEY_Y             = 0x59,
		GLFW_KEY_Z             = 0x5A,
		GLFW_KEY_LEFT_BRACKET  = 0x5B,
		GLFW_KEY_BACKSLASH     = 0x5C,
		GLFW_KEY_RIGHT_BRACKET = 0x5D,
		GLFW_KEY_GRAVE_ACCENT  = 0x60,
		GLFW_KEY_WORLD_1       = 0xA1,
		GLFW_KEY_WORLD_2       = 0xA2;

	/** Function keys. */
	public static final int
		GLFW_KEY_ESCAPE        = 0x100,
		GLFW_KEY_ENTER         = 0x101,
		GLFW_KEY_TAB           = 0x102,
		GLFW_KEY_BACKSPACE     = 0x103,
		GLFW_KEY_INSERT        = 0x104,
		GLFW_KEY_DELETE        = 0x105,
		GLFW_KEY_RIGHT         = 0x106,
		GLFW_KEY_LEFT          = 0x107,
		GLFW_KEY_DOWN          = 0x108,
		GLFW_KEY_UP            = 0x109,
		GLFW_KEY_PAGE_UP       = 0x10A,
		GLFW_KEY_PAGE_DOWN     = 0x10B,
		GLFW_KEY_HOME          = 0x10C,
		GLFW_KEY_END           = 0x10D,
		GLFW_KEY_CAPS_LOCK     = 0x118,
		GLFW_KEY_SCROLL_LOCK   = 0x119,
		GLFW_KEY_NUM_LOCK      = 0x11A,
		GLFW_KEY_PRINT_SCREEN  = 0x11B,
		GLFW_KEY_PAUSE         = 0x11C,
		GLFW_KEY_F1            = 0x122,
		GLFW_KEY_F2            = 0x123,
		GLFW_KEY_F3            = 0x124,
		GLFW_KEY_F4            = 0x125,
		GLFW_KEY_F5            = 0x126,
		GLFW_KEY_F6            = 0x127,
		GLFW_KEY_F7            = 0x128,
		GLFW_KEY_F8            = 0x129,
		GLFW_KEY_F9            = 0x12A,
		GLFW_KEY_F10           = 0x12B,
		GLFW_KEY_F11           = 0x12C,
		GLFW_KEY_F12           = 0x12D,
		GLFW_KEY_F13           = 0x12E,
		GLFW_KEY_F14           = 0x12F,
		GLFW_KEY_F15           = 0x130,
		GLFW_KEY_F16           = 0x131,
		GLFW_KEY_F17           = 0x132,
		GLFW_KEY_F18           = 0x133,
		GLFW_KEY_F19           = 0x134,
		GLFW_KEY_F20           = 0x135,
		GLFW_KEY_F21           = 0x136,
		GLFW_KEY_F22           = 0x137,
		GLFW_KEY_F23           = 0x138,
		GLFW_KEY_F24           = 0x139,
		GLFW_KEY_F25           = 0x13A,
		GLFW_KEY_KP_0          = 0x140,
		GLFW_KEY_KP_1          = 0x141,
		GLFW_KEY_KP_2          = 0x142,
		GLFW_KEY_KP_3          = 0x143,
		GLFW_KEY_KP_4          = 0x144,
		GLFW_KEY_KP_5          = 0x145,
		GLFW_KEY_KP_6          = 0x146,
		GLFW_KEY_KP_7          = 0x147,
		GLFW_KEY_KP_8          = 0x148,
		GLFW_KEY_KP_9          = 0x149,
		GLFW_KEY_KP_DECIMAL    = 0x14A,
		GLFW_KEY_KP_DIVIDE     = 0x14B,
		GLFW_KEY_KP_MULTIPLY   = 0x14C,
		GLFW_KEY_KP_SUBTRACT   = 0x14D,
		GLFW_KEY_KP_ADD        = 0x14E,
		GLFW_KEY_KP_ENTER      = 0x14F,
		GLFW_KEY_KP_EQUAL      = 0x150,
		GLFW_KEY_LEFT_SHIFT    = 0x154,
		GLFW_KEY_LEFT_CONTROL  = 0x155,
		GLFW_KEY_LEFT_ALT      = 0x156,
		GLFW_KEY_LEFT_SUPER    = 0x157,
		GLFW_KEY_RIGHT_SHIFT   = 0x158,
		GLFW_KEY_RIGHT_CONTROL = 0x159,
		GLFW_KEY_RIGHT_ALT     = 0x15A,
		GLFW_KEY_RIGHT_SUPER   = 0x15B,
		GLFW_KEY_MENU          = 0x15C,
		GLFW_KEY_LAST          = GLFW_KEY_MENU;

	/** Mouse buttons. */
	public static final int
		GLFW_MOUSE_BUTTON_1      = 0x0,
		GLFW_MOUSE_BUTTON_2      = 0x1,
		GLFW_MOUSE_BUTTON_3      = 0x2,
		GLFW_MOUSE_BUTTON_4      = 0x3,
		GLFW_MOUSE_BUTTON_5      = 0x4,
		GLFW_MOUSE_BUTTON_6      = 0x5,
		GLFW_MOUSE_BUTTON_7      = 0x6,
		GLFW_MOUSE_BUTTON_8      = 0x7,
		GLFW_MOUSE_BUTTON_LAST   = GLFW_MOUSE_BUTTON_8,
		GLFW_MOUSE_BUTTON_LEFT   = GLFW_MOUSE_BUTTON_1,
		GLFW_MOUSE_BUTTON_RIGHT  = GLFW_MOUSE_BUTTON_2,
		GLFW_MOUSE_BUTTON_MIDDLE = GLFW_MOUSE_BUTTON_3;

	/** Joysticks. */
	public static final int
		GLFW_JOYSTICK_1    = 0x0,
		GLFW_JOYSTICK_2    = 0x1,
		GLFW_JOYSTICK_3    = 0x2,
		GLFW_JOYSTICK_4    = 0x3,
		GLFW_JOYSTICK_5    = 0x4,
		GLFW_JOYSTICK_6    = 0x5,
		GLFW_JOYSTICK_7    = 0x6,
		GLFW_JOYSTICK_8    = 0x7,
		GLFW_JOYSTICK_9    = 0x8,
		GLFW_JOYSTICK_10   = 0x9,
		GLFW_JOYSTICK_11   = 0xA,
		GLFW_JOYSTICK_12   = 0xB,
		GLFW_JOYSTICK_13   = 0xC,
		GLFW_JOYSTICK_14   = 0xD,
		GLFW_JOYSTICK_15   = 0xE,
		GLFW_JOYSTICK_16   = 0xF,
		GLFW_JOYSTICK_LAST = GLFW_JOYSTICK_16;

	/** GLFW has not been initialized. */
	public static final int
		GLFW_NOT_INITIALIZED = 0x70001;

	/** No context is current for this thread. */
	public static final int
		GLFW_NO_CURRENT_CONTEXT = 0x70002;

	/** One of the enum parameters for the function was given an invalid enum. */
	public static final int
		GLFW_INVALID_ENUM = 0x70003;

	/** One of the parameters for the function was given an invalid value. */
	public static final int
		GLFW_INVALID_VALUE = 0x70004;

	/** A memory allocation failed. */
	public static final int
		GLFW_OUT_OF_MEMORY = 0x70005;

	/** GLFW could not find support for the requested client API on the system. */
	public static final int
		GLFW_API_UNAVAILABLE = 0x70006;

	/** The requested client API version is not available. */
	public static final int
		GLFW_VERSION_UNAVAILABLE = 0x70007;

	/** A platform-specific error occurred that does not match any of the more specific categories. */
	public static final int
		GLFW_PLATFORM_ERROR = 0x70008;

	/** The clipboard did not contain data in the requested format. */
	public static final int
		GLFW_FORMAT_UNAVAILABLE = 0x70009;

	/** Window events. */
	public static final int
		GLFW_FOCUSED   = 0x20001,
		GLFW_ICONIFIED = 0x20002,
		GLFW_RESIZABLE = 0x22007,
		GLFW_VISIBLE   = 0x22008,
		GLFW_DECORATED = 0x22009;

	/** Input options. */
	public static final int
		GLFW_CURSOR_MODE          = 0x30001,
		GLFW_STICKY_KEYS          = 0x30002,
		GLFW_STICKY_MOUSE_BUTTONS = 0x30003;

	/** Cursor state. */
	public static final int
		GLFW_CURSOR_NORMAL   = 0x40001,
		GLFW_CURSOR_HIDDEN   = 0x40002,
		GLFW_CURSOR_CAPTURED = 0x40003;

	/** Joystick state. */
	public static final int
		GLFW_PRESENT = 0x50001,
		GLFW_AXES    = 0x50002,
		GLFW_BUTTONS = 0x50003;

	/** Gamma ramp size. */
	public static final int
		GLFW_GAMMA_RAMP_SIZE = 0x100;

	/** Monitor events. */
	public static final int
		GLFW_CONNECTED    = 0x61000,
		GLFW_DISCONNECTED = 0x61001;

	/** PixelFormat hints. */
	public static final int
		GLFW_RED_BITS         = 0x21000,
		GLFW_GREEN_BITS       = 0x21001,
		GLFW_BLUE_BITS        = 0x21002,
		GLFW_ALPHA_BITS       = 0x21003,
		GLFW_DEPTH_BITS       = 0x21004,
		GLFW_STENCIL_BITS     = 0x21005,
		GLFW_ACCUM_RED_BITS   = 0x21006,
		GLFW_ACCUM_GREEN_BITS = 0x21007,
		GLFW_ACCUM_BLUE_BITS  = 0x21008,
		GLFW_ACCUM_ALPHA_BITS = 0x21009,
		GLFW_AUX_BUFFERS      = 0x2100A,
		GLFW_STEREO           = 0x2100B,
		GLFW_SAMPLES          = 0x2100C,
		GLFW_SRGB_CAPABLE     = 0x2100D;

	/** Client API hints. */
	public static final int
		GLFW_CLIENT_API            = 0x22000,
		GLFW_CONTEXT_VERSION_MAJOR = 0x22001,
		GLFW_CONTEXT_VERSION_MINOR = 0x22002,
		GLFW_CONTEXT_REVISION      = 0x20004,
		GLFW_CONTEXT_ROBUSTNESS    = 0x22003,
		GLFW_OPENGL_FORWARD_COMPAT = 0x22004,
		GLFW_OPENGL_DEBUG_CONTEXT  = 0x22005,
		GLFW_OPENGL_PROFILE        = 0x22006;

	/** Client API types. */
	public static final int
		GLFW_OPENGL_API    = 0x1,
		GLFW_OPENGL_ES_API = 0x2;

	/** // Robustness values. */
	public static final int
		GLFW_NO_ROBUSTNESS         = 0x0,
		GLFW_NO_RESET_NOTIFICATION = 0x1,
		GLFW_LOSE_CONTEXT_ON_RESET = 0x2;

	/** OpenGL profiles. */
	public static final int
		GLFW_OPENGL_NO_PROFILE     = 0x0,
		GLFW_OPENGL_CORE_PROFILE   = 0x1,
		GLFW_OPENGL_COMPAT_PROFILE = 0x2;

	private GLFW() {}

	// --- [ glfwInit ] ---

	/**
	 * This function initializes the GLFW library. Before most GLFW functions can be used, GLFW must be initialized, and before a program terminates GLFW
	 * should be terminated in order to free any resources allocated during or after initialization.
	 * <p/>
	 * If this function fails, it calls {@link #glfwTerminate} before returning.  If it succeeds, you should call {@link #glfwTerminate} before the program
	 * exits.
	 * <p/>
	 * Additional calls to this function after successful initialization but before termination will succeed but will do nothing.
	 * <p/>
	 * Notes:
	 * <ul>
	 * <li>This function may only be called from the main thread.</li>
	 * <li>This function may take several seconds to complete on some systems, while on other systems it may take only a fraction of a second to complete.</li>
	 * <li><strong>Mac OS X</strong>: This function will change the current directory of the application to the `Contents/Resources` subdirectory of the
	 * application's bundle, if present.</li>
	 * </ul>
	 */
	public static native int glfwInit();

	// --- [ glfwTerminate ] ---

	/** JNI method for {@link #glfwTerminate} */
	public static native void nglfwTerminate();

	/**
	 * This function destroys all remaining windows, frees any allocated resources and sets the library to an uninitialized state. Once this is called, you
	 * must again call {@link #glfwInit} successfully before you will be able to use most GLFW functions.
	 * <p/>
	 * If GLFW has been successfully initialized, this function should be called before the program exits. If initialization fails, there is no need to call
	 * this function, as it is called by {@link #glfwInit} before it returns failure.
	 * <p/>
	 * Notes:
	 * <ul>
	 * <li>This function may be called before {@link #glfwInit}.</li>
	 * <li>This function may only be called from the main thread.</li>
	 * <li>No window's context may be current on another thread when this function is called.</li>
	 * </ul>
	 */
	public static void glfwTerminate() {
		WindowCallback.clearAll();
		nglfwTerminate();
	}

	// --- [ glfwGetVersion ] ---

	/** JNI method for {@link #glfwGetVersion} */
	public static native void nglfwGetVersion(long major, long minor, long rev);

	/**
	 * This function retrieves the major, minor and revision numbers of the GLFW library. It is intended for when you are using GLFW as a shared library and
	 * want to ensure that you are using the minimum required version.
	 * <p/>
	 * Notes:
	 * <ul>
	 * <li>This function may be called before {@link #glfwInit}.</li>
	 * <li>This function may be called from any thread.</li>
	 * </ul>
	 *
	 * @param major major version number
	 * @param minor minor version number
	 * @param rev   revision number
	 */
	public static void glfwGetVersion(ByteBuffer major, ByteBuffer minor, ByteBuffer rev) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(major, 1 << 2);
			checkBuffer(minor, 1 << 2);
			checkBuffer(rev, 1 << 2);
		}
		nglfwGetVersion(memAddress(major), memAddress(minor), memAddress(rev));
	}

	/** Alternative version of: {@link #glfwGetVersion} */
	public static void glfwGetVersion(IntBuffer major, IntBuffer minor, IntBuffer rev) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(major, 1);
			checkBuffer(minor, 1);
			checkBuffer(rev, 1);
		}
		nglfwGetVersion(memAddress(major), memAddress(minor), memAddress(rev));
	}

	// --- [ glfwGetVersionString ] ---

	/** JNI method for {@link #glfwGetVersionString} */
	public static native long nglfwGetVersionString();

	/**
	 * This function returns a static string generated at compile-time according to which configuration macros were defined. This is intended for use when
	 * submitting bug reports, to allow developers to see which code paths are enabled in a binary.
	 * <p/>
	 * The format of the string is as follows:
	 * <ul>
	 * <li>The version of GLFW</li>
	 * <li>The name of the window system API</li>
	 * <li>The name of the context creation API</li>
	 * <li>Any additional options or APIs</li>
	 * </ul>
	 * <p/>
	 * For example, when compiling GLFW 3.0 with MinGW using the Win32 and WGL backends, the version string may look something like this:
	 * <p/>
	 * 3.0.0 Win32 WGL MinGW
	 */
	public static String glfwGetVersionString() {
		long __result = nglfwGetVersionString();
		return memDecodeUTF8(memByteBufferNT1(__result));
	}

	// --- [ glfwSetErrorCallback ] ---

	/** JNI method for {@link #glfwSetErrorCallback} */
	public static native void nglfwSetErrorCallback(long cbfun);

	/**
	 * This function sets the error callback, which is called with an error code and a human-readable description each time a GLFW error occurs.
	 * <p/>
	 * Notes:
	 * <ul>
	 * <li>This function may be called before {@link #glfwInit}.</li>
	 * <li>The error callback is called by the thread where the error was generated. If you are using GLFW from multiple threads, your error callback needs to
	 * be written accordingly.</li>
	 * <li>Because the description string provided to the callback may have been generated specifically for that error, it is not guaranteed to be valid after
	 * the callback has returned.  If you wish to use it after that, you need to make your own copy of it before returning.</li>
	 * </ul>
	 *
	 * @param cbfun the new callback or NULL to remove the currently set callback
	 */
	public static void glfwSetErrorCallback(long cbfun) {
		nglfwSetErrorCallback(cbfun);
	}

	/** Alternative version of: {@link #glfwSetErrorCallback} */
	public static void glfwSetErrorCallback(ErrorCallback cbfun) {
		nglfwSetErrorCallback(ErrorCallback.register(cbfun));
	}

	// --- [ glfwGetMonitors ] ---

	/** JNI method for {@link #glfwGetMonitors} */
	public static native long nglfwGetMonitors(long count);

	/**
	 * This function returns an array of handles for all currently connected monitors. The returned array is valid only until the monitor configuration
	 * changes.
	 * <p/>
	 * See {@link #glfwSetMonitorCallback} to receive notifications of configuration changes.
	 */
	public static PointerBuffer glfwGetMonitors() {
		APIBuffer __buffer = apiBuffer();
		int count = __buffer.intParam();
		long __result = nglfwGetMonitors(__buffer.address() + count);
		return memPointerBuffer(__result, __buffer.intValue(count));
	}

	// --- [ glfwGetPrimaryMonitor ] ---

	/**
	 * This function returns the primary monitor.  This is usually the monitor
	 * where elements like the Windows task bar or the OS X menu bar is located.
	 */
	public static native long glfwGetPrimaryMonitor();

	// --- [ glfwGetMonitorPos ] ---

	/** JNI method for {@link #glfwGetMonitorPos} */
	public static native void nglfwGetMonitorPos(long monitor, long xpos, long ypos);

	/**
	 * This function returns the position, in screen coordinates, of the upper-left
	 * corner of the specified monitor.
	 *
	 * @param monitor monitor to query
	 * @param xpos    The monitor x-coordinate
	 * @param ypos    The monitor y-coordinate
	 */
	public static void glfwGetMonitorPos(long monitor, ByteBuffer xpos, ByteBuffer ypos) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(monitor);
			checkBuffer(xpos, 1 << 2);
			checkBuffer(ypos, 1 << 2);
		}
		nglfwGetMonitorPos(monitor, memAddress(xpos), memAddress(ypos));
	}

	/** Alternative version of: {@link #glfwGetMonitorPos} */
	public static void glfwGetMonitorPos(long monitor, IntBuffer xpos, IntBuffer ypos) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(monitor);
			checkBuffer(xpos, 1);
			checkBuffer(ypos, 1);
		}
		nglfwGetMonitorPos(monitor, memAddress(xpos), memAddress(ypos));
	}

	// --- [ glfwGetMonitorPhysicalSize ] ---

	/** JNI method for {@link #glfwGetMonitorPhysicalSize} */
	public static native void nglfwGetMonitorPhysicalSize(long monitor, long width, long height);

	/**
	 * This function returns the size, in millimetres, of the display area of the specified monitor.
	 * <p/>
	 * Note: Some operating systems do not provide accurate information, either
	 * because the monitor's EDID data is incorrect, or because the driver does not
	 * report it accurately.
	 *
	 * @param monitor monitor to query
	 * @param width   width, in mm, of the monitor's display
	 * @param height  height, in mm, of the monitor's display
	 */
	public static void glfwGetMonitorPhysicalSize(long monitor, ByteBuffer width, ByteBuffer height) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(monitor);
			checkBuffer(width, 1 << 2);
			checkBuffer(height, 1 << 2);
		}
		nglfwGetMonitorPhysicalSize(monitor, memAddress(width), memAddress(height));
	}

	/** Alternative version of: {@link #glfwGetMonitorPhysicalSize} */
	public static void glfwGetMonitorPhysicalSize(long monitor, IntBuffer width, IntBuffer height) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(monitor);
			checkBuffer(width, 1);
			checkBuffer(height, 1);
		}
		nglfwGetMonitorPhysicalSize(monitor, memAddress(width), memAddress(height));
	}

	// --- [ glfwGetMonitorName ] ---

	/** JNI method for {@link #glfwGetMonitorName} */
	public static native long nglfwGetMonitorName(long monitor);

	/**
	 * This function returns a human-readable name, encoded as UTF-8, of the
	 * specified monitor.
	 *
	 * @param monitor monitor to query
	 */
	public static String glfwGetMonitorName(long monitor) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(monitor);
		long __result = nglfwGetMonitorName(monitor);
		return memDecodeUTF8(memByteBufferNT1(__result));
	}

	// --- [ glfwSetMonitorCallback ] ---

	/** JNI method for {@link #glfwSetMonitorCallback} */
	public static native void nglfwSetMonitorCallback(long cbfun);

	/**
	 * Sets the monitor configuration callback.
	 *
	 * @param cbfun the new callback, or NULL to remove the currently set callback
	 */
	public static void glfwSetMonitorCallback(long cbfun) {
		nglfwSetMonitorCallback(cbfun);
	}

	/** Alternative version of: {@link #glfwSetMonitorCallback} */
	public static void glfwSetMonitorCallback(MonitorCallback cbfun) {
		nglfwSetMonitorCallback(MonitorCallback.register(cbfun));
	}

	// --- [ glfwGetVideoModes ] ---

	/** JNI method for {@link #glfwGetVideoModes} */
	public static native long nglfwGetVideoModes(long monitor, long count);

	/**
	 * This function returns an array of all video modes supported by the specified
	 * monitor.
	 *
	 * @param monitor monitor to query
	 */
	public static ByteBuffer glfwGetVideoModes(long monitor, ByteBuffer count) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(monitor);
			checkBuffer(count, 1 << 2);
		}
		long __result = nglfwGetVideoModes(monitor, memAddress(count));
		return memByteBuffer(__result, count.getInt(count.position()) * GLFWvidmode.SIZEOF);
	}

	/** Alternative version of: {@link #glfwGetVideoModes} */
	public static ByteBuffer glfwGetVideoModes(long monitor, IntBuffer count) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(monitor);
			checkBuffer(count, 1);
		}
		long __result = nglfwGetVideoModes(monitor, memAddress(count));
		return memByteBuffer(__result, count.get(count.position()) * GLFWvidmode.SIZEOF);
	}

	// --- [ glfwGetVideoMode ] ---

	/** JNI method for {@link #glfwGetVideoMode} */
	public static native void nglfwGetVideoMode(long monitor, long __result);

	/**
	 * This function returns the current video mode of the specified monitor.
	 *
	 * @param monitor monitor to query
	 */
	public static void glfwGetVideoMode(long monitor, ByteBuffer __result) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(monitor);
		nglfwGetVideoMode(monitor, memAddress(__result));
	}

	// --- [ glfwSetGamma ] ---

	/** JNI method for {@link #glfwSetGamma} */
	public static native void nglfwSetGamma(long monitor, float gamma);

	/**
	 * This function generates a gamma ramp from the specified exponent and then
	 * calls {@link #glfwSetGammaRamp} with it.
	 *
	 * @param monitor monitor whose gamma ramp to set
	 * @param gamma   desired exponent
	 */
	public static void glfwSetGamma(long monitor, float gamma) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(monitor);
		nglfwSetGamma(monitor, gamma);
	}

	// --- [ glfwGetGammaRamp ] ---

	/** JNI method for {@link #glfwGetGammaRamp} */
	public static native void nglfwGetGammaRamp(long monitor, long ramp);

	/**
	 * This function retrieves the current gamma ramp of the specified monitor.
	 *
	 * @param monitor monitor to query
	 * @param ramp    Where to store the gamma ramp
	 */
	public static void glfwGetGammaRamp(long monitor, ByteBuffer ramp) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(monitor);
			checkBuffer(ramp, GLFWgammaramp.SIZEOF);
		}
		nglfwGetGammaRamp(monitor, memAddress(ramp));
	}

	// --- [ glfwSetGammaRamp ] ---

	/** JNI method for {@link #glfwSetGammaRamp} */
	public static native void nglfwSetGammaRamp(long monitor, long ramp);

	/**
	 * This function sets the current gamma ramp for the specified monitor.
	 *
	 * @param monitor monitor whose gamma ramp to set
	 * @param ramp    gamma ramp to use
	 */
	public static void glfwSetGammaRamp(long monitor, ByteBuffer ramp) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(monitor);
			checkBuffer(ramp, GLFWgammaramp.SIZEOF);
		}
		nglfwSetGammaRamp(monitor, memAddress(ramp));
	}

	// --- [ glfwDefaultWindowHints ] ---

	/**
	 * This function resets all window hints to their default values.
	 * <p/>
	 * Note: This function may only be called from the main thread.
	 */
	public static native void glfwDefaultWindowHints();

	// --- [ glfwWindowHint ] ---

	/**
	 * This function sets hints for the next call to {@link #glfwCreateWindow}. The
	 * hints, once set, retain their values until changed by a call to
	 * glfwWindowHint or {@link #glfwDefaultWindowHints}, or until the library is
	 * terminated with {@link #glfwTerminate}.
	 * <p/>
	 * Some window hints are hard constraints. These must match the available
	 * capabilities <em>exactly</em> for window creation to succeed. Hints
	 * that are not hard constraints are matched as closely as possible, but the
	 * resulting window may differ from what these hints requested. To
	 * find out the actual parameters of the created window, use the
	 * {@link #glfwGetWindowParam} function.
	 * <p/>
	 * Hints that do not apply to a given type of window are ignored.
	 * <p/>
	 * Window hints:
	 * <p/>
	 * The {@link #GLFW_RESIZABLE} hint specifies whether the window will be resizable by
	 * the user. The window will still be resizable using the
	 * {@link #glfwSetWindowSize} function.  This hint is ignored for fullscreen windows.
	 * <p/>
	 * The {@link #GLFW_VISIBLE} hint specifies whether the window will be initially
	 * visible. This hint is ignored for fullscreen windows.
	 * <p/>
	 * Note: This function may only be called from the main thread.
	 *
	 * @param target The window hint to set
	 * @param hint   new value of the window hint
	 */
	public static native void glfwWindowHint(int target, int hint);

	// --- [ glfwCreateWindow ] ---

	/** JNI method for {@link #glfwCreateWindow} */
	public static native long nglfwCreateWindow(int width, int height, long title, long monitor, long share);

	/**
	 * This function creates a window. Most of the options controlling how the window should be created are specified via the {@link #glfwWindowHint} function.
	 * <p/>
	 * Note that the actual properties of the window may differ from what you requested, as not all parameters and hints are hard constraints.
	 * <p/>
	 * To create the window at a specific position, make it initially invisible using the {@link #GLFW_VISIBLE} window hint, set its position and then show it.
	 * <p/>
	 * For fullscreen windows the initial cursor mode is {@link #GLFW_CURSOR_CAPTURED} and the screensaver is prohibited from starting. For regular windows the
	 * initial cursor mode is {@link #GLFW_CURSOR_NORMAL} and the screensaver is allowed to start.
	 * <p/>
	 * This function may only be called from the main thread.
	 *
	 * @param width   desired width, in pixels, of the window
	 * @param height  desired height, in pixels, of the window
	 * @param title   initial, UTF-8 encoded window title
	 * @param monitor monitor to use for fullscreen mode, or null to use windowed mode
	 * @param share   window whose context to share resources with, or null to not share resources
	 */
	public static long glfwCreateWindow(int width, int height, ByteBuffer title, long monitor, long share) {
		if ( LWJGLUtil.CHECKS )
			checkNT1(title);
		return nglfwCreateWindow(width, height, memAddress(title), monitor, share);
	}

	/** CharSequence version of: {@link #glfwCreateWindow} */
	public static long glfwCreateWindow(int width, int height, CharSequence title, long monitor, long share) {
		return nglfwCreateWindow(width, height, memAddress(memEncodeUTF8(title)), monitor, share);
	}

	// --- [ glfwDestroyWindow ] ---

	/** JNI method for {@link #glfwDestroyWindow} */
	public static native void nglfwDestroyWindow(long window);

	/**
	 * This function destroys the specified window. On calling this function, no further callbacks will be called for that window.
	 * <p/>
	 * Notes:
	 * <ul>
	 * <li>This function may only be called from the main thread.</li>
	 * <li>This function may not be called from a callback.</li>
	 * </ul>
	 *
	 * @param window window to destroy
	 */
	public static void glfwDestroyWindow(long window) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		WindowCallback.set(window, null);
		nglfwDestroyWindow(window);
	}

	// --- [ glfwWindowShouldClose ] ---

	/** JNI method for {@link #glfwWindowShouldClose} */
	public static native int nglfwWindowShouldClose(long window);

	/**
	 * This function returns the value of the close flag of the specified window.
	 *
	 * @param window window to query
	 */
	public static int glfwWindowShouldClose(long window) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nglfwWindowShouldClose(window);
	}

	// --- [ glfwSetWindowShouldClose ] ---

	/** JNI method for {@link #glfwSetWindowShouldClose} */
	public static native void nglfwSetWindowShouldClose(long window, int value);

	/**
	 * This function sets the value of the close flag of the specified window.
	 * This can be used to override the user's attempt to close the window, or
	 * to signal that it should be closed.
	 *
	 * @param window window whose flag to change
	 * @param value  new value
	 */
	public static void glfwSetWindowShouldClose(long window, int value) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwSetWindowShouldClose(window, value);
	}

	// --- [ glfwSetWindowTitle ] ---

	/** JNI method for {@link #glfwSetWindowTitle} */
	public static native void nglfwSetWindowTitle(long window, long title);

	/**
	 * This function sets the window title, encoded as UTF-8, of the specified
	 * window.
	 *
	 * @param window window whose title to change
	 * @param title  UTF-8 encoded window title
	 */
	public static void glfwSetWindowTitle(long window, ByteBuffer title) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(window);
			checkNT1(title);
		}
		nglfwSetWindowTitle(window, memAddress(title));
	}

	/** CharSequence version of: {@link #glfwSetWindowTitle} */
	public static void glfwSetWindowTitle(long window, CharSequence title) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwSetWindowTitle(window, memAddress(memEncodeUTF8(title)));
	}

	// --- [ glfwGetWindowPos ] ---

	/** JNI method for {@link #glfwGetWindowPos} */
	public static native void nglfwGetWindowPos(long window, long xpos, long ypos);

	/**
	 * This function retrieves the position, in screen coordinates, of the
	 * upper-left corner of the client area of the specified window.
	 *
	 * @param window window to query
	 * @param xpos   x-coordinate of the upper-left corner of the client area
	 * @param ypos   y-coordinate of the upper-left corner of the client area
	 */
	public static void glfwGetWindowPos(long window, ByteBuffer xpos, ByteBuffer ypos) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(window);
			checkBuffer(xpos, 1 << 2);
			checkBuffer(ypos, 1 << 2);
		}
		nglfwGetWindowPos(window, memAddress(xpos), memAddress(ypos));
	}

	/** Alternative version of: {@link #glfwGetWindowPos} */
	public static void glfwGetWindowPos(long window, IntBuffer xpos, IntBuffer ypos) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(window);
			checkBuffer(xpos, 1);
			checkBuffer(ypos, 1);
		}
		nglfwGetWindowPos(window, memAddress(xpos), memAddress(ypos));
	}

	// --- [ glfwSetWindowPos ] ---

	/** JNI method for {@link #glfwSetWindowPos} */
	public static native void nglfwSetWindowPos(long window, int xpos, int ypos);

	/**
	 * This function sets the position, in screen coordinates, of the upper-left
	 * corner of the client area of the window.
	 * <p/>
	 * If you wish to set an initial window position you should create a hidden window (using {@link #glfwWindowHint} and {@link #GLFW_VISIBLE}, set its
	 * position and then show it.
	 * <p/>
	 * Notes:
	 * <ul>
	 * <li>It is very rarely a good idea to move an already visible window, as it will confuse and annoy the user.</li>
	 * <li>This function may only be called from the main thread.</li>
	 * <li>The window manager may put limits on what positions are allowed.</li>
	 * <li><strong>X11</strong>: Some window managers ignore the set position of hidden (i.e. unmapped) windows, instead placing them where it thinks is
	 * appropriate once they are shown.</li>
	 * <li><strong>Mac OS X</strong>: The screen coordinate system is inverted.</li>
	 * </ul>
	 *
	 * @param window window to query
	 * @param xpos   x-coordinate of the upper-left corner of the client area
	 * @param ypos   y-coordinate of the upper-left corner of the client area
	 */
	public static void glfwSetWindowPos(long window, int xpos, int ypos) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwSetWindowPos(window, xpos, ypos);
	}

	// --- [ glfwGetWindowSize ] ---

	/** JNI method for {@link #glfwGetWindowSize} */
	public static native void nglfwGetWindowSize(long window, long width, long height);

	/**
	 * This function retrieves the size, in pixels, of the client area of the
	 * specified window.
	 *
	 * @param window window whose size to retrieve
	 * @param width  width of the client area
	 * @param height height of the client area
	 */
	public static void glfwGetWindowSize(long window, ByteBuffer width, ByteBuffer height) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(window);
			checkBuffer(width, 1 << 2);
			checkBuffer(height, 1 << 2);
		}
		nglfwGetWindowSize(window, memAddress(width), memAddress(height));
	}

	/** Alternative version of: {@link #glfwGetWindowSize} */
	public static void glfwGetWindowSize(long window, IntBuffer width, IntBuffer height) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(window);
			checkBuffer(width, 1);
			checkBuffer(height, 1);
		}
		nglfwGetWindowSize(window, memAddress(width), memAddress(height));
	}

	// --- [ glfwSetWindowSize ] ---

	/** JNI method for {@link #glfwSetWindowSize} */
	public static native void nglfwSetWindowSize(long window, int width, int height);

	/**
	 * This function sets the size, in pixels, of the client area of the specified
	 * window.
	 * <p/>
	 * Notes:
	 * <ul>
	 * <li>This function may only be called from the main thread.</li>
	 * <li>The window manager may put limits on what window sizes are allowed.</li>
	 * <li>For fullscreen windows, this function selects and switches to the resolution closest to the specified size, without destroying the window's context.</li>
	 * </ul>
	 *
	 * @param window window to resize
	 * @param width  desired width of the specified window
	 * @param height desired height of the specified window
	 */
	public static void glfwSetWindowSize(long window, int width, int height) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwSetWindowSize(window, width, height);
	}

	// --- [ glfwIconifyWindow ] ---

	/** JNI method for {@link #glfwIconifyWindow} */
	public static native void nglfwIconifyWindow(long window);

	/**
	 * This function iconifies/minimizes the specified window, if it was previously
	 * restored.  If it is a fullscreen window, the original monitor resolution is
	 * restored until the window is restored.  If the window is already iconified,
	 * this function does nothing.
	 * <p/>
	 * Note: This function may only be called from the main thread.
	 *
	 * @param window window to iconify
	 */
	public static void glfwIconifyWindow(long window) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwIconifyWindow(window);
	}

	// --- [ glfwRestoreWindow ] ---

	/** JNI method for {@link #glfwRestoreWindow} */
	public static native void nglfwRestoreWindow(long window);

	/**
	 * This function restores the specified window, if it was previously
	 * iconified/minimized.  If the window is already restored, this function does
	 * nothing.
	 * <p/>
	 * Note: This function may only be called from the main thread.
	 *
	 * @param window window to restore
	 */
	public static void glfwRestoreWindow(long window) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwRestoreWindow(window);
	}

	// --- [ glfwShowWindow ] ---

	/** JNI method for {@link #glfwShowWindow} */
	public static native void nglfwShowWindow(long window);

	/**
	 * This function makes the specified window visible, if it was previously
	 * hidden.  If the window is already visible or is in fullscreen mode, this
	 * function does nothing.
	 * <p/>
	 * Note: This function may only be called from the main thread.
	 *
	 * @param window window to make visible
	 */
	public static void glfwShowWindow(long window) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwShowWindow(window);
	}

	// --- [ glfwHideWindow ] ---

	/** JNI method for {@link #glfwHideWindow} */
	public static native void nglfwHideWindow(long window);

	/**
	 * This function hides the specified window, if it was previously visible.  If
	 * the window is already hidden or is in fullscreen mode, this function does
	 * nothing.
	 * <p/>
	 * Note: This function may only be called from the main thread.
	 *
	 * @param window window to hide
	 */
	public static void glfwHideWindow(long window) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwHideWindow(window);
	}

	// --- [ glfwGetWindowMonitor ] ---

	/** JNI method for {@link #glfwGetWindowMonitor} */
	public static native long nglfwGetWindowMonitor(long window);

	/**
	 * This function returns the handle of the monitor that the specified window is
	 * in fullscreen on.
	 *
	 * @param window window to query
	 */
	public static long glfwGetWindowMonitor(long window) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nglfwGetWindowMonitor(window);
	}

	// --- [ glfwGetWindowParam ] ---

	/** JNI method for {@link #glfwGetWindowParam} */
	public static native int nglfwGetWindowParam(long window, int param);

	/**
	 * This function returns a property of the specified window.
	 * <ul>
	 * <li>The {@link #GLFW_FOCUSED} parameter indicates whether the window is focused.</li>
	 * <li>The {@link #GLFW_ICONIFIED} parameter indicates whether the window is iconified.</li>
	 * <li>The {@link #GLFW_VISIBLE} parameter indicates whether the window is visible.</li>
	 * <li>The {@link #GLFW_RESIZABLE} parameter indicates whether the window is resizable by the user.</li>
	 * </ul>
	 *
	 * @param window window to query
	 * @param param  parameter whose value to return
	 */
	public static int glfwGetWindowParam(long window, int param) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nglfwGetWindowParam(window, param);
	}

	// --- [ glfwSetWindowUserPointer ] ---

	/** JNI method for {@link #glfwSetWindowUserPointer} */
	public static native void nglfwSetWindowUserPointer(long window, long pointer);

	/**
	 * This function sets the user-defined pointer of the specified window.  The
	 * current value is retained until the window is destroyed.  The initial value
	 * is null.
	 *
	 * @param window  window whose pointer to set
	 * @param pointer new value
	 */
	public static void glfwSetWindowUserPointer(long window, long pointer) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwSetWindowUserPointer(window, pointer);
	}

	// --- [ glfwGetWindowUserPointer ] ---

	/** JNI method for {@link #glfwGetWindowUserPointer} */
	public static native long nglfwGetWindowUserPointer(long window);

	/**
	 * This function returns the current value of the user-defined pointer of the
	 * specified window.  The initial value is null.
	 *
	 * @param window window whose pointer to return
	 */
	public static long glfwGetWindowUserPointer(long window) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nglfwGetWindowUserPointer(window);
	}

	// --- [ glfwSetWindowPosCallback ] ---

	/** JNI method for {@link #glfwSetWindowPosCallback} */
	public static native void nglfwSetWindowPosCallback(long window, long cbfun);

	/**
	 * Sets the position callback for the specified window. See {@link WindowCallback#set(long, WindowCallback, int)}.
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or NULL to remove the currently set callback
	 */
	public static void glfwSetWindowPosCallback(long window, long cbfun) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwSetWindowPosCallback(window, cbfun);
	}

	// --- [ glfwSetWindowSizeCallback ] ---

	/** JNI method for {@link #glfwSetWindowSizeCallback} */
	public static native void nglfwSetWindowSizeCallback(long window, long cbfun);

	/**
	 * Sets the size callback for the specified window. See {@link WindowCallback#set(long, WindowCallback, int)}.
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or NULL to remove the currently set callback
	 */
	public static void glfwSetWindowSizeCallback(long window, long cbfun) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwSetWindowSizeCallback(window, cbfun);
	}

	// --- [ glfwSetWindowCloseCallback ] ---

	/** JNI method for {@link #glfwSetWindowCloseCallback} */
	public static native void nglfwSetWindowCloseCallback(long window, long cbfun);

	/**
	 * Sets the close callback for the specified window. See {@link WindowCallback#set(long, WindowCallback, int)}.
	 * <p/>
	 * This callback is called when the user attempts to close the window, i.e. for example by clicking the window's close widget.  It is called immediately
	 * after the window's close flag has been set.
	 * <p/>
	 * Calling {@link #glfwDestroyWindow} does not cause this callback to be called.
	 * <p/>
	 * <b>Mac OS X:</b> Selecting Quit from the application menu will trigger the close callback for all windows.
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or NULL to remove the currently set callback
	 */
	public static void glfwSetWindowCloseCallback(long window, long cbfun) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwSetWindowCloseCallback(window, cbfun);
	}

	// --- [ glfwSetWindowRefreshCallback ] ---

	/** JNI method for {@link #glfwSetWindowRefreshCallback} */
	public static native void nglfwSetWindowRefreshCallback(long window, long cbfun);

	/**
	 * Sets the refresh callback for the specified window. See {@link WindowCallback#set(long, WindowCallback, int)}.
	 * <p/>
	 * This callback is called when the client area of the window needs to be redrawn, for example if the window has been exposed after having been covered by
	 * another window.
	 * <p/>
	 * On compositing window systems such as Aero, Compiz or Aqua, where the window contents are saved off-screen, this callback may be called only very
	 * infrequently or never at all.
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or NULL to remove the currently set callback
	 */
	public static void glfwSetWindowRefreshCallback(long window, long cbfun) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwSetWindowRefreshCallback(window, cbfun);
	}

	// --- [ glfwSetWindowFocusCallback ] ---

	/** JNI method for {@link #glfwSetWindowFocusCallback} */
	public static native void nglfwSetWindowFocusCallback(long window, long cbfun);

	/**
	 * Sets the focus callback for the specified window. See {@link WindowCallback#set(long, WindowCallback, int)}.
	 * <p/>
	 * This callback is called when the window gains or loses focus.
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or NULL to remove the currently set callback
	 */
	public static void glfwSetWindowFocusCallback(long window, long cbfun) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwSetWindowFocusCallback(window, cbfun);
	}

	// --- [ glfwSetWindowIconifyCallback ] ---

	/** JNI method for {@link #glfwSetWindowIconifyCallback} */
	public static native void nglfwSetWindowIconifyCallback(long window, long cbfun);

	/**
	 * Sets the iconify callback for the specified window. See {@link WindowCallback#set(long, WindowCallback, int)}.
	 * <p/>
	 * This callback is called when the window is iconified or restored.
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or NULL to remove the currently set callback
	 */
	public static void glfwSetWindowIconifyCallback(long window, long cbfun) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwSetWindowIconifyCallback(window, cbfun);
	}

	// --- [ glfwPollEvents ] ---

	/**
	 * This function processes only those events that have already been recevied
	 * and then returns immediately.
	 */
	public static native void glfwPollEvents();

	// --- [ glfwWaitEvents ] ---

	/**
	 * This function blocks until at least one event has been recevied and then
	 * processes all received events before returning.
	 */
	public static native void glfwWaitEvents();

	// --- [ glfwGetInputMode ] ---

	/** JNI method for {@link #glfwGetInputMode} */
	public static native int nglfwGetInputMode(long window, int mode);

	/**
	 * Returns the value of an input option for the specified window
	 *
	 * @param window window to query
	 * @param mode   One of {@link #GLFW_CURSOR_MODE}, {@link #GLFW_STICKY_KEYS} or {@link #GLFW_STICKY_MOUSE_BUTTONS}
	 */
	public static int glfwGetInputMode(long window, int mode) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nglfwGetInputMode(window, mode);
	}

	// --- [ glfwSetInputMode ] ---

	/** JNI method for {@link #glfwSetInputMode} */
	public static native void nglfwSetInputMode(long window, int mode, int value);

	/**
	 * Sets an input option for the specified window
	 * <p/>
	 * If mode is {@link #GLFW_CURSOR_MODE}, the value must be one of the supported input
	 * modes:
	 * <ul>
	 * <li>{@link #GLFW_CURSOR_NORMAL} makes the cursor visible and behaving normally.</li>
	 * <li>{@link #GLFW_CURSOR_HIDDEN} makes the cursor invisible when it is over the client area of the window.</li>
	 * <li>{@link #GLFW_CURSOR_CAPTURED} makes the cursor invisible and unable to leave the window but unconstrained in terms of position.</li>
	 * </ul>
	 * <p/>
	 * If mode is {@link #GLFW_STICKY_KEYS}, the value must be either {@link GL11#GL_TRUE} to
	 * enable sticky keys, or {@link GL11#GL_FALSE} to disable it.  If sticky keys are
	 * enabled, a key press will ensure that {@link #glfwGetKey} returns
	 * {@link #GLFW_PRESS} the next time it is called even if the key had been released
	 * before the call.
	 * <p/>
	 * If mode is {@link #GLFW_STICKY_MOUSE_BUTTONS}, the value must be either {@link GL11#GL_TRUE}
	 * to enable sticky mouse buttons, or {@link GL11#GL_FALSE} to disable it.  If sticky
	 * mouse buttons are enabled, a mouse button press will ensure that
	 * {@link #glfwGetMouseButton} returns {@link #GLFW_PRESS} the next time it is called even
	 * if the mouse button had been released before the call.
	 *
	 * @param window window whose input mode to set
	 * @param mode   One of {@link #GLFW_CURSOR_MODE}, {@link #GLFW_STICKY_KEYS} or {@link #GLFW_STICKY_MOUSE_BUTTONS}
	 * @param value  new value of the specified input mode
	 */
	public static void glfwSetInputMode(long window, int mode, int value) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwSetInputMode(window, mode, value);
	}

	// --- [ glfwGetKey ] ---

	/** JNI method for {@link #glfwGetKey} */
	public static native int nglfwGetKey(long window, int key);

	/**
	 * This function returns the last state reported for the specified key to the
	 * specified window. The returned state is one of {@link #GLFW_PRESS} or
	 * {@link #GLFW_RELEASE}. The higher-level state {@link #GLFW_REPEAT} is only reported to
	 * the key callback.
	 * <p/>
	 * If the {@link #GLFW_STICKY_KEYS} input mode is enabled, this function returns
	 * {@link #GLFW_PRESS} the first time you call this function after a key has been
	 * pressed, even if the key has already been released.
	 * <p/>
	 * The key functions deal with physical keys, with tokens named after their use on the standard US keyboard layout. If you want to input text, use the
	 * Unicode character callback instead.
	 *
	 * @param window desired window
	 * @param key    desired keyboard key
	 */
	public static int glfwGetKey(long window, int key) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nglfwGetKey(window, key);
	}

	// --- [ glfwGetMouseButton ] ---

	/** JNI method for {@link #glfwGetMouseButton} */
	public static native int nglfwGetMouseButton(long window, int button);

	/**
	 * This function returns the last state reported for the specified mouse button
	 * to the specified window.
	 * <p/>
	 * If the {@link #GLFW_STICKY_MOUSE_BUTTONS} input mode is enabled, this function
	 * returns {@link #GLFW_PRESS} the first time you call this function after a mouse
	 * button has been pressed, even if the mouse button has already been released.
	 *
	 * @param window desired window
	 * @param button desired mouse button
	 */
	public static int glfwGetMouseButton(long window, int button) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		return nglfwGetMouseButton(window, button);
	}

	// --- [ glfwGetCursorPos ] ---

	/** JNI method for {@link #glfwGetCursorPos} */
	public static native void nglfwGetCursorPos(long window, long xpos, long ypos);

	/**
	 * This function returns the last reported position of the cursor to the
	 * specified window.
	 *
	 * @param window desired window
	 * @param xpos   cursor x-coordinate, relative to the left edge of the client area or null
	 * @param ypos   cursor y-coordinate, relative to the to top edge of the client area, or null.
	 */
	public static void glfwGetCursorPos(long window, ByteBuffer xpos, ByteBuffer ypos) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(window);
			checkBuffer(xpos, 1 << 3);
			checkBuffer(ypos, 1 << 3);
		}
		nglfwGetCursorPos(window, memAddress(xpos), memAddress(ypos));
	}

	/** Alternative version of: {@link #glfwGetCursorPos} */
	public static void glfwGetCursorPos(long window, DoubleBuffer xpos, DoubleBuffer ypos) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(window);
			checkBuffer(xpos, 1);
			checkBuffer(ypos, 1);
		}
		nglfwGetCursorPos(window, memAddress(xpos), memAddress(ypos));
	}

	// --- [ glfwSetCursorPos ] ---

	/** JNI method for {@link #glfwSetCursorPos} */
	public static native void nglfwSetCursorPos(long window, double xpos, double ypos);

	/**
	 * This function sets the position of the cursor. The specified window must be
	 * focused. If the window does not have focus when this function is called, it
	 * fails silently.
	 *
	 * @param window desired window
	 * @param xpos   desired x-coordinate, relative to the left edge of the client area, or null
	 * @param ypos   desired y-coordinate, relative to the top edge of the client area, or null
	 */
	public static void glfwSetCursorPos(long window, double xpos, double ypos) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwSetCursorPos(window, xpos, ypos);
	}

	// --- [ glfwSetKeyCallback ] ---

	/** JNI method for {@link #glfwSetKeyCallback} */
	public static native void nglfwSetKeyCallback(long window, long cbfun);

	/**
	 * Sets the key callback. See {@link WindowCallback#set(long, WindowCallback, int)}.
	 * <p/>
	 * The key callback deals with physical keys, with key tokens named after their use on the standard US keyboard layout. If you want to input text, use the
	 * Unicode character callback instead.
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or NULL to remove the currently set callback
	 */
	public static void glfwSetKeyCallback(long window, long cbfun) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwSetKeyCallback(window, cbfun);
	}

	// --- [ glfwSetCharCallback ] ---

	/** JNI method for {@link #glfwSetCharCallback} */
	public static native void nglfwSetCharCallback(long window, long cbfun);

	/**
	 * Sets the Unicode character callback. See {@link WindowCallback#set(long, WindowCallback, int)}.
	 * <p/>
	 * The Unicode character callback is for text input. If you want to know whether a specific key was pressed or released, use the key callback.
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or NULL to remove the currently set callback
	 */
	public static void glfwSetCharCallback(long window, long cbfun) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwSetCharCallback(window, cbfun);
	}

	// --- [ glfwSetMouseButtonCallback ] ---

	/** JNI method for {@link #glfwSetMouseButtonCallback} */
	public static native void nglfwSetMouseButtonCallback(long window, long cbfun);

	/**
	 * Sets the mouse button callback. See {@link WindowCallback#set(long, WindowCallback, int)}.
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or NULL to remove the currently set callback
	 */
	public static void glfwSetMouseButtonCallback(long window, long cbfun) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwSetMouseButtonCallback(window, cbfun);
	}

	// --- [ glfwSetCursorPosCallback ] ---

	/** JNI method for {@link #glfwSetCursorPosCallback} */
	public static native void nglfwSetCursorPosCallback(long window, long cbfun);

	/**
	 * Sets the cursor position callback. See {@link WindowCallback#set(long, WindowCallback, int)}.
	 * <p/>
	 * The position is relative to the upper-left corner of the client area of the window.
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or NULL to remove the currently set callback
	 */
	public static void glfwSetCursorPosCallback(long window, long cbfun) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwSetCursorPosCallback(window, cbfun);
	}

	// --- [ glfwSetCursorEnterCallback ] ---

	/** JNI method for {@link #glfwSetCursorEnterCallback} */
	public static native void nglfwSetCursorEnterCallback(long window, long cbfun);

	/**
	 * Sets the cursor enter/exit callback. See {@link WindowCallback#set(long, WindowCallback, int)}.
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or NULL to remove the currently set callback
	 */
	public static void glfwSetCursorEnterCallback(long window, long cbfun) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwSetCursorEnterCallback(window, cbfun);
	}

	// --- [ glfwSetScrollCallback ] ---

	/** JNI method for {@link #glfwSetScrollCallback} */
	public static native void nglfwSetScrollCallback(long window, long cbfun);

	/**
	 * Sets the scroll callback. See {@link WindowCallback#set(long, WindowCallback, int)}.
	 * <p/>
	 * This receives all scrolling input, like that from a mouse wheel or a touchpad scrolling area.
	 *
	 * @param window the window whose callback to set
	 * @param cbfun  the new callback or NULL to remove the currently set callback
	 */
	public static void glfwSetScrollCallback(long window, long cbfun) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwSetScrollCallback(window, cbfun);
	}

	// --- [ glfwGetJoystickParam ] ---

	/**
	 * This function returns a parameter of the specified joystick.
	 *
	 * @param joy   joystick to query
	 * @param param parameter whose value to return
	 */
	public static native int glfwGetJoystickParam(int joy, int param);

	// --- [ glfwGetJoystickAxes ] ---

	/** JNI method for {@link #glfwGetJoystickAxes} */
	public static native int nglfwGetJoystickAxes(int joy, long axes, int numaxes);

	/**
	 * This function returns the current positions of axes of the specified
	 * joystick.
	 *
	 * @param joy     joystick to query
	 * @param axes    array to hold the values
	 * @param numaxes size of the provided array
	 */
	public static int glfwGetJoystickAxes(int joy, ByteBuffer axes, int numaxes) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(axes, numaxes << 2);
		return nglfwGetJoystickAxes(joy, memAddress(axes), numaxes);
	}

	/** Alternative version of: {@link #glfwGetJoystickAxes} */
	public static int glfwGetJoystickAxes(int joy, FloatBuffer axes) {
		return nglfwGetJoystickAxes(joy, memAddress(axes), axes.remaining());
	}

	// --- [ glfwGetJoystickButtons ] ---

	/** JNI method for {@link #glfwGetJoystickButtons} */
	public static native int nglfwGetJoystickButtons(int joy, long buttons, int numbuttons);

	/**
	 * This function returns the current state of buttons of the specified
	 * joystick.
	 *
	 * @param joy        joystick to query
	 * @param buttons    array to hold the values
	 * @param numbuttons size of the provided array
	 */
	public static int glfwGetJoystickButtons(int joy, ByteBuffer buttons, int numbuttons) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(buttons, numbuttons);
		return nglfwGetJoystickButtons(joy, memAddress(buttons), numbuttons);
	}

	/** Alternative version of: {@link #glfwGetJoystickButtons} */
	public static int glfwGetJoystickButtons(int joy, ByteBuffer buttons) {
		return nglfwGetJoystickButtons(joy, memAddress(buttons), buttons.remaining());
	}

	// --- [ glfwGetJoystickName ] ---

	/** JNI method for {@link #glfwGetJoystickName} */
	public static native long nglfwGetJoystickName(int joy);

	/**
	 * This function returns the name, encoded as UTF-8, of the specified joystick.
	 *
	 * @param joy joystick to query
	 */
	public static String glfwGetJoystickName(int joy) {
		long __result = nglfwGetJoystickName(joy);
		return memDecodeUTF8(memByteBufferNT1(__result));
	}

	// --- [ glfwSetClipboardString ] ---

	/** JNI method for {@link #glfwSetClipboardString} */
	public static native void nglfwSetClipboardString(long window, long string);

	/**
	 * This function sets the system clipboard to the specified, UTF-8 encoded
	 * string.  The string is copied before returning, so you don't have to retain
	 * it afterwards.
	 *
	 * @param window window that will own the clipboard contents
	 * @param string UTF-8 encoded string
	 */
	public static void glfwSetClipboardString(long window, ByteBuffer string) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(window);
			checkNT1(string);
		}
		nglfwSetClipboardString(window, memAddress(string));
	}

	/** CharSequence version of: {@link #glfwSetClipboardString} */
	public static void glfwSetClipboardString(long window, CharSequence string) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		nglfwSetClipboardString(window, memAddress(memEncodeUTF8(string)));
	}

	// --- [ glfwGetClipboardString ] ---

	/** JNI method for {@link #glfwGetClipboardString} */
	public static native long nglfwGetClipboardString(long window);

	/**
	 * This function returns the contents of the system clipboard, if it contains
	 * or is convertible to a UTF-8 encoded string.
	 *
	 * @param window window that will request the clipboard contents
	 */
	public static String glfwGetClipboardString(long window) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(window);
		long __result = nglfwGetClipboardString(window);
		return memDecodeUTF8(memByteBufferNT1(__result));
	}

	// --- [ glfwGetTime ] ---

	/**
	 * This function returns the value of the GLFW timer. Unless the timer has
	 * been set using glfwSetTime, the timer measures time elapsed since GLFW
	 * was initialized.
	 */
	public static native double glfwGetTime();

	// --- [ glfwSetTime ] ---

	/**
	 * This function sets the value of the GLFW timer.  It then continues to count
	 * up from that value.
	 *
	 * @param time new value, in seconds
	 */
	public static native void glfwSetTime(double time);

}