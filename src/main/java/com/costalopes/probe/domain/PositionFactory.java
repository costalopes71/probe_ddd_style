package com.costalopes.probe.domain;

import org.springframework.stereotype.Component;

import static com.costalopes.probe.domain.Direction.NORTH;

@Component
public class PositionFactory {

	public Position createForLanding(int x, int y) {
		return create(x, y, NORTH);
	}

	public Position create(int x, int y, Direction direction) {

		if (x < 0) {
			throw new RuntimeException("position x cannot be less than 0");
		}

		if (y < 0) {
			throw new RuntimeException("position y cannot be less than 0");
		}

		return new Position(x, y, direction);
	}

}
