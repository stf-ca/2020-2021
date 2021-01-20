class Main {
  public static void main(String[] args) {
    helper();
	Ruler myRuler = new Ruler();
	System.out.println("10 cm equals " + Ruler.cmToInch(10) + " inches. MyRuler is " + myRuler.getLength() + " inches long.");
  }

  public static void helper() {
	System.out.println("Hello world!");
  }
}
