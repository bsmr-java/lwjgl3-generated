/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be passed to the {@link GLFW#glfwSetWindowIconifyCallback SetWindowIconifyCallback} method. */
@FunctionalInterface
public interface GLFWWindowIconifyCallbackI extends CallbackI.V {

	@Override
	default long address() {
		return apiCreateCallback(this, "(pi)v", false);
	}

	@Override
	default void callback(long args) {
		invoke(
			dcbArgPointer(args),
			dcbArgInt(args) != 0
		);
	}

	/**
	 * Will be called when the specified window is iconified or restored.
	 *
	 * @param window    the window that was iconified or restored.
	 * @param iconified {@link GL11#GL_TRUE} if the window was iconified, or {@link GL11#GL_FALSE} if it was restored
	 */
	void invoke(long window, boolean iconified);

}