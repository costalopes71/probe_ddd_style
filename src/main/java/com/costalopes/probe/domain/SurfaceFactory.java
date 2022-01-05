package com.costalopes.probe.domain;

import org.springframework.stereotype.Component;

@Component
public class SurfaceFactory {

	public Surface create(int width, int length) {
		return new Surface(width, length);
	}

}
