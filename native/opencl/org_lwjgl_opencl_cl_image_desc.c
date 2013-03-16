/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include <jni.h>
#include <stddef.h>
#include "opencl.h"

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_cl_image_desc_offsets(JNIEnv *env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	buffer[0] = (jint)(offsetof(cl_image_desc, image_type));
	buffer[1] = (jint)(offsetof(cl_image_desc, image_width));
	buffer[2] = (jint)(offsetof(cl_image_desc, image_height));
	buffer[3] = (jint)(offsetof(cl_image_desc, image_depth));
	buffer[4] = (jint)(offsetof(cl_image_desc, image_array_size));
	buffer[5] = (jint)(offsetof(cl_image_desc, image_row_pitch));
	buffer[6] = (jint)(offsetof(cl_image_desc, image_slice_pitch));
	buffer[7] = (jint)(offsetof(cl_image_desc, num_mip_levels));
	buffer[8] = (jint)(offsetof(cl_image_desc, num_samples));
	buffer[9] = (jint)(offsetof(cl_image_desc, buffer));

	return sizeof(cl_image_desc);
}