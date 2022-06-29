The Python program *test_random.py* first asks for a seed for its pseudo random number generator, then generates 3 pseudo-random numbers $x,y,z$ and checks whether their addition is associative, i.e. if $x+(y+z) = (x+y)+z$. When run many times with different seeds, it turns out that this fundamental property of the addition **only holds about 82.8% of the time**. 

Content of test_random.py:

```
from random import random, seed


def associativity_test() -> bool:
    x = random()
    y = random()
    z = random()

    return x + (y + z) == (x + y) + z


def proportion(number: int) -> float:
    ok = 0
    for _ in range(number):
        ok += associativity_test()

    return ok * 100 / number


if __name__ == '__main__':
    seed(int(input('Seed: ')))
    print(str(proportion(1000)) + '%')
```

Yet already severe, the problem does not stop here. If we translate this program to Java (see *Main2.java*) using `Math.random()` as its random generator, we get that associativity holds 83.1% of the time, which is quite but not exactly similar to Python: this is an example of *Language*. But if we use `java.util.Random.nextFloat()`, we get 100%! Two variants of the same functionality ends up behaving differently: this is an example of *Library*. (NB: this text comes from a research proposal (ERC) written by Jean-Marc Jézéquel)


Content of Main2.java:

```
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
```
