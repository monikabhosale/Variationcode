/*
Index of first 1 in a sorted array of 0s and 1s 
Basic Accuracy: 54.13% Submissions: 12985 Points: 1
Given a sorted array consisting 0’s and 1’s. The task is to find the index of first ‘1’ in the given array.

 

Example 1:

Input : 
arr[] = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1}
Output : 
6
Explanation:
The index of first 1 in the array is 6.
public class MyClass {
//StartOfMainMethod
public static void main(String[] args) {
int arr[] = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1};
myCode(arr);
}
//EndOfMainMethod
public static void myCode(int[] arr) {
}
}
*/
public class varcode13 {
    // StartOfMainMethod
        public static void main(String[] args) {
            int arr[] = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1};
            myCode(arr);
        }
    // EndOfMainMethod
    
        public static void myCode(int[] arr) {
            int index = findFirstOneIndex(arr);
            System.out.println(index);
        }
    
        private static int findFirstOneIndex(int[] arr) {
            int left = 0;
            int right = arr.length - 1;
            int result = -1;
    
            while (left <= right) {
                int mid = left + (right - left) / 2;
    
                if (arr[mid] == 1) {
                    result = mid;
                    right = mid - 1; // search in the left half
                } else {
                    left = mid + 1; // search in the right half
                }
            }
    
            return result;
        }
    }
    