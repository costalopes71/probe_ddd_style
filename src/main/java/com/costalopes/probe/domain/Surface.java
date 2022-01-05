package com.costalopes.probe.domain;

import java.util.ArrayList;
import java.util.List;

public class Surface {

	private final Integer base;
	private final Integer height;
	private List<Probe> probes;

	Surface(Integer base, Integer height) {
		this.base = base;
		this.height = height;
		this.probes = new ArrayList<>();
	}

	public boolean isPositionOccupied(Position landPosition) {
		return probes.stream()
				.filter(p -> p.getCurrentPosition().equals(landPosition))
				.findAny()
				.isPresent();
	}

	public void addProbe(Probe probe) {
		probes.add(probe);
	}

	public boolean isPositionOutOfBounds(Position landPosition) {
		return landPosition.getX() > base || landPosition.getY() > height;
	}

}
