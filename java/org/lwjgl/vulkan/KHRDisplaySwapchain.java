/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/** This extension provides an API to create a swapchain directly on a device's display without any underlying window system. */
public class KHRDisplaySwapchain {

	/** The extension specification version. */
	public static final int VK_KHR_DISPLAY_SWAPCHAIN_SPEC_VERSION = 0x9;

	/** The extension name. */
	public static final String VK_KHR_DISPLAY_SWAPCHAIN_EXTENSION_NAME = "VK_KHR_display_swapchain";

	/** VkStructureType */
	public static final int VK_STRUCTURE_TYPE_DISPLAY_PRESENT_INFO_KHR = 1000003000;

	/** VkResult */
	public static final int VK_ERROR_INCOMPATIBLE_DISPLAY_KHR = -1000003001;

	/** Function address. */
	@JavadocExclude
	public final long CreateSharedSwapchainsKHR;

	@JavadocExclude
	protected KHRDisplaySwapchain() {
		throw new UnsupportedOperationException();
	}

	@JavadocExclude
	public KHRDisplaySwapchain(FunctionProvider provider) {
		CreateSharedSwapchainsKHR = checkFunctionAddress(provider.getFunctionAddress("vkCreateSharedSwapchainsKHR"));
	}

	// --- [ Function Addresses ] ---

	private static final KHRDisplaySwapchain instance = new KHRDisplaySwapchain(getLibrary());

	/** Returns the {@link SharedLibrary} that provides pointers for the functions in this class. */
	public static SharedLibrary getLibrary() {
		return VK10.getLibrary();
	}

	/** Returns the {@link KHRDisplaySwapchain} instance. */
	public static KHRDisplaySwapchain getInstance() {
		return instance;
	}

	// --- [ vkCreateSharedSwapchainsKHR ] ---

	/** Unsafe version of {@link #vkCreateSharedSwapchainsKHR CreateSharedSwapchainsKHR} */
	@JavadocExclude
	public static int nvkCreateSharedSwapchainsKHR(long device, int swapchainCount, long pCreateInfos, long pAllocator, long pSwapchains) {
		long __functionAddress = getInstance().CreateSharedSwapchainsKHR;
		if ( CHECKS )
			checkPointer(device);
		return callPIPPPI(__functionAddress, device, swapchainCount, pCreateInfos, pAllocator, pSwapchains);
	}

	/**
	 * Creates multiple swapchains that share presentable images.
	 *
	 * @param device         the {@code VkDevice} assocated with swapchain
	 * @param swapchainCount the count of the array of swapchain create info
	 * @param pCreateInfos   a pointer to an array of {@link VkSwapchainCreateInfoKHR} structures containing the parameters affecting the creation of the swapchain objects
	 * @param pAllocator     the allocator used for host memory allocated for the swapchain objects
	 * @param pSwapchains    the array of created swapchains
	 */
	public static int vkCreateSharedSwapchainsKHR(long device, int swapchainCount, VkSwapchainCreateInfoKHR.Buffer pCreateInfos, VkAllocationCallbacks pAllocator, ByteBuffer pSwapchains) {
		if ( CHECKS ) {
			checkBuffer(pCreateInfos, swapchainCount);
			checkBuffer(pSwapchains, swapchainCount << 3);
		}
		return nvkCreateSharedSwapchainsKHR(device, swapchainCount, pCreateInfos.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pSwapchains));
	}

	/** Alternative version of: {@link #vkCreateSharedSwapchainsKHR CreateSharedSwapchainsKHR} */
	public static int vkCreateSharedSwapchainsKHR(long device, VkSwapchainCreateInfoKHR.Buffer pCreateInfos, VkAllocationCallbacks pAllocator, LongBuffer pSwapchains) {
		if ( CHECKS )
			checkBuffer(pSwapchains, pCreateInfos.remaining());
		return nvkCreateSharedSwapchainsKHR(device, pCreateInfos.remaining(), pCreateInfos.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pSwapchains));
	}

}