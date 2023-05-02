package programs.patterns.builder;

public class BuilderClass {

	private String Os;
	private int Ram;
	private int Battery;
	private double ScreenSize;

	public BuilderClass setOs(String os) {
		Os = os;
		return this;
	}

	public BuilderClass setRam(int ram) {
		Ram = ram;
		return this;
	}

	public BuilderClass setBattery(int battery) {
		Battery = battery;
		return this;
	}

	public BuilderClass setScreenSize(double screenSize) {
		ScreenSize = screenSize;
		return this;
	}

	public Phone getPhone() {
		return new Phone(Os, Ram, Battery, ScreenSize);
	}
	
}

