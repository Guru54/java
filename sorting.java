// bubble sort in java
class sorting {
  public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    // delay in java
    public static void delay(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    // 1 second = 1000 milliseconds
  public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
           // printArray(arr);
        }
    }
    // linear search in java
    public static int linearSearch(int arr[], int x) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
    // binary search in java
    public static void binarySearch(int arr[], int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == x) {
                System.out.println("Element found at index " + m);
                return;
            }
            if (arr[m] < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        System.out.println("Element not found");
    }

    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);
        System.out.println("Sorted array: ");
        printArray(arr);
        int x = 22;
        System.out.println("Element to search: " + x);
        System.out.println("searching the element : "+x);
        delay(3000); // 1 second delay
        System.out.println("almost done...");
        delay(3000); // 1 second delay
        System.out.println("done...");
        int result = linearSearch(arr, x);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + result);
        }
        System.out.println("Searching using binary search...");
        delay(3000); // 1 second delay
        System.out.println("almost done...");
        delay(3000); // 1 second delay
        System.out.println("done...");
        binarySearch(arr, x);
    }
}