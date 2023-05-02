package programs.patterns.builder;

public class Phone {

	private String Os;
	private int Ram;
	private int Battery;
	private double ScreenSize;

	public Phone(String os, int ram, int battery, double screenSize) {
		super();
		Os = os;
		Ram = ram;
		Battery = battery;
		ScreenSize = screenSize;
	}

	@Override
	public String toString() {
		return "Phone [Os=" + Os + ", Ram=" + Ram + ", Battery=" + Battery + ", ScreenSize=" + ScreenSize + "]";
	}

}