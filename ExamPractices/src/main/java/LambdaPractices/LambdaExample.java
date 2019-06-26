public class LambdaExample {
	// Basic examples of lambda functions:
	greetingFunction = () -> System.out.println("Hello World");
	doubleNumberFunction = (int a) -> a * 2;
	addFunction = (int a, int b) -> a + b;
	safeDivideFunction = (int a, int b) -> {
		if (b == 0) return 0;
		return a/b;
	};

	stringLengthCountFunction = (String s) -> s.lenght();
}