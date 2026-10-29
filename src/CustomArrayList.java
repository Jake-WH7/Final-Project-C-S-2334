public class CustomArrayList<T> {
  private static final int DEFAULT_CAPACITY = 10;

  private Object[] elements;
  private int size;

  public CustomArrayList() {
    elements = new Object[DEFAULT_CAPACITY];
    size = 0;
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    if (size == 0) {
      return true;
    }
    return false;
  }

  @SuppressWarnings("unchecked")
  public T get(int index) {
    checkElementIndex(index);
    return (T) elements[index];
  }

  @SuppressWarnings("unchecked")
  public T set(int index, T element) {
    checkElementIndex(index);
    Object elementReplaced = elements[index];
    elements[index] = element;
    return (T) elementReplaced;
  }

  @SuppressWarnings("unchecked")
  public T remove(int index) {
    checkElementIndex(index);
    Object elementRemoved = elements[index];
    for (int i = index; i < size - 1; i++) {
      elements[i] = elements[i + 1];
    }
    size--;
    elements[size] = null;
    return (T) elementRemoved;
  }

  private void checkElementIndex(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException(
          "Index: " + index + ", Size: " + size);
    }
  }

  private void checkPositionIndex(int index) {
    if (index < 0 || index > size) {
      throw new IndexOutOfBoundsException(
          "Index: " + index + ", Size: " + size);
    }
  }

}
