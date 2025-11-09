public class Collatz {
	public static void main(String args[]) {
		int seed = Integer.parseInt(args[0]);
		String mode = args[1];
		Boolean isV = false;
		if (mode.equals("v")) {
			isV = true;
		}
		int count = 1;
		Boolean coll = false;
		for (int i = 1; i <= seed; i++) {
			if (isV) {
				System.out.print(i + " ");
			}
			int tempI = i;
			if (i == 1) {
				tempI = 4;
				if (isV) {
					System.out.print("4 ");
				}
				count++;
			}
			while (tempI != 1) {
				if (tempI % 2 == 0) {
					tempI = tempI / 2;
					if (isV) {
						System.out.print(tempI + " ");
						count++;
					}
				} else {
					tempI = (tempI * 3) + 1;
					if (isV) {
						System.out.print(tempI + " ");
						count++;
					}
				}
				if (tempI == 1) {
					coll = true;
				}
			}
			if (isV) {
				System.out.println(" (" + count + ")");
			}
			count = 1;
		}
		if (coll) {
			System.out.println("\nEvery one of the first " + seed + " hailstone sequences reached 1.");
		}
	}
}
