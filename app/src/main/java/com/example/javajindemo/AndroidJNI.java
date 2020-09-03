package com.example.javajindemo;

public class AndroidJNI {
    static {

        System.loadLibrary("ndkdemotest-jni");
    }
    public static native  String getStringFromNDK();
}
