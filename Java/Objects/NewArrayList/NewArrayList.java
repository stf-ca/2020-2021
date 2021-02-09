public class NewArrayList {
  private int size;
  private Object[] elements = new Object[2];
  public NewArrayList() {
    size = 0;
  }

  public int size() {
    return size;
  }

  public void print() {
    for (int i = 0; i < size; i++) {
      System.out.println(elements[i]);
    }
  }

  public void add(Object o) {

    if (elements.length == size) {
      Object[] newArray = new Object[size * 2];
      for (int i = 0; i < elements.length; i++) {
        newArray[i] = elements[i];
      }
      elements = newArray;
    }
    elements[size] = o;
    size++;
  }

  public void set(int i, Object o) {
    if (i < size) {
      elements[i] = 0;
    }
  }

  public Object get(int i) {
    if (i < size) {
      return elements[i];
    }
    return null;
  }
}
