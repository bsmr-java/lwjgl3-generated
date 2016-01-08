/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/egl/extensions/KHR/EGL_KHR_stream_fifo.txt">KHR_stream_fifo</a> extension.
 * 
 * <p>This extension allows an EGLStream to operate as a fifo rather than as a mailbox.</p>
 * 
 * <p>The EGL_KHR_stream extension defines the EGLStream object. The EGLStream object works like a 1 entry mailbox, allowing the consumer to consume the
 * frame that the producer most recently inserted. If the consumer requests image frames faster than the producer creates them then it gets the most
 * recent one over and over until a new one is inserted. If the producer inserts frames faster than the consumer can consume them then the extra frames
 * are discarded. The producer is never stalled.</p>
 * 
 * <p>This extension allows an EGLStream to be placed into fifo mode. In fifo mode no images are discarded. If the producer attempts to insert a frame and
 * the fifo is full then the producer will stall until there is room in the fifo. When the consumer retrieves an image frame from the EGLStream it will
 * see the image frame that immediately follows the image frame that it last retrieved (unless no such frame has been inserted yet in which case it
 * retrieves the same image frame that it retrieved last time).</p>
 * 
 * <p>Timing of the EGLStream in mailbox mode, as described by the EGL_KHR_stream extension, is the responsibility of the producer (with help from the
 * consumer in the form of the EGL_CONSUMER_LATENCY_USEC_KHR hint).</p>
 * 
 * <p>In contrast, timing of an EGLStream in fifo mode is the responsibility of the consumer. Each image frame in the fifo has an associated timestamp set by
 * the producer. The consumer can use this timestamp to determine when the image frame is intended to be displayed to the user.</p>
 * 
 * <p>Requires {@link EGL12 EGL L.1} and {@link KHRStream KHR_stream}.</p>
 */
public class KHRStreamFIFO {

	/**  */
	public static final int
		EGL_STREAM_FIFO_LENGTH_KHR   = 0x31FC,
		EGL_STREAM_TIME_NOW_KHR      = 0x31FD,
		EGL_STREAM_TIME_CONSUMER_KHR = 0x31FE,
		EGL_STREAM_TIME_PRODUCER_KHR = 0x31FF;

	/** Function address. */
	@JavadocExclude
	public final long QueryStreamTimeKHR;

	@JavadocExclude
	protected KHRStreamFIFO() {
		throw new UnsupportedOperationException();
	}

	@JavadocExclude
	public KHRStreamFIFO(FunctionProvider provider) {
		QueryStreamTimeKHR = provider.getFunctionAddress("eglQueryStreamTimeKHR");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link KHRStreamFIFO} instance. */
	public static KHRStreamFIFO getInstance() {
		return getInstance(EGL.getCapabilities());
	}

	/** Returns the {@link KHRStreamFIFO} instance of the specified {@link EGLCapabilities}. */
	public static KHRStreamFIFO getInstance(EGLCapabilities caps) {
		return checkFunctionality(caps.__KHRStreamFIFO);
	}

	// --- [ eglQueryStreamTimeKHR ] ---

	/** Unsafe version of {@link #eglQueryStreamTimeKHR QueryStreamTimeKHR} */
	@JavadocExclude
	public static int neglQueryStreamTimeKHR(long dpy, long stream, int attribute, long value) {
		long __functionAddress = getInstance().QueryStreamTimeKHR;
		if ( CHECKS ) {
			checkPointer(dpy);
			checkPointer(stream);
		}
		return callPPIPI(__functionAddress, dpy, stream, attribute, value);
	}

	public static int eglQueryStreamTimeKHR(long dpy, long stream, int attribute, ByteBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1 << 3);
		return neglQueryStreamTimeKHR(dpy, stream, attribute, memAddress(value));
	}

	/** Alternative version of: {@link #eglQueryStreamTimeKHR QueryStreamTimeKHR} */
	public static int eglQueryStreamTimeKHR(long dpy, long stream, int attribute, LongBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		return neglQueryStreamTimeKHR(dpy, stream, attribute, memAddress(value));
	}

}