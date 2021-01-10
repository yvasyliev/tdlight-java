package it.tdlight.common.utils;
public final class LibraryVersion {
    public static final String VERSION = "${project.version}";
    public static final String NATIVES_VERSION = "${natives-version}";
    public static final String IMPLEMENTATION_NAME = "tdlight";
    public static final String LINUX_X86_CLASS = "it.tdlight.jni.tdlight.linux.x86.LoadLibrary";
    public static final String LINUX_AMD64_CLASS = "it.tdlight.jni.tdlight.linux.amd64.LoadLibrary";
    public static final String LINUX_AARCH64_CLASS = "it.tdlight.jni.tdlight.linux.aarch64.LoadLibrary";
    public static final String LINUX_ARMV6_CLASS = "it.tdlight.jni.tdlight.linux.armv6.LoadLibrary";
    public static final String LINUX_ARMV7_CLASS = "it.tdlight.jni.tdlight.linux.armv7.LoadLibrary";
    public static final String LINUX_PPC64LE_CLASS = "it.tdlight.jni.tdlight.linux.ppc64le.LoadLibrary";
    public static final String WINDOWS_AMD64_CLASS = "it.tdlight.jni.tdlight.win.amd64.LoadLibrary";
    public static final String OSX_AMD64_CLASS = "it.tdlight.jni.tdlight.osx.amd64.LoadLibrary";
}