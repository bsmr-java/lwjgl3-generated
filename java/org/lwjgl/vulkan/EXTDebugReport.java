/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Due to the nature of the Vulkan interface, there is very little error information available to the developer/application. By enabling optional
 * validation layers and using the Debug Report extension a developer has much more detailed feedback on the application's use of Vulkan.
 * 
 * <p>This extension adds two entrypoints ({@link #vkCreateDebugReportCallbackEXT CreateDebugReportCallbackEXT}, {@link #vkDestroyDebugReportCallbackEXT DestroyDebugReportCallbackEXT}) and an extension structure that together define
 * a way for layers and the implementation to call back to the application for events of interest to the application.</p>
 * 
 * <p>Using the {@code VK_EXT_debug_report} extension allows an application to register multiple callbacks with the validation layers. Some callbacks may log
 * the information to a file, others may cause a debug break point or other application defined behavior. An application can register callbacks even when
 * no validation layers are enabled, but they will only be called for loader and, if implemented, driver events.</p>
 * 
 * <p>To capture issues found while creating an instance an application can link a {@link VkDebugReportCallbackCreateInfoEXT} structure to the {@code pNext}
 * element of the {@link VkInstanceCreateInfo} structure given to {@link VK10#vkCreateInstance CreateInstance}. This callback is only valid for the duration of the
 * {@code vkCreateInstance} call. Use {@link #vkCreateDebugReportCallbackEXT CreateDebugReportCallbackEXT} to create persistent callback objects.</p>
 */
public class EXTDebugReport {

	/** The extension specification version. */
	public static final int VK_EXT_DEBUG_REPORT_SPEC_VERSION = 2;

	/** The extension name. */
	public static final String VK_EXT_DEBUG_REPORT_EXTENSION_NAME = "VK_EXT_debug_report";

	/** VkStructureType */
	public static final int VK_STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT = 1000011000;

	/** VkDebugReportObjectTypeEXT */
	public static final int
		VK_DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT               = 0,
		VK_DEBUG_REPORT_OBJECT_TYPE_INSTANCE_EXT              = 1,
		VK_DEBUG_REPORT_OBJECT_TYPE_PHYSICAL_DEVICE_EXT       = 2,
		VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_EXT                = 3,
		VK_DEBUG_REPORT_OBJECT_TYPE_QUEUE_EXT                 = 4,
		VK_DEBUG_REPORT_OBJECT_TYPE_SEMAPHORE_EXT             = 5,
		VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_BUFFER_EXT        = 6,
		VK_DEBUG_REPORT_OBJECT_TYPE_FENCE_EXT                 = 7,
		VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_MEMORY_EXT         = 8,
		VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_EXT                = 9,
		VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_EXT                 = 10,
		VK_DEBUG_REPORT_OBJECT_TYPE_EVENT_EXT                 = 11,
		VK_DEBUG_REPORT_OBJECT_TYPE_QUERY_POOL_EXT            = 12,
		VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_VIEW_EXT           = 13,
		VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_VIEW_EXT            = 14,
		VK_DEBUG_REPORT_OBJECT_TYPE_SHADER_MODULE_EXT         = 15,
		VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_CACHE_EXT        = 16,
		VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_LAYOUT_EXT       = 17,
		VK_DEBUG_REPORT_OBJECT_TYPE_RENDER_PASS_EXT           = 18,
		VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_EXT              = 19,
		VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT_EXT = 20,
		VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_EXT               = 21,
		VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_POOL_EXT       = 22,
		VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_EXT        = 23,
		VK_DEBUG_REPORT_OBJECT_TYPE_FRAMEBUFFER_EXT           = 24,
		VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_POOL_EXT          = 25,
		VK_DEBUG_REPORT_OBJECT_TYPE_SURFACE_KHR_EXT           = 26,
		VK_DEBUG_REPORT_OBJECT_TYPE_SWAPCHAIN_KHR_EXT         = 27,
		VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_EXT          = 28;

	/** VkDebugReportErrorEXT */
	public static final int
		VK_DEBUG_REPORT_ERROR_NONE_EXT         = 0,
		VK_DEBUG_REPORT_ERROR_CALLBACK_REF_EXT = 1;

	/** Indicates an informational message such as resource details that may be handy when debugging an application. */
	public static final int VK_DEBUG_REPORT_INFORMATION_BIT_EXT = 0x1;

	/**
	 * Indicates an unexpected use.
	 * 
	 * <p>E.g. Not destroying objects prior to destroying the containing object or potential inconsistencies between descriptor set layout and the layout in
	 * the corresponding shader, etc.</p>
	 */
	public static final int VK_DEBUG_REPORT_WARNING_BIT_EXT = 0x2;

	/**
	 * Indicates a potentially non-optimal use of Vulkan.
	 * 
	 * <p>E.g. using {@code vkCmdClearImage} when a RenderPass {@code load_op} would have worked.</p>
	 */
	public static final int VK_DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT = 0x4;

	/** Indicates an error that may cause undefined results, including an application crash. */
	public static final int VK_DEBUG_REPORT_ERROR_BIT_EXT = 0x8;

	/** Indicates diagnostic information from the loader and layers. */
	public static final int VK_DEBUG_REPORT_DEBUG_BIT_EXT = 0x10;

	/** VkResult */
	public static final int VK_ERROR_VALIDATION_FAILED_EXT = -1000011001;

	/** Function address. */
	public final long
		CreateDebugReportCallbackEXT,
		DestroyDebugReportCallbackEXT,
		DebugReportMessageEXT;

	protected EXTDebugReport() {
		throw new UnsupportedOperationException();
	}

	public EXTDebugReport(FunctionProvider provider) {
		CreateDebugReportCallbackEXT = provider.getFunctionAddress("vkCreateDebugReportCallbackEXT");
		DestroyDebugReportCallbackEXT = provider.getFunctionAddress("vkDestroyDebugReportCallbackEXT");
		DebugReportMessageEXT = provider.getFunctionAddress("vkDebugReportMessageEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTDebugReport} instance from the specified dispatchable handle. */
	public static EXTDebugReport getInstance(DispatchableHandle handle) {
		return getInstance(handle.getCapabilities());
	}

	/** Returns the {@link EXTDebugReport} instance of the specified {@link VKCapabilities}. */
	public static EXTDebugReport getInstance(VKCapabilities caps) {
		return checkFunctionality(caps.__EXTDebugReport);
	}

	static EXTDebugReport create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("VK_EXT_debug_report") )
			return null;

		return VK.checkExtension("VK_EXT_debug_report", create(provider));
	}

	static EXTDebugReport create(FunctionProvider provider) {
		EXTDebugReport funcs = new EXTDebugReport(provider);

		boolean supported = checkFunctions(
			funcs.CreateDebugReportCallbackEXT, funcs.DestroyDebugReportCallbackEXT, funcs.DebugReportMessageEXT
		);

		return supported ? funcs : null;
	}

	// --- [ vkCreateDebugReportCallbackEXT ] ---

	/** Unsafe version of {@link #vkCreateDebugReportCallbackEXT CreateDebugReportCallbackEXT} */
	public static int nvkCreateDebugReportCallbackEXT(VkInstance instance, long pCreateInfo, long pAllocator, long pCallback) {
		long __functionAddress = getInstance(instance).CreateDebugReportCallbackEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			VkDebugReportCallbackCreateInfoEXT.validate(pCreateInfo);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPPI(__functionAddress, instance.address(), pCreateInfo, pAllocator, pCallback);
	}

	public static int vkCreateDebugReportCallbackEXT(VkInstance instance, VkDebugReportCallbackCreateInfoEXT pCreateInfo, VkAllocationCallbacks pAllocator, ByteBuffer pCallback) {
		if ( CHECKS )
			checkBuffer(pCallback, 1 << 3);
		return nvkCreateDebugReportCallbackEXT(instance, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pCallback));
	}

	/** Alternative version of: {@link #vkCreateDebugReportCallbackEXT CreateDebugReportCallbackEXT} */
	public static int vkCreateDebugReportCallbackEXT(VkInstance instance, VkDebugReportCallbackCreateInfoEXT pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pCallback) {
		if ( CHECKS )
			checkBuffer(pCallback, 1);
		return nvkCreateDebugReportCallbackEXT(instance, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pCallback));
	}

	// --- [ vkDestroyDebugReportCallbackEXT ] ---

	/** Unsafe version of {@link #vkDestroyDebugReportCallbackEXT DestroyDebugReportCallbackEXT} */
	public static void nvkDestroyDebugReportCallbackEXT(VkInstance instance, long callback, long pAllocator) {
		long __functionAddress = getInstance(instance).DestroyDebugReportCallbackEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		callPJPV(__functionAddress, instance.address(), callback, pAllocator);
	}

	public static void vkDestroyDebugReportCallbackEXT(VkInstance instance, long callback, VkAllocationCallbacks pAllocator) {
		nvkDestroyDebugReportCallbackEXT(instance, callback, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkDebugReportMessageEXT ] ---

	/** Unsafe version of {@link #vkDebugReportMessageEXT DebugReportMessageEXT} */
	public static void nvkDebugReportMessageEXT(VkInstance instance, int flags, int objectType, long object, long location, int messageCode, long pLayerPrefix, long pMessage) {
		long __functionAddress = getInstance(instance).DebugReportMessageEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPIIJPIPPV(__functionAddress, instance.address(), flags, objectType, object, location, messageCode, pLayerPrefix, pMessage);
	}

	public static void vkDebugReportMessageEXT(VkInstance instance, int flags, int objectType, long object, long location, int messageCode, ByteBuffer pLayerPrefix, ByteBuffer pMessage) {
		if ( CHECKS ) {
			checkNT1(pLayerPrefix);
			checkNT1(pMessage);
		}
		nvkDebugReportMessageEXT(instance, flags, objectType, object, location, messageCode, memAddress(pLayerPrefix), memAddress(pMessage));
	}

	/** CharSequence version of: {@link #vkDebugReportMessageEXT DebugReportMessageEXT} */
	public static void vkDebugReportMessageEXT(VkInstance instance, int flags, int objectType, long object, long location, int messageCode, CharSequence pLayerPrefix, CharSequence pMessage) {
		APIBuffer __buffer = apiBuffer();
		int pLayerPrefixEncoded = __buffer.stringParamUTF8(pLayerPrefix, true);
		int pMessageEncoded = __buffer.stringParamUTF8(pMessage, true);
		nvkDebugReportMessageEXT(instance, flags, objectType, object, location, messageCode, __buffer.address(pLayerPrefixEncoded), __buffer.address(pMessageEncoded));
	}

}