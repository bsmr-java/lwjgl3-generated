/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code style="font-family: monospace">
 * struct VkClearDepthStencilValue {
 *     float depth;
 *     uint32_t stencil;
 * }</code></pre>
 */
public class VkClearDepthStencilValue extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		DEPTH,
		STENCIL;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		DEPTH = layout.offsetof(0);
		STENCIL = layout.offsetof(1);
	}

	VkClearDepthStencilValue(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkClearDepthStencilValue} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkClearDepthStencilValue(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code depth} field. */
	public float depth() { return ndepth(address()); }
	/** Returns the value of the {@code stencil} field. */
	public int stencil() { return nstencil(address()); }

	/** Sets the specified value to the {@code depth} field. */
	public VkClearDepthStencilValue depth(float value) { ndepth(address(), value); return this; }
	/** Sets the specified value to the {@code stencil} field. */
	public VkClearDepthStencilValue stencil(int value) { nstencil(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkClearDepthStencilValue set(
		float depth,
		int stencil
	) {
		depth(depth);
		stencil(stencil);

		return this;
	}

	/** Unsafe version of {@link #set(VkClearDepthStencilValue) set}. */
	public VkClearDepthStencilValue nset(long struct) {
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
	public VkClearDepthStencilValue set(VkClearDepthStencilValue src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(VkClearDepthStencilValue) set}. */
	public VkClearDepthStencilValue set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link VkClearDepthStencilValue} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkClearDepthStencilValue malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkClearDepthStencilValue} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkClearDepthStencilValue calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkClearDepthStencilValue} instance allocated with {@link BufferUtils}. */
	public static VkClearDepthStencilValue create() {
		return new VkClearDepthStencilValue(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkClearDepthStencilValue} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkClearDepthStencilValue create(long address) {
		return address == NULL ? null : new VkClearDepthStencilValue(address, null);
	}

	/**
	 * Returns a new {@link VkClearDepthStencilValue.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkClearDepthStencilValue.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkClearDepthStencilValue.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkClearDepthStencilValue.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #depth}. */
	public static float ndepth(long struct) { return memGetFloat(struct + VkClearDepthStencilValue.DEPTH); }
	/** Unsafe version of {@link #stencil}. */
	public static int nstencil(long struct) { return memGetInt(struct + VkClearDepthStencilValue.STENCIL); }

	/** Unsafe version of {@link #depth(float) depth}. */
	public static void ndepth(long struct, float value) { memPutFloat(struct + VkClearDepthStencilValue.DEPTH, value); }
	/** Unsafe version of {@link #stencil(int) stencil}. */
	public static void nstencil(long struct, int value) { memPutInt(struct + VkClearDepthStencilValue.STENCIL, value); }

	// -----------------------------------

	/** An array of {@link VkClearDepthStencilValue} structs. */
	public static final class Buffer extends StructBuffer<VkClearDepthStencilValue, Buffer> {

		/**
		 * Creates a new {@link VkClearDepthStencilValue.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkClearDepthStencilValue#SIZEOF}, and its mark will be undefined.
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
		protected VkClearDepthStencilValue newInstance(long address) {
			return new VkClearDepthStencilValue(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code depth} field. */
		public float depth() { return VkClearDepthStencilValue.ndepth(address()); }
		/** Returns the value of the {@code stencil} field. */
		public int stencil() { return VkClearDepthStencilValue.nstencil(address()); }

		/** Sets the specified value to the {@code depth} field. */
		public VkClearDepthStencilValue.Buffer depth(float value) { VkClearDepthStencilValue.ndepth(address(), value); return this; }
		/** Sets the specified value to the {@code stencil} field. */
		public VkClearDepthStencilValue.Buffer stencil(int value) { VkClearDepthStencilValue.nstencil(address(), value); return this; }

	}

}