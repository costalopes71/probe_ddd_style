package com.costalopes.probe.domain;

class Position {

	private Integer x;
	private Integer y;
	private boolean occupied; //TODO boolean ou Probe? uma posicao pode ter 0 ou 1 sonda?

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
