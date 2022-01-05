package com.costalopes.probe.domain;

import java.util.List;

import static com.costalopes.probe.domain.Direction.NORTH;

public class Probe {

	private boolean landed;
	private Position currentPosition;
	private Surface surface;

	Probe() {
		this.landed = false;
	}

	public Position getCurrentPosition() {
		return currentPosition;
	}

	boolean isLanded() {
		return landed;
	}

	public boolean land(Surface surface, Position landPosition) {

		if (isLanded()) {
			throw new RuntimeException("probe is already landed");
		}

		if (!landPosition.getDirection().equals(NORTH)) {
			throw new RuntimeException("probes can only land pointing to North");
		}

		validatePositionOnSurface(landPosition);

		this.currentPosition = landPosition;
		this.landed = true;
		this.surface = surface;
		surface.addProbe(this);

		return true;
	}

	Position move(List<Movement> movements, PositionFactory positionFactory) {

		if (!isLanded()) {
			throw new RuntimeException("cannot move probe because its not landed");
		}

		Position position = this.currentPosition;
		for (Movement move : movements) {
			Position newPosition = move.doMove(position, positionFactory);
			validatePositionOnSurface(newPosition);
			position = newPosition;
		}

		this.currentPosition = position;

		return position;
	}

	private void validatePositionOnSurface(Position position) {
		if (surface.isPositionOccupied(position)) {
			throw new RuntimeException("land position occupied");
		}

		if (surface.isPositionOutOfBounds(position)) {
			throw new RuntimeException("position out of surface bounds");
		}
	}

}
