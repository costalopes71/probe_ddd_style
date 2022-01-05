package com.costalopes.probe.domain;

public class Position {

	private Integer x;
	private Integer y;
	private Direction direction;

	Position(int x, int y, Direction direction) {
		this.x = x;
		this.y = y;
		this.direction = direction;
	}

	public Integer getX() {
		return x;
	}

	public Integer getY() {
		return y;
	}

	public Direction getDirection() {
		return direction;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Position)) return false;

		Position position = (Position) o;

		if (!x.equals(position.x)) return false;
		return y.equals(position.y);
	}

	@Override
	public int hashCode() {
		int result = x.hashCode();
		result = 31 * result + y.hashCode();
		return result;
	}

}
