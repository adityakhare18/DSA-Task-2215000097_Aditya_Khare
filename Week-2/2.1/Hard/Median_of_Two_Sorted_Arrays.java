package Hard;

import java.util.Arrays;

public class Median_of_Two_Sorted_Arrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double[] arr = new double[nums1.length + nums2.length];
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            arr[count] = nums1[i];
            count++;
        }
        for (int i = 0; i < nums2.length; i++) {
            arr[count] = nums2[i];
            count++;
        }
        Arrays.sort(arr);
        int n = arr.length;
        if (n % 2 != 0) {
            return arr[n / 2];
        } else {
            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;

        }
        
    }
}
