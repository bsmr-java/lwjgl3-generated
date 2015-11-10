/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include <stddef.h>
#include "common_tools.h"
DISABLE_WARNINGS()
#include "OVR_CAPI.h"
ENABLE_WARNINGS()

EXTERN_C_EXIT

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVRLayerEyeFov_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS(__env, clazz)

	buffer[0] = (jint)offsetof(ovrLayerEyeFov, Header);
	buffer[1] = (jint)offsetof(ovrLayerEyeFov, ColorTexture);
	buffer[2] = (jint)offsetof(ovrLayerEyeFov, Viewport);
	buffer[3] = (jint)offsetof(ovrLayerEyeFov, Fov);
	buffer[4] = (jint)offsetof(ovrLayerEyeFov, RenderPose);
	buffer[5] = (jint)offsetof(ovrLayerEyeFov, SensorSampleTime);

	return sizeof(ovrLayerEyeFov);
}

EXTERN_C_EXIT
