public class Tester {
  public static void main(String[] args) {
    int[] array0 = {};
    int[] array1 = {1};
    int[] array2 = {1, 2};
    int[] array3 = {1, 2, 3};
    int[] array4 = {1, 2, 3, 4};
    int[] array5 = {4, 1, 5, 2, 3};

    System.out.println("sum() Tests:");
    System.out.println(ArrayOps.sum(array0));
    System.out.println(ArrayOps.sum(array1));
    System.out.println(ArrayOps.sum(array2));
    System.out.println(ArrayOps.sum(array3));
    System.out.println(ArrayOps.sum(array4));
    System.out.println(ArrayOps.sum(array5));
    System.out.println();
    System.out.println("largest() Tests:");
    System.out.println(ArrayOps.largest(array0));
    System.out.println(ArrayOps.largest(array1));
    System.out.println(ArrayOps.largest(array2));
    System.out.println(ArrayOps.largest(array3));
    System.out.println(ArrayOps.largest(array4));
    System.out.println(ArrayOps.largest(array5));
  }
}
