/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>GLXStereoNotifyEventEXT members</h3>
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><th>Member</th><th>Type</th><th>Description</th></tr>
 * <tr><td>type</td><td class="nw">int</td><td>GenericEvent</td></tr>
 * <tr><td>serial</td><td class="nw">unsigned long</td><td>\# of last request server processed</td></tr>
 * <tr><td>send_event</td><td class="nw">Bool</td><td>{@code True} if generated by {@code SendEvent} request</td></tr>
 * <tr><td>display</td><td class="nw">Display</td><td>display the event was read from</td></tr>
 * <tr><td>extension</td><td class="nw">int</td><td>GLX major opcode, from {@code XQueryExtension}</td></tr>
 * <tr><td>evtype</td><td class="nw">int</td><td>always {@code GLX_STEREO_NOTIFY_EXT}</td></tr>
 * <tr><td>window</td><td class="nw">GLXDrawable</td><td>XID of the X window affected</td></tr>
 * <tr><td>stereo_tree</td><td class="nw">Bool</td><td>{@code True} if tree contains stereo windows</td></tr>
 * </table>
 */
public class GLXStereoNotifyEventEXT extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		TYPE,
		SERIAL,
		SEND_EVENT,
		DISPLAY,
		EXTENSION,
		EVTYPE,
		WINDOW,
		STEREO_TREE;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(4),
			__member(POINTER_SIZE),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		TYPE = layout.offsetof(0);
		SERIAL = layout.offsetof(1);
		SEND_EVENT = layout.offsetof(2);
		DISPLAY = layout.offsetof(3);
		EXTENSION = layout.offsetof(4);
		EVTYPE = layout.offsetof(5);
		WINDOW = layout.offsetof(6);
		STEREO_TREE = layout.offsetof(7);
	}

	GLXStereoNotifyEventEXT(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link GLXStereoNotifyEventEXT} instance at the specified memory address. */
	public GLXStereoNotifyEventEXT(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link GLXStereoNotifyEventEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public GLXStereoNotifyEventEXT(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code type} field. */
	public int type() { return ntype(address()); }
	/** Returns the value of the {@code serial} field. */
	public long serial() { return nserial(address()); }
	/** Returns the value of the {@code send_event} field. */
	public int send_event() { return nsend_event(address()); }
	/** Returns the value of the {@code display} field. */
	public long display() { return ndisplay(address()); }
	/** Returns the value of the {@code extension} field. */
	public int extension() { return nextension(address()); }
	/** Returns the value of the {@code evtype} field. */
	public int evtype() { return nevtype(address()); }
	/** Returns the value of the {@code window} field. */
	public long window() { return nwindow(address()); }
	/** Returns the value of the {@code stereo_tree} field. */
	public int stereo_tree() { return nstereo_tree(address()); }

	// -----------------------------------

	/** Returns a new {@link GLXStereoNotifyEventEXT} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static GLXStereoNotifyEventEXT malloc() {
		return new GLXStereoNotifyEventEXT(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link GLXStereoNotifyEventEXT} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static GLXStereoNotifyEventEXT calloc() {
		return new GLXStereoNotifyEventEXT(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link GLXStereoNotifyEventEXT} instance allocated with {@link BufferUtils}. */
	public static GLXStereoNotifyEventEXT create() {
		return new GLXStereoNotifyEventEXT(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link GLXStereoNotifyEventEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link GLXStereoNotifyEventEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link GLXStereoNotifyEventEXT.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link GLXStereoNotifyEventEXT.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	/** Unsafe version of {@link #type}. */
	public static int ntype(long struct) { return memGetInt(struct + GLXStereoNotifyEventEXT.TYPE); }
	/** Unsafe version of {@link #serial}. */
	public static long nserial(long struct) { return memGetAddress(struct + GLXStereoNotifyEventEXT.SERIAL); }
	/** Unsafe version of {@link #send_event}. */
	public static int nsend_event(long struct) { return memGetInt(struct + GLXStereoNotifyEventEXT.SEND_EVENT); }
	/** Unsafe version of {@link #display}. */
	public static long ndisplay(long struct) { return memGetAddress(struct + GLXStereoNotifyEventEXT.DISPLAY); }
	/** Unsafe version of {@link #extension}. */
	public static int nextension(long struct) { return memGetInt(struct + GLXStereoNotifyEventEXT.EXTENSION); }
	/** Unsafe version of {@link #evtype}. */
	public static int nevtype(long struct) { return memGetInt(struct + GLXStereoNotifyEventEXT.EVTYPE); }
	/** Unsafe version of {@link #window}. */
	public static long nwindow(long struct) { return memGetAddress(struct + GLXStereoNotifyEventEXT.WINDOW); }
	/** Unsafe version of {@link #stereo_tree}. */
	public static int nstereo_tree(long struct) { return memGetInt(struct + GLXStereoNotifyEventEXT.STEREO_TREE); }

	// -----------------------------------

	/** An array of {@link GLXStereoNotifyEventEXT} structs. */
	public static final class Buffer extends StructBuffer<GLXStereoNotifyEventEXT, Buffer> {

		/**
		 * Creates a new {@link GLXStereoNotifyEventEXT.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link GLXStereoNotifyEventEXT#SIZEOF}, and its mark will be undefined.
		 *
		 * <p>The created buffer instance holds a strong reference to the container object.</p>
		 */
		public Buffer(ByteBuffer container) {
			this(container.slice(), SIZEOF);
		}

		Buffer(ByteBuffer container, int SIZEOF) {
			super(container, SIZEOF);
		}

		@Override
		protected Buffer self() {
			return this;
		}

		@Override
		protected Buffer newBufferInstance(ByteBuffer buffer) {
			return new Buffer(buffer);
		}

		@Override
		protected GLXStereoNotifyEventEXT newInstance(long address) {
			return new GLXStereoNotifyEventEXT(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code type} field. */
		public int type() { return ntype(address()); }
		/** Returns the value of the {@code serial} field. */
		public long serial() { return nserial(address()); }
		/** Returns the value of the {@code send_event} field. */
		public int send_event() { return nsend_event(address()); }
		/** Returns the value of the {@code display} field. */
		public long display() { return ndisplay(address()); }
		/** Returns the value of the {@code extension} field. */
		public int extension() { return nextension(address()); }
		/** Returns the value of the {@code evtype} field. */
		public int evtype() { return nevtype(address()); }
		/** Returns the value of the {@code window} field. */
		public long window() { return nwindow(address()); }
		/** Returns the value of the {@code stereo_tree} field. */
		public int stereo_tree() { return nstereo_tree(address()); }

	}

}