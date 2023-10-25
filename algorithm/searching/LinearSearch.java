package algorithm.searching;

public class LinearSearch {
  private static <T> int search(T[] ar, T item) {
    for (int i = 0; i < ar.length; i++) {
      if (ar[i].equals(item)) {
        return i;
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    Integer[] ar = {2, 3, 5, 1, 2, 3, 5, 90};

    System.out.println(search(ar, 5));
    System.out.println(search(ar, 50));
  }
}
