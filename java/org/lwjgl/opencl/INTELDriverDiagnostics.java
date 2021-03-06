/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

/**
 * Native bindings to the <a href="http://www.khronos.org/registry/cl/extensions/intel/cl_intel_driver_diagnostics.txt">intel_driver_diagnostics</a> extension.
 * 
 * <p>The OpenCL specification allows registering a callback function during OpenCL context creation that will be called whenever there is an error. This
 * extension extends this mechanism by allowing the driver to pass additional strings containing diagnostic information. The diagnostic messages can help
 * to understand how the driver works and can provide guidance to modify an application to improve performance.</p>
 * 
 * <p>Requires {@link CL12 CL12}.</p>
 */
public final class INTELDriverDiagnostics {

	/** Accepted as a property name in the {@code properties} parameter of {@link CL10#clCreateContext CreateContext} and {@link CL10#clCreateContextFromType CreateContextFromType}. */
	public static final int CL_CONTEXT_SHOW_DIAGNOSTICS_INTEL = 0x4106;

	/** Messages under good verbose level report good use cases to verify that the driver is used properly and optimally. */
	public static final int CL_CONTEXT_DIAGNOSTICS_LEVEL_GOOD_INTEL = 0x1;

	/** Messages under bad verbose level report cases that may result in degraded performance. */
	public static final int CL_CONTEXT_DIAGNOSTICS_LEVEL_BAD_INTEL = 0x2;

	/**
	 * Messages under neutral verbose level report cases that may or may not have performance implications. Additionally, neutral diagnostic messages may
	 * inform developers about specific internal driver properties.
	 */
	public static final int CL_CONTEXT_DIAGNOSTICS_LEVEL_NEUTRAL_INTEL = 0x4;

	private INTELDriverDiagnostics() {}

}