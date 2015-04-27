/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
DISABLE_WARNINGS()
#include "OVR_CAPI_0_5_0.h"
ENABLE_WARNINGS()

EXTERN_C_EXIT

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVRPositionTimewarpDesc_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)offsetof(ovrPositionTimewarpDesc, HmdToEyeViewOffset);
	buffer[1] = (jint)offsetof(ovrPositionTimewarpDesc, NearClip);
	buffer[2] = (jint)offsetof(ovrPositionTimewarpDesc, FarClip);

	return sizeof(ovrPositionTimewarpDesc);
}

EXTERN_C_EXIT