class Main {
  public static void main(String[] args) {
    NewArrayList myNames = new NewArrayList();
	for (int i = 1; i <= 20; i++) {
		myNames.add("Name " + i);
	}
	myNames.print();
  }
}
