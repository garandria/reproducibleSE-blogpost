In the provided java class *Main.java*, we define two strings **a** and **b**, both set to the value **"test"** using two scenarios S1 and S2. In S1, the variable is set to a new instance of a class String, with the content of the string set as an argument in the constructor. In S2, the instance of a string is directly affected to the variable. For these scenarios, we then compute the command `a == b` that returns a boolean set to *true* if (and only if) the two variables **a** and **b** are referencing the same instance of the Class String. Depending on the way you instantiate the strings (S1 or S2), `a == b` could be either true or false: in S1, two separate instances are compared and `a == b` is **false** while in Scenario S2, **a** and **b** are referencing the same instance of the class String, so `a == b` returns **true**. Source [here](https://stackoverflow.com/questions/3052442/what-is-the-difference-between-text-and-new-stringtext)

Content of Main.java :

```

public class Main {
	
	public static void main(String[] args) {
		
		// S1		
		String a_s1 = new String("test");
		String b_s1 = new String("test");
		System.out.println(a_s1 == b_s1);
		// returns false
		
		// S2
		String a_s2 = "test"; 
		String b_s2 = "test"; 
		System.out.println(a_s2 == b_s2);
		// returns true

	}
	
}

```
