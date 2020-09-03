//
// Created by luo on 2020/8/31.
//
#include "com_example_javajindemo_AndroidJNI.h"
JNIEXPORT jstring JNICALL Java_com_example_javajindemo_AndroidJNI_getStringFromNDK
  (JNIEnv *env, jclass obj){
  return (*env)->NewStringUTF(env,"helow World,NDK JNI 第一次demo");
  }

