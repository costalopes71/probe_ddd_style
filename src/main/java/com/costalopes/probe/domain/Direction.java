package com.costalopes.probe.domain;

enum Direction {

	NORTH {
		@Override
		Direction turnRight() {
			return EAST;
		}

		@Override
		Direction turnLeft() {
			return WEST;
		}

		@Override
		Position moveFoward(Position current, PositionFactory positionFactory) {
			return positionFactory.create(current.getX(), current.getY() - 1, current.getDirection());
		}
	}, SOUTH{
		@Override
		Direction turnRight() {
			return WEST;
		}

		@Override
		Direction turnLeft() {
			return EAST;
		}

		@Override
		Position moveFoward(Position current, PositionFactory positionFactory) {
			return positionFactory.create(current.getX(), current.getY() + 1, current.getDirection());
		}
	}, EAST{
		@Override
		Direction turnRight() {
			return SOUTH;
		}

		@Override
		Direction turnLeft() {
			return NORTH;
		}

		@Override
		Position moveFoward(Position current, PositionFactory positionFactory) {
			return positionFactory.create(current.getX() + 1, current.getY(), current.getDirection());
		}
	}, WEST{
		@Override
		Direction turnRight() {
			return NORTH;
		}

		@Override
		Direction turnLeft() {
			return SOUTH;
		}

		@Override
		Position moveFoward(Position current, PositionFactory positionFactory) {
			return positionFactory.create(current.getX() - 1, current.getY(), current.getDirection());
		}
	};

	abstract Direction turnRight();
	abstract Direction turnLeft();
	abstract Position moveFoward(Position current, PositionFactory positionFactory);

}
