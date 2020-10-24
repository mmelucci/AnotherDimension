import java.util.Arrays;

public class Tester {
  public static void main(String[] args) {
    int[] array0 = {};
    int[] array1 = {1};
    int[] array2 = {1, 2};
    int[] array3 = {1, 2, 3};
    int[] array4 = {1, 2, 3, 4};
    int[] array5 = {4, 1, 5, 2, 3};
    int[][] A = { {  1,  0, 12, -1 },
                  {  7, -2,  2,  1 },
                  { -5, -2,  2, -9 }
               };
    int[][] B  = { { 1, 3, 5 } };
    int[][] C = { {  1,  2, 3, 4 },
                  {  5, 7,  6,  8 },
                  { 0, 0,  -2, -1 }
               };
    int[][] D = { {  0,  0, 2, -1 },
                  {  2, -2,  2,  1 },
                  { 2, -8,  2, -9 }
               };
    int[][] E = { {} };

    System.out.println("sum() Tests:");
    System.out.print("Expected: 0 Result: ");
    System.out.println(ArrayOps.sum(array0));
    System.out.print("Expected: 1 Result: ");
    System.out.println(ArrayOps.sum(array1));
    System.out.print("Expected: 3 Result: ");
    System.out.println(ArrayOps.sum(array2));
    System.out.print("Expected: 6 Result: ");
    System.out.println(ArrayOps.sum(array3));
    System.out.print("Expected: 10 Result: ");
    System.out.println(ArrayOps.sum(array4));
    System.out.print("Expected: 15 Result: ");
    System.out.println(ArrayOps.sum(array5));
    System.out.println();
    System.out.println("largest() Tests:");
    System.out.print("Expected: 0 Result: ");
    System.out.println(ArrayOps.largest(array0));
    System.out.print("Expected: 1 Result: ");
    System.out.println(ArrayOps.largest(array1));
    System.out.print("Expected: 2 Result: ");
    System.out.println(ArrayOps.largest(array2));
    System.out.print("Expected: 3 Result: ");
    System.out.println(ArrayOps.largest(array3));
    System.out.print("Expected: 4 Result: ");
    System.out.println(ArrayOps.largest(array4));
    System.out.print("Expected: 5 Result: ");
    System.out.println(ArrayOps.largest(array5));
    System.out.println();
    System.out.println("sumRows() Tests:");
    System.out.print("Expected: [12, 8, -14] Result: ");
    System.out.println(Arrays.toString(ArrayOps.sumRows(A)));
    System.out.print("Expected: [9] Result: ");
    System.out.println(Arrays.toString(ArrayOps.sumRows(B)));
    System.out.print("Expected: [10, 26, -3] Result: ");
    System.out.println(Arrays.toString(ArrayOps.sumRows(C)));
    System.out.print("Expected: [1, 3, -13] Result: ");
    System.out.println(Arrays.toString(ArrayOps.sumRows(D)));
    System.out.print("Expected: [0] Result: ");
    System.out.println(Arrays.toString(ArrayOps.sumRows(E)));
    System.out.println();
    System.out.println("largestInRows() Tests:");
    System.out.print("Expected: [12, 7, 2] Result: ");
    System.out.println(Arrays.toString(ArrayOps.largestInRows(A)));
    System.out.print("Expected: [5] Result: ");
    System.out.println(Arrays.toString(ArrayOps.largestInRows(B)));
    System.out.print("Expected: [4, 8, 0] Result: ");
    System.out.println(Arrays.toString(ArrayOps.largestInRows(C)));
    System.out.print("Expected: [2, 2, 2] Result: ");
    System.out.println(Arrays.toString(ArrayOps.largestInRows(D)));
    System.out.println();
    System.out.println("sum() Tests:");
    System.out.print("Expected: 6 Result: ");
    System.out.println(ArrayOps.sum(A));
    System.out.print("Expected: 9 Result: ");
    System.out.println(ArrayOps.sum(B));
    System.out.print("Expected: 33 Result: ");
    System.out.println(ArrayOps.sum(C));
    System.out.print("Expected: -9 Result: ");
    System.out.println(ArrayOps.sum(D));
    System.out.print("Expected: 0 Result: ");
    System.out.println(ArrayOps.sum(E));
    System.out.println();

  }
}
