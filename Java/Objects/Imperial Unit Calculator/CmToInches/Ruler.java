class Ruler{
	int length = 30;

	public Ruler() {
		length = (int)(Math.random()*45)+5;
	}

	// static method
	public static double cmToInch(double i) {
		return i/2.54;
	}

	// nonstatic method
	public double getLength() {
		return length;
	}
}
