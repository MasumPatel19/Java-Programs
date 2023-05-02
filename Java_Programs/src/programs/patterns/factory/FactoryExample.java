package programs.patterns.factory;

public class FactoryExample {

	public static void main(String[] args) {

		FactoryClass factoryObj = new FactoryClass();
		Laptop obj = factoryObj.getNewLaptop("Apple");
		obj.laptopType();

	}

}
