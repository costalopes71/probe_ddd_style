package com.costalopes.probe.app;

public class LandProbeInputModel {

	private Integer probeId;
	private Integer x;
	private Integer y;
	private Integer surfaceId;

	public LandProbeInputModel(Integer probeId, Integer surfaceId, Integer x, Integer y) {
		this.probeId = probeId;
		this.surfaceId = surfaceId;
		this.x = x;
		this.y = y;
	}

}
