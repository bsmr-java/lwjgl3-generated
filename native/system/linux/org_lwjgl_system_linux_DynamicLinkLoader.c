/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "LinuxLWJGL.h"
#include <dlfcn.h>

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_DynamicLinkLoader_ndlopen(JNIEnv *__env, jclass clazz, jlong filenameAddress, jint mode) {
	const char *filename = (const char *)(intptr_t)filenameAddress;
	return (jlong)(intptr_t)dlopen(filename, mode);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_DynamicLinkLoader_ndlerror(JNIEnv *__env, jclass clazz) {
	return (jlong)(intptr_t)dlerror();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_DynamicLinkLoader_ndlsym(JNIEnv *__env, jclass clazz, jlong handleAddress, jlong nameAddress) {
	void *handle = (void *)(intptr_t)handleAddress;
	const char *name = (const char *)(intptr_t)nameAddress;
	return (jlong)(intptr_t)dlsym(handle, name);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_DynamicLinkLoader_ndlclose(JNIEnv *__env, jclass clazz, jlong handleAddress) {
	void *handle = (void *)(intptr_t)handleAddress;
	return (jint)dlclose(handle);
}