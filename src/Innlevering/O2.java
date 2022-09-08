package Innlevering;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class O2 {

	public static void main(String[] args) {

		int poeng = 0;

		for (int telle = 0; telle < 10; telle++) {

			poeng = parseInt(showInputDialog("Poengsum: "));

			if (poeng < 0 || poeng > 100) {
				System.out.println("Ugyldig poengsum");
				
				telle--;
				continue;

			} else {
				if ((poeng >= 90) || (poeng == 100)) {
					System.out.println("A");
				} else {
					if ((poeng >= 80) || (poeng == 89)) {
						System.out.println("B");
					} else {
						if ((poeng >= 60) || (poeng == 79)) {
							System.out.println("C");
						} else {
							if ((poeng >= 50) || (poeng == 59)) {
								System.out.println("D");
							} else {
								if ((poeng >= 49) || (poeng == 40)) {
									System.out.println("E");
								} else {
									if ((poeng >= 39) || (poeng == 0)) {
										System.out.println("F");
									}
								}

							}
						}
					}
				}
			}

		}
	}
}
