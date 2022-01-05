package com.costalopes.probe.domain;

import org.springframework.stereotype.Component;

@Component
public class ProbeFactory {

	public Probe create() {
		return new Probe();
	}

}
