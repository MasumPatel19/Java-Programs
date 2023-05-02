package programs.patterns.factory;

public class FactoryClass {

	public Laptop getNewLaptop(String str) {
		if (str.equals("Apple")) {
			return new AppleLaptop();
		} else if (str.equals("HP")) {
			return new HPLaptop();
		} else {
			return new DellLaptop();
		}
	}

}
