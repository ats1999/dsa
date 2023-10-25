package algorithm.searching;

public class BinarySearch {
  private static int search(int[] ar, int item) {
    int start = 0, end = ar.length - 1;
    int mid;

    while (start <= end) {
      mid = (start + end) / 2;

      if (ar[mid] == item) {
        return mid;
      }

      if (ar[mid] > item) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    int[] ar = {2, 3, 7, 8, 90, 123, 677,900};

    System.out.println(search(ar, 677));
    System.out.println(search(ar, 900));
  }
}
