/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>struct nk_buffer_marker {
    int active;
    nk_size offset;
}</code></pre>
 */
public class NkBufferMarker extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		ACTIVE,
		OFFSET;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		ACTIVE = layout.offsetof(0);
		OFFSET = layout.offsetof(1);
	}

	NkBufferMarker(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NkBufferMarker} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NkBufferMarker(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code active} field. */
	public int active() { return nactive(address()); }
	/** Returns the value of the {@code offset} field. */
	public long offset() { return noffset(address()); }

	/** Sets the specified value to the {@code active} field. */
	public NkBufferMarker active(int value) { nactive(address(), value); return this; }
	/** Sets the specified value to the {@code offset} field. */
	public NkBufferMarker offset(long value) { noffset(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public NkBufferMarker set(
		int active,
		long offset
	) {
		active(active);
		offset(offset);

		return this;
	}

	/** Unsafe version of {@link #set(NkBufferMarker) set}. */
	public NkBufferMarker nset(long struct) {
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
	public NkBufferMarker set(NkBufferMarker src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link NkBufferMarker} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static NkBufferMarker malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link NkBufferMarker} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static NkBufferMarker calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link NkBufferMarker} instance allocated with {@link BufferUtils}. */
	public static NkBufferMarker create() {
		return new NkBufferMarker(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link NkBufferMarker} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkBufferMarker create(long address) {
		return address == NULL ? null : new NkBufferMarker(address, null);
	}

	/**
	 * Returns a new {@link NkBufferMarker.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkBufferMarker.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkBufferMarker.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link NkBufferMarker.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link NkBufferMarker} instance allocated on the thread-local {@link MemoryStack}. */
	public static NkBufferMarker mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link NkBufferMarker} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static NkBufferMarker callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link NkBufferMarker} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkBufferMarker mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link NkBufferMarker} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkBufferMarker callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link NkBufferMarker.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkBufferMarker.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkBufferMarker.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkBufferMarker.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #active}. */
	public static int nactive(long struct) { return memGetInt(struct + NkBufferMarker.ACTIVE); }
	/** Unsafe version of {@link #offset}. */
	public static long noffset(long struct) { return memGetAddress(struct + NkBufferMarker.OFFSET); }

	/** Unsafe version of {@link #active(int) active}. */
	public static void nactive(long struct, int value) { memPutInt(struct + NkBufferMarker.ACTIVE, value); }
	/** Unsafe version of {@link #offset(long) offset}. */
	public static void noffset(long struct, long value) { memPutAddress(struct + NkBufferMarker.OFFSET, value); }

	// -----------------------------------

	/** An array of {@link NkBufferMarker} structs. */
	public static final class Buffer extends StructBuffer<NkBufferMarker, Buffer> {

		/**
		 * Creates a new {@link NkBufferMarker.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NkBufferMarker#SIZEOF}, and its mark will be undefined.
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
		protected NkBufferMarker newInstance(long address) {
			return new NkBufferMarker(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code active} field. */
		public int active() { return NkBufferMarker.nactive(address()); }
		/** Returns the value of the {@code offset} field. */
		public long offset() { return NkBufferMarker.noffset(address()); }

		/** Sets the specified value to the {@code active} field. */
		public NkBufferMarker.Buffer active(int value) { NkBufferMarker.nactive(address(), value); return this; }
		/** Sets the specified value to the {@code offset} field. */
		public NkBufferMarker.Buffer offset(long value) { NkBufferMarker.noffset(address(), value); return this; }

	}

}