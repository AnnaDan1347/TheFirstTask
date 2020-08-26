package my.traning.project.flower.store.application;

import java.util.Scanner;

public class Office {

	private boolean runFlag = true;

	public void run() {
		Scanner scanner = new Scanner(System.in);
		while (runFlag) {
			System.out.println("Input smth, or \"exit\" for exit");
			String input = scanner.next();
			switch (input) {
				case "exit" -> runFlag = false;
				default -> {
					System.out.println("Store is online");
				}
			}
		}
	}
}
