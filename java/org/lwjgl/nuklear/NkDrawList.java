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
 * <pre><code>struct nk_draw_list {
    float global_alpha;
    nk_anti_aliasing shape_AA;
    nk_anti_aliasing line_AA;
    {@link NkDrawNullTexture struct nk_draw_null_texture} null_texture;
    {@link NkRect struct nk_rect} clip_rect;
    struct nk_buffer * buffer;
    struct nk_buffer * vertices;
    struct nk_buffer * elements;
    unsigned int element_count;
    unsigned int vertex_count;
    nk_size cmd_offset;
    unsigned int cmd_count;
    unsigned int path_count;
    unsigned int path_offset;
    {@link NkVec2 struct nk_vec2}[12] circle_vtx;
    {@link NkHandle nk_handle} userdata;
}</code></pre>
 */
public class NkDrawList extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		GLOBAL_ALPHA,
		SHAPE_AA,
		LINE_AA,
		NULL_TEXTURE,
		CLIP_RECT,
		BUFFER,
		VERTICES,
		ELEMENTS,
		ELEMENT_COUNT,
		VERTEX_COUNT,
		CMD_OFFSET,
		CMD_COUNT,
		PATH_COUNT,
		PATH_OFFSET,
		CIRCLE_VTX,
		USERDATA;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4),
			__member(NkDrawNullTexture.SIZEOF, NkDrawNullTexture.ALIGNOF),
			__member(NkRect.SIZEOF, NkRect.ALIGNOF),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(4),
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(4),
			__member(4),
			__array(NkVec2.SIZEOF, NkVec2.ALIGNOF, 12),
			__member(NkHandle.SIZEOF, NkHandle.ALIGNOF)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		GLOBAL_ALPHA = layout.offsetof(0);
		SHAPE_AA = layout.offsetof(1);
		LINE_AA = layout.offsetof(2);
		NULL_TEXTURE = layout.offsetof(3);
		CLIP_RECT = layout.offsetof(4);
		BUFFER = layout.offsetof(5);
		VERTICES = layout.offsetof(6);
		ELEMENTS = layout.offsetof(7);
		ELEMENT_COUNT = layout.offsetof(8);
		VERTEX_COUNT = layout.offsetof(9);
		CMD_OFFSET = layout.offsetof(10);
		CMD_COUNT = layout.offsetof(11);
		PATH_COUNT = layout.offsetof(12);
		PATH_OFFSET = layout.offsetof(13);
		CIRCLE_VTX = layout.offsetof(14);
		USERDATA = layout.offsetof(15);
	}

	NkDrawList(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NkDrawList} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NkDrawList(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code global_alpha} field. */
	public float global_alpha() { return nglobal_alpha(address()); }
	/** Returns the value of the {@code shape_AA} field. */
	public int shape_AA() { return nshape_AA(address()); }
	/** Returns the value of the {@code line_AA} field. */
	public int line_AA() { return nline_AA(address()); }
	/** Returns a {@link NkDrawNullTexture} view of the {@code null_texture} field. */
	public NkDrawNullTexture null_texture() { return nnull_texture(address()); }
	/** Returns a {@link NkRect} view of the {@code clip_rect} field. */
	public NkRect clip_rect() { return nclip_rect(address()); }
	/** Returns a {@link NkBuffer} view of the struct pointed to by the {@code buffer} field. */
	public NkBuffer buffer() { return nbuffer(address()); }
	/** Returns a {@link NkBuffer} view of the struct pointed to by the {@code vertices} field. */
	public NkBuffer vertices() { return nvertices(address()); }
	/** Returns a {@link NkBuffer} view of the struct pointed to by the {@code elements} field. */
	public NkBuffer elements() { return nelements(address()); }
	/** Returns the value of the {@code element_count} field. */
	public int element_count() { return nelement_count(address()); }
	/** Returns the value of the {@code vertex_count} field. */
	public int vertex_count() { return nvertex_count(address()); }
	/** Returns the value of the {@code cmd_offset} field. */
	public long cmd_offset() { return ncmd_offset(address()); }
	/** Returns the value of the {@code cmd_count} field. */
	public int cmd_count() { return ncmd_count(address()); }
	/** Returns the value of the {@code path_count} field. */
	public int path_count() { return npath_count(address()); }
	/** Returns the value of the {@code path_offset} field. */
	public int path_offset() { return npath_offset(address()); }
	/** Returns a {@link NkVec2}.Buffer view of the {@code circle_vtx} field. */
	public NkVec2.Buffer circle_vtx() { return ncircle_vtx(address()); }
	/** Returns a {@link NkVec2} view of the struct at the specified index of the {@code circle_vtx} field. */
	public NkVec2 circle_vtx(int index) { return ncircle_vtx(address(), index); }
	/** Returns a {@link NkHandle} view of the {@code userdata} field. */
	public NkHandle userdata() { return nuserdata(address()); }

	/** Sets the specified value to the {@code global_alpha} field. */
	public NkDrawList global_alpha(float value) { nglobal_alpha(address(), value); return this; }
	/** Sets the specified value to the {@code shape_AA} field. */
	public NkDrawList shape_AA(int value) { nshape_AA(address(), value); return this; }
	/** Sets the specified value to the {@code line_AA} field. */
	public NkDrawList line_AA(int value) { nline_AA(address(), value); return this; }
	/** Copies the specified {@link NkDrawNullTexture} to the {@code null_texture} field. */
	public NkDrawList null_texture(NkDrawNullTexture value) { nnull_texture(address(), value); return this; }
	/** Copies the specified {@link NkRect} to the {@code clip_rect} field. */
	public NkDrawList clip_rect(NkRect value) { nclip_rect(address(), value); return this; }
	/** Sets the address of the specified {@link NkBuffer} to the {@code buffer} field. */
	public NkDrawList buffer(NkBuffer value) { nbuffer(address(), value); return this; }
	/** Sets the address of the specified {@link NkBuffer} to the {@code vertices} field. */
	public NkDrawList vertices(NkBuffer value) { nvertices(address(), value); return this; }
	/** Sets the address of the specified {@link NkBuffer} to the {@code elements} field. */
	public NkDrawList elements(NkBuffer value) { nelements(address(), value); return this; }
	/** Sets the specified value to the {@code element_count} field. */
	public NkDrawList element_count(int value) { nelement_count(address(), value); return this; }
	/** Sets the specified value to the {@code vertex_count} field. */
	public NkDrawList vertex_count(int value) { nvertex_count(address(), value); return this; }
	/** Sets the specified value to the {@code cmd_offset} field. */
	public NkDrawList cmd_offset(long value) { ncmd_offset(address(), value); return this; }
	/** Sets the specified value to the {@code cmd_count} field. */
	public NkDrawList cmd_count(int value) { ncmd_count(address(), value); return this; }
	/** Sets the specified value to the {@code path_count} field. */
	public NkDrawList path_count(int value) { npath_count(address(), value); return this; }
	/** Sets the specified value to the {@code path_offset} field. */
	public NkDrawList path_offset(int value) { npath_offset(address(), value); return this; }
	/** Copies the specified {@link NkVec2.Buffer} to the {@code circle_vtx} field. */
	public NkDrawList circle_vtx(NkVec2.Buffer value) { ncircle_vtx(address(), value); return this; }
	/** Copies the specified {@link NkVec2} at the specified index of the {@code circle_vtx} field. */
	public NkDrawList circle_vtx(int index, NkVec2 value) { ncircle_vtx(address(), index, value); return this; }
	/** Copies the specified {@link NkHandle} to the {@code userdata} field. */
	public NkDrawList userdata(NkHandle value) { nuserdata(address(), value); return this; }

	/** Unsafe version of {@link #set(NkDrawList) set}. */
	public NkDrawList nset(long struct) {
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
	public NkDrawList set(NkDrawList src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link NkDrawList} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static NkDrawList malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link NkDrawList} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static NkDrawList calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link NkDrawList} instance allocated with {@link BufferUtils}. */
	public static NkDrawList create() {
		return new NkDrawList(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link NkDrawList} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkDrawList create(long address) {
		return address == NULL ? null : new NkDrawList(address, null);
	}

	/**
	 * Returns a new {@link NkDrawList.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkDrawList.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkDrawList.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link NkDrawList.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link NkDrawList} instance allocated on the thread-local {@link MemoryStack}. */
	public static NkDrawList mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link NkDrawList} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static NkDrawList callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link NkDrawList} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkDrawList mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link NkDrawList} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkDrawList callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link NkDrawList.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkDrawList.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkDrawList.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkDrawList.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #global_alpha}. */
	public static float nglobal_alpha(long struct) { return memGetFloat(struct + NkDrawList.GLOBAL_ALPHA); }
	/** Unsafe version of {@link #shape_AA}. */
	public static int nshape_AA(long struct) { return memGetInt(struct + NkDrawList.SHAPE_AA); }
	/** Unsafe version of {@link #line_AA}. */
	public static int nline_AA(long struct) { return memGetInt(struct + NkDrawList.LINE_AA); }
	/** Unsafe version of {@link #null_texture}. */
	public static NkDrawNullTexture nnull_texture(long struct) { return NkDrawNullTexture.create(struct + NkDrawList.NULL_TEXTURE); }
	/** Unsafe version of {@link #clip_rect}. */
	public static NkRect nclip_rect(long struct) { return NkRect.create(struct + NkDrawList.CLIP_RECT); }
	/** Unsafe version of {@link #buffer}. */
	public static NkBuffer nbuffer(long struct) { return NkBuffer.create(memGetAddress(struct + NkDrawList.BUFFER)); }
	/** Unsafe version of {@link #vertices}. */
	public static NkBuffer nvertices(long struct) { return NkBuffer.create(memGetAddress(struct + NkDrawList.VERTICES)); }
	/** Unsafe version of {@link #elements}. */
	public static NkBuffer nelements(long struct) { return NkBuffer.create(memGetAddress(struct + NkDrawList.ELEMENTS)); }
	/** Unsafe version of {@link #element_count}. */
	public static int nelement_count(long struct) { return memGetInt(struct + NkDrawList.ELEMENT_COUNT); }
	/** Unsafe version of {@link #vertex_count}. */
	public static int nvertex_count(long struct) { return memGetInt(struct + NkDrawList.VERTEX_COUNT); }
	/** Unsafe version of {@link #cmd_offset}. */
	public static long ncmd_offset(long struct) { return memGetAddress(struct + NkDrawList.CMD_OFFSET); }
	/** Unsafe version of {@link #cmd_count}. */
	public static int ncmd_count(long struct) { return memGetInt(struct + NkDrawList.CMD_COUNT); }
	/** Unsafe version of {@link #path_count}. */
	public static int npath_count(long struct) { return memGetInt(struct + NkDrawList.PATH_COUNT); }
	/** Unsafe version of {@link #path_offset}. */
	public static int npath_offset(long struct) { return memGetInt(struct + NkDrawList.PATH_OFFSET); }
	/** Unsafe version of {@link #circle_vtx}. */
	public static NkVec2.Buffer ncircle_vtx(long struct) {
		return NkVec2.create(struct + NkDrawList.CIRCLE_VTX, 12);
	}
	/** Unsafe version of {@link #circle_vtx(int) circle_vtx}. */
	public static NkVec2 ncircle_vtx(long struct, int index) {
		return NkVec2.create(struct + NkDrawList.CIRCLE_VTX + index * NkVec2.SIZEOF);
	}
	/** Unsafe version of {@link #userdata}. */
	public static NkHandle nuserdata(long struct) { return NkHandle.create(struct + NkDrawList.USERDATA); }

	/** Unsafe version of {@link #global_alpha(float) global_alpha}. */
	public static void nglobal_alpha(long struct, float value) { memPutFloat(struct + NkDrawList.GLOBAL_ALPHA, value); }
	/** Unsafe version of {@link #shape_AA(int) shape_AA}. */
	public static void nshape_AA(long struct, int value) { memPutInt(struct + NkDrawList.SHAPE_AA, value); }
	/** Unsafe version of {@link #line_AA(int) line_AA}. */
	public static void nline_AA(long struct, int value) { memPutInt(struct + NkDrawList.LINE_AA, value); }
	/** Unsafe version of {@link #null_texture(NkDrawNullTexture) null_texture}. */
	public static void nnull_texture(long struct, NkDrawNullTexture value) { memCopy(value.address(), struct + NkDrawList.NULL_TEXTURE, NkDrawNullTexture.SIZEOF); }
	/** Unsafe version of {@link #clip_rect(NkRect) clip_rect}. */
	public static void nclip_rect(long struct, NkRect value) { memCopy(value.address(), struct + NkDrawList.CLIP_RECT, NkRect.SIZEOF); }
	/** Unsafe version of {@link #buffer(NkBuffer) buffer}. */
	public static void nbuffer(long struct, NkBuffer value) { memPutAddress(struct + NkDrawList.BUFFER, addressSafe(value)); }
	/** Unsafe version of {@link #vertices(NkBuffer) vertices}. */
	public static void nvertices(long struct, NkBuffer value) { memPutAddress(struct + NkDrawList.VERTICES, addressSafe(value)); }
	/** Unsafe version of {@link #elements(NkBuffer) elements}. */
	public static void nelements(long struct, NkBuffer value) { memPutAddress(struct + NkDrawList.ELEMENTS, addressSafe(value)); }
	/** Unsafe version of {@link #element_count(int) element_count}. */
	public static void nelement_count(long struct, int value) { memPutInt(struct + NkDrawList.ELEMENT_COUNT, value); }
	/** Unsafe version of {@link #vertex_count(int) vertex_count}. */
	public static void nvertex_count(long struct, int value) { memPutInt(struct + NkDrawList.VERTEX_COUNT, value); }
	/** Unsafe version of {@link #cmd_offset(long) cmd_offset}. */
	public static void ncmd_offset(long struct, long value) { memPutAddress(struct + NkDrawList.CMD_OFFSET, value); }
	/** Unsafe version of {@link #cmd_count(int) cmd_count}. */
	public static void ncmd_count(long struct, int value) { memPutInt(struct + NkDrawList.CMD_COUNT, value); }
	/** Unsafe version of {@link #path_count(int) path_count}. */
	public static void npath_count(long struct, int value) { memPutInt(struct + NkDrawList.PATH_COUNT, value); }
	/** Unsafe version of {@link #path_offset(int) path_offset}. */
	public static void npath_offset(long struct, int value) { memPutInt(struct + NkDrawList.PATH_OFFSET, value); }
	/** Unsafe version of {@link #circle_vtx(NkVec2.Buffer) circle_vtx}. */
	public static void ncircle_vtx(long struct, NkVec2.Buffer value) {
		if ( CHECKS ) checkBufferGT(value, 12);
		memCopy(value.address(), struct + NkDrawList.CIRCLE_VTX, value.remaining() * NkVec2.SIZEOF);
	}
	/** Unsafe version of {@link #circle_vtx(int, NkVec2) circle_vtx}. */
	public static void ncircle_vtx(long struct, int index, NkVec2 value) { memCopy(value.address(), struct + NkDrawList.CIRCLE_VTX + index * NkVec2.SIZEOF, NkVec2.SIZEOF); }
	/** Unsafe version of {@link #userdata(NkHandle) userdata}. */
	public static void nuserdata(long struct, NkHandle value) { memCopy(value.address(), struct + NkDrawList.USERDATA, NkHandle.SIZEOF); }

	// -----------------------------------

	/** An array of {@link NkDrawList} structs. */
	public static final class Buffer extends StructBuffer<NkDrawList, Buffer> {

		/**
		 * Creates a new {@link NkDrawList.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NkDrawList#SIZEOF}, and its mark will be undefined.
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
		protected NkDrawList newInstance(long address) {
			return new NkDrawList(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code global_alpha} field. */
		public float global_alpha() { return NkDrawList.nglobal_alpha(address()); }
		/** Returns the value of the {@code shape_AA} field. */
		public int shape_AA() { return NkDrawList.nshape_AA(address()); }
		/** Returns the value of the {@code line_AA} field. */
		public int line_AA() { return NkDrawList.nline_AA(address()); }
		/** Returns a {@link NkDrawNullTexture} view of the {@code null_texture} field. */
		public NkDrawNullTexture null_texture() { return NkDrawList.nnull_texture(address()); }
		/** Returns a {@link NkRect} view of the {@code clip_rect} field. */
		public NkRect clip_rect() { return NkDrawList.nclip_rect(address()); }
		/** Returns a {@link NkBuffer} view of the struct pointed to by the {@code buffer} field. */
		public NkBuffer buffer() { return NkDrawList.nbuffer(address()); }
		/** Returns a {@link NkBuffer} view of the struct pointed to by the {@code vertices} field. */
		public NkBuffer vertices() { return NkDrawList.nvertices(address()); }
		/** Returns a {@link NkBuffer} view of the struct pointed to by the {@code elements} field. */
		public NkBuffer elements() { return NkDrawList.nelements(address()); }
		/** Returns the value of the {@code element_count} field. */
		public int element_count() { return NkDrawList.nelement_count(address()); }
		/** Returns the value of the {@code vertex_count} field. */
		public int vertex_count() { return NkDrawList.nvertex_count(address()); }
		/** Returns the value of the {@code cmd_offset} field. */
		public long cmd_offset() { return NkDrawList.ncmd_offset(address()); }
		/** Returns the value of the {@code cmd_count} field. */
		public int cmd_count() { return NkDrawList.ncmd_count(address()); }
		/** Returns the value of the {@code path_count} field. */
		public int path_count() { return NkDrawList.npath_count(address()); }
		/** Returns the value of the {@code path_offset} field. */
		public int path_offset() { return NkDrawList.npath_offset(address()); }
		/** Returns a {@link NkVec2}.Buffer view of the {@code circle_vtx} field. */
		public NkVec2.Buffer circle_vtx() { return NkDrawList.ncircle_vtx(address()); }
		/** Returns a {@link NkVec2} view of the struct at the specified index of the {@code circle_vtx} field. */
		public NkVec2 circle_vtx(int index) { return NkDrawList.ncircle_vtx(address(), index); }
		/** Returns a {@link NkHandle} view of the {@code userdata} field. */
		public NkHandle userdata() { return NkDrawList.nuserdata(address()); }

		/** Sets the specified value to the {@code global_alpha} field. */
		public NkDrawList.Buffer global_alpha(float value) { NkDrawList.nglobal_alpha(address(), value); return this; }
		/** Sets the specified value to the {@code shape_AA} field. */
		public NkDrawList.Buffer shape_AA(int value) { NkDrawList.nshape_AA(address(), value); return this; }
		/** Sets the specified value to the {@code line_AA} field. */
		public NkDrawList.Buffer line_AA(int value) { NkDrawList.nline_AA(address(), value); return this; }
		/** Copies the specified {@link NkDrawNullTexture} to the {@code null_texture} field. */
		public NkDrawList.Buffer null_texture(NkDrawNullTexture value) { NkDrawList.nnull_texture(address(), value); return this; }
		/** Copies the specified {@link NkRect} to the {@code clip_rect} field. */
		public NkDrawList.Buffer clip_rect(NkRect value) { NkDrawList.nclip_rect(address(), value); return this; }
		/** Sets the address of the specified {@link NkBuffer} to the {@code buffer} field. */
		public NkDrawList.Buffer buffer(NkBuffer value) { NkDrawList.nbuffer(address(), value); return this; }
		/** Sets the address of the specified {@link NkBuffer} to the {@code vertices} field. */
		public NkDrawList.Buffer vertices(NkBuffer value) { NkDrawList.nvertices(address(), value); return this; }
		/** Sets the address of the specified {@link NkBuffer} to the {@code elements} field. */
		public NkDrawList.Buffer elements(NkBuffer value) { NkDrawList.nelements(address(), value); return this; }
		/** Sets the specified value to the {@code element_count} field. */
		public NkDrawList.Buffer element_count(int value) { NkDrawList.nelement_count(address(), value); return this; }
		/** Sets the specified value to the {@code vertex_count} field. */
		public NkDrawList.Buffer vertex_count(int value) { NkDrawList.nvertex_count(address(), value); return this; }
		/** Sets the specified value to the {@code cmd_offset} field. */
		public NkDrawList.Buffer cmd_offset(long value) { NkDrawList.ncmd_offset(address(), value); return this; }
		/** Sets the specified value to the {@code cmd_count} field. */
		public NkDrawList.Buffer cmd_count(int value) { NkDrawList.ncmd_count(address(), value); return this; }
		/** Sets the specified value to the {@code path_count} field. */
		public NkDrawList.Buffer path_count(int value) { NkDrawList.npath_count(address(), value); return this; }
		/** Sets the specified value to the {@code path_offset} field. */
		public NkDrawList.Buffer path_offset(int value) { NkDrawList.npath_offset(address(), value); return this; }
		/** Copies the specified {@link NkVec2.Buffer} to the {@code circle_vtx} field. */
		public NkDrawList.Buffer circle_vtx(NkVec2.Buffer value) { NkDrawList.ncircle_vtx(address(), value); return this; }
		/** Copies the specified {@link NkVec2} at the specified index of the {@code circle_vtx} field. */
		public NkDrawList.Buffer circle_vtx(int index, NkVec2 value) { NkDrawList.ncircle_vtx(address(), index, value); return this; }
		/** Copies the specified {@link NkHandle} to the {@code userdata} field. */
		public NkDrawList.Buffer userdata(NkHandle value) { NkDrawList.nuserdata(address(), value); return this; }

	}

}