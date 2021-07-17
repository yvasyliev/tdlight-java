module tdlight.java {
	requires tdlight.api;
	requires org.reactivestreams;
	requires org.slf4j;
	requires it.unimi.dsi.fastutil.core;
	exports it.tdlight.tdlight;
	exports it.tdlight.tdnative;
	exports it.tdlight.tdlib;
	exports it.tdlight.common;
	exports it.tdlight.common.utils;
	exports it.tdlight.common.internal;
}