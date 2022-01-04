package com.costalopes.probe.domain;

enum Movement {

	//TODO o comportamento de mover deveria estar aqui?
	// talvez um metodo abstract Position doMovement(Position p)? Mas ai position teria que conhecer Direction

	RIGHT('R'), LEFT('L'), FOWARD('F');

	private char m;

	Movement(char m) {
		this.m = m;
	}

}
