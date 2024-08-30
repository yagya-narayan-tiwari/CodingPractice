public class SortBinaryArrayWithOutBuildInMethods{
  public static void main(String args[]){
    int arr [] = {1,0,0,0,0,0,1,1,1,0};

    int sortedBinaryArr[] = sortBinaryArray(arr);

      System.out.print("[ ");
    for( int i : sortedBinaryArr){
      System.out.print(i + " ");
    }
    System.out.print("]");
  } 

  public static int [] sortBinaryArray(int arr[]){
    int zeroCount = 0;
    // int oneCount = 0;

    for(int i = 0 ; i < arr.length ; i++){
      if(arr[i] == 0){
        zeroCount++;
      }
    }
    int sortedArr [] = new int[arr.length];

    for(int i = 0 ; i < zeroCount ; i++){
      sortedArr[i] = 0;
    }
    for(int i = zeroCount ; i < arr.length ; i++){
      sortedArr[i] = 1;
    }

    return sortedArr;
  }
}


/*

-----------------
two pointer Approach 
----------------

  public class BinaryArraySort {

    public static void main(String[] args) {
      int[] binaryArray = {1, 0, 1, 1, 0, 0, 1, 0};  // Example binary array
      sortBinaryArray(binaryArray);

      // Print the sorted array
      for (int num : binaryArray) {
        System.out.print(num + " ");
      }
    }

    public static void sortBinaryArray(int[] arr) {
      int low = 0;               // Pointer starting from the beginning
      int high = arr.length - 1; // Pointer starting from the end

      while (low < high) {
        // Move the `low` pointer if it is at `0`
        while (low < high && arr[low] == 0) {
          low++;
        }

        // Move the `high` pointer if it is at `1`
        while (low < high && arr[high] == 1) {
          high--;
        }

        // Swap `1` at `low` with `0` at `high`
        if (low < high) {
          // Swap elements at low and high
          int temp = arr[low];
          arr[low] = arr[high];
          arr[high] = temp;

          // Move pointers
          low++;
          high--;
          
        }
      }
    }
  }


*/