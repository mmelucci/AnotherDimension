public class ArrayOps {
  public static int sum(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum;
  }

  public static  int largest(int[] arr) {
    int largest = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > largest) {
        largest = arr[i];
      }
    }
    return largest;
  }

  public static int[] sumRows(int[][] matrix) {
    int[] arrayofsums = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      arrayofsums[i] = sum(matrix[i]);
    }
    return arrayofsums;
  }

  public static int[] largestInRows(int[][] matrix) {
    int[] arrayoflargest = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      arrayoflargest[i] = largest(matrix[i]);
    }
    return arrayoflargest;
  }

  public static int sum(int[][] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += sum(arr[i]);
    }
    return sum;
  }

  public static int[] sumCols(int[][] matrix) {
    int[] arrayofcolsums = new int[matrix[0].length];
    for (int i = 0; i < matrix[0].length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        arrayofcolsums[i] += matrix[j][i];
      }
    }
    return arrayofcolsums;
  }
}
