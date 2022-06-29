import java.util.*;

public class Main2 {

	public static boolean associativity_test(int policy) {

		double x, y, z;

		if (policy == 1) {
			Random gen = new Random();
			x = gen.nextFloat();
			y = gen.nextFloat();
			z = gen.nextFloat();
		} else {
			x = Math.random();
			y = Math.random();
			z = Math.random();
		}

		return x + (y + z) == (x + y) + z;
	}

	public static double proportion(int number, int policy) {
		double ok = 0;
		for (int i = 0; i < number; i++) {
			if (associativity_test(policy)) {
				ok += 1;
			}
		}
		return ok * 100 / number;
	}

	public static void main(String[] args) {
		System.out.println("Choose the policy of random number generation :");
		System.out.println("0 for Math.Random");
		System.out.println("1 for java.util.Random.nextFloat()");
		int policy = 0;
		try {
			Scanner n = new Scanner(System.in);
			policy = n.nextInt();
			n.close();
		} catch (InputMismatchException e) {
			System.out.println("Invalid value, please try again");
		}
		System.out.println(String.valueOf(proportion(1000, policy)) + '%');
	}

}
