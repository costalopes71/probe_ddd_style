package com.costalopes.probe.ui;

import com.costalopes.probe.app.to.LandProbeInputModel;
import com.costalopes.probe.app.LandProbeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ConsoleUI {

	@Autowired
	private LandProbeService landProbeService;

	public void startApp() {

		//TODO while loop

		Scanner scan = new Scanner(System.in);

		System.out.println("Menu");
		System.out.println("0: Create surface");
		System.out.println("1: Create probe");
		System.out.println("2: list surfaces");
		System.out.println("3: list probes");
		System.out.println("4: land probe");
		System.out.println("5: move probe");
		int userChoice = scan.nextInt();

		switch (userChoice) {
			case 4:
				System.out.println("Enter probe id, surface id, position x, position y: ");
				String[] rawInput = scan.nextLine().split(",");
				int probeId = Integer.valueOf(rawInput[0]);
				int surfaceId = Integer.valueOf(rawInput[1]);
				int x = Integer.valueOf(rawInput[2]);
				int y = Integer.valueOf(rawInput[3]);
				landProbeService.land(new LandProbeInputModel(probeId, surfaceId, x, y));
				break;
		}

	}

}
