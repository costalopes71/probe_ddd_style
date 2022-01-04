package com.costalopes.probe.domain;

import java.util.List;

class Probe {

	private boolean landed;
	private Direction direction;
	private Position currentPosition;

	Probe() {
		this.landed = false;
	}

	boolean isLanded() {
		return landed;
	}

	boolean land(Position landPosition) {
		//TODO implement land logic
		return true;
	}

	Position move(List<Movement> movements) {
		//TODO implements move logic
		return null;
	}

}
