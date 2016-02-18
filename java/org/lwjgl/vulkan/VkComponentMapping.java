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
 * struct VkComponentMapping {
 *     VkComponentSwizzle r;
 *     VkComponentSwizzle g;
 *     VkComponentSwizzle b;
 *     VkComponentSwizzle a;
 * }</code></pre>
 */
public class VkComponentMapping extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		R,
		G,
		B,
		A;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		R = layout.offsetof(0);
		G = layout.offsetof(1);
		B = layout.offsetof(2);
		A = layout.offsetof(3);
	}

	VkComponentMapping(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkComponentMapping} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkComponentMapping(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code r} field. */
	public int r() { return nr(address()); }
	/** Returns the value of the {@code g} field. */
	public int g() { return ng(address()); }
	/** Returns the value of the {@code b} field. */
	public int b() { return nb(address()); }
	/** Returns the value of the {@code a} field. */
	public int a() { return na(address()); }

	/** Sets the specified value to the {@code r} field. */
	public VkComponentMapping r(int value) { nr(address(), value); return this; }
	/** Sets the specified value to the {@code g} field. */
	public VkComponentMapping g(int value) { ng(address(), value); return this; }
	/** Sets the specified value to the {@code b} field. */
	public VkComponentMapping b(int value) { nb(address(), value); return this; }
	/** Sets the specified value to the {@code a} field. */
	public VkComponentMapping a(int value) { na(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkComponentMapping set(
		int r,
		int g,
		int b,
		int a
	) {
		r(r);
		g(g);
		b(b);
		a(a);

		return this;
	}

	/** Unsafe version of {@link #set(VkComponentMapping) set}. */
	public VkComponentMapping nset(long struct) {
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
	public VkComponentMapping set(VkComponentMapping src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(VkComponentMapping) set}. */
	public VkComponentMapping set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link VkComponentMapping} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkComponentMapping malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkComponentMapping} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkComponentMapping calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkComponentMapping} instance allocated with {@link BufferUtils}. */
	public static VkComponentMapping create() {
		return new VkComponentMapping(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkComponentMapping} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkComponentMapping create(long address) {
		return address == NULL ? null : new VkComponentMapping(address, null);
	}

	/**
	 * Returns a new {@link VkComponentMapping.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkComponentMapping.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkComponentMapping.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkComponentMapping.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #r}. */
	public static int nr(long struct) { return memGetInt(struct + VkComponentMapping.R); }
	/** Unsafe version of {@link #g}. */
	public static int ng(long struct) { return memGetInt(struct + VkComponentMapping.G); }
	/** Unsafe version of {@link #b}. */
	public static int nb(long struct) { return memGetInt(struct + VkComponentMapping.B); }
	/** Unsafe version of {@link #a}. */
	public static int na(long struct) { return memGetInt(struct + VkComponentMapping.A); }

	/** Unsafe version of {@link #r(int) r}. */
	public static void nr(long struct, int value) { memPutInt(struct + VkComponentMapping.R, value); }
	/** Unsafe version of {@link #g(int) g}. */
	public static void ng(long struct, int value) { memPutInt(struct + VkComponentMapping.G, value); }
	/** Unsafe version of {@link #b(int) b}. */
	public static void nb(long struct, int value) { memPutInt(struct + VkComponentMapping.B, value); }
	/** Unsafe version of {@link #a(int) a}. */
	public static void na(long struct, int value) { memPutInt(struct + VkComponentMapping.A, value); }

	// -----------------------------------

	/** An array of {@link VkComponentMapping} structs. */
	public static final class Buffer extends StructBuffer<VkComponentMapping, Buffer> {

		/**
		 * Creates a new {@link VkComponentMapping.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkComponentMapping#SIZEOF}, and its mark will be undefined.
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
		protected VkComponentMapping newInstance(long address) {
			return new VkComponentMapping(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code r} field. */
		public int r() { return VkComponentMapping.nr(address()); }
		/** Returns the value of the {@code g} field. */
		public int g() { return VkComponentMapping.ng(address()); }
		/** Returns the value of the {@code b} field. */
		public int b() { return VkComponentMapping.nb(address()); }
		/** Returns the value of the {@code a} field. */
		public int a() { return VkComponentMapping.na(address()); }

		/** Sets the specified value to the {@code r} field. */
		public VkComponentMapping.Buffer r(int value) { VkComponentMapping.nr(address(), value); return this; }
		/** Sets the specified value to the {@code g} field. */
		public VkComponentMapping.Buffer g(int value) { VkComponentMapping.ng(address(), value); return this; }
		/** Sets the specified value to the {@code b} field. */
		public VkComponentMapping.Buffer b(int value) { VkComponentMapping.nb(address(), value); return this; }
		/** Sets the specified value to the {@code a} field. */
		public VkComponentMapping.Buffer a(int value) { VkComponentMapping.na(address(), value); return this; }

	}

}