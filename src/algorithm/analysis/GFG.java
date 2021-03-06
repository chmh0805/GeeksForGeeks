package algorithm.analysis;

// Analysis of Algorithms - Set 2
public class GFG {

    // Linearly search x in arr[]. If x is present then
    // return the index, otherwise return -1
    static int linearSearch(int arr[], int x) {
        int n, i;
        for (n = arr.length, i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    /* Driver Program to test above functions */
    public static void main(String[] args) {
        int arr[] = { 1, 10, 30, 15 };
        int x = 30;
        int n = arr.length;
        System.out.printf("%d is present at index %d", x, linearSearch(arr, x));
    }
}
