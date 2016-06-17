/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Field Of View (FOV) in tangent of the angle units. As an example, for a standard 90 degree vertical FOV, we would have:
 * 
 * <pre><code>{ UpTan = tan(90 degrees / 2), DownTan = tan(90 degrees / 2) }</code></pre>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code UpTan} &ndash; the tangent of the angle between the viewing vector and the top edge of the field of view</li>
 * <li>{@code DownTan} &ndash; the tangent of the angle between the viewing vector and the bottom edge of the field of view</li>
 * <li>{@code LeftTan} &ndash; the tangent of the angle between the viewing vector and the left edge of the field of view</li>
 * <li>{@code RightTan} &ndash; the tangent of the angle between the viewing vector and the right edge of the field of view</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct ovrFovPort {
    float UpTan;
    float DownTan;
    float LeftTan;
    float RightTan;
}</code></pre>
 */
public class OVRFovPort extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		UPTAN,
		DOWNTAN,
		LEFTTAN,
		RIGHTTAN;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		UPTAN = layout.offsetof(0);
		DOWNTAN = layout.offsetof(1);
		LEFTTAN = layout.offsetof(2);
		RIGHTTAN = layout.offsetof(3);
	}

	OVRFovPort(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link OVRFovPort} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRFovPort(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code UpTan} field. */
	public float UpTan() { return nUpTan(address()); }
	/** Returns the value of the {@code DownTan} field. */
	public float DownTan() { return nDownTan(address()); }
	/** Returns the value of the {@code LeftTan} field. */
	public float LeftTan() { return nLeftTan(address()); }
	/** Returns the value of the {@code RightTan} field. */
	public float RightTan() { return nRightTan(address()); }

	/** Sets the specified value to the {@code UpTan} field. */
	public OVRFovPort UpTan(float value) { nUpTan(address(), value); return this; }
	/** Sets the specified value to the {@code DownTan} field. */
	public OVRFovPort DownTan(float value) { nDownTan(address(), value); return this; }
	/** Sets the specified value to the {@code LeftTan} field. */
	public OVRFovPort LeftTan(float value) { nLeftTan(address(), value); return this; }
	/** Sets the specified value to the {@code RightTan} field. */
	public OVRFovPort RightTan(float value) { nRightTan(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public OVRFovPort set(
		float UpTan,
		float DownTan,
		float LeftTan,
		float RightTan
	) {
		UpTan(UpTan);
		DownTan(DownTan);
		LeftTan(LeftTan);
		RightTan(RightTan);

		return this;
	}

	/** Unsafe version of {@link #set(OVRFovPort) set}. */
	public OVRFovPort nset(long struct) {
		memCopy(struct, address(), SIZEOF);
		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public OVRFovPort set(OVRFovPort src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link OVRFovPort} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static OVRFovPort malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRFovPort} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static OVRFovPort calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRFovPort} instance allocated with {@link BufferUtils}. */
	public static OVRFovPort create() {
		return new OVRFovPort(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link OVRFovPort} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static OVRFovPort create(long address) {
		return address == NULL ? null : new OVRFovPort(address, null);
	}

	/**
	 * Returns a new {@link OVRFovPort.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRFovPort.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRFovPort.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link OVRFovPort.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link OVRFovPort} instance allocated on the thread-local {@link MemoryStack}. */
	public static OVRFovPort mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link OVRFovPort} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static OVRFovPort callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link OVRFovPort} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static OVRFovPort mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRFovPort} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static OVRFovPort callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRFovPort.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link OVRFovPort.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link OVRFovPort.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRFovPort.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #UpTan}. */
	public static float nUpTan(long struct) { return memGetFloat(struct + OVRFovPort.UPTAN); }
	/** Unsafe version of {@link #DownTan}. */
	public static float nDownTan(long struct) { return memGetFloat(struct + OVRFovPort.DOWNTAN); }
	/** Unsafe version of {@link #LeftTan}. */
	public static float nLeftTan(long struct) { return memGetFloat(struct + OVRFovPort.LEFTTAN); }
	/** Unsafe version of {@link #RightTan}. */
	public static float nRightTan(long struct) { return memGetFloat(struct + OVRFovPort.RIGHTTAN); }

	/** Unsafe version of {@link #UpTan(float) UpTan}. */
	public static void nUpTan(long struct, float value) { memPutFloat(struct + OVRFovPort.UPTAN, value); }
	/** Unsafe version of {@link #DownTan(float) DownTan}. */
	public static void nDownTan(long struct, float value) { memPutFloat(struct + OVRFovPort.DOWNTAN, value); }
	/** Unsafe version of {@link #LeftTan(float) LeftTan}. */
	public static void nLeftTan(long struct, float value) { memPutFloat(struct + OVRFovPort.LEFTTAN, value); }
	/** Unsafe version of {@link #RightTan(float) RightTan}. */
	public static void nRightTan(long struct, float value) { memPutFloat(struct + OVRFovPort.RIGHTTAN, value); }

	// -----------------------------------

	/** An array of {@link OVRFovPort} structs. */
	public static final class Buffer extends StructBuffer<OVRFovPort, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link OVRFovPort.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRFovPort#SIZEOF}, and its mark will be undefined.
		 *
		 * <p>The created buffer instance holds a strong reference to the container object.</p>
		 */
		public Buffer(ByteBuffer container) {
			super(container, container.remaining() / SIZEOF);
		}

		Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
			super(address, container, mark, pos, lim, cap);
		}

		@Override
		protected Buffer self() {
			return this;
		}

		@Override
		protected Buffer newBufferInstance(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
			return new Buffer(address, container, mark, pos, lim, cap);
		}

		@Override
		protected OVRFovPort newInstance(long address) {
			return new OVRFovPort(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code UpTan} field. */
		public float UpTan() { return OVRFovPort.nUpTan(address()); }
		/** Returns the value of the {@code DownTan} field. */
		public float DownTan() { return OVRFovPort.nDownTan(address()); }
		/** Returns the value of the {@code LeftTan} field. */
		public float LeftTan() { return OVRFovPort.nLeftTan(address()); }
		/** Returns the value of the {@code RightTan} field. */
		public float RightTan() { return OVRFovPort.nRightTan(address()); }

		/** Sets the specified value to the {@code UpTan} field. */
		public OVRFovPort.Buffer UpTan(float value) { OVRFovPort.nUpTan(address(), value); return this; }
		/** Sets the specified value to the {@code DownTan} field. */
		public OVRFovPort.Buffer DownTan(float value) { OVRFovPort.nDownTan(address(), value); return this; }
		/** Sets the specified value to the {@code LeftTan} field. */
		public OVRFovPort.Buffer LeftTan(float value) { OVRFovPort.nLeftTan(address(), value); return this; }
		/** Sets the specified value to the {@code RightTan} field. */
		public OVRFovPort.Buffer RightTan(float value) { OVRFovPort.nRightTan(address(), value); return this; }

	}

}