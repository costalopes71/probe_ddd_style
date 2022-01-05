package com.costalopes.probe.domain;

enum Movement {

	RIGHT('R') {
		@Override
		public Position doMove(Position current, PositionFactory positionFactory) {
			return positionFactory.create(current.getX(), current.getY(), current.getDirection().turnRight());
		}
	}, LEFT('L') {
		@Override
		public Position doMove(Position current, PositionFactory positionFactory) {
			return positionFactory.create(current.getX(), current.getY(), current.getDirection().turnLeft());
		}
	}, FOWARD('F') {
		@Override
		public Position doMove(Position current, PositionFactory positionFactory) {
			return current.getDirection().moveFoward(current, positionFactory);
		}
	};

	private char m;

	Movement(char m) {
		this.m = m;
	}

	public abstract Position doMove(Position current, PositionFactory positionFactory);

}
