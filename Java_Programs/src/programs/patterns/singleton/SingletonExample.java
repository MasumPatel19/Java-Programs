package programs.patterns.singleton;

class TestSingleton {

	static TestSingleton testObject = new TestSingleton();

	private TestSingleton() {

	}

	public static TestSingleton getInstance() {
		return testObject;
	}

}

public class SingletonExample {

	public static void main(String[] args) {

		TestSingleton obj1 = TestSingleton.getInstance();
		TestSingleton obj2 = TestSingleton.getInstance();

		System.out.println(obj1);
		System.out.println(obj2);

	}
}
