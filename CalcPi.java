public class CalcPi {
	public static void main(String[] args) {
		int times = Integer.parseInt(args[0]);
		double sum = 1;
		double denom = 3;
		for (int i = 0; i < times - 1; i++) {
			if ((i % 2) == 0) {
				sum = sum - (1 / denom);
			} 
			else {
				sum = sum + (1 / denom);
			}
			denom = denom + 2;
		}
		System.out.println("pi according to Java: 3.141592653589793");
		System.out.println("pi, approximated:     " + sum * 4);
	}
}